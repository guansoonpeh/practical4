
public class Owner {
    private String name;
    private String icNo;
    
 /*  public Owner(){
       //name = "";
       //icNo = "";
       this("", "");
   }
  */  
    public Owner(String name, String icNo){
        this.name = name;
        this.icNo = icNo;
    }
/*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcNo() {
        return icNo;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    }

*/
    
    public String toString(){
        return String.format("%-12s %-12s", name, icNo);
    }
}
