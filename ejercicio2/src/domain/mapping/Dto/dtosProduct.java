package mapping.dtos;
import domain.enums.ClientType;

public record orderDto(Long id, String name,
                       ProductCategory category,
                       Double price,
                        ) {
}