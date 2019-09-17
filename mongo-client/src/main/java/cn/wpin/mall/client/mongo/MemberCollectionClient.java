package cn.wpin.mall.client.mongo;

import cn.wpin.mall.common.entity.CommonResult;
import cn.wpin.mall.mongo.entity.MemberProductCollection;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 会员收藏管理
 *
 * @author wangpin
 */
@FeignClient("mongo")
public interface MemberCollectionClient {


    /**
     * 添加商品收藏
     */
    @RequestMapping(value = "member/collection/addProduct", method = RequestMethod.POST)
    CommonResult addProduct(@RequestBody MemberProductCollection productCollection);

    /**
     * 删除收藏商品
     */
    @RequestMapping(value = "member/collection/deleteProduct", method = RequestMethod.POST)
    CommonResult deleteProduct(Long memberId, Long productId);

    /**
     * 显示关注列表
     */
    @RequestMapping(value = "member/collection/listProduct/{memberId}", method = RequestMethod.GET)
    CommonResult<List<MemberProductCollection>> listProduct(@PathVariable Long memberId);
}
