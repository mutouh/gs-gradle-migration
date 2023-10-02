package com.example.shop.product.mapper;

import com.example.shop.common.product.dto.ProductDto;
import com.example.shop.common.product.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

    ProductDto entityToDto(ProductEntity productEntity);

    List<ProductDto> entityToDto(List<ProductEntity> productEntities);
}
