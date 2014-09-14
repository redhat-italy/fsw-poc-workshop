package it.redhat.fsw.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class OrderDTO {

	@Id
	private String id;

	@ManyToOne(cascade = CascadeType.ALL)
	private CustomerDTO customer;

	@OneToMany(cascade = CascadeType.ALL)
	private List<OrderLineDTO> lines;

	public OrderDTO(String orderId, CustomerDTO customerDTO) {
		this.id = orderId;
		this.customer = customerDTO;
	}

	public void addLine(OrderLineDTO line) {
		if (lines == null) {
			lines = new ArrayList<OrderLineDTO>();
		}
		lines.add(line);
	}
}
