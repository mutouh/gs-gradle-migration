package com.example.shop.product.service.impl;

import com.example.shop.common.product.dto.ProductDto;
import com.example.shop.common.product.entity.ProductEntity;
import com.example.shop.product.dao.ProductRepository;
import com.example.shop.product.mapper.ProductMapper;
import com.example.shop.product.service.ProductService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductRepository productRepository;

    @Override
    public List<ProductDto> listAll() {
        List<ProductEntity> productEntities = productRepository.findAll();

        return ProductMapper.MAPPER.entityToDto(productEntities);
    }
}
