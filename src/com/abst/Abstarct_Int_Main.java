package com.abst;

public class Abstarct_Int_Main implements Abstract_Inter_One,Abstract_Int_Two
{

	@Override
	public void sbi() {
System.out.println("balaji");		
	}

	@Override
	public void pincard() {
System.out.println("0987");		
	}

	@Override
	public void sbicard() {
System.out.println("123456789");		
	}

	@Override
	public void sbicvv() {
System.out.println("098");		
	}
public static void main(String[] args) {
	Abstarct_Int_Main lkj=new Abstarct_Int_Main();
	lkj.sbi();
	lkj.pincard();
	lkj.sbicard();
	lkj.sbicvv();
}
}
