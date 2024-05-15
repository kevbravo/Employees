/* Honor Pledge:
 *  I pledge that i have neither given nor received
 *  any help on this assignment
 *
 *  kevbravo */

//import statements are necessary to make the program run
import java.util.Scanner;
import java.io.*;

//our driver will execute our program
public class Driver{
	public static void main(String[] args) throws IOException{

		boolean check = false;
//So I first created arrays of each type of employee of size 1
		PharmacyManager [] pm = new PharmacyManager[1];
		StaffPharmacist [] sp = new StaffPharmacist[1];
		StaffTechnician [] st = new StaffTechnician[1];
		SeniorTechnician [] set = new SeniorTechnician[1];

//setting hours to an initial value to prevent the user from not entering a number
		int hours = 0;

//I made a basic scanner to take in user input
		Scanner scan = new Scanner(System.in);

//this while loop will allow us to keep asking the user for options until they specify to exit
		while(true){

//we prompt the user with a menu to choose from
			System.out.println("1. Load Employees (From File)");
			System.out.println("2. Exit Program");
			System.out.println("Enter Your Selection:");

//we then scan their answer
			int answer = scan.nextInt();

//if they choose to load the employees we will read them in from the file and store them
//in their respective array
			if(answer == 1){

			int choice;
				try{
				File employees = new File("employees.txt");
//created some variables to use
				String line;

//our try catch block will ensure the text file exists


					Scanner employeeScanner = new Scanner(employees);
//we scan the file until all the lines have been pulled in
					while(employeeScanner.hasNextLine()){

						line = employeeScanner.nextLine();

//we then separate the values in our file by the commas and store them into a string array
						String [] info = line.split(",");

//we then procede to test what the first element is for our jobID to then store each employee in their own array
						if(info[0].equals("1")){

							pm[0] = new PharmacyManager(info);
						}

						if(info[0].equals("2")){

							sp[0] = new StaffPharmacist(info);
						}

						if(info[0].equals("3")){

							st[0] = new StaffTechnician(info);
						}

						if(info[0].equals("4")){

							set[0] = new SeniorTechnician(info);
						}
					}

//then we close our scanner
					employeeScanner.close();
				
				}

//if the file is not found it catches it and  an exception is thrown
				catch(IOException ex){

					System.out.println(ex + "The sytem cannot find the file specified");
					System.out.println("Program Exiting.....");
					System.exit(0);
				}

//once everything has been stored we print that it was successful
				System.out.println("\nFile Succesfully Loaded");

//next we have another while loop to keep the second menu up
			while(true){

//we then prompt the user for some more options
				System.out.println("\n1. Print Employee Information");
				System.out.println("2. Enter Hours Worked");
				System.out.println("3. Calculate Paychecks");
				System.out.println("4. Exit Program");
				System.out.println("Enter Your Selection:");

//we scan their choice in another variable
				choice = scan.nextInt();

//if they choose to print the employees we call our methods in Employee through inheritence
				if(choice == 1){

					try{
			
//we then print out a formated string with all the information for each employee
						pm[0].printEmployee();
						sp[0].printEmployee();
						set[0].printEmployee();
						st[0].printEmployee();
					}

					catch(Exception e){


					}
				}

//if the user enters a 2 we ask them how many hours were worked
				else if(choice == 2){

					System.out.println("Please enter the hours worked:");

//we then store the hours entered
					hours = scan.nextInt();
					pm[0].setHoursWorked(hours);
					sp[0].setHoursWorked(hours);
					st[0].setHoursWorked(hours);
					set[0].setHoursWorked(hours);

					check = true;
				}

//if the user chooses to get the paychecks we hit them with another if statement that makes sure they entered
//hours already
				else if(choice == 3){

//next through inheritence we calculate the amount for the paycheck for each employee with the calculatePaycheck 
//method in the Employee class. How is this possible you ask? through inheritence.
					if(check == true){

//and finally print everything out formatted
						System.out.println(String.format("ID: %-15s Check Amount: $%-10s" , pm[0].getEmployeeID(), pm[0].calculatePaycheck()));
						System.out.println(String.format("ID: %-15s Check Amount: $%-10s" , sp[0].getEmployeeID(), sp[0].calculatePaycheck()));
						System.out.println(String.format("ID: %-15s Check Amount: $%-10s" , set[0].getEmployeeID(), set[0].calculatePaycheck()));
						System.out.println(String.format("ID: %-15s Check Amount: $%-10s" , st[0].getEmployeeID(), st[0].calculatePaycheck()));
					}
//this tells the user to first enter some hours
					else{

						System.out.println("Please enter the hours worked before trying to calculate the paycheck amounts");
					}
				}

//if the user chooses to exit the program we bid them farewell and break out of our while loop
				else if(choice == 4){

					System.out.println("\nGoodbye");

					break;
				}

//I was hoping this else statement handled not entering an option :\
				else{

					System.out.println("Please enter either 1, 2, 3, or 4");
				}
			}

//once the second while loop has been broken there is no point for the user to want to exit again so we just go ahead and break from the first while 
//loop as well
			break;
			}

//and if they choose to exit the program from the beginning we just break
			else if(answer == 2){

				System.out.println("\nGoodbye");

				break;
			}

//again I thought this would catch user mistakes but I guess it only works if I make the user option of type string instead of integer
			else{

				System.out.println("Please enter a 1 or 2");
			}
		}
	}
}

