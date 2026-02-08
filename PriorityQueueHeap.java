import java.util.Arrays;

public class MinHeap {

    int[] heap = new int[50];
    int size = 0;

    
    void insert(int value) {
        heap[size] = value;
        int i = size;
        size++;

        System.out.println("After append: " + Arrays.toString(Arrays.copyOf(heap, size)));

       
        while (i > 0) {
            int parent = (i - 1) / 2;

            if (heap[i] < heap[parent]) {
                int temp = heap[i];
                heap[i] = heap[parent];
                heap[parent] = temp;

                System.out.println("After swap : " + Arrays.toString(Arrays.copyOf(heap, size)));

                i = parent;
            } else {
                break;
            }
        }
    }

   
    void deleteMin() {
        if (size == 0) {
            System.out.println("Heap empty!");
            return;
        }

        System.out.println("Removing patient with priority: " + heap[0]);

        heap[0] = heap[size - 1];
        size--;

        System.out.println("After moving last to root: " + Arrays.toString(Arrays.copyOf(heap, size)));

        sinkDown(0);
    }

    void sinkDown(int i) {
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;

            if (left < size && heap[left] < heap[smallest])
                smallest = left;

            if (right < size && heap[right] < heap[smallest])
                smallest = right;

            if (smallest != i) {
                int temp = heap[i];
                heap[i] = heap[smallest];
                heap[smallest] = temp;

                System.out.println("After swap: " + Arrays.toString(Arrays.copyOf(heap, size)));

                i = smallest;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {

        MinHeap h = new MinHeap();

       
        int[] arr = {1, 3, 5, 4, 6};

       
        for (int x : arr) {
            h.heap[h.size++] = x;
        }

        System.out.println("Initial heap: " + Arrays.toString(Arrays.copyOf(h.heap, h.size)));
        
        
        System.out.println("\n-- Insert 2 --");
        h.insert(2);

       
        System.out.println("\n-- Treat Next Patient --");
        h.deleteMin();

        System.out.println("\nFinal heap: " + Arrays.toString(Arrays.copyOf(h.heap, h.size)));
    }
}