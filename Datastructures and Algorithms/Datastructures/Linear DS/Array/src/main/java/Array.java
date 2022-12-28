import java.util.Arrays;

/**
 * Exercise: Create an Array Class with the following properties
 *         - Dynamically grows with the insert Method
 *         - Remove items with removeAt Method
 *         - Print to console with print Method
 *         - Provide a value into the indexOf Method to get the index of a value --> if not in array return -1
 * Generic version of the Array class
 * @param <T> the type of the value being saved
 */
public class Array<T> {
    private T[] items;
    private int size;
    private int count;

    public Array(int length) {
        this.size = length;
        this.count = 0;
        items = (T[]) new Object[size];
    }

    public void insert(T item) {
        // - 1 because the size of an array is its last index + 1
        if (size - 1 == count){
            T[] tempArray = (T[]) new Object[++size];
            for (int i = 0; i < items.length; i++){
                tempArray[i] = items[i];
            }
            items = tempArray;
            items[size - 1] = item;
        }
        items[count] = item;
        count++;
    }

    public void removeAt(int index) {
        if (index < 0 || index > items.length - 1)
            throw new IllegalArgumentException("This index is not valid.");

        items[index] = (T)Integer.valueOf(0);
    }

    public int indexOf(T item) {
        for(int i = 0; i < items.length; i++) {
            if (items[i].equals(item))
                return i;
        }
        return -1;
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }
}
