public class main {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Front: " + q.peek());

        q.dequeue();
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // overflow

        q.display();
    }
}
