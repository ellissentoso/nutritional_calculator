/* Name: Ellis Sentoso
 *  Professor: Dave Harden
 *  Class: CS1 - Java
 *  Assignment: Lab 3 - Nutritional Calculator
 *  Email: ellissentoso@gmail.com
 *  Date: 07/11/2019
 */
package nutrition;

import java.util.Scanner;

public class Foothill {
	// food #1 constants: https://nutritiondata.self.com/facts/soups-sauces-and-gravies/1316/2
	static final String FOOD_1_NAME = "Marinara sauce";
	static final int FOOD_1_CALORIES_P100G = 87;  // in calories
	static final double FOOD_1_SOL_FIBER_P100G = 2.6;   // in grams
	static final double FOOD_1_SOL_PROTEIN_P100G = 1.8;   // in grams
	static final double FOOD_1_SOL_FAT_P100G = 2.7;   // in grams

	//*********************************************************

	// food #2 constants: https://nutritiondata.self.com/facts/dairy-and-egg-products/25/2
	static final String FOOD_2_NAME = "Mozzarella Cheese";
	static final int FOOD_2_CALORIES_P100G = 300;  // in calories
	static final double FOOD_2_SOL_FIBER_P100G = 0.;   // in grams
	static final double FOOD_2_SOL_PROTEIN_P100G = 22.2;   // in grams
	static final double FOOD_2_SOL_FAT_P100G = 22.4;   // in grams

	// food #3 constants: https://nutritiondata.self.com/facts/vegetables-and-vegetable-products/2482/2
	static final String FOOD_3_NAME = "Mushrooms";
	static final int FOOD_3_CALORIES_P100G = 22;  // in calories
	static final double FOOD_3_SOL_FIBER_P100G = 1.;   // in grams
	static final double FOOD_3_SOL_PROTEIN_P100G = 3.1;   // in grams
	static final double FOOD_3_SOL_FAT_P100G = 0.3;   // in grams

	// food #4 constants: https://nutritiondata.self.com/facts/fruits-and-fruit-juices/1964/2
	static final String FOOD_4_NAME = "Olives";
	static final int FOOD_4_CALORIES_P100G = 115;  // in calories
	static final double FOOD_4_SOL_FIBER_P100G = 3.2;   // in grams
	static final double FOOD_4_SOL_PROTEIN_P100G = 0.8;   // in grams
	static final double FOOD_4_SOL_FAT_P100G = 10.7;   // in grams

	// food #5 constants: https://nutritiondata.self.com/facts/fast-foods-generic/9304/2
	static final String FOOD_5_NAME = "Pizza Crust";
	static final int FOOD_5_CALORIES_P100G = 257;  // in calories
	static final double FOOD_5_SOL_FIBER_P100G = 1.4;   // in grams
	static final double FOOD_5_SOL_PROTEIN_P100G = 11.0;   // in grams
	static final double FOOD_5_SOL_FAT_P100G = 8.4;   // in grams

	// food #6 constants: https://nutritiondata.self.com/facts/sausages-and-luncheon-meats/1369/2
	static final String FOOD_6_NAME = "Pepperoni";
	static final int FOOD_6_CALORIES_P100G = 494;  // in calories
	static final double FOOD_6_SOL_FIBER_P100G = 0.;   // in grams
	static final double FOOD_6_SOL_PROTEIN_P100G = 22.7;   // in grams
	static final double FOOD_6_SOL_FAT_P100G = 44.0;   // in grams

	static final String INDENT = "   ";
	static final String SEPARATOR = "\n";

