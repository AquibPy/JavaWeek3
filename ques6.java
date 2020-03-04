import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques6 {
    public static void main(String [] arg) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Name:");
        String p = stdin.readLine();
        Student s = new Student(p);
        System.out.println("Enter quiz #1 for " + s.name + ":");
        double q =Double.parseDouble(stdin.readLine());
        s.addQuiz(q);
        System.out.println("Enter quiz #2 for " + s.name + ":");
        double a =Double.parseDouble(stdin.readLine());
        s.addQuiz(a);
        System.out.println("Enter quiz #3 for " + s.name + ":");
        double b =Double.parseDouble(stdin.readLine());
        s.addQuiz(b);
        s.printStudent();
    }
}

class Student
{
    String name;
    double totalScore;
    int numberOfQuizzes;
    public Student(String name, double Score)
    {
        this.name = name;
        totalScore +=Score;
    }
    public Student(double Score, String name)
    {
        totalScore += Score;
        this.name = name;
    }
    public Student(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public double getAverage()
    {
        return totalScore/numberOfQuizzes;
    }
    public void addQuiz(double Score)
    {
        numberOfQuizzes++;
        totalScore += Score;
    }
    public void printStudent()
    {
        System.out.println("Name is " + name + "\nAverage is " + getAverage());
    }
}
