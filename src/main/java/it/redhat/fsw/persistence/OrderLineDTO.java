package it.redhat.fsw.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_LINES")
public class OrderLineDTO {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "LINE_ID")
    private Long lineID;
	
	@Column(name = "PRODUCT")
    private String product;
	
	@Column(name = "QUANTITY")
    private Long quantity;
	
	@Column(name = "PRICE")
    private Long price;
	
	@Column(name = "CURRENCY")
    private String currency;

	public OrderLineDTO() {
	}
	
	public OrderLineDTO(Long lineID, String product, Long quantity, Long price,
			String currency) {
		this.lineID = lineID;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
		this.currency = currency;
	}

	public Long getLineID() {
		return lineID;
	}

	public void setLineID(Long lineID) {
		this.lineID = lineID;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
    
}
