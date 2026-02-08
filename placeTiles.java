class placeTiles{

public static int tiles(int n,int m){
    
    //base case
    if(n==m){
        return 2;
    }
    if(n<m){
        return 1;
    }
    //Task
    int ver=tiles(n-m,m);//Recursive case

    int hor=tiles(n-1,m);//recursive case

    return hor +ver;

}

    public static void main(String [] args){
System.out.println(tiles(2,1));
    }
}