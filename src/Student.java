
public class Student {
    private static double contribution;
    
    private String studentID;
    private String name;
    private int quizzesTaken;
    private int totalScore;

    public Student() {
        this("","");
        //studentID = "";
        //name = "";
    }

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getQuizzesTaken() {
        return quizzesTaken;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public void addQuiz(int score) {
        totalScore += score;
        quizzesTaken++;
    }
    
    public double getAverageScore(){
        
        if (quizzesTaken != 0)
           return (double)totalScore / quizzesTaken;  
        else
           return 0;
    }
    
    
    public static double getContribution(){
        return contribution;
    }
    
    public static void setContribution(double percetage){
        contribution = percetage;
    }
    
    
    public double calculateCourseworkMark(){
        return ((double)totalScore / (quizzesTaken *10) * contribution) * 100;
    }
    
        
}
