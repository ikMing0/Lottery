package cn.itedus.lottery.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 策略表
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class Strategy {
    private Long id;
    private Long strategyId;
    private String strategyDesc;
    private Integer strategyMode;
    private Integer grantType;
    private Date grantDate;
    private String extInfo;
    private Date createTime;
    private Date updateTime;
}
