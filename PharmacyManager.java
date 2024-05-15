/*Honor Pledge:
 *
 * I pledge that i have neither given nor received 
 * any help on this assignment
 *
 * kevbravo*/

//since our employees inherit from our employee class we dont have
//a lot of code in here
public class PharmacyManager extends StaffPharmacist{

//we define our attributes again
	protected boolean leadership;

//we inherit from staffpharmacist so we when we construct a pharmacymanager
//we also construct a staff pharmacist which constructs an employee
	public PharmacyManager(String [] info){

//inheritence times two
		super(info);

//setting our boolean
		leadership = true;
		rate = 50;
	}

//being able to get our boolean
	public boolean hasLeadership(){

		return leadership;
	}

	public void printEmployee(){

		System.out.println("ID: " + employeeID + "      Name: " + name + "           Rate: " + rate + "         Licensed: " + licensed + "       Has Leadership: " + leadership);
	}
}
