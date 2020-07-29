
import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeDetails {
	 ArrayList< Employee>Al= new ArrayList< Employee>();
	 //Constructor to pass and calculate 
	
	public  EmployeeDetails(int empId, String empName, String Deg, double basic) {
		{ 
			//double HRA=CalHra(deg, basic);
			double hra = 0;
			if(Deg.equalsIgnoreCase("manager")) {
				 hra= basic*0.10;
				
				}
			else if(Deg.equalsIgnoreCase("officer")) {
				 hra= basic*0.12;
			}
			else if(Deg.equalsIgnoreCase("clerk")) {
				 hra= basic*0.05;
			}
			Employee e = new Employee(empId, empName, Deg, basic,hra);
			Al.add(e);
		}
	}
		
//method to print	
	
void printDET() {
		//System.out.print(Al);
		Iterator I = Al.iterator();
		while(I.hasNext()) {
			System.out.print(I.next());
		}
	}
}



