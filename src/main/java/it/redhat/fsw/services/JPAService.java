package it.redhat.fsw.services;

import it.redhat.fsw.persistence.OrderDTO;

public interface JPAService {

	void save(OrderDTO order);
}
