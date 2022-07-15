package org.hcl;

public class Client extends Company {
	private void clientName() {
System.out.println("client name = wipro");
	}
	public static void main(String[] args) {
		Client c = new Client();
		c.clientName();
		c.companyName();
		c.companyId();
		c.empId();
		c.empNmae();
	}

}
