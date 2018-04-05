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
	/**
	 * method YearToCentury put value of 0 to year
	 */
	public YearToCentury() // defining method YearToCentury
	{
		year =0; // value of year =0
	}
	/**
	 * method YearToCentury put value of year to this.year
	 * @param year
	 */
	public YearToCentury(int year) // defining method YearToCentury with int value year
	{
		this.year = year; // value of year = this.year
	}
	/**
	 * method calc_century calculate year to century
	 * @return the value of year which was converted to century
	 */
	public int calc_century() // defining method calc_century
	{
		if(year %100 == 0) // implement in the condition of year%100 =0
			year = year / 100; // divide year by 100 and put its value to year
		else // implement except for the condition of year%100 =0
		{
			year = (year/100) +1; // divide year by 100 and add 1 then put its value to year
		}
		return year; // return value of year
	}
	/**
	 * This is main method which starts our program
	 * Using input by keyboard and calculate  , then print out the results
	 * @param args
	 */
	public static void main(String[] args) // defining main method
	{
		// TODO Auto-generated method stub
		int yr = 0; // put value of 0 to yr
		Scanner keyboard = new Scanner(System.in); // data can be entered using keyboard

		System.out.println("Input year: ");// print out text and sets up things so the program can accept keyboard input
		yr = keyboard.nextInt(); // read number from keyboard

		YearToCentury year = new YearToCentury(yr); // // instantiate year
		System.out.println(yr + " is " + year.calc_century() + "th century."); // print out the result of calcultation


	}

}
