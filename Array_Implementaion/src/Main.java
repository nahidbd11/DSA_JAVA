import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MyArray<Integer> myArray=new MyArray<Integer>(5);

        myArray.insert(0,10);
        myArray.insert(1,25);
        myArray.insert(1,35); //previous index 1 value will shift to index 2 and current index 1 value is 35
        System.out.println(Arrays.toString(myArray.arr));

        myArray.delete(1);
        System.out.println(Arrays.toString(myArray.arr));

        System.out.println(myArray.search(25));

    }
}