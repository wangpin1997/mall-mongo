package cn.wpin.mall.client.mongo;

import cn.wpin.mall.common.entity.CommonResult;
import cn.wpin.mall.mongo.entity.MemberBrandAttention;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 会员关注品牌管理Controller
 *
 * @author wangpin
 */
@FeignClient("mongo")
public interface MemberAttentionClient {


    /**
     * 添加品牌关注
     */
    @RequestMapping(value = "member/attention/add", method = RequestMethod.POST)
    CommonResult add(@RequestBody MemberBrandAttention memberBrandAttention);


    /**
     * 取消关注
     */
    @RequestMapping(value = "member/attention/delete", method = RequestMethod.POST)
    CommonResult delete(@RequestParam Long memberId,@RequestParam Long brandId);

    /**
     * 显示关注列表
     */
    @RequestMapping(value = "member/attention/list/{memberId}", method = RequestMethod.GET)
    CommonResult<List<MemberBrandAttention>> list(@PathVariable Long memberId);
}
