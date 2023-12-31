package de20383;

import java.util.ArrayList;

public class TestTour {
public static void main(String[] args) {
	Tour t1= new Tour(1,"t1",100,3,"2N1D","oto");
	Tour t2= new Tour(2,"t2",1200,3,"2N1D","oto");
	Tour t3= new Tour(3,"t3",1030,3,"2N1D","oto");
	Tour t4= new Tour(4,"t4",1400,4,"2N1D","oto");
	Tour t5= new Tour(5,"t5",1050,5,"2N1D","oto");
	TourManagerImpl T= new TourManagerImpl();
	T.addTour(t1);
	T.addTour(t2);
	T.addTour(t3);
	T.addTour(t4);
	T.addTour(t5);
	System.out.println("mang ");
	T.print();
	T.delTour(t5);
	System.out.println("mang sau xoa");
	T.print();
	
	T.sortTour();
	System.out.println("mang sau xap xep ");
	System.out.println(T.sortTour());
	T.print();
	System.out.println("mang tim kiem ten");
	ArrayList<Tour> l1=T.searchTour("t3");
	l1.forEach(e->{
		System.out.println(e);
	});
	System.out.println("mang tim kiem gia");
	ArrayList<Tour> l2=T.searchTour(1039);
	l2.forEach(e->{
		System.out.println(e);
	});
	System.out.println("tong"+T.getTotalStorage());
	
	
}
}
