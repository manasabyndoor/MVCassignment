package com.collection;

public class Cellphone implements Comparable<Cellphone> {

	private String company;
	private String model;
	String operatingSys;
	double price;
	String description;

	public Cellphone(String company, String model, String description, String operatingSys, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSys = operatingSys;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String moel) {
		this.model = moel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOperatingSys() {
		return operatingSys;
	}

	public void setOperatingSys(String operatingSys) {
		this.operatingSys = operatingSys;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Cellphone [company=" + company + ", model=" + model + ", operatingSys=" + operatingSys + ", price="
				+ price + ", description=" + description + "]";
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Cellphone cellphone) {
		// TODO Auto-generated method stub
		return this.getCompany().compareTo(cellphone.getCompany());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((operatingSys == null) ? 0 : operatingSys.hashCode());
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
		Cellphone other = (Cellphone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (operatingSys == null) {
			if (other.operatingSys != null)
				return false;
		} else if (!operatingSys.equals(other.operatingSys))
			return false;
		return true;
	}

	
}
