package cn.wpin.mall.client.mongo;

import cn.wpin.mall.common.entity.CommonResult;
import cn.wpin.mall.mongo.entity.MemberBrandAttention;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    CommonResult delete(Long memberId, Long brandId);

    /**
     * 显示关注列表
     */
    @RequestMapping(value = "member/attention/list/{memberId}", method = RequestMethod.GET)
    CommonResult<List<MemberBrandAttention>> list(@PathVariable Long memberId);
}
