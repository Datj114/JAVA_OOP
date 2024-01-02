package de23671;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TestSach {
	private ArrayList<SachGiaoTrinh> list;
	static Scanner sc = new Scanner(System.in);

//	public void printList() {
//		this.list.forEach(e->{
//			System.out.println(e.getInfor());
//		});
//	}
	public void taoDuLieu() {
		this.list = new ArrayList<SachGiaoTrinh>(10);

		SachGiaoTrinh s1 = new SachGiaoTrinh("a", "a", "2003", 45);
		SachGiaoTrinh s2 = new SachGiaoTrinh("s", "a", "2013", 45);
		SachGiaoTrinh s3 = new SachGiaoTrinh("xa", "d", "2010", 45);
		SachGiaoTrinh s4 = new SachGiaoTrinh("ac", "d", "2013", 43);
		SachGiaoTrinh s5 = new SachGiaoTrinh("ad", "a", "2012", 42);
		SachGiaoTrinh s6 = new SachGiaoTrinh("az", "a", "2013", 41);
		SachGiaoTrinh s7 = new SachGiaoTrinh("ta", "x", "2013", 3);
		SachGiaoTrinh s8 = new SachGiaoTrinh("ya", "x", "2014", 4);
			SachGiaoTrinh s9 = new SachGiaoTrinh("ia", "a", "2013", -5);
			this.list.add(s9);
		
		SachGiaoTrinh s10 = new SachGiaoTrinh("oa", "h", "2021", 15);
		this.list.add(s1);
		this.list.add(s2);
		this.list.add(s3);
		this.list.add(s4);
		this.list.add(s5);
		this.list.add(s6);
		this.list.add(s7);
		this.list.add(s8);
		
		this.list.add(s10);
		Collections.sort(this.list, new Comparator<SachGiaoTrinh>() {

			@Override
			public int compare(SachGiaoTrinh o1, SachGiaoTrinh o2) {
				double result = o1.getPrice() - o2.getPrice();
				if (result > 0) {
					return 1;
				} else if (result < 0) {
					return -1;
				}
				return 0;
			}
		});
		this.list.forEach(e -> {
			System.out.println(e);
		});
	}

	public void timKiem(String tieude) throws Exception {

		for (Sach s : this.list) {
			if (s.getTitle().contains(tieude)) {
				System.out.println("tacgia");
				s.setAuthor(sc.nextLine());
				System.out.println("title");
				try {
					s.setTitle(sc.nextLine());
				}catch(Exception ex){
					ex.printStackTrace();
				}
				System.out.println("year");
				s.setYear(sc.nextLine());
				System.out.println("price");
				s.setPrice(sc.nextDouble());
			}
		}
		Collections.sort(this.list, new Comparator<SachGiaoTrinh>() {

			@Override
			public int compare(SachGiaoTrinh o1, SachGiaoTrinh o2) {
				// TODO Auto-generated method stub
				return o1.getYear().compareTo(o2.getYear());
			}

		});
		this.list.forEach(e -> {
			System.out.println(e);
		});
	}

	public static void main(String[] args) throws Exception {
		TestSach t = new TestSach();
		t.taoDuLieu();
		String tieude = sc.nextLine();
		t.timKiem(tieude);
	}
}
