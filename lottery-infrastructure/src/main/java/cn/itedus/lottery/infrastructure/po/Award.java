package cn.itedus.lottery.infrastructure.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 奖品信息表
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
public class Award {
    private Long id;
    private Long awardId;
    private Integer awardType;
    private Integer awardCount;
    private String awardName;
    private String awardContent;
    private Date createTime;
    private Date updateTime;
}
