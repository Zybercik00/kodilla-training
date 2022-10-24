package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;

public class ExceptionModuleRunner {

    public static void main(String[] args)  {
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
            fileReader.readFile("nie ma takiego pliku");
        } catch (Exception e) {
            System.out.println("coś się wysypało");
        }
    }
}
