
package utilities;

import objects.*;
import java.util.*;// khai báo đế sử dụng ArrayList<>

/**
 * Sinh ngẫu nhiên mảng nguyên (int) 1 chiều với n phần tử
 * 
 * @ppram n- số phần tử của mảng
 * @return - mảng có giá trị ngẫu nhiên [0,100)
 */
public class MyArrays {
	public static int[] gennerateArray(int n) {
		int[] arrInt = new int[n];

		for (int i = 0; i < n; i++) {
			arrInt[i] = (int) (Math.random() * 100);
		}
		return arrInt;
	}

	public static Person[] generatePerson(int n) {
		// mang trung gian
		Person[] list = new Person[n];
		// danh sachs tên
		String[] firstNames = { "Anh ", "Anh Tuấn", "Tuấn Anh", "Cường", "Cương", "Hùng", "Đạt", "Dương", "Công",
				"Giang", "Huyền", "Đoàn ", "Đại", "Minh", "Hương", "Ngát", "Vân", "Kiên", "Tú", "Hải", "Hoài", "Tùng",
				"Thuỷ", "Hà", "Huy", "Thao", "Ngân", "Kiệt", "Ánh", "Oanh" };
		// danh sách họ
		String[] lastNames = { "Bùi", "nguyễn", "Đỗ", "Phạm", "Chương", "Lê", "Lường", "Lại", "Lò", "Đào", "Trần", "vũ",
				"Quoách", "Doãn", "Chu", "Lỗ" };
		// sinh ngẫu nhiên phần tử mảng
		int index;
		for (int i = 0; i < list.length; i++) {
			// cấp phát bộ nhớ cho phần tử mảng
			list[i] = new Person();

			// ngẫu nhiên tên
			index = (int) (Math.random() * firstNames.length);
			list[i].setFirstName(firstNames[index]);

			// ngẫu nhiên họ
			index = (int) (Math.random() * lastNames.length);
			list[i].setLastName(lastNames[index]);

			// ngẫu nhiên tuổi
			index = 18 + (int) (Math.random() * 5);
			list[i].setAge((byte) index);
		}
		return list;
	}

	public static int[] filterArray(int[] arrInt, boolean isINC) {
		// sap xep
		arrInt = MyArrays.sortedArrays(arrInt, isINC);
		// tach nguyen to
		int[] temp1 = new int[arrInt.length];// luu nguyen to
		int[] temp2 = new int[arrInt.length];// luu ko nt
		int t1 = 0, t2 = 0;
		for (int value : arrInt) {
			if (basic.Examples3.isPrime(value)) {
				temp1[t1++] = value;
			} else {
				temp2[t2++] = value;
			}
		}
		// gop mang
		for (int i = t1; i < temp1.length; i++) {
			temp1[i] = temp2[i - t1];
		}
		return temp1;
	}

	//
	public static Person[] searchPerson(Person[] list, String name) {
		// khai báo mảng kết quả
		Person[] results = null;

		// dếm số kết quả
		int count = 0;
		for (Person p : list) {
//			if(p.getFirstName()==name) so sánh bị lỗi vì "=" so sánh 2 địa chỉ,mà  địa chỉ 2 đối tượng luôn khác nhau
			if (p.getFirstName().contains(name)) {//so sánh tên có chứa 
				count++;
			}
		}
		// khởi tạo bộ nhớ
		results = new Person[count];
		// ghi nhận kết quả
		count = 0;
		for (Person p : list) {
//			if(p.getFirstName().equalsIgnoreCase(name)) {
			if (p.getFirstName().contains(name)) {
				results[count++] = p;
			}
		}

		return results;
	}

	//
	public static ArrayList<Person> searchPersonV2(Person[] list, String name) {
		// mảng trung gian
		ArrayList<Person> results = new ArrayList<Person>();// ngầm định khở tạo 10 phần tử, thiếu bổ sung thêm, thừa
															// thì lấy ra

		// ghi nhận
		for (Person p : list) {
			if (p.getFirstName().contains(name)) {
				results.add(p);
			}
		}

		return results;
	}

	// method sort
	public static int[] sortedArrays(int[] arrInt, boolean isINC) {
		// xac dinh huong sap xep
		byte oriented = (byte) (isINC ? 1 : -1);

		int tmp;
		for (int i = 0; i < arrInt.length - 1; i++) {
			for (int j = i + 1; j < arrInt.length; j++) {
				if (arrInt[i] * oriented > arrInt[j] * oriented) {
					tmp = arrInt[i];
					arrInt[i] = arrInt[j];
					arrInt[j] = tmp;
				}

			}
		}
		return arrInt;
	}

	public static void printArray(int[] arrInt) {
		for (int value : arrInt) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public static void printPerson(Person[] list) {
		for (Person p : list) {
			System.out.println(p);
		}
	}
	public static void printPerson(ArrayList<Person> list) {
//		for (Person p : list) {
//			System.out.println(p);
//		}
		//vong for java 8
		list.forEach(p->{
			System.out.println(p);
		});
	}


	public static void main(String[] args) {

		Person[] list = MyArrays.generatePerson(20_000);
		printPerson(list);
		System.out.println("\n---------------------");
		ArrayList<Person> results = MyArrays.searchPersonV2(list, "Đạt");
		MyArrays.printPerson(results);

//		// sinh mang
//		int[] arrInt = MyArrays.gennerateArray(20);
//		// in mang
//		MyArrays.printArray(arrInt);
//		// xap xep
//		arrInt = MyArrays.sortedArrays(arrInt, false);
//		//
//		MyArrays.printArray(arrInt);
	}
}
