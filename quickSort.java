class quickSort{

 public static int partition(int array[],int low,int high){


int pivot=array[high];
int i=low-1;

for(int j=low;j<high;j++){

    if(array[j]<pivot){
i++;
int temp=array[i];
array[i]=array[j];
array[j]=temp;

    }
}

i++;
int temp=array[i];
array[i]=array[high];
array[high]=temp;
return i;

}

    public static void quick(int array[],int low,int high){

if(low<high){

    int pivot=partition(array,low,high);

    quick(array,low,pivot-1);
        quick(array,pivot+1,high);

}

    }

public static void main(String [] args){

    int array[]={2,5,6,3,8,9};
    quick(array,0,array.length-1);

for(int i=0;i<array.length;i++){
    System.out.print(array[i]+"  ");
}

}
}