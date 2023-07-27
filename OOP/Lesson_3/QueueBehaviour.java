package OOP.Lesson_3;

interface QueueBehaviour {
    void enqueue(Person person);
    Person dequeue();
    int size();
}
