public class MyArray<T> {
    T[] arr;
    int size;
    int capacity;

    MyArray(int capacity) {
        this.arr = (T[]) new Object[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public void insert(int pos, T data) {

        if (size == capacity) {
            System.out.println("Can not insert. capacity full");
            return;
        }

        if (pos > size || pos < 0) {
            System.out.println("invalid index position");
            return;
        }
//first move all element to right starting from pos
// then insert new element to pos
        for (int i = pos; i <= size; i++) {
            arr[pos + 1] = arr[pos];
        }
        arr[pos]=data;
        size++;


    }

    public void delete(int pos){

        if(pos<0 || pos>=size){
            System.out.println("invalid index");
            return;
        }

        for(int i=size-1;i>pos;i--){

            arr[i-1]=arr[i];
        }

        arr[size-1]=null;
        size--;


    }

    public int search(T data){

        for (int i=0;i<size;i++){

            if(arr[i].equals(data)) return i;
        }

        return -1;
    }


}
