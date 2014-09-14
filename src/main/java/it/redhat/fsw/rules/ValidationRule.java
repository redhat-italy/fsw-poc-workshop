package it.redhat.fsw.rules;

import it.redhat.fsw.domain.Order;

public interface ValidationRule {
	
	boolean validate(Order order);
}
