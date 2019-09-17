package cn.wpin.mall.mongo.repository;

import cn.wpin.mall.mongo.entity.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 会员商品浏览历史Repository
 *
 * @author wangpin
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory, String> {

    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
