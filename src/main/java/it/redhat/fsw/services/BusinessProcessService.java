package it.redhat.fsw.services;

import it.redhat.fsw.domain.Order;
import it.redhat.fsw.domain.OrderResponse;

public interface BusinessProcessService {

	OrderResponse submitOrder(Order order);
}
