
public class Student {
    private String studentID;
    private String name;
    private int quizzesTaken;
    private int totalScore;

    public Student() {
    }

    public Student(String sID, String n) {
        studentID = sID;
        name = n;
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
        
}
