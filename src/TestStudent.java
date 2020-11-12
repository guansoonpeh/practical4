
public class TestStudent {
    public static void main(String[] args) {
        
        Student.setContribution(0.2);
        
        Student s1 = new Student();
        s1.setName("John");
        s1.setStudentID("W4321");
         
        
        s1.addQuiz(10);
        s1.addQuiz(5);
        s1.addQuiz(5);
        
        
        System.out.println("Number of quizzes :" + s1.getQuizzesTaken());
        System.out.println("Total Mark :" + s1.getTotalScore());
        System.out.println("Averge Mark :" + s1.getAverageScore());
        
        System.out.printf("Coursework Mark  : %.2f / 20 ", s1.calculateCourseworkMark() );
             
    }
}
