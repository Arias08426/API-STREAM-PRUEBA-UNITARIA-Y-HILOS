package Mappers.MapperProduct;

import domain.models.Customer;
import domain.models.Product;
import mapper.dtos.CustomerDto;
import mapper.dtos.ProductDto;

import java.util.List;

public class MapperProduct {
    public static ProductDto mapFrom(Product source){
        return new ProductDto(source.getId(),
                source.getName(),
                source.getCategory(),
                source.getPrice());
    }
    public static Product mapFrom(ProductDto source){
        return new Product(source.productId(),
                source.productName(),
                source.productCategory(),
                source.price());
    }
    public static List<ProductDto> mapFrom(List<Product> source) {
        return source.parallelStream().map(e-> mapFrom(e)).toList();
    }
    public static List<Product> mapFromDto(List<ProductDto> source) {
        return source.parallelStream().map(e-> mapFrom(e)).toList();
    }
}
