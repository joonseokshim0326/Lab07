package edu.handong.csee.java.lab07;// defining package which our class is in

import java.util.Scanner;// Gets the Scanner class from the package(library)java.util

/**
 * Class YearTocentury is desinged to calculates the century given a year
 * Using class YearTocentury 1900 is 19th century and 1967 is 20th century
 * @author jssjp
 * @since 20180405
 */
public class YearToCentury  // defining class Year To century
{
	int year; // variable statement
	
	public YearToCentury()
	{
		year =0;
	}
	
	public YearToCentury(int year)
	{
		this.year = year;
	}
	
	public int calc_century()
	{
		if(year %100 == 0)
			year = year / 100;
		else
		{
			year = (year/100) +1;
		}
		return year;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       int yr = 0;
       Scanner keyboard =new Scanner(System.in);
       
       System.out.println("Input year: ");
       yr = keyboard.nextInt();

       YearToCentury year = new YearToCentury(yr);
       System.out.println(yr + " is " + year.calc_century() + "th century.");

		
	}

}
