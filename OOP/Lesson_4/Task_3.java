package OOP.Lesson_4;

public class Task_3 {
    public static void main(String[] args) {
       System.out.println(getMax(10, 129));
       System.out.println(getMax("computer", "car"));
       System.out.println(getMax(12.2, 23.1));
    }

    public static <T extends Comparable<T>> T getMax(T parametr1, T parametr2){
        return parametr1.compareTo(parametr2) >= 0 ? parametr1 : parametr2;
    }
    
}
