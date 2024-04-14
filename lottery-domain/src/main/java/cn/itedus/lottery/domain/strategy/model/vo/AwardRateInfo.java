package cn.itedus.lottery.domain.strategy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @author：ming
 * @version：1.0
 * @date：2024-04-12 15:25
 * @description 奖品概率信息
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class AwardRateInfo {
    // 奖品ID
    private String awardId;
    // 中奖概率
    private BigDecimal awardRate;
}
