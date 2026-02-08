class MergeSort {

    public static void conquer(int array[], int sp, int mid, int ep) {

        int[] merge = new int[(ep - sp) + 1];
        int x = 0;
        int i = sp;
        int j = mid + 1;

        while (i <= mid && j <= ep) {
            if (array[i] < array[j]) {
                merge[x++] = array[i++];
            } else {
                merge[x++] = array[j++];
            }
        }

        while (i <= mid) {
            merge[x++] = array[i++];
        }

        while (j <= ep) {
            merge[x++] = array[j++];
        }

        for (x = 0; x < merge.length; x++) {
            array[sp + x] = merge[x];
        }
    }

    public static void divide(int array[], int sp, int ep) {
        if (sp >= ep) return;

        int mid = sp + (ep - sp) / 2;

        divide(array, sp, mid);
        divide(array, mid + 1, ep);

        conquer(array, sp, mid, ep);
    }

    public static void main(String[] args) {

        int array[] = {3, 8, 9, 6, 2, 7};

        divide(array, 0, array.length - 1);

        System.out.println("Sorted Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}