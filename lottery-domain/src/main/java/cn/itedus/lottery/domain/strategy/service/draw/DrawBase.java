package cn.itedus.lottery.domain.strategy.service.draw;

import cn.itedus.lottery.domain.strategy.model.vo.AwardRateInfo;
import cn.itedus.lottery.domain.strategy.model.vo.StrategyDetailBriefVO;
import cn.itedus.lottery.domain.strategy.service.algorithm.IDrawAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：ming
 * @version：1.0
 * @date：2024-04-13 15:41
 * @description 抽奖基类: 公共属性,公共方法
 */
public class DrawBase extends DrawConfig {

    /**
     * 此方法用于检查和初始化特定彩票策略的费率数据。
     *
     * @param strategyId 彩票策略的唯一标识符。
     * @param strategyMode 一个整数，表示策略的模式。
     * @param strategyDetailList StrategyDetail 对象的列表，其中包含有关策略的详细信息。
     */
    public void checkAndInitRateData(Long strategyId, Integer strategyMode, List<StrategyDetailBriefVO> strategyDetailList) {
        // 如果策略模式不是 1，则该方法将立即返回。
        if (1 != strategyMode) return;

        // 使用 strategyMode 作为键从 drawAlgorithmMap 中检索 IDrawAlgorithm 对象。
        IDrawAlgorithm drawAlgorithm = drawAlgorithmGroup.get(strategyMode);

        // 检查给定 strategyId 的速率元组是否已存在于 drawAlgorithm 中。
        // 如果是这样，该方法将立即返回。
        boolean existRateTuple = drawAlgorithm.isExistRateTuple(strategyId);
        if (existRateTuple) return;

        // 如果速率元组不存在，则该方法将从 strategyDetailList 创建 AwardRateInfo 对象的新列表。
        // 每个 AwardRateInfo 对象都是使用 StrategyDetail 对象中的 awardId 和 awardRate 构建的。
        List<AwardRateInfo> awardRateInfoList = new ArrayList<>(strategyDetailList.size());
        for (StrategyDetailBriefVO strategyDetail : strategyDetailList) {
            awardRateInfoList.add(
                    AwardRateInfo.builder()
                    .awardId(strategyDetail.getAwardId())
                    .awardRate(strategyDetail.getAwardRate())
                    .build());
        }

        // 调用 drawAlgorithm 的 initRateTuple 方法，使用 strategyId 和 AwardRateInfo 对象列表初始化速率元组。
        drawAlgorithm.initRateTuple(strategyId, awardRateInfoList);

    }

}
