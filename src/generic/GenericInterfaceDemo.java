package generic;

interface Container<T>{
    void add(T item);
    T get();
}

public class GenericInterfaceDemo<T> implements  Container<T>{

    private T item;
    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}
