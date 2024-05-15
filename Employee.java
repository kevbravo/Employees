/* Honor Pledge:
 * I pledge that I have neither given nor received any help
 * on this assignment
 *
 * kevbravo */

//Our employee class will be the parent class for our employees
public class Employee{

//I define the properties of an Employee here
	protected int employeeID;
	private String firstName;
	private String lastName;
	protected int rate;
	protected String name;
	protected double hours;

//our default constructor just creates a standard employee array of size 1
	public Employee(){

//		Employee [] generalEmployee = new Employee[1];
	}

	public Employee(String[] info){

//we pass in the string of information into our non default constructor and proceed to
//assign the corresponding values 
		String eID = info[1];
		this.employeeID = Integer.parseInt(eID);
		this.firstName = info[2];
		this.lastName = info[3];

//we then have some other methods for the name, rate, and status
		name = getName();
		getHourlyRate();
	}

//this method just returns a string of firstname and lastname
	public String getName(){

//this is to help us format it later on
		return firstName + " " + lastName;
	}

//I have a method for determining which rate goes with which employee
	public int getHourlyRate(){

		return rate;
	}

//this returns the employeeID
	public int  getEmployeeID(){

		return employeeID;
	}

//and this method calculates our paycheck based on the employee
	public double calculatePaycheck(){

		return rate * hours;
	}

	public void setHoursWorked(double hours){

		this.hours = hours;	
	}
}
