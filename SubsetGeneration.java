import java.util.ArrayList;

class subset{

public static void printset(ArrayList<Integer> set){
    for(int i=0;i<set.size();i++){
        System.out.println(set.get(i)+" ");
    }
    System.out.println();
}


public static void choise(int n, ArrayList<Integer> set){

    
    //base case
    if(n==0){
        System.out.println(set);
        return ;
    }


    //add hona chahe
    set.add(n);
    choise(n-1,set);

    //add nhi hona chahe
    set.remove(set.size()-1);
    choise(n-1,set);
    

}

    public static void main(String [] args){


        int n=3;
        ArrayList<Integer> set=new ArrayList<>(); 
    choise(n,set);    }
}