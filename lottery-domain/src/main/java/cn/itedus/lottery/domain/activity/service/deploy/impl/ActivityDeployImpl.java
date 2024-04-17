package cn.itedus.lottery.domain.activity.service.deploy.impl;

import cn.itedus.lottery.domain.activity.model.aggregates.ActivityConfigRich;
import cn.itedus.lottery.domain.activity.model.req.ActivityConfigReq;
import cn.itedus.lottery.domain.activity.model.vo.ActivityVO;
import cn.itedus.lottery.domain.activity.model.vo.StrategyDetailVO;
import cn.itedus.lottery.domain.activity.repository.IActivityRepository;
import cn.itedus.lottery.domain.activity.service.deploy.IActivityDeploy;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: ZzzMing
 * @version: 1.0
 * @date: 2024/4/17 21:46
 * @description: 部署活动配置服务
 */
@Component
public class ActivityDeployImpl implements IActivityDeploy {

    private static final Logger logger = LoggerFactory.getLogger(ActivityDeployImpl.class);

    @Resource
    private IActivityRepository activityRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void createActivity(ActivityConfigReq req) {
        logger.info("创建活动配置开始,activityId：{}",req.getActivityId());
        ActivityConfigRich activityConfigRich = req.getActivityConfigRich();
        try {
            // 添加活动配置
            activityRepository.addActivity(activityConfigRich.getActivity());
            // 添加奖品配置
            activityRepository.addAward(activityConfigRich.getAwardList());
            // 添加策略配置
            activityRepository.addStrategy(activityConfigRich.getStrategy());
            // 添加策略明细配置
            List<StrategyDetailVO> strategyDetailList = activityConfigRich.getStrategy().getStrategyDetailList();
            activityRepository.addStrategyDetailList(strategyDetailList);
            logger.info("创建活动配置完成,activityId：{}",req.getActivityId());
        } catch (DuplicateKeyException err){
            logger.info("创建活动配置失败,唯一索引冲突 activityId：{} reqJson：{}",req.getActivityId(), JSON.toJSONString(req), err);
            throw err;
        }
    }

    @Override
    public void updateActivity(ActivityConfigReq req) {
        // TODO: 非核心功能后续补充
    }
}
