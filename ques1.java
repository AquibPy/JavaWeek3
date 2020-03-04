import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques1 {
    public static void main(String[] arg) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        OddAndEven o = new OddAndEven();
        System.out.println("Enter A Number:");
        String a = stdin.readLine();
        while (!a.equalsIgnoreCase("q"))
        {
            if(a.matches("^[a-zA-Z]*$"))
            {
                System.out.println("Enter the number :");
                a = stdin.readLine();
            }
            else
            {
                int n = Integer.parseInt(a);
                o.addNumber(n);
                System.out.println("Enter the number :");
                a = stdin.readLine();
            }
        }
        System.out.println(o.toString());
    }
}

class OddAndEven
{
    int countOfEven,countOfOdd;
    public void addNumber(int x)
    {
        if(x%2 == 0)
        {
            countOfEven++;
        }
        else
        {
            countOfOdd++;
        }
    }
    public String toString()
    {
        return "Number of Odd:" +countOfOdd +"\nNumber Of Even:"+ countOfEven;
    }
}
