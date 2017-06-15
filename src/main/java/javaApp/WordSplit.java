package javaApp;

import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

public class WordSplit {

	public static String[] splitWord(String word) {
		word = StringUtils.swapCase(word);
		String[] split = word.split("");
		return split;
	}

	public static void main(String[] args) {
	 	if (args.length == 0) {
	 		System.out.println("No words to split, hombre.");
	 	}
		for (int i = 0; i < args.length; i+=1) {
			System.out.println(Arrays.toString(splitWord(args[i])));
		}
	}
}
