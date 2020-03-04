import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques5 {
    public static void main(String[] arg) throws IOException
    {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Score(not greater than 100) to find your score:");
        double sc = Double.parseDouble(stdin.readLine());
        Grader g1 = new Grader(sc);
        System.out.println("Your Grade: " + g1.letterGrade());
    }
}
class Grader
{
    public double score;
    public String grade;
    public Grader(double s)
    {
        score = s;
    }
    public void grading_system()
    {
        if(score >= 100 || score <0)
        {
            grade = "Invalid!! Please Give Valid Input";
        }
        else if (score >=90)
        {
            grade = "A+";
        }
        else if (score >=85)
        {
            grade = "A";
        }
        else if (score >=80)
        {
            grade = "B+";
        }
        else if (score >=75)
        {
            grade = "B";
        }
        else if (score >=65)
        {
            grade = "C+";
        }
        else if (score >=60)
        {
            grade = "C";
        }
        else if (score >=55) {
            grade = "D+";
        } else if (score >=50)
        {
            grade = "D";
        }
        else
        {
            grade = "F";
        }
    }
    public String letterGrade()
    {
        grading_system();
        return grade;
    }
}