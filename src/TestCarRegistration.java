import java.util.Scanner;

public class TestCarRegistration {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
  	// todo:: create initial the array for various car types
        CarType []typeList = { new CarType("Toyota", "Vios" , 1.5),
                               new CarType("Nissan", "Teana" , 2.0),
                               new CarType("Honda", "City" , 1.6)
                             };
  	
  	// todo:: create an array for car Registration
  	Registration []reg = new Registration[2];
  	
        //todo:: loop until no more registration
       for(int count=0; count<reg.length; count++){       
            //todo:: request owner info and create owner object
            System.out.print("\nName : ");
            String name = scanner.nextLine();
            
            System.out.print("IC No : ");
            String icNo = scanner.nextLine();
            
            Owner owner = new Owner(name, icNo);
                                  
            //todo:: request car info
            System.out.print("Plate No : ");
            String plateNo = scanner.nextLine();
            
            System.out.print("Color : ");
            String color = scanner.nextLine();
            
            System.out.print("Year : ");
            int year = scanner.nextInt();
                        
            //todo:: choose car type
            System.out.println("Select Car Type");
            for(int i=0; i<typeList.length ; i++){
                System.out.printf("%d. %s \n" , (i+1), typeList[i].toString());
            }
            System.out.print("Enter Selection : ");
            int selectedType = scanner.nextInt();
            scanner.nextLine();
            
            CarType carType = typeList[selectedType-1];
          	
  	    //todo:: create car object
            Car car = new Car(plateNo, color, year, carType);
  
            reg[count] = new Registration(owner, car );
            
       }
            //System.out.println(reg.toString());
       displayListing(reg);
                    
  	//todo:: display result
  }

  public static void displayListing(Registration[] regArr) {
  	System.out.printf("\n\n%50s\n", "Car Registration Listing");
  	System.out.printf("%-6s %-12s %-12s %-10s %-8s %-6s %-10s %-10s %5s\n", 
  		"Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");

        for(Registration r : regArr){
            System.out.println(r.toString());
        }
        
        
  }


}
