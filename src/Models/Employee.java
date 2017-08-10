package Models;

public class Employee {
	public int employeeNumber;
	public String name;
	public String addressLine1;
	public String addressLine2;
	public String town;
	public String postcode;
	public String bankAccountNo;
	public String sortCode;
	public int deptId;
	
	public void setDeptId(int id) {
		this.deptId = id;
	}
	
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getNatInsurance() {
		return natInsurance;
	}

	public void setNatInsurance(String natInsurance) {
		this.natInsurance = natInsurance;
	}

	public double getStartSalary() {
		return startSalary;
	}

	public void setStartSalary(double startSalary) {
		this.startSalary = startSalary;
	}

	public String natInsurance;
	public double startSalary;

	public Employee() {
	}


	public int getDeptId() {
		// TODO Auto-generated method stub
		return this.deptId;
	}

}
