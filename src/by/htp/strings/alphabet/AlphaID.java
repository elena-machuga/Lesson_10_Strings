package by.htp.strings.alphabet;

public class AlphaID {

	public static void main(String[] args) {
		alphabet("Hello World!");

	}

	public static void alphabet(String s) {
		String alphabeth = "abcdefghijklmnopqrstuvwxyz";
		char[] toChars = s.toLowerCase().toCharArray();

		char[] sToChars = s.toLowerCase().toCharArray();
		for (char x : sToChars) {
			System.out.print(x + "\t");
		}

		System.out.println();

		for (int i = 0; i < toChars.length; i++) {
			if (Character.isAlphabetic(toChars[i])) {
				int c = alphabeth.indexOf(toChars[i]);
				System.out.print(c + "\t");
			} else {
				System.out.print(toChars[i] + "\t");
			}
		}

	}

}
