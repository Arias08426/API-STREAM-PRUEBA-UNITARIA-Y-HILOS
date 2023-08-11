package mapping.dtos;
import domain.enums.ClientType;

public record orderDto(long id,
                        String status,
                        LocalDate orderDate,
                        LocalDate deliveryDate,
                        ) {
}