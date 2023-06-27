package algo.sort;

public class SortTest {

    public static void main(String[] args) {
        ISort<Integer> sort = new SelectionSort<>();
        Integer[] data = new Integer[]{4,3,2,1};
        sort.sort(data);
        for (Integer datum : data) {
            System.out.print(datum + " ");
        }
    }
}
