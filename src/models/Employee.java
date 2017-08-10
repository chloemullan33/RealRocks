package models;

public class Employee {
	
	private String name;
	private String addressLine1;
	private String addressLine2;
	private String town;
	private String postcode;
	private String natInsurance;
	private String bankAccountNumber;
	private String bankSortCode;
	private String startingSalary;
	private int employeeNumber;
	private int deptId;
	

	public Employee(String name, String addressLine1, String addressLine2, String town, String postcode, String natInsurance, String 
			bankAccountNumber, String bankSortCode, String startingSalary, int employeeNumber, int deptID) {
		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.town = town;
		this.postcode = postcode;
		this.natInsurance = natInsurance;
		this.bankAccountNumber = bankAccountNumber;
		this.bankSortCode = bankSortCode;
		this.startingSalary = startingSalary;
		this.employeeNumber = employeeNumber;
		this.deptId = deptID;

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


	public String getNatInsurance() {
		return natInsurance;
	}


	public void setNatInsurance(String natInsurance) {
		this.natInsurance = natInsurance;
	}


	public String getBankAccountNumber() {
		return bankAccountNumber;
	}


	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}


	public String getBankSortCode() {
		return bankSortCode;
	}


	public void setBankSortCode(String bankSortCode) {
		this.bankSortCode = bankSortCode;
	}


	public String getStartingSalary() {
		return startingSalary;
	}


	public void setStartingSalary(String startingSalary) {
		this.startingSalary = startingSalary;
	}


	public int getEmployeeNumber() {
		return employeeNumber;
	}


	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	

}
