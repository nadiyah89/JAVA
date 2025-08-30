import java.util.*;

interface ArrayOperations {
    void insert(int index, int value);
    void search(int value);
    void display();
}

class ArrayManager implements ArrayOperations {
    int[] arr = new int[5];
    int size = 0;

    public void insert(int index, int value) {
        try {
            arr[index] = value;
            size++;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
    }

    public void search(int value) {
        for(int i=0; i<size; i++) {
            if(arr[i] == value) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not found.");
    }

    public void display() {
        System.out.print("Array: ");
        for(int i=0; i<size; i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
}

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayManager am = new ArrayManager();
        am.insert(0, 10);
        am.insert(1, 20);
        am.display();
        am.search(20);
        am.insert(10, 99); // triggers exception
    }
}
