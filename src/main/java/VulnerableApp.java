

import java.io.*;

public class VulnerableApp {

    public static void main(String[] args) throws Exception {

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter command:");

        String cmd = reader.readLine();

        Runtime.getRuntime().exec(cmd);   // Command Injection
    }
}