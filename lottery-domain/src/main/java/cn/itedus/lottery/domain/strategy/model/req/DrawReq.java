package cn.itedus.lottery.domain.strategy.model.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author：ming
 * @version：1.0
 * @date：2024-04-12 15:30
 * @description 抽奖请求
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class DrawReq {
    // 用户ID
    private String uId;
    // 策略ID
    private Long strategyId;
}
