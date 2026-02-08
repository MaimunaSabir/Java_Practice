class inviteParty{

public static int invitation(int n){
    
    //base case
    if(n==1){
        return 1;
    }
     if(n==0){
        return 0;
    }
    
    
    //Task
    int single=invitation(n-1);//Recursive case

    int pair=(n-1)*invitation(n-2);//recursive case

    return single +pair;

}

    public static void main(String [] args){


System.out.println("Total ways to invite 4 friends: " + invitation(4));
    }
}