package utilities;

public class MyStrings {
	/**
	 * phương thức đếm số ký tự giống nhau trong chuỗi
	 * @param str  chuỗi ký tự đầu vào
	 * @param ch ký tự cần đếm số lượng
	 * @param isIgnoreCase phân biệt kiểu chữa hoa, thường
	 * @return kết quả đếm được
	 */
	public static int countChar(String str, char ch, boolean isIgnoreCase) {
		//nếu bỏ qua kiểu chữ
		if(isIgnoreCase){
			str=str.toLowerCase();
			ch=Character.toLowerCase(ch);
		}
		int count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}
	
	public static String formatString(String str) {
		char[] chs= {
				'~','`','@','#','$','%','^','&','*','(',')',
				'_','-','+','=','<','>','/','{','}','[',']','\'','\\',
				'9','8','7','6','5','4','3','2','1','0'
		};
		//loại bỏ ký tự đặc biệt
		for(char ch: chs) {
			str=str.replace(ch, ' ');
		}
		//xử lý các ký tự liên quan đến ngắt câu, ngắt ý
		String[] chs2= {
				" ?"," ? ","? ",
				" !"," ! ","! ",
				" ;"," ; ","; ",
				" ,"," , ",", ",
		};
		for (String tmp: chs2) {
			str=str.trim();			
			int at=str.indexOf(tmp);
			if(at==0) {
				str=str.substring(tmp.length());
				
			}
			if(at>0) {
				str=str.replace(tmp, tmp.trim());
			}
		}
		//loại bỏ dấu cách thừa
		//-1 là chỉ tồn tại 
		while(str.indexOf("  ")!=-1) {
			str=str.replace("  ", " ");
		}

		return str;
	}
	/**
	 * Đếm số lượng chuối ký tự trong một chuỗi ký tự
	 * @param str chuỗi đầu vào
	 * @return số lượng chuỗi
	 */
	public static int countWords(String str) {
//		int count=1;
//		for(int i=0;i<str.length()-1;i++) {
//			if(str.charAt(i)==' ' && str.charAt(i+1)==Character.i) {
//				count++;
//			}
//		}
//		if(str.charAt(0)==' ') count--;
//		return count;
		
		//chuẩn hoá
		str=MyStrings.formatString(str);
		System.out.println(str);
		return MyStrings.countChar(str, ' ', false)+1;
	}
	
	public static String gerWords( String str, byte nWords) {
		//chuẩn hoá chuỗi
		str=MyStrings.formatString(str);
		//xác định vị trí cần cắt
		int i=0;
		int count=0;//đếm số dấu cách
		for( i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
			if(count==nWords) {
				break;
			}
		}
		//trả về kết quả
		if(i<str.length()-1) {
			return str.substring(0,i)+"...";
			
		}else {
			return str;
		}
	}
	public static void main(String[] args) {
		String str="cong hoa xa   hoi chu nghia viet nam";
		
//		int count =MyStrings.countChar(str, 'e',true);
//		System.out.println("có "+count+" ký tự e");
		
		System.out.println("có "+countWords(str)+" từ");
		System.out.println(MyStrings.gerWords(str, (byte)9));
	}
}
//bt #abc###nhd##abc##nhd#kio#lod#abc
//thống kê số lần xuất hiện
