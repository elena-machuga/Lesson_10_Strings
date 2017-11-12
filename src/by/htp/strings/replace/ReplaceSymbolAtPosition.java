package by.htp.strings.replace;

public class ReplaceSymbolAtPosition {

	public static void main(String[] args) {
		replace("Hello World!", 0, 'z');

	}

	public static void replace(String s, int k, char r) {

		String[] split = s.split(" ");

		StringBuilder sb = new StringBuilder();

		for (String temp : split) {
			if (k < temp.length()) {
				char[] tochar = temp.toCharArray();
				tochar[k] = r;
				sb.append(tochar);
				sb.append(" ");
			} else {
				sb.append(temp);
				sb.append(" ");
			}
		}

		String result = new String(sb);

		System.out.println(result);

	}

}
