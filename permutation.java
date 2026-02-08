class Permutation{

   public static void per(String str,String permutation){
    //base case
    if(str.length()==0){
        System.out.println(permutation);
        return;
    }
    
    //task
    for(int i=0;i<str.length();i++){
        char currentChar=str.charAt(i);
        String newString=str.substring(0,i)+str.substring(1+i);
        //RECURSIOVE 
        per(newString,permutation+currentChar);
    }
   }


    public static void main(String [] args){
per("ABC","");
    }
}