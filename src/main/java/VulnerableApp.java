package main.java;

import java.io.*;

public class VulnerableApp {

    public static void main(String[] args) throws Exception {

        String cmd = args.length > 0 ? args[0] : "test";

        // Vulnerabilidad: Command Injection
        Runtime.getRuntime().exec(cmd);

    }
}