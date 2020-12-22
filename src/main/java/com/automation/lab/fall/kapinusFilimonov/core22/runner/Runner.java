package com.automation.lab.fall.kapinusFilimonov.core22.runner;

import com.automation.lab.fall.kapinusFilimonov.core22.util.FileCompileService;
import com.automation.lab.fall.kapinusFilimonov.core22.util.FileUtil;
import org.apache.commons.cli.*;

import java.io.IOException;
import java.util.Scanner;


public class Runner {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner sc = new Scanner(System.in);
        String path;
        System.out.println("---------------------------------");
        System.out.println("|Welcome to console IDE for Java|");
        System.out.println("|  Enter 'help' to get commands |");
        System.out.println("---------------------------------");

        boolean flag = true;
        while (flag) {
            String switcher = sc.nextLine();
            switch (switcher){

                case "help":{
                    System.out.println("Help - show info about all commands");
                    System.out.println("Create - create .txt file by your path");
                    System.out.println("View - shows the contents of the file");
                    System.out.println("Delete - deleting part of file content between two coordinates");
                    System.out.println("Replace - replace part of file content between two coordinates");
                    System.out.println("Exit - exit from program");
                    break;
                }
                case "create":
                {
                    System.out.println("Mode 'Create'...");
                    System.out.println("Input File path");
                    path = sc.nextLine();
                    FileUtil.createFile(path);
                    break;
                }

                case "view":{
                    System.out.println("Mode 'View'...");
                    System.out.println("Input file path");
                    path = sc.nextLine();
                    FileUtil.readFile(path);
                    break;
                }

                case "delete":{
                    System.out.println("Mode 'Delete'...");
                    System.out.println("Input file path");
                    path = sc.nextLine();
                    FileUtil.deleteByNum(path);
                    break;
                }

                case "replace":{
                    System.out.println("Mode 'Replace ...'");
                    System.out.println("Input file path");
                    path = sc.nextLine();
                    FileUtil.editByNum(path);
                }

                case "version":{
                    System.out.println("Mode 'Version Info...");
                    System.out.println("Input file path");
                    path = sc.nextLine();
                    FileUtil.getVersionInfo(path);
                }

                case "compile":{
                    System.out.println("Mode 'compile");
                    System.out.println("Input file path");
                    path = sc.nextLine();
                    FileCompileService.compile(path);
                    break;
                }

                case "exit":{
                    System.out.println("Exit from program...");
                    flag = false;
                    System.exit(0);
                }
            }
        }

    }
}