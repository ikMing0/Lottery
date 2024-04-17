package cn.itedus.lottery.domain.strategy.model.aggregates;

import cn.itedus.lottery.domain.strategy.model.vo.StrategyBriefVO;
import cn.itedus.lottery.domain.strategy.model.vo.StrategyDetailBriefVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author：ming
 * @version：1.0
 * @date：2024-04-12 15:31
 * @description 策略聚合
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class StrategyRich {
    // 策略ID
    private Long strategyId;
    // 策略配置
    private StrategyBriefVO strategy;
    // 策略明细
    private List<StrategyDetailBriefVO> strategyDetailList;
}
