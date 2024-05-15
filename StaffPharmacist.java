/* Honor Pledge:
 *
 * I pledge that I have neither given nor received any help on this 
 * assignment
 *
 * kevbravo */

//our staff pharmacist inherits from our employee
public class StaffPharmacist extends Employee{

//we declare the members of staff pharmacist which is a boolean
	protected boolean licensed;

//when we create a staff pharmacist we also create an employee
	public StaffPharmacist(String [] info){

//inheritence
		super(info);

//we set licensed to true
		licensed = true;
		rate = 40;
	}

//we have a method for if they are licensed to return licensed
	public boolean isLicensed(){

		return licensed;
	}

	public void printEmployee(){

		System.out.println("ID: " + employeeID + "      Name: " + name + "       Rate: " + rate + "         Licensed: " + licensed);
	}
}
