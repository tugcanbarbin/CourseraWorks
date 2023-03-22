import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloGoodbye {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String firstName = reader.readLine();
        String secondName = reader.readLine();

        System.out.println("Hello " + firstName + " and " + secondName);
    }
}