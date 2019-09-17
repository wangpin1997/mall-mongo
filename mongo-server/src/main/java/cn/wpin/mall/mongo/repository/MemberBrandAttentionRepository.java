package cn.wpin.mall.mongo.repository;

import cn.wpin.mall.mongo.entity.MemberBrandAttention;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 会员关注Repository
 *
 * @author wangpin
 */
public interface MemberBrandAttentionRepository extends MongoRepository<MemberBrandAttention, String> {

    MemberBrandAttention findByMemberIdAndBrandId(Long memberId, Long brandId);

    int deleteByMemberIdAndBrandId(Long memberId, Long brandId);

    List<MemberBrandAttention> findByMemberId(Long memberId);
}
