import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ques3 {
    public static void main(String[] arg) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String:");
        String a =stdin.readLine();
        StringTokenizer x = new StringTokenizer(a," ");
        int cword = 0;
        while(x.hasMoreTokens())
        {
            cword++;
            x.nextToken();
        }
        System.out.println("Number of Words are " + cword);

        StringTokenizer y = new StringTokenizer(a,".");
        int sen = 0;
        while (y.hasMoreTokens())
        {
            sen++;
            y.nextToken();
        }
        System.out.println("Number of Sentences are " + sen);

        StringTokenizer z = new StringTokenizer(a,"e");
        int ce = -1;
        while(z.hasMoreTokens())
        {
            ce++;
            z.nextToken();
        }
        System.out.println("Number of e are " + ce);

        StringTokenizer w=new StringTokenizer(a,"z");
        int ze=-1;
        while(w.hasMoreTokens())
        {
            ze++;
            w.nextToken();
        }
        System.out.println("Number of z are "+ ze);

    }
}
