package mapping.dtos;
import domain.enums.ClientType;

public record CustomerDto (
        Long customerId,
        String customerName,
        Integer tier){
}