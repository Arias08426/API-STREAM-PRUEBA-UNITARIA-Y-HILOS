package repository;

import Mappers.Dto.CustomerDto;

import java.util.List;

public interface customerRepository {
    List<CustomerDto> getAllCustomers();
}
