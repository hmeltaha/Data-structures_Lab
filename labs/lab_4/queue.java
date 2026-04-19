class queue {
    int[] queue;
    int front, rear, size, capacity;

    Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = x;
        size++;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front++];
    }

    int peek() {
        if (isEmpty()) return -1;
        return queue[front];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
