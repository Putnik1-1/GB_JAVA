package Exception.Lesson_2.Task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean number = true;
        while(number){
            System.out.print("Введите дробное число: ");
            try {
                float fNumber = Float.parseFloat(reader.readLine());
                System.out.printf("Введено число %.2f\n", fNumber);
                number = false;
            }catch (IOException|NumberFormatException exp){
                System.out.println("Неверный ввод");
            }
        }


    }
    
}
