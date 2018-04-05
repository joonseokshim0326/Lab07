package edu.handong.csee.java.lab07;// defining package which our class is in

import java.util.*; //make it possible to abbreviate references to data and methods in other packages
import java.util.Random; // allows to create objects that produce pseudo-random numbers 

/**
 * class Attendance is designed to express the number of classes absent to each student
 * if the number of absent greater than 6, then student will fail
 * @author jssjp
 * @since 20180405
 */
public class Attendance // defining class Attendence 
{
	private String name = ""; // private value "name statement
	private int year = 0; // private value "year" statement
	private String student_id = ""; //  private value "student_id" statement
	private int missed = 0; // private value "missed" statement

	//Constructors
	/**
	 * method Attendance is used to initialize the value
	 */
	public Attendance() // defining method Attendance
	{
		this.name = "Null"; // put value of Null to name
		this.year = 0; // put value of 0 to year
		this.student_id = "Null"; // put value of Null to student_id
		this.missed = 0; // put value of 0 to missed
	}

	/**
	 * method Attendance created instance of an object
	 * @param name
	 * @param year
	 * @param student_id
	 * @param missed
	 */
	public Attendance(String name, int year, String student_id, int missed) // defining method
	{
		this.name = name; // instance variable name
		this.year = year; // instance variable year
		this.student_id = student_id; // instance variable student_id
		this.missed = missed; // instance variable missed
	}

	//Getters
	/**
	 * method String get_name makes getting value of name
	 * @return value of name
	 */
	public String get_name() // defining method String get_name
	{
		return name; // returning value of name
	}
	/**
	 * method get_year makes getting value of year
	 * @return value of year
	 */
	public int get_year() // defining method get_year
	{
		return year; // returning value of year
	}


	/**
	 * method String get_id makes getting value of student_id
	 * @return value of student_id
	 */
	public String get_id() // defining method get_id
	{
		return student_id; // returning value of student_id
	}
	/**
	 * method get_missed makes getting value of missed
	 * @return value of missed
	 */
	public int get_missed() // defining method get missed
	{
		return missed; // returning value of missed
	}

	//Setters
	/**
	 * method set_name makes setting value of name
	 * @param name
	 */
	public void set_name(String name) // defining method set_name
	{
		this.name = name; // returning value of name
	}
	/**
	 * method set_year makes setting value of year
	 * @param year
	 */
	public void set_year(int year) // defining
	{
		this.year = year; // returning value of year
	}
	/**
	 * method set_id makes setting value of student_id
	 * @param student_id
	 */
	public void set_id(String student_id) // defining method set_id
	{
		this.student_id = student_id; // returning value of student_id
	}
	/**
	 * method set_missed makes setting value of missed
	 * @param missed
	 */
	public void set_missed(int missed) // defining method set_missed
	{
		this.missed = missed; // returning value of missed
	}
	/**
	 * This is main method which starts our program
	 * print out information of students and the number of absent
	 * If absent over 6, then print out message of fail
	 * @param args
	 */
	public static void main(String[] args) // defining main method
	{
		// TODO Auto-generated method stub
		Attendance s_1 = new Attendance(); // instantiate s_1
		Attendance s_2 = new Attendance(); // instantiate s_2
		Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0); // put information of student to s_3
		Attendance s_4 = new Attendance("Martha", 2, "21733444", 0); // put information of student to s_4

		s_1.set_name("Jess"); s_1.set_year(4); s_1.set_id("21400999"); s_1.set_missed(0); // put information of student to s_1
		s_2.set_name("Kent"); s_2.set_year(2); s_2.set_id("21700111"); s_2.set_missed(0); // put information of student to s_2

		Random randomGenerator = new Random(); // generate random value

		s_1.set_missed(randomGenerator.nextInt(10)); // generating random value between 1~10
		s_2.set_missed(randomGenerator.nextInt(10)); // generating random value between 1~10
		s_3.set_missed(randomGenerator.nextInt(10)); // generating random value between 1~10
		s_4.set_missed(randomGenerator.nextInt(10)); // generating random value between 1~10

		if(s_1.get_missed() > 6) // implement in condition of s_1.get_missed() > 6
		{
			System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course"); // print out name and text message
			System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed()); // print out name, missed and text message
		}
		else // implement in condition except for s_1.get_missed() > 6
			System.out.println("We'll see about the grade, " + s_1.get_name()); // print out text message and name

		if(s_2.get_missed() > 6) // implement in condition of s_2.get_missed() > 6
		{
			System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course");// print out name and text message
			System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());// print out name, missed and text message
		}
		else // implement in condition except for s_2.get_missed() > 6
			System.out.println("We'll see about the grade, " + s_2.get_name()); // print out text message and name

		if(s_3.get_missed() > 6) // implement in condition of s_3.get_missed() > 6
		{
			System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");// print out name and text message
			System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());// print out name, missed and text message
		}
		else // implement in condition except for s_3.get_missed() > 6
			System.out.println("We'll see about the grade, " + s_3.get_name()); // print out text message and name
		if(s_4.get_missed() > 6)// implement in condition of s_4.get_missed() > 6
		{
			System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");// print out name and text message
			System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed());// print out name, missed and text message
		}
		else // implement in condition except for s_4.get_missed() > 6
			System.out.println("We'll see about the grade, " + s_4.get_name()); // print out text message and name


	}

}
