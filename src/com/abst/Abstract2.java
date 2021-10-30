package com.abst;

public class Abstract2 extends Abstract1
{

	@Override
	public void password() {
System.out.println("1234"); 		
	}

	@Override
	public void phoneno() {
System.out.println("98765432");		
	}
public static void main(String[] args) {
	Abstract2 poi=new Abstract2();
	poi.name();
	poi.age();
	poi.dob();
	poi.password();
	poi.phoneno();
}
}
