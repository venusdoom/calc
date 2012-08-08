package org.venusdoom.calc;
import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calc {

    public static final String PLUS = "+";
    public static final String MINUS = "-";
    public static final String MULTIPLICATE = "*";
    public static final String DIVIDE = "/";

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                out.print("Первое число: ");
                double firstValue = Double.parseDouble(reader.readLine());

                out.print("Действие: ");
                String operation = reader.readLine().trim();

                out.print("Второе число: ");
                double secondValue = Double.parseDouble(reader.readLine());

                if (operation.equals(PLUS)) {
                    out.println("Результат: " + sum(firstValue, secondValue));
                } else if (operation.equals(MINUS)) {
                    out.println("Результат: " + diff(firstValue, secondValue));
                } else if (operation.equals(MULTIPLICATE)) {
                    out.println("Результат: " + mult(firstValue, secondValue));
                } else if (operation.equals(DIVIDE)) {
                    out.println("Результат: " + div(firstValue, secondValue));
                } else {
                    out.println("Неправильный ввод действия");
                    continue;
                }
                out.print("Для выхода введите команду - exit, иначе нажмите Enter: ");
                String end = reader.readLine();
                if (end.equals("exit")) {
                    break;
                }
            } catch (Exception e) {
                out.println("Неправильный ввод числа");
                continue;
            }
        }
    }

    static double sum(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    static double diff(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }

    static double mult(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    static double div(double firstValue, double secondValue) {
        return firstValue / secondValue;
    }
}
