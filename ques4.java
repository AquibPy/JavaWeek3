import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques4 {
    public static void main(String[] arg) throws IOException {
        BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Sale:");
        double sale = Double.parseDouble(stdin.readLine());
        Commission c1 = new Commission(sale);
        System.out.println("Commission is " + c1.commission(sale));
    }
}
class Commission
{
    private double sale;
    Commission(double s)
    {
        sale = s;
    }
    public double commission( double sale)
    {
        if (sale<0)
        {
            System.out.println("Invalid Input");
        }
        else if (sale<500)
        {
            return 0.02*sale;
        }
        else if (sale>=500 && sale<5000)
        {
            return 0.05*sale;
        }
        else return 0.08 * sale;
        return 0;
    }
}