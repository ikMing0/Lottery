package cn.itedus.lottery.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 策略明细表
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class StrategyDetail {

    private String id;
    private Long strategyId;
    private String awardId;
    private Integer awardCount;
    private BigDecimal awardRate;
    private Date createTime;
    private Date updateTime;

}
