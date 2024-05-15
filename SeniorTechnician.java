/*Honor Pledge:
 *
 * I pledge that i have neither given nor received any 
 * help on this assignment
 *
 * kevbravo */

//finally our last branch of inheritence
public class SeniorTechnician extends StaffTechnician{

//our protected attributes
	protected boolean serviceAward;

//we then proceed to create a senior technician with the same parameters
	public SeniorTechnician(String [] info){

// a senior technician is a type of staff technician which is a type of employee
		super(info);

//boolean set to true
		serviceAward = true;
		rate = 25;
	}

//our return that boolean method
	public boolean hasServiceAward(){

		return serviceAward;
	}

	public void printEmployee(){

		System.out.println("ID: " + employeeID + "      Name: " + name + "      Rate: " + rate + "         Has Degree: " + degree + "     Has Service Award: " + serviceAward);
	}
}
