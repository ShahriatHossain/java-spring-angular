package com.mycode.springbootecommerce.dto;

import com.mycode.springbootecommerce.entity.Address;
import com.mycode.springbootecommerce.entity.Customer;
import com.mycode.springbootecommerce.entity.Order;
import com.mycode.springbootecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
