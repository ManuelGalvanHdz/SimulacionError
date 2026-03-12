import java.io.*;

public class VulnerableApp {

    public static void main(String[] args) throws Exception {

        String filename = args[0];

        File file = new File("/tmp/" + filename);

        BufferedReader reader = new BufferedReader(new FileReader(file));

        System.out.println(reader.readLine());

        reader.close();
    }
}