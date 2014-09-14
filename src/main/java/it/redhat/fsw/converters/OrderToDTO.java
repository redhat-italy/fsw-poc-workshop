package it.redhat.fsw.converters;

import it.redhat.fsw.domain.Order;
import it.redhat.fsw.domain.OrderLine;
import it.redhat.fsw.persistence.CustomerDTO;
import it.redhat.fsw.persistence.OrderDTO;
import it.redhat.fsw.persistence.OrderLineDTO;

import org.apache.camel.Converter;

@Converter
public class OrderToDTO {

	@Converter
	public OrderDTO from(Order order) {
		System.out.println("*******************************");
		System.out.println("Convert order");
		System.out.println("*******************************");
		CustomerDTO customerDTO = new CustomerDTO(order.getCustomerName(), order.getCustomerVAT());
		OrderDTO orderDTO = new OrderDTO(order.getOrderId(), customerDTO);
		for(OrderLine line: order.getLines()) {
			OrderLineDTO lineDTO = new OrderLineDTO(line.getLineID(), line.getProduct(), line.getQuantity(), 
					line.getPrice().getValue(), line.getPrice().getCurrency().toString());
			orderDTO.addLine(lineDTO);
		}
		return orderDTO;
	}
}
