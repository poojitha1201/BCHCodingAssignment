package com.common;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Poojitha_Alla
 *
 */
public class CommonNumbers {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
	      ArrayList<Integer> list1 = new ArrayList<Integer>();
	      System.out.println("Enter numbers into list1, Press any non integer value to stop entering values into list and hit Enter");
	      while(scan.hasNextInt()){
	         list1.add(scan.nextInt());
	      }
	      if(list1.size()==0){
	    	  System.out.println("No values entered into list");
	      }
	      else
	      {
	      System.out.println("Then numbers in the list1 are:" +list1);
	      }
	      
	      Scanner scanner=new Scanner(System.in);
	      ArrayList<Integer> list2 = new ArrayList<Integer>();
	      System.out.println("Enter numbers into list2, Press any non integer value to stop entering values into list and hit Enter");
	     
	      while(scanner.hasNextInt()){
		      list2.add(scanner.nextInt());
		  }
		  if(list2.size()==0){
	    	  System.out.println("No values entered into list");
	      }
	      else
	      {
	      System.out.println("Then numbers in the list2 are:" +list2);
	      }
	
		ArrayList<Integer>common=new ArrayList<Integer>(list2);
		common.retainAll(list1);
		if(common.size()!=0){
		System.out.println("The common numbers in both the lists are " +common);
		}
		else{
			System.out.println("There are no common numbers in both the lists");
		}
		scan.close();
		scanner.close();
	
	}

}
