public class LinkedQueue<E> implements AbstractQueue<E> {
    QNode front, rear;

    public LinkedQueue() {
        this.front = this.rear = null;
    }

    // Method to add an key to the queue.
    public boolean enqueue(E key) {
// Create a new LL node
        QNode temp = new QNode(key);
// If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return false;
        }
// Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
        return true;
    }

    // Method to remove an key from queue.
    public E dequeue() {
// If queue is empty, return NULL.
        if (this.front == null)
            return null;
// Store previous front and move front one node ahead
        QNode temp = this.front;
        this.front = this.front.next;
// If front becomes NULL, then change rear also as NULL
        if (this.front == null)
            this.rear = null;
        return (E) temp.key;
    }
}