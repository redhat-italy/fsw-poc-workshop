package it.redhat.fsw.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS")
public class CustomerDTO {

	@Id
	@Column(name="NAME")
    private String customerName;
	
	@Column(name="VAT")
    private String customerVAT;

	public CustomerDTO() {
	}
	
	public CustomerDTO(String name, String vat) {
		this.customerName = name;
		this.customerVAT = vat;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerVAT() {
		return customerVAT;
	}

	public void setCustomerVAT(String customerVAT) {
		this.customerVAT = customerVAT;
	}

}
