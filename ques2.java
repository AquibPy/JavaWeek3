import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques2 {
    public  static void main(String[] arg) throws IOException {
        Circle c1 = new Circle();
        BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter Radius of a Circle:");
        double rad = Double.parseDouble(stdin.readLine());
        System.out.println("Area of Circle is " + c1.area(rad));
        System.out.println("Perimeter of a Circle is "+ c1.perimeter(rad));
        System.out.println("Checking whether given X and Y coordinates lies on circle or not !!");
        System.out.println("Enter X coordinate:");
        double x_cod = Double.parseDouble(stdin.readLine());
        System.out.println("Enter Y coordinate:");
        double y_cod = Double.parseDouble(stdin.readLine());
        c1.point(x_cod,y_cod,rad);
    }
}
class Circle
{
    double area( double r)
    {
        return 3.14*r*r;
    }
    double perimeter(double r)
    {
        return 2*3.14*r;
    }
    void point(double x,double y,double radius)
    {
        double eq = Math.pow(x,2) + Math.pow(y,2) - radius;
        if(eq > 0)
        {
            System.out.println("Points lies outside the circle.");
        }
        else if (eq == 0)
        {
            System.out.println("Points lies on the circle");
        }
        else if (eq < 0)
        {
            System.out.println("Point lies inside the circle");
        }
    }
}
