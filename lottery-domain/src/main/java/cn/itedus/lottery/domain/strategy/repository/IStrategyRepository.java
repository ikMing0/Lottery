package cn.itedus.lottery.domain.strategy.repository;

import cn.itedus.lottery.domain.strategy.model.aggregates.StrategyRich;
import cn.itedus.lottery.infrastructure.po.Award;

import java.util.List;

/**
 * @author：ming
 * @version：1.0
 * @date：2024-04-12 15:33
 * @description 策略仓储
 */
public interface IStrategyRepository {

    /**
     * 查询策略聚合
     * @param strategyId
     * @return StrategyRich对象
     */
    StrategyRich queryStrategyRich(Long strategyId);

    /**
     * 查询奖品信息
     * @param awardId
     * @return Award对象
     */
    Award queryAwardInfo(String awardId);

    List<String> queryNoStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return           扣减结果
     */
    boolean deductStock(Long strategyId, String awardId);

}
