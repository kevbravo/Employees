/*Honor Pledge:
 *
 * I pledge that i have neither given nor received 
 * any help on this assignment
 *
 * kevbravo */

//this is a separate route of inheritence but it is basically
//the same
public class StaffTechnician extends Employee{

//our protected members
	protected boolean degree;

//our constructor that constructs a staff technician and employee
	public StaffTechnician(String [] info){

//a staff technician is a type of employee
		super(info);

//boolean degree is set to true
		degree = true;
		rate = 20;
	}

//returns the boolean
	public boolean hasDegree(){

		return degree;
	}

	public void printEmployee(){

		System.out.println("ID: " + employeeID + "      Name: " + name + "           Rate: " + rate + "         Has Degree: " + degree);
	}
}
