
public class TestEmployee {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("John", 3500);
        Employee emp2 = new Employee("Tan");
        emp2.setSalary(4000);
        
        
        
        System.out.print("\nHighest Salary: ");
        
        if (emp1.getSalary() > emp2.getSalary()){ //comparing employee salary to get highest
    	     System.out.println(emp1.getName() + 
                     " with RM : " + emp2.getSalary());
        }
    	else{
    	    System.out.println(emp2.getName() +
                    " with RM : " + emp2.getSalary());
        }
        
        
        System.out.println("Total salary of the 2 employees : RM " + 
                (emp1.getSalary() + emp2.getSalary())   );
        
        //System.out.println("Salary (before) : "  + emp1.getSalary() );
        // emp1.raiseSalary(8);
        //System.out.println("Salary (after) : "  + emp1.getSalary());
        
        
    }
}
