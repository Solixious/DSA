package model;

public class Data<T> {

    private T data;

    public Data() {
        this.data = null;
    }

    public Data(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(final T data) {
        this.data = data;
    }
}
