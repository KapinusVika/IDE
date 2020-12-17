package com.automation.lab.fall.kapinusFilimonov.core22.util;

import java.io.*;
import java.util.Scanner;
import java.io.File;

public class FileUtil {

    public static void createFile(String path) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name of your file: ");
        String name = sc.nextLine();
        System.out.print("\n");

        File myFile = new File(path, name + ".txt");

        try (PrintWriter pw = new PrintWriter(myFile)) {
            myFile.createNewFile();

            String line = sc.nextLine();

            while (!line.equals("esc")) {
                pw.println(line);
                line = sc.nextLine();
            }

        } catch (IOException e) {
            System.out.println("Error creation file!");
            e.printStackTrace();
        }
    }

    public static void readFile(String path) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name of your file: ");
        String name = sc.nextLine();
        File myFile = new File(path, name + ".txt");
        try (BufferedReader br = new BufferedReader(new FileReader(myFile))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void deleteByNum(String path) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Input name of your file: ");
        String name = sc.nextLine();
        File myFile = new File(path, name + ".txt");
        try (BufferedReader br = new BufferedReader(new FileReader(myFile))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            System.out.println("Write start index and end index : ");
            a = sc.nextInt();
            b = sc.nextInt();
            sb.delete(a, b);
            String everything = sb.toString();

            System.out.println(everything);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void editByNum(String path) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Write your text");
        String str = sc.nextLine();
        System.out.println("Input name of your file: ");
        String name = sc.nextLine();
        File myFile = new File(path, name + ".txt");
        try (BufferedReader br = new BufferedReader(new FileReader(myFile))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            System.out.println("Write start index and end index : ");
            a = sc.nextInt();
            b = sc.nextInt();
            sb.replace(a,b,str);
            String everything = sb.toString();
            System.out.println(everything);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
