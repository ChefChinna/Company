package org.company;

public class CompanyInfo {
private void companyName() {
System.out.println("CompanyName - TovoInfusion");
}
private void companyId() {
System.out.println("companyId -600008");
}
private void companyAddress() {
System.out.println("companyAddress -RK Salai");
}
public static void main(String[] args) {
	CompanyInfo c=new CompanyInfo();
	c.companyName();
	c.companyId();
	c.companyAddress();
			
}
}

