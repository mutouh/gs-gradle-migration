package com.example.shop.product.controller;

import com.example.shop.common.product.dto.ProductDto;
import com.example.shop.product.service.ProductService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @GetMapping
    public List<ProductDto> listAll() {
        return productService.listAll();
    }

}
