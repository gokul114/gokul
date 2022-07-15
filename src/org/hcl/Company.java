package org.hcl;

public class Company extends Employee{
	public void companyName() {
System.out.println("company name = hcl");
	}
	public void companyId() {
System.out.println("company id = 1880");
	}
public static void main(String[] args) {
	Company c = new Company();
	c.companyId();
	c.companyName();
	c.empId();
	c.empNmae();
}
}
