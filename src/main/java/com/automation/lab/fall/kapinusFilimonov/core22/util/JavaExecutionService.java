package com.automation.lab.fall.kapinusFilimonov.core22.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaExecutionService {
    public static void compile(String path) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input name of your file: ");
        String name = sc.nextLine();
        Process process = Runtime.getRuntime().exec("javac " + path + ".java");
        printResults(process);
    }

    public static void run(String path) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name of your file: ");
        String name = sc.nextLine();
        Process process = Runtime.getRuntime().exec("java -classpath " + path + " " + name);
        printResults(process);
    }

    public static void printResults(Process process) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
