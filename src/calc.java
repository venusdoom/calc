import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class calc {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                out.print("Первое число: ");
                double firstValue = Double.parseDouble(reader.readLine());

                out.print("Действие: ");
                String operation = reader.readLine();

                String plus = "+";
                String minus = "-";
                String multiplicate = "*";
                String divide = "/";

                out.print("Второе число: ");
                double secondValue = Double.parseDouble(reader.readLine());

                double result = 0;

                if (operation.equals(plus)) {
                    result = sum(firstValue, secondValue);
                } else if (operation.equals(minus)) {
                    result = diff(firstValue, secondValue);
                } else if (operation.equals(multiplicate)) {
                    result = mult(firstValue, secondValue);
                } else if (operation.equals(divide)) {
                    result = div(firstValue, secondValue);
                } else {
                    out.println("Неправильный ввод действия");
                    continue;
                }
                out.println("Результат: " + result);

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
        double result;
        result = firstValue + secondValue;
        return result;
    }

    static double diff(double firstValue, double secondValue) {
        double result;
        result = firstValue - secondValue;
        return result;
    }

    static double mult(double firstValue, double secondValue) {
        double result;
        result = firstValue * secondValue;
        return result;
    }

    static double div(double firstValue, double secondValue) {
        double result;
        result = firstValue / secondValue;
        return result;
    }

}
