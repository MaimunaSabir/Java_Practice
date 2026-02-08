class MazePath{

    public static int calPath(int i,int j,int n,int m){
    
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i==n ||j==m){
            return 0;
        }

    
int downward=calPath(i+1,j,n,m);

int right=calPath(i,j+1,n,m);

return downward+right;

    }
    public static void main(String [] args){
int n=4;
int m=4;
System.out.println("Total paths in " + n + "x" + m + " grid: " + calPath(0,0,n,m));


    }
}
