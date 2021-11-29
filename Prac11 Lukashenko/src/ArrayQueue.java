public class ArrayQueue<E> extends ArrayQueueADT{
    public int size() {
        if (size<0)
            throw new IllegalStateException();
        return size;
    }
    public boolean isEmpty()
    {
        if (size>0)
            return true;
        return false;
    }
    public void clear()
    {
        arr = (E[]) new Object[0];
        size = 0;
    }
}