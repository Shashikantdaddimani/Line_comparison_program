package com.line.comparison;
import java.util.*;
public class Line_Comparison {

	 void lengthCalculate() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter x1 co-ordinate : ");
	        int x1 = sc.nextInt();
	        System.out.println("Enter x2 co-ordinate : ");
	        int x2 = sc.nextInt();
	        System.out.println("Enter y1 co-ordinate : ");
	        int y1 = sc.nextInt();
	        System.out.println("Enter y2 co-ordinate : ");
	        int y2 = sc.nextInt();

	        Double lenOfLineFirst = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	        System.out.println("Length of first line is " + lenOfLineFirst);
	    }

	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line comparison computation program");
		Line_Comparison lc = new Line_Comparison();
		lc.lengthCalculate();
	}
		
	}


