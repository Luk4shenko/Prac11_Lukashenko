public class ArrayQueueADT<E> implements AbstractQueue<E>{
    protected int size = 0;
    protected E[] arr = (E[])new Object[0];
    public E element()
    {
        if (size<0)
            throw new IllegalStateException();
        return arr[0];
    }
    public boolean enqueue(E obj)
    {
        try {
            size++;
            E[] old_arr = arr;
            arr = (E[]) new Object[size];
            for (int i =0; i<size-1; ++i)
                arr[i] = old_arr[i];
            arr[size - 1] = obj;
            return true;
        } catch (IllegalStateException ex) {
            throw ex;
        }
    }
    public E dequeue()
    {
        if (size<0)
            throw new IllegalStateException();
        E buf;
        buf = arr[0];
        for (int i=1; i<size; ++i)
            arr[i-1] = arr[i];
        --size;
        E[] old_arr = arr;
        arr = (E[])new Object[size];
        for (int i =0; i<size; ++i)
            arr[i] = old_arr[i];
        return buf;
    }
}
