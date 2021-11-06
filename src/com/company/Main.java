package com.company;

import java.util.Scanner;
import java.util.GregorianCalendar;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        homework6();
    }

    public static void homework4() {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTime());
    }

    public static void homework5() {
        try (Scanner scanner = new Scanner(new File("file.txt"))) {
            int sum = 0;
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
            }
            System.out.println(sum);
        } catch (Exception e) {
            System.exit(1);
        }

    }

    public static void homework6() {
        try (BufferedReader reader = new BufferedReader(new FileReader("resourceOne.txt"));
             PrintWriter writer = new PrintWriter(new FileWriter("resourceTwo.txt"))) {
            int lengthSum = 0;
            while (reader.ready()) {
                lengthSum += reader.readLine().length();
            }
            writer.println(lengthSum);

        } catch (Exception e) {
            System.exit(1);
        }
    }
}
