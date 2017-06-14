/*************************************************************************
* 
* ADOBE CONFIDENTIAL
* __________________
* 
*  [2002] - [2007] Adobe Systems Incorporated 
*  All Rights Reserved.
* 
* NOTICE:  All information contained herein is, and remains
* the property of Adobe Systems Incorporated and its suppliers,
* if any.  The intellectual and technical concepts contained
* herein are proprietary to Adobe Systems Incorporated
* and its suppliers and may be covered by U.S. and Foreign Patents,
* patents in process, and are protected by trade secret or copyright law.
* Dissemination of this information or reproduction of this material
* is strictly forbidden unless prior written permission is obtained
* from Adobe Systems Incorporated.
*/

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
