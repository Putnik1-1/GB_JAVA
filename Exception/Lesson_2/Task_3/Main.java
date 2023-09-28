package Exception.Lesson_2.Task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите текст, если хотите можете ввести с пробелом и проверите исключение)): ");


            try {
                String str = reader.readLine();
                if (str.equals("")) throw new RuntimeException("Пустую строку вводить нельзя, правило!!");
                System.out.println(str);

            } catch (IOException exp) {
                throw new RuntimeException(exp);
            }

    }
    
}
