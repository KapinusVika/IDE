package com.automation.lab.fall.kapinusFilimonov.core22.runner;

import com.automation.lab.fall.kapinusFilimonov.core22.domain.FileManager;

import java.util.Scanner;


public class Runner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        FileManager.editByNum(path);
    }
}