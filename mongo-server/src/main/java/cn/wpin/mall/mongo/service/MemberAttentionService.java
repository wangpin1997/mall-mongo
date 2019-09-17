package cn.wpin.mall.mongo.service;


import cn.wpin.mall.mongo.entity.MemberBrandAttention;
import cn.wpin.mall.mongo.repository.MemberBrandAttentionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员关注Service实现类
 * @author wangpin
 */
@Service
public class MemberAttentionService{

    @Autowired
    private MemberBrandAttentionRepository memberBrandAttentionRepository;

    public int add(MemberBrandAttention memberBrandAttention) {
        int count = 0;
        MemberBrandAttention findAttention = memberBrandAttentionRepository.findByMemberIdAndBrandId(memberBrandAttention.getMemberId(), memberBrandAttention.getBrandId());
        if (findAttention == null) {
            memberBrandAttentionRepository.save(memberBrandAttention);
            count = 1;
        }
        return count;
    }

    public int delete(Long memberId, Long brandId) {
        return memberBrandAttentionRepository.deleteByMemberIdAndBrandId(memberId,brandId);
    }

    public List<MemberBrandAttention> list(Long memberId) {
        return memberBrandAttentionRepository.findByMemberId(memberId);
    }
}
