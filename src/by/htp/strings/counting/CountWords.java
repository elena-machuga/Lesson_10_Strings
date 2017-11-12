package by.htp.strings.counting;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

	public static void main(String[] args) {
		countWords(
				"The National Library of Greece is a library situated near the center of Athens\n that holds material produced in or related to Greece.");

	}

	public static void countWords(String text) {
		Map<String, Integer> map = new HashMap<>();
		System.out.println(text);
		String[] splitted = text.split("[,;:.!?\\s]+");
		for (String word : splitted) {
			int count = 0;
			for (int i = 0; i < splitted.length; i++) {
				if (word.equalsIgnoreCase(splitted[i])) {
					count++;
				}
			}
			map.put(word, count);
		}
		for (Map.Entry<String, Integer> pair : map.entrySet()) {
			System.out.println(pair.getKey() + " - " + pair.getValue());
		}

	}

}
