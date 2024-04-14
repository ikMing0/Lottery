package cn.itedus.lottery.domain.strategy.service.draw;

import cn.itedus.lottery.domain.strategy.model.req.DrawReq;
import cn.itedus.lottery.domain.strategy.model.res.DrawResult;

/**
 * @author：ming
 * @version：1.0
 * @date：2024-04-13 15:35
 * @description 抽奖执行接口，定义抽奖行为，后面的抽奖执行都要实现这个接口
 */
public interface IDrawExec {

    /**
     * 执行抽奖
     * @param req
     * @return 抽奖结果
     */
    DrawResult doDrawExec(DrawReq req);

}
