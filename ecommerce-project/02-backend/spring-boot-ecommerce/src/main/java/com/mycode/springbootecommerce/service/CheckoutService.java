package com.mycode.springbootecommerce.service;

import com.mycode.springbootecommerce.dto.Purchase;
import com.mycode.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