	public static void main(String[] args) {
		String recipeName, userInputStr;
		int userInputInt, servings = 0;
		double totalSolFiber, totalCals, totalFat, totalProtein;


		String userName;
		Scanner inputStream = new Scanner(System.in);

		// initialize accumulator variables
		totalSolFiber  = 0.;
		totalCals =  0;
		totalFat = 0;
		totalProtein = 0;

		// print menu
		System.out.println("---------- List of Possible Ingredients ---------");
		System.out.println(INDENT + "Food #1: " + FOOD_1_NAME);
		System.out.println(INDENT + "Food #2: " + FOOD_2_NAME);
		System.out.println(INDENT + "Food #3: " + FOOD_3_NAME);
		System.out.println(INDENT + "Food #4: " + FOOD_4_NAME);
		System.out.println(INDENT + "Food #5: " + FOOD_5_NAME);
		System.out.println(INDENT + "Food #6: " + FOOD_6_NAME + SEPARATOR);     

		// name of recipe
		System.out.print("What are you calling this recipe ? ");
		recipeName  = inputStream.nextLine();	// taking user input and storing to var

		System.out.print("What is your name?"); // Asking user for their name
		userName = inputStream.nextLine();	    // storing answer to a string var

		// Servings asker
		System.out.print("How many servings will your recipe have? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);{
			if(userInputInt < 1) { // error handling 
				System.out.println("Error Message: out of bound");
				System.exit(0);
			}
			else if(userInputInt > 15) { // error handling
				System.out.println("Error Message: out of bound");
				System.exit(0);
			}
			else {
				servings = userInputInt;
			}
		}

		// food #1 ---------------------------------------------------------
		System.out.print("How many grams of " + FOOD_1_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);{ // string to int
			if(userInputInt < 0) { // error handling
				System.exit(0);
			}
			else if(userInputInt > 1500) { // error handling for out of range
				System.exit(0);
			}
			else {

				// update accumulators
				totalFat += userInputInt * (FOOD_1_SOL_FAT_P100G / 100.);
				totalProtein += userInputInt * (FOOD_1_SOL_PROTEIN_P100G / 100.);
				totalCals += userInputInt * (FOOD_1_CALORIES_P100G / 100.);
				totalSolFiber  += userInputInt * (FOOD_1_SOL_FIBER_P100G / 100.);

			}
		}
		// food #2 ---------------------------------------------------------
		System.out.print("How many grams of " + FOOD_2_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr); // convert str to int
		if(userInputInt < 0) { // error handling
			System.exit(0);
		}
		else if(userInputInt > 1500) { // error handling for out of range
			System.exit(0);
		}
		else {

			// update accumulators
			totalCals += userInputInt * (FOOD_2_CALORIES_P100G / 100.);
			totalSolFiber  += userInputInt * (FOOD_2_SOL_FIBER_P100G / 100.);
			totalFat += userInputInt * (FOOD_2_SOL_FAT_P100G / 100.);
			totalProtein += userInputInt * (FOOD_2_SOL_PROTEIN_P100G / 100.);
		}
		// food #3 ---------------------------------------------------------
		System.out.print("How many grams of " + FOOD_3_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);

		if(userInputInt < 0) { // error handling
			System.exit(0);
		}
		else if(userInputInt > 1500) { // error handling for out of range
			System.exit(0);
		}
		else {
			// update accumulators
			totalCals += userInputInt * (FOOD_3_CALORIES_P100G / 100.);
			totalSolFiber  += userInputInt * (FOOD_3_SOL_FIBER_P100G / 100.);
			totalFat += userInputInt * (FOOD_3_SOL_FAT_P100G / 100.);
			totalProtein += userInputInt * (FOOD_3_SOL_PROTEIN_P100G / 100.);
		}
		// food #4 ---------------------------------------------------------
		System.out.print("How many grams of " + FOOD_4_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);
		if(userInputInt < 0) { // error handling
			System.exit(0);
		}
		else if(userInputInt > 1500) { // error handling for out of range
			System.exit(0);
		}
		else {
			// update accumulators
			totalCals += userInputInt * (FOOD_4_CALORIES_P100G / 100.);
			totalSolFiber  += userInputInt * (FOOD_4_SOL_FIBER_P100G / 100.);
			totalFat += userInputInt * (FOOD_4_SOL_FAT_P100G / 100.);
			totalProtein += userInputInt * (FOOD_4_SOL_PROTEIN_P100G / 100.);
		}
		// food #5 ---------------------------------------------------------
		System.out.print("How many grams of " + FOOD_5_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);
		if(userInputInt < 0) { // error handling
			System.exit(0);
		}
		else if(userInputInt > 1500) { // error handling for out of range
			System.exit(0);
		}
		else {
			// update accumulators
			totalCals += userInputInt * (FOOD_5_CALORIES_P100G / 100.);
			totalSolFiber  += userInputInt * (FOOD_5_SOL_FIBER_P100G / 100.);
			totalFat += userInputInt * (FOOD_5_SOL_FAT_P100G / 100.);
			totalProtein += userInputInt * (FOOD_5_SOL_PROTEIN_P100G / 100.);
		}
		// food #6 ---------------------------------------------------------
		System.out.print("How many grams of " + FOOD_6_NAME + "? ");
		userInputStr = inputStream.nextLine();
		userInputInt = Integer.parseInt(userInputStr);
		if(userInputInt < 0) { // error handling
			System.exit(0);
		}
		else if(userInputInt > 1500) { // error handling for out of range
			System.exit(0);
		}
		else {
			// update accumulators
			totalCals += userInputInt * (FOOD_6_CALORIES_P100G / 100.);
			totalSolFiber  += userInputInt * (FOOD_6_SOL_FIBER_P100G / 100.);
			totalFat += userInputInt * (FOOD_6_SOL_FAT_P100G / 100.);
			totalProtein += userInputInt * (FOOD_6_SOL_PROTEIN_P100G / 100.);
			inputStream.close();
		}
		// report results --------------------------------------------------
		System.out.println("\nThe servings for your recipe, " + recipeName + ", is " + servings + ".");
		System.out.println("\nNutrition for " + userName + " Simple " + recipeName + "------------"); 
		System.out.println(INDENT + "Calories: " + totalCals);
		System.out.println(INDENT + "Soluble Fiber: " + totalSolFiber + " grams");   
		System.out.println(INDENT + "Fat: " + totalFat+ " grams");
		System.out.println(INDENT + "Protein: " + totalFat+ " grams");

	}


}
/*----------------- Sample Run 1 -----------------------------------------------
 ---------- List of Possible Ingredients ---------
   Food #1: Marinara sauce
   Food #2: Mozzarella Cheese
   Food #3: Mushrooms
   Food #4: Olives
   Food #5: Pizza Crust
   Food #6: Pepperoni

What are you calling this recipe ? Cheesy Pizza
What is your name?Ellis
How many servings will your recipe have? 1
How many grams of Marinara sauce? 100
How many grams of Mozzarella Cheese? 100
How many grams of Mushrooms? 0
How many grams of Olives? 0
How many grams of Pizza Crust? 100
How many grams of Pepperoni? 0

The servings for your recipe, Cheesy Pizza, is 1.

Nutrition for Ellis Simple Cheesy Pizza------------
   Calories: 644.0
   Soluble Fiber: 4.0 grams
   Fat: 33.5 grams
   Protein: 33.5 grams
 *----------------- Sample Run 2 -----------------------------------------------
   ---------- List of Possible Ingredients ---------
   Food #1: Marinara sauce
   Food #2: Mozzarella Cheese
   Food #3: Mushrooms
   Food #4: Olives
   Food #5: Pizza Crust
   Food #6: Pepperoni

What are you calling this recipe ? Meaty Pizza
What is your name?Ellis
How many servings will your recipe have? 1
How many grams of Marinara sauce? 40
How many grams of Mozzarella Cheese? 40
How many grams of Mushrooms? 40
How many grams of Olives? 40
How many grams of Pizza Crust? 50
How many grams of Pepperoni? 50

The servings for your recipe, Meaty Pizza, is 1.

Nutrition for Ellis Simple Meaty Pizza------------
   Calories: 585.1
   Soluble Fiber: 3.42 grams
   Fat: 40.64 grams
   Protein: 40.64 grams

 *----------------- Sample Run 3 Throwing an Error-----------------------------------------------
 *---------- List of Possible Ingredients ---------
   Food #1: Marinara sauce
   Food #2: Mozzarella Cheese
   Food #3: Mushrooms
   Food #4: Olives
   Food #5: Pizza Crust
   Food #6: Pepperoni

What are you calling this recipe ? Mushroom Pizza
What is your name?Ellis
How many servings will your recipe have? 0
Error Message: out of bound
 *----------------- Sample Run 4 -----------------------------------------------
 *---------- List of Possible Ingredients ---------
   Food #1: Marinara sauce
   Food #2: Mozzarella Cheese
   Food #3: Mushrooms
   Food #4: Olives
   Food #5: Pizza Crust
   Food #6: Pepperoni

What are you calling this recipe ? Oliva Pizza
What is your name?Ellis 
How many servings will your recipe have? 1
How many grams of Marinara sauce? 30
How many grams of Mozzarella Cheese? 30
How many grams of Mushrooms? 0
How many grams of Olives? 200
How many grams of Pizza Crust? 100
How many grams of Pepperoni? 0

The servings for your recipe, Oliva Pizza, is 1.

Nutrition for Ellis  Simple Oliva Pizza------------
   Calories: 603.0999999999999
   Soluble Fiber: 8.58 grams
   Fat: 37.33 grams
   Protein: 37.33 grams
 *----------------- Sample Run 5 -----------------------------------------------
 *---------- List of Possible Ingredients ---------
   Food #1: Marinara sauce
   Food #2: Mozzarella Cheese
   Food #3: Mushrooms
   Food #4: Olives
   Food #5: Pizza Crust
   Food #6: Pepperoni

What are you calling this recipe ? Pepperoni Pizza
What is your name?Ellis
How many servings will your recipe have? 2
How many grams of Marinara sauce? 25
How many grams of Mozzarella Cheese? 25
How many grams of Mushrooms? 0
How many grams of Olives? 0
How many grams of Pizza Crust? 60
How many grams of Pepperoni? 100

The servings for your recipe, Pepperoni Pizza, is 2.

Nutrition for Ellis Simple Pepperoni Pizza------------
   Calories: 744.95
   Soluble Fiber: 1.4899999999999998 grams
   Fat: 55.315 grams
   Protein: 55.315 grams
 */

