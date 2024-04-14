package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: ZzzMing
 * @description: 策略配置持久层
 * @date: 2024/4/11 20:01
 * @version: 1.0
 */
@Mapper
public interface IStrategyDao {

    Strategy queryStrategy(Long strategyId);

}
