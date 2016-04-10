package com.reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Poojitha_Alla
 *
 */
public class ReverseWords {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String \n");
        String sentence ="";
        try {
			 sentence = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("The reverse of a sentence is \n" +reverseWords(sentence));
	}
	
	public static String reverseWords(String sentence) {
	    StringBuilder sb = new StringBuilder();
	    String[] words = sentence.split(" ");
	    for (int i = words.length - 1; i >= 0; i--) {
	        sb.append(words[i]+" ");
	    }
	    return sb.toString();
	}

}
