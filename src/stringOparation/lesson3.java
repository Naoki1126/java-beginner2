package stringOparation;

public class lesson3 {
	public static void test() {
		String s1 = "Java programming";
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
		
		System.out.println("文字列s1の4 ~ 8文字目は" + s1.substring(3, 8));
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 4; i++) {
			sb.append("Java");
		}
		
		String s = sb.toString();
		System.out.println(s);
		
		
	}
}
