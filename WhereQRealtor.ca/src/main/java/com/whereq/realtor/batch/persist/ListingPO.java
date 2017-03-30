package com.whereq.realtor.batch.persist;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @author bacon
 *
 */
@Entity
@Table (name = "FH_Listing")
public class ListingPO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(generator = "generator")
	@GenericGenerator(name = "generator", strategy = "increment")
	private long id;
	
	@Column
	private String name;
	
	@Column(name = "ml_num")
	private String MLS;

	@Column(name = "addr")
	private String Address;


	@Column(name = "s_r")
	private String SaleLease;
	
	
	@Column(name = "lp_dol")
	private Double ListPrice;
	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMLS() {
		return MLS;
	}



	public void setMLS(String mLS) {
		MLS = mLS;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public String getSaleLease() {
		return SaleLease;
	}



	public void setSaleLease(String saleLease) {
		SaleLease = saleLease;
	}



	public double getListPrice() {
		return ListPrice;
	}



	public void setListPrice(double listPrice) {
		ListPrice = listPrice;
	}


	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListingPO other = (ListingPO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
