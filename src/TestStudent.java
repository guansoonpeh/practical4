
public class TestStudent {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student("W1234", "Alex");
        
        s1.setName("John");
        s1.setStudentID("W4321");
        
        s1.addQuiz(10);
        s1.addQuiz(5);
        s1.addQuiz(0);
        
        
        System.out.println("Number of quizzes :" + s1.getQuizzesTaken());
        System.out.println("Total Mark :" + s1.getTotalScore());
        System.out.println("Averge Mark :" + s1.getAverageScore());
        
        
    }
}
