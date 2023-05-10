/* Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */

public class p3 {
    public static void main(String[] args) {
        int[] nums = new int[] { 266, 1, 88, 6, 34, 722, -1, -27, 325, 5 };

        heapSort(nums);

        for (int i : nums) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    public static int left(int i) {
        return (2 * i + 1);
    }

    public static int right(int i) {
        return (2 * i + 2);
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void makeHeap(int[] arr, int i, int size) {
        int left = left(i);
        int right = right(i);

        int largest = i;

        if (left < size && arr[left] > arr[i]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            makeHeap(arr, largest, size);
        }
    }

    public static int pop(int[] arr, int size) {
        if (size <= 0) {
            return -1;
        }
        int t = arr[0];
        arr[0] = arr[size - 1];
        makeHeap(arr, 0, size - 1);

        return t;
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;
        int i = (n - 2) / 2;
        while (i >= 0) {
            makeHeap(arr, i--, n);
        }

        while (n > 0) {
            arr[n - 1] = pop(arr, n);
            n--;
        }
    }
}
