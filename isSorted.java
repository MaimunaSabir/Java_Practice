class isSorted{

public static boolean issorted(int array[],int idx){
 
        //basse case
if(idx==array.length-1) {
        return true;
}       

        //kam
if(array[idx]>=array[idx+1])
{
        return false;
}
//recursion
return issorted(array,idx+1);

}

    public static void main(String [] args){
int array[]={8,4,6};

System.out.println(issorted(array,0));
    }
}