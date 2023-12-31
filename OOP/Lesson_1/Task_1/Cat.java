package OOP.Lesson_1.Task_1;

// Создайте класс "Кот" (Cat) со следующими свойствами:
// Приватное поле "имя" (name) типа String для хранения имени кота.
// Приватное поле "возраст" (age) типа int для хранения возраста кота.
// Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
// Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
// Дополнительное задание:
// Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот" и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".

public class Cat {
    private String name;
    private int age;
    private Owner owner;

    /**
     * Конструктор класса Cat.
     *
     * @param name имя кота
     * @param age  возраст кота
     */
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Получает имя кота.
     *
     * @return имя кота
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя кота.
     *
     * @param name имя кота
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получает возраст кота.
     *
     * @return возраст кота
     */
    public int getAge() {
        return age;
    }

    /**
     * Устанавливает возраст кота.
     *
     * @param age возраст кота
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Получает владельца кота.
     *
     * @return владелец кота
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Устанавливает владельца кота.
     *
     * @param owner владелец кота
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Выводит приветствие на консоль.
     * Если у кота есть владелец, приветствие будет включать имя владельца.
     */
    public void greet() {
        if (owner != null) {
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец - " + owner.getName() + ".");
        } else {
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет).");
        }
    }
}
