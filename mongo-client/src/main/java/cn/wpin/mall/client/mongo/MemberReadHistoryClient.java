package cn.wpin.mall.client.mongo;

import cn.wpin.mall.common.entity.CommonResult;
import cn.wpin.mall.mongo.entity.MemberReadHistory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 会员商品浏览记录管理
 *
 * @author wangpin
 */
@FeignClient("mongo")
public interface MemberReadHistoryClient {


    /**
     * 创建浏览记录
     */
    @RequestMapping(value = "member/readHistory/create", method = RequestMethod.POST)
    CommonResult create(@RequestBody MemberReadHistory memberReadHistory);


    /**
     * 删除浏览记录
     */
    @RequestMapping(value = "member/readHistory/delete", method = RequestMethod.POST)
    CommonResult delete(@RequestParam("ids") List<String> ids);


    /**
     * 展示浏览记录
     */
    @RequestMapping(value = "member/readHistory/list", method = RequestMethod.GET)
    CommonResult<List<MemberReadHistory>> list(Long memberId);
}
