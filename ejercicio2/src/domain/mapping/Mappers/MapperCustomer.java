package Mappers.MapperCustomer;

import domain.models.customer;
import domain.mapping.Mappers.Dto.CustomerDto;

import java.util.List;

public class MapperCustomer {
    public static CustomerDto mapFrom(Customer source){
        return new CustomerDto(source.getId(),
                source.getName(),
                source.getTier());
    }

    public static Customer mapFrom(CustomerDto source){
        return new Customer(source.customerId(),
                source.customerName(),
                source.tier());
    }

    public static List<CustomerDto> mapFrom(List<Customer> source) {
        return source.parallelStream().map(e-> mapFrom(e)).toList();
    }
    public static List<Customer> mapFromDto(List<CustomerDto> source) {
        return source.parallelStream().map(e-> mapFrom(e)).toList();
    }
}
