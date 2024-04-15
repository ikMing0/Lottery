package cn.itedus.lottery.domain.award.service.factory;

import cn.itedus.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author：ming
 * @version：1.0
 * @date：2024-04-15 11:41
 * @description 配送商品简单工厂，提供获取配送服务
 */
@Component
public class DistributionGoodsFactory extends GoodsConfig  {

    public IDistributionGoods getDistributionGoodsService(Integer awardType){
        if (!goodsMap.containsKey(awardType)) throw new RuntimeException("未找到奖品类型");
        return goodsMap.get(awardType);
    }


}
