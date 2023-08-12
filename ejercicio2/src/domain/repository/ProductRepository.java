package repository;

import Mapper.Dto.ProductDto;

import java.util.List;

public interface ProductRepository {
    List<ProductDto> getAllProducts();
}
