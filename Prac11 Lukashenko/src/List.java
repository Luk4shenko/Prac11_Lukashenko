public class List<T> {
    public int key;
    public T data;
    public List next;
    List(int key, T data) {
        this.key = key;
        this.data = data;
    }
    T getData() {
        return this.data;
    }
    void show(){
        System.out.println(key+") "+data+" ");
    }
}
