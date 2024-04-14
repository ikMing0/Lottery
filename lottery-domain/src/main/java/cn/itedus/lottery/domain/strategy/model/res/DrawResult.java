package cn.itedus.lottery.domain.strategy.model.res;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author：ming
 * @version：1.0
 * @date：2024-04-12 15:28
 * @description 抽奖结果
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class DrawResult {
    // 用户ID
    private String uId;
    // 策略ID
    private Long strategyId;
    // 奖品ID
    private String rewardId;
    // 奖品名称
    private String awardName;
}
