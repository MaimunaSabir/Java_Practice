public class Main {
    public static void main(String[] args) {
        int arr[]={5,6,23,8,10,7,22};

        //TRAVERSAL
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();

        //SEARCH
        int tar=8;
        int x=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                x=i;
            }
        }
        if(x==-1){
            System.out.println("Not Found");
        } else {
            System.out.println("Found at = "+x);
        }

        //DELETE
        int idx=4;
        for(int i=idx;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.print("After Delete: ");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();

        //UPDATE
        arr[5]=400;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();

        //INSERTION
        int toAdd=122;
        int id=5;

        int newOne[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            newOne[i]=arr[i];
        }

        for(int i=newOne.length-1;i>id;i--){
            newOne[i]=newOne[i-1];
        }

        newOne[id]=toAdd;

        for(int i=0;i<newOne.length;i++){
            System.out.print(newOne[i]+"  ");
        }
        System.out.println();
    }
}
