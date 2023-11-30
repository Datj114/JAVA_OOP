package basic;

public class Examples3 {
	/**
	 * This method is used to check aint value to prime <br>
	 * <b>Update 02/11/23</b>
	 * @author Van Dat
	 * @param n
	 * @return
	 */
	// muon sd ham isPrime khong can goi ex -> them static
	public static boolean isPrime(int n) {
		boolean flag = true;
		// kiem tra
		if (n < 2) {
			flag = false;
		} else {
			for (int v = 2; v <= (int) (Math.sqrt(n)); v++) {
				if (n % v == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;// tra ve gia tri trung gian
	}
	/**
	 * This is method 
	 * @param a
	 * @param b
	 * @return
	 */
//	public static int getUCLN(int a,int b){
//		while(a!=b) {
//			if(a>b) {
//				a-=b;
//			}else {
//				b-=a;
//			}
//		}
//		return a;
//	}
	public static int getUCLN(int a,int b) {
		int ucln=-1;
		if (a*b!=0) {
			while(a!=b) {
				if(a>b) {
					a-=b;
				}else {
					b-=a;
				}
			}
			ucln=a;
		}
		return ucln;
	}
	public static int getUCLN(int a, int b,int c) {
		return Examples3.getUCLN(Examples3.getUCLN(a,b),c);
		
	}
	

	public static void main(String[] args) {
		//khai báo thể hiện đối tượng để thực hiện
		//A a=new A();
		//A b= new B(); khi A la cha cua B
		//Examples3 ex= new Examples3();
		int n= (int)(Math.random()*100);
		int m=(int)(Math.random()*100);
		//nhan ket qua
		//boolean flag = ex.isPrime(n);
		System.out.println("ucln cua n="+n+"m= "+m+"la"+Examples3.getUCLN(n,m));
		if (Examples3.isPrime(n)) {
			System.out.println("n=" + n + " la snt");
		} else {
		System.out.println("n="+n+" ko la snt");
		}
	}
}
