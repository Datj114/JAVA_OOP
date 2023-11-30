package utilities;

public class Exercise_Array {
	// make array
	public static int[] makeArray(int n) {
		int Arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			Arr[i] = (int) (Math.random() * 100);
		}
		return Arr;
	}

	// sort
	public static int[] sortedArray(int[] Arr) {
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr.length - 1; j++) {
				if (Arr[j] < Arr[j + 1]) {
					int temp = Arr[j];
					Arr[j] = Arr[j + 1];
					Arr[j + 1] = temp;
				}
			}
		}
		return Arr;
	}

	// tìm số nguyên tố
	public static boolean isprime(int n) {
		if (n < 2)
			return false;
		else {
			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		}
	}

	//
	public static void displayArr(int[] Arr) {
		for (int value : Arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	// ham main
	public static void main(String[] args) {
		int a[] = makeArray(22);
		a = Exercise_Array.sortedArray(a);
		int i = 0;
		int[] b = new int[22];
		for (int value : a) {
			if (isprime(value)) {
				b[i] = value;
				i++;
			}
		}
		for (int value : a) {
			if (isprime(value) == false) {
				b[i] = value;
				i++;
			}
		}
		System.out.println("mang truoc khi thay doi");
		displayArr(a);
		System.out.println("mang sau khi thay doi");
		displayArr(b);

	}
}
