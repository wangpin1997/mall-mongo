package cn.wpin.mall.mongo.repository;

import cn.wpin.mall.mongo.entity.MemberProductCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 商品收藏Repository
 * @author wangpin
 */
public interface MemberProductCollectionRepository extends MongoRepository<MemberProductCollection, String> {

    MemberProductCollection findByMemberIdAndProductId(Long memberId, Long productId);

    int deleteByMemberIdAndProductId(Long memberId, Long productId);

    List<MemberProductCollection> findByMemberId(Long memberId);
}
