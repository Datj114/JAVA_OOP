package TestKT;

import java.util.ArrayList;

public class TestMobile {
	public static void main(String[] args) {
		Mobile m1= new Mobile(01,"a1",1000,5,"samsung","8BG");
		Mobile m2= new Mobile(02,"a2",1200,3,"samsung","8BG");
		Mobile m3= new Mobile(03,"a3",13000,4,"samsung","16BG");
		Mobile m4= new Mobile(04,"a4",14000,5,"samsung","8BG");
		Mobile m5= new Mobile(05,"a5",11000,2,"apple","8BG");
		Mobile m6= new Mobile(04,"a4",14000,5,"samsung","8BG");
		MobileManagerImpl M= new MobileManagerImpl();
		
		//them
		M.addMobile(m1);
		M.addMobile(m2);
		M.addMobile(m3);
		M.addMobile(m4);
		M.addMobile(m5);
		for (Mobile m : M.getList()) {
			System.out.println(m);
		}
		//xoa
		M.delMobile(m5);
		System.out.println("danh sach sau khi xoa");
		for (Mobile m : M.getList()) {
			System.out.println(m);
		}
		//tim
		ArrayList<Mobile> l= M.searchMobile("a2");
		System.out.println("danh sach tim kiem");
		for (Mobile mobile : l) {
			System.out.println(mobile);
		}
		//tinh tong
		System.out.println("tong so tien toan bo sp "+M.getTotalStorage());
	}
}
