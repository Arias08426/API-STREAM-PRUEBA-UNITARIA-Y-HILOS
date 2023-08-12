package mapping.Dto;


public record orderDto(Long id, String name,
                       ProductCategory category,
                       Double price,
                        ) {
}