package cn.itedus.lottery.domain.strategy.model.res;

import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.domain.strategy.model.vo.DrawAwardInfo;
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
    // 中奖状态：0未中奖、1已中奖、2兜底奖 Constants.DrawState
    private Integer drawState = Constants.DrawState.FAIL.getCode();
    // 中奖奖品信息
    private DrawAwardInfo drawAwardInfo;

    public DrawResult(String uId, Long strategyId, Integer drawState) {
        this.uId = uId;
        this.strategyId = strategyId;
        this.drawState = drawState;
    }
}
