package com.example.shop.product.service.impl;

import com.example.shop.common.product.dto.ProductDto;
import com.example.shop.product.service.ProductService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductServiceImplTest {
    @Resource
    private ProductService productService;

    @Test
    void listAll() {
        List<ProductDto> productDtos = productService.listAll();

        Assertions.assertEquals(2, productDtos.size());
    }
}