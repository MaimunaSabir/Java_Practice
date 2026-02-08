public class HeapSort {
    int heap[];
    int size;

    HeapSort(int[] arr) {
        size = arr.length;
        heap = new int[size];
        System.arraycopy(arr, 0, heap, 0, size);
    }

    // Heapify for sorting
    void heapifyDown(int[] arr, int n, int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != index) {
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;

            heapifyDown(arr, n, largest);
        }
    }

    // Heap Sort
    int[] sort() {
        int[] arr = new int[size];
        System.arraycopy(heap, 0, arr, 0, size);

        // Build max heap
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapifyDown(arr, size, i);
        }

        // Sort
        for (int i = size - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapifyDown(arr, i, 0);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {50, 30, 20, 15, 10, 8, 16};
        HeapSort hs = new HeapSort(arr);

        int[] sorted = hs.sort();
        System.out.println("Heap Sorted Array:");
        for (int i : sorted) {
            System.out.print(i + " ");
        }
    }
}