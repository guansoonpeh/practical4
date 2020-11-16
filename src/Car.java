
public class Car {
    private String plateNo;
    private String color;
    private int year;
    private CarType carType;
    
  //  public Car(){
  //      this("", "", 0, null);
  //  }
    
    
    public Car(String plateNo, String color, int year, CarType carType ){
        this.plateNo = plateNo;
        this.color = color;
        this.year = year;
        this.carType = carType;
    }
/*
    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
    */
 
    public String toString(){
        return String.format("%-10s %-8s %-6d %s" ,  
                plateNo, color, year, carType.toString());
    }
    
}


