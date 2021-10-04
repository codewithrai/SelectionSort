public class SelectionSort {
    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {40, 30 , 20, 10, 50};
        selectionSort.sort(arr);
        selectionSort.printArray(arr);
    }
}