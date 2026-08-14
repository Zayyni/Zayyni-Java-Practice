package com.zayyni.springjpatutorial;

import com.zayyni.springjpatutorial.entities.ProductEntity;
import com.zayyni.springjpatutorial.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SpringJpaTutorialApplicationTests {

    @Autowired
    ProductRepository productRepository;

    @Test
    void contextLoads() {
    }

//    @Test
//    void testRepository()
//    {
//        ProductEntity productEntity = ProductEntity
//                .builder()
//                .sku("nestle23")
//                .title("Nestle Milk")
//                .price(BigDecimal.valueOf(250.55))
//                .quantity(2)
//                .build();
//        ProductEntity savedProductEntity = productRepository.save(productEntity);
//        System.out.println(savedProductEntity);
//    }

    @Test
    void getRepository() {
//        List<ProductEntity> list = productRepository.findByCreatedAtAfter(
//                LocalDateTime.of(2025,1,1, 0,0,0));
//        System.out.println(list);

        List<ProductEntity> entities = productRepository
                .findByQuantityAndPrice(4,BigDecimal.valueOf(23.33));
        System.out.println(entities);
    }

}
