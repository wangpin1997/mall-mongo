package cn.wpin.mall.mongo.service;


import cn.wpin.mall.mongo.entity.MemberProductCollection;
import cn.wpin.mall.mongo.repository.MemberProductCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员收藏Service实现类
 *
 * @author wangpin
 */
@Service
public class MemberCollectionService {

    @Autowired
    private MemberProductCollectionRepository productCollectionRepository;

    public int addProduct(MemberProductCollection productCollection) {
        int count = 0;
        MemberProductCollection findCollection = productCollectionRepository.findByMemberIdAndProductId(productCollection.getMemberId(), productCollection.getProductId());
        if (findCollection == null) {
            productCollectionRepository.save(productCollection);
            count = 1;
        }
        return count;
    }

    public int deleteProduct(Long memberId, Long productId) {
        return productCollectionRepository.deleteByMemberIdAndProductId(memberId, productId);
    }

    public List<MemberProductCollection> listProduct(Long memberId) {
        return productCollectionRepository.findByMemberId(memberId);
    }
}
