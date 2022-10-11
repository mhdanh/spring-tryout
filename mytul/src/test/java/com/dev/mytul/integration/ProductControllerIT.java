package com.dev.mytul.integration;

import com.dev.mytul.entity.Product;
import com.dev.mytul.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Tag("IntegrationTest")
@ActiveProfiles("test")
@SpringBootTest
@RequiredArgsConstructor
public class ProductControllerIT {

    @Autowired
    private ProductRepository productRepository;

    @Test
    @Transactional
    public void givenUsersInDB_WhenUpdateStatusForNameModifyingQueryAnnotationNative_ThenModifyMatchingUsers(){
        productRepository.save(Product.builder().name("IPHONE").uuid(UUID.randomUUID()).build());
        productRepository.flush();
        List<Product> products = productRepository.findAll();
        Assertions.assertThat(products.size()).isEqualTo(1);
    }
}
