package com.ecarrot.repository;

import com.ecarrot.domain.Sku;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SkuRepository extends CrudRepository<Sku, String> {
    @Override
    Sku findOne(String s);

    @Override
    boolean exists(String s);

    @Override
    Iterable<Sku> findAll();

    @Override
    Iterable<Sku> findAll(Iterable<String> iterable);

    @Override
    long count();

    Sku findBySkuCodeAndStrCode(Long skuCode, Long strCode);

    // TODO: 점포코드, 대,중 분류로 상품 조회
    List<Sku> findByStrCodeAndGCodeAndMCode(Long strCode, Long gCode, Long mCode);

    // TODO: 추가 필요한 메소드 구현 및 테스트
}
