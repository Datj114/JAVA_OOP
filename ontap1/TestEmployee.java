package ontap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> list= new ArrayList<Employee>();
		for(int i=0;i<10;i++) {
			int n= (int) (Math.random()*100);
			String[] names= {
					"lan","cuc","phuong","hong","tham","sen","sung","dao","bong","ngat","huong","hoa","hoe","huyn",
			};
			int h=(int) (Math.random()*100);
			if(n%2==0) {
				
				int t=1+(int) (Math.random()*6);
				PartTimeEmployee e = new PartTimeEmployee(names[(int) (Math.random()*names.length)],h,t);
				list.add(e);
			}else {
				FullTimeEmployee f=new FullTimeEmployee(names[(int) (Math.random()*names.length)],h);
				list.add(f);
			}
		}
		//
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				int o=o1.calculateSalary()-o2.calculateSalary();
				if(o>0) {
					return 1;
				}else if(o<0) {
					return -1;
				}else {
					return 0;
				}
			}
		});
//
		for (Employee employee : list) {
			System.out.println(employee);
		}
		for (Employee employee : list) {
			if(employee.getName().contains("lan")) {
				employee.setPaymentPerHour((int) (Math.random()*100));
			}
		}
		System.out.println("ds sau khi sua thong tin lan");
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
}
