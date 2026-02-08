public class HeapOperations {
    int heap[];
    int size;
    int capacity;

    HeapOperations(int cap) {
        capacity = cap;
        size = 0;
        heap = new int[cap];
    }

    // Insert element
    void insert(int data) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }

        heap[size] = data;
        int curr = size;
        size++;

        // Heapify up
        int parent = (curr - 1) / 2;
        while (curr > 0 && heap[curr] > heap[parent]) {
            int temp = heap[curr];
            heap[curr] = heap[parent];
            heap[parent] = temp;

            curr = parent;
            parent = (curr - 1) / 2;
        }
    }

    // Delete root
    int delete() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }

        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;

        heapifyDown(0);
        return root;
    }

    // Heapify down
    void heapifyDown(int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != index) {
            int temp = heap[largest];
            heap[largest] = heap[index];
            heap[index] = temp;

            heapifyDown(largest);
        }
    }

    // Print heap
    void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HeapOperations h = new HeapOperations(10);

        h.insert(50);
        h.insert(30);
        h.insert(20);
        h.insert(15);
        h.insert(10);
        h.insert(8);
        h.insert(16);

        System.out.println("Original Heap:");
        h.printHeap();

        h.delete();
        System.out.println("Heap after deleting root:");
        h.printHeap();
    }
}