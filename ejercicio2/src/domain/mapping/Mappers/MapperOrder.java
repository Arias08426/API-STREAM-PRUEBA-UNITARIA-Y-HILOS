package Mappers.MapperOrder;

import domain.models.Order;
import domain.models.Product;
import mapping.Dto.OrderDto;
import mapping.Dto.ProductDto;

import java.util.List;

public class MapperOrder {
    public static OrderDto mapFrom(Order source){
        return new OrderDto(source.getId(),
                source.getStatus(),
                source.getOrderDate(),
                source.getDeliveryDate(),
                source.getProducts(),
                source.getCustomer());
    }

    public static Order mapFrom(OrderDto source){
        return new Order(source.orderId(),
                source.status(),
                source.orderDate(),
                source.deliveryDate(),
                source.products(),
                source.customer());
    }
    public static List<OrderDto> mapFrom(List<Order> source) {
        return source.parallelStream().map(e-> mapFrom(e)).toList();
    }
}
