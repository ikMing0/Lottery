package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: ZzzMing
 * @description: 奖品配置持久层
 * @date: 2024/4/11 19:51
 * @version: 1.0
 */
@Mapper
public interface IAwardDao {

    Award queryAwardInfo(String awardId);

}
