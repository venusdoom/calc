package org.venusdoom.calc;

import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.venusdoom.calc.calculations.Calculations;
import org.venusdoom.calc.calculations.Operations;

public class Calc {

    public static final String PLUS = "+";
    public static final String MINUS = "-";
    public static final String MULTIPLICATE = "*";
    public static final String DIVIDE = "/";

    public static void main(String[] args) {

        Calculations op = new Operations();

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
                    out.println("Результат: " + op.sum(firstValue, secondValue));
                } else if (operation.equals(MINUS)) {
                    out.println("Результат: " + op.diff(firstValue, secondValue));
                } else if (operation.equals(MULTIPLICATE)) {
                    out.println("Результат: " + op.mult(firstValue, secondValue));
                } else if (operation.equals(DIVIDE)) {
                    out.println("Результат: " + op.div(firstValue, secondValue));
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

}
