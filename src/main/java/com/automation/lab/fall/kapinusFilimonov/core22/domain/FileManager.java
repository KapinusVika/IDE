package com.automation.lab.fall.kapinusFilimonov.core22.domain;

import java.io.*;
import java.util.Scanner;

public class FileManager {

    public static void createFile(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name of your file: ");
        String name = sc.nextLine();
        System.out.print("\n");

        File myFile = new File(name + ".txt");

        try (PrintWriter pw = new PrintWriter(myFile)){
            myFile.createNewFile();

            String line = sc.nextLine();

            while (!line.equals("esc")){
                pw.println(line);
                line = sc.nextLine();
            }

        } catch (IOException e) {
            System.out.println("Error creation file!");
            e.printStackTrace();
        }
    }

    public static String readFile(String filename) throws IOException {
        File file = new File(filename);
        int len = (int) file.length();
        byte[] bytes = new byte[len];
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            assert len == fis.read(bytes);
        } catch (IOException e) {
            close(fis);
            throw e;
        }
        return new String(bytes, "UTF-8");
    }

    public static void writeFile(String filename, String text) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filename);
            fos.write(text.getBytes("UTF-8"));
        } catch (IOException e) {
            close(fos);
            throw e;
        }
    }

    public static void close(Closeable closeable) {
        try {
            closeable.close();
        } catch(IOException ignored) {
        }
    }
}
