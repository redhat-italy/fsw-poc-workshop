package it.redhat.fsw.services;

import it.redhat.fsw.domain.Order;

public interface BusinessProcessService {

	void submitOrder(Order order);
}
