package com.teachmeskills.lesson_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        List<String> listPathFull = getListPath();

        DocumentHandler.documentHandle(listPathFull, "out.txt");
    }

    private static List<String> getListPath() {
        List<String> listPath = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String path = "";

        boolean ready = false;
        while (!ready) {
            System.out.println("Укажите путь к файлу");
            path = scanner.next();

            if (!path.contains("0")) {
                listPath.add(path);
            } else {
                ready = true;
            }

        }

        scanner.close();
        return listPath;
    }

}
