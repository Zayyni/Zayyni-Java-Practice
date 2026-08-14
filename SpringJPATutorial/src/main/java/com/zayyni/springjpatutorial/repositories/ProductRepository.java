package com.zayyni.springjpatutorial.repositories;

import com.zayyni.springjpatutorial.entities.ProductEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
//    List<ProductEntity> findByTitleOrderByPrice(String title);

//    List<ProductEntity> findBy(Sort sort);

    List<ProductEntity> findByTitleContainingIgnoreCase( String title, Pageable pageable);


    List<ProductEntity> findByCreatedAtAfter(LocalDateTime after);

    List<ProductEntity> findByQuantityAndPrice(Integer quantity, BigDecimal price);

    List<ProductEntity> findByTitleLike(String title);

    @Query("SELECT e FROM ProductEntity e WHERE e.title = ?1 AND e.price = ?2")
    Optional<ProductEntity> findByTitleAndPrice(String title, BigDecimal price);
}
