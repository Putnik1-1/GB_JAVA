package OOP.Lesson_1;

// Задача 1:

// Создайте класс "Кот" (Cat) со следующими свойствами:
// Приватное поле "имя" (name) типа String для хранения имени кота.
// Приватное поле "возраст" (age) типа int для хранения возраста кота.
// Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
// Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".

public class Task_1 {
     public static void main(String[] args) {
        Cat Cat = new Cat("Mike", 7); // Создание объекта класса Person с именем "Mike" и возрастом 7

        System.out.println("Имя: " + Cat.getName()); // Получение имени с помощью публичного метода getName()

        System.out.println("Возраст: " + Cat.getAge()); // Получение имени с помощью публичного метода getAge()

        Cat.greeting();
    }

    private String getName() {
        return null;
    }

    private String getAge() {
        return null;
    }
}
    class Cat {
        private String name; // Приватное поле name
        private int age; // Приватное поле age

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        } public String getName() { // Публичный метод getName() для доступа к приватному полю name
            return name;
        }

        public int getAge() { // Публичный метод getAge() для доступа к приватному полю age
            return age;
        }
        private void helloGreet() { // Приватный метод celebrateBirthday()
    
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " лет.");
        }
        public void greeting() { // Публичный метод haveBirthday()
        helloGreet(); // Вызов приватного метода celebrateBirthday()
        }
    }


