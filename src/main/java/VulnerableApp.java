package main.java;

import java.io.*;

public class VulnerableApp {

    public static void main(String[] args) throws Exception {

        String input = args.length > 0 ? args[0] : "test";

        // Command Injection
        Runtime.getRuntime().exec("ls " + input);

        // Path Traversal
        File file = new File("data/" + input);
        BufferedReader br = new BufferedReader(new FileReader(file));

        br.readLine();
        br.close();
    }
}