package stringOparation;

public class Practice {
	public static void test() {
		StringBuilder sb = new StringBuilder();
		for( int i = 1 ; i < 101; i++) {
			sb.append(i).append(",");
		}
		String s = sb.toString();
		System.out.println(s);
		
		String[] a = s.split("[,]");
		for(String word : a) {
			System.out.println(word);
		}
		
	}
	
	public static String generateFileName(String file, String folder) {
		if (folder.matches(".*¥¥")) {
			return folder + file;
		}
		return folder + "¥" + file;
	}

}
