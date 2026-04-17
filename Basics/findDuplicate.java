public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 3};
        int val = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    val = arr[i];
                    break;
                }
            }
            if (val != -1) 
               break; 
        }

        if (val == -1) {
            System.out.println("No duplicate value is present");
        } else {
            System.out.println("Duplicate value is " + val);
        }
    }
}