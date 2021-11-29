public interface AbstractQueue<T> {
    public boolean enqueue(T key);
    public T dequeue();
}