package edu.handong.csee.java.lab07; // defining package which our class is in

/**
 * class Chicken is designed to show evaluation of menus by star ratings
 * getters,setters and 3 menus are in class Chicken
 * @author jssjp
 * @since 20180405
 */
public class Chicken // defining class Chicken
{
	private String name; // private value "name" statement
	private double price; // private value "price" statement
	private int stars; // private value "stars" statement

	/**
	 * method Chicken is used to initialize the value
	 */
	public Chicken() // defining method Chicken
	{
		this.name = ""; // put current value of " " to name
		this.price = 0.0; // put current value of 0.0 to price
		this.stars = 0; // put current value of 0 to stars
	}
	/**
	 * method Chicken created instance of an object
	 * @param name
	 * @param price
	 * @param stars
	 */
	public Chicken(String name, double price, int stars) // defining method Chicken
	{
		this.name = name; // instance variable name
		this.price = price; // instance variable price
		this.stars = stars; // instance variable stars
	}

	/**
	 * method String get_name makes getting value of name
	 * @return value of name
	 */
	public String get_name() // defining method String get_name
	{
		return this.name; // returning value of name
	}
	/**
	 * method get_price makes getting value of price
	 * @return value of price
	 */
	public double get_price() // defining method get_price
	{
		return this.price; // returning value of price
	}
	/**
	 * method get_starts makes getting value of stars
	 * @return value of stars
	 */
	public int get_stars() // defining method get_stars
	{
		return this.stars; // returning value of stars
	}
	/**
	 * method set_name makes setting value of name
	 * @param name
	 */
	public void set_name(String name) //  defining method set_name
	{
		this.name = name; // returning value of name
	}
	/**
	 * method set_price makes setting value of price
	 * @param price
	 */
	public void set_price(double price) // defining method set_price
	{
		this.price = price; // returning value of price
	}
	/**
	 * method set_stars makes setting value of stars
	 * @param stars
	 */
	public void set_stars(int stars) // defining method set stars
	{
		this.stars = stars; // returning value of stars
	}
	/**
	 * This is main method that starts our program
	 * print out 3 menus and their number of stars 
	 * @param args
	 */
	public static void main(String[] args) // defining main method
	{
		// TODO Auto-generated method stub
		Chicken menu1 = new Chicken("Shoyu_Ramen", 16000.00, 5); // put name,price,stars to menu 1
		Chicken menu2 = new Chicken("Aglio_E_Olio", 16000.00, 4); // put name,price,stars to menu 2
		Chicken menu3 = new Chicken("Chop_Steak", 16000.00, 3); // put name,price,stars to menu 3

		menu1.set_stars(5); // set stars of menu1 to 5
		menu2.set_stars(4); // set stars of menu2 to 4
		menu3.set_stars(3); // set stars of menu3 to 3

		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars()); // print out text and value of stars for menu
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars()); // print out text and value of stars for menu
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars()); // print out text and value of stars for menu


	}

}
