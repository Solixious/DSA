package algo.sort;

public class SelectionSort<T extends Comparable<T>> implements ISort<T> {


    @Override
    public void sort(T[] data) {
        for(int i = 0; i < data.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < data.length; j++) {
                if (data[min].compareTo(data[j]) > 0) {
                    min = j;
                }
            }
            if(min != i) {
                T k = data[i];
                data[i] = data[min];
                data[min] = k;
            }
        }
    }
}
