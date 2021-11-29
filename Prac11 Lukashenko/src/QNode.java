public class QNode<E> {
    E key;
    QNode next;
    // constructor to create a new linked list node
    public QNode(E key)
    {
        this.key = key;
        this.next = null;
    }
}
