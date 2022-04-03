package stringOparation;

public class lesson4 {
	public static void test() {
		String s = "Java";
		s.matches("Java");
		s.matches("JavaJava");
		s.matches("java");
		System.out.println("Java".matches("J.va"));
		
		String s2 = "abc,def:ghi";
		String[] words = s2.split("[,:]");
		for( String w : words){
			System.out.println(w + "->");
		}

		String s3 = "abc,def:ghi";
		String w2 = s3.replaceAll("[beh]", "X");
		System.out.println(w2);
		
		
	}
	
	public boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}
