package by.htp.strings.remove;

public class RemoveSubstring {

	public static void main(String[] args) {
		remove("Welcome to Hell!o World!", '!');

	}

	public static void remove(String s, char c) {
		int start = s.indexOf(c);
		int end = s.indexOf(c, start + 1);
		CharSequence sub = s.subSequence(start, end);
		String newstr = s.replace(sub, "");
		System.out.println(newstr);
	}

}
