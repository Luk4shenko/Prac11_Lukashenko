public class Main {
    public static void main(String[] args) {
        ArrayQueue<Integer> arr = new ArrayQueue<>();
        arr.enqueue(1);
        arr.enqueue(2);
        arr.enqueue(3);
        System.out.println(arr.dequeue());
        System.out.println(arr.size());
        System.out.println(arr.dequeue());
        System.out.println(arr.size());
        System.out.println(arr.dequeue());
        System.out.println("\n\n");
        LinkedQueue q = new LinkedQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);
    }
}