package question3;
public class QueueUsingStacks {
    private Stack stack1;
    private Stack stack2;

    public QueueUsingStacks(int size) {
        stack1 = new Stack(size);
        stack2 = new Stack(size);
    }

    public void enqueue(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        System.out.println(value + " enqueued to the queue");
    }

    public int dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1;
        }
        int value = stack1.pop();
        System.out.println(value + " dequeued from the queue");
        return value;
    }

    public int peek() {
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty. Cannot peek");
            return -1;
        }
        int value = stack1.peek();
        System.out.println("Peeked value: " + value);
        return value;
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.peek();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
