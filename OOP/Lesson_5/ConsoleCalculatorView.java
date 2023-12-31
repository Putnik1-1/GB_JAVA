package OOP.Lesson_5;

import java.util.Scanner;

public class ConsoleCalculatorView implements CalculatorView {
    private Scanner scanner;

    public ConsoleCalculatorView() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void showResult(double result) {
        System.out.println("Результат: " + result);
    }

    @Override
    public double getFirstNumber() {
        System.out.print("Введите первое число: ");
        return scanner.nextDouble();
    }

    @Override
    public double getSecondNumber() {
        System.out.print("Введите второе число: ");
        return scanner.nextDouble();
    }

    @Override
    public char getOperation() {
        System.out.print("Введите операцию (+, -, *, /): ");
        return scanner.next().charAt(0);
    }
}
