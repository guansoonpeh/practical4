
public class Registration {
    private static int nextRegNo = 1000;
    private int regNo;
    private Owner owner;
    private Car car;

/*    public Registration() {
    }
*/
    public Registration(Owner owner, Car car) {
        this.regNo = regNo;
        this.owner = owner;
        this.car = car;
        
        this.regNo = ++nextRegNo;
    }
/*
    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    */
    
    public String toString(){
        return String.format("%-6d %s %s",
                regNo, owner.toString(), car.toString());
    }
    
    
}
