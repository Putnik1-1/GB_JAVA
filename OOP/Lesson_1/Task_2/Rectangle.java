package OOP.Lesson_1.Task_2;

// Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). Класс должен обладать следующими методами:
// Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
// Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
// Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
// Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
// Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).

public class Rectangle {
    private double width;
    private double height;

    /**
 * Конструктор без параметров, создает прямоугольник с шириной и высотой по умолчанию.
     */
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    /**
 * Конструктор, создает прямоугольник с заданными значениями ширины и высоты.
     *
 * @param width ширина прямоугольника
 * @param height высота прямоугольника
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
 * Получает ширину прямоугольника.
     *
 * @return ширина прямоугольника
     */
    public double getWidth() {
        return width;
    }

    /**
 * Устанавливает ширину прямоугольника.
     *
 * @param width ширина прямоугольника
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
 * Получает высоту прямоугольника.
     *
 * @return высота прямоугольника
     */
    public double getHeight() {
        return height;
    }

    /**
 * Устанавливает высоту прямоугольника.
     *
 * @param height высота прямоугольника
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
 * Вычисляет площадь прямоугольника.
     *
 * @return площадь прямоугольника
     */
    public double calculateArea() {
        return width * height;
    }

    /**
 * Вычисляет периметр прямоугольника.
     *
 * @return периметр прямоугольника
     */
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    
}
