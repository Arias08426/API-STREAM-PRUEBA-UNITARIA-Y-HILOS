package mapping.Dto;

public record ProductDto (Long productId,
                          String productName,
                          String productCategory,
                          Double price) {
}