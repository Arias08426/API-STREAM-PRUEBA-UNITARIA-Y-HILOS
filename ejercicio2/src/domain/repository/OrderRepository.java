package repository;

import Mappers.Dto.OrderDto;

import java.util.List;

public interface OrderRepository {
    List<OrderDto> getAllOrders();
}
