package stringOparation;

public class lesson2 {
	public static void test() {
		String s1 = "Java and Javascript";
		if (s1.contains("Java")) {
			System.out.println("文字列s1はJavaを含んでいます");
		}
		
		if (s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}
		
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
	}
}
