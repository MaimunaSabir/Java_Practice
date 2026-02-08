
class occuranceOfNumber{

public static int first=-1;
public static int last=-1;

public static  void checkNumber(String str,char ele,int idx){

//BASE CAASE
if(idx==str.length()){
    System.out.println("first index : "+first);
        System.out.println("last index : "+last);

    return;
}

//kam
char currentChar=str.charAt(idx);
if(currentChar==ele){
    if(first==-1){
        first=idx;
    }
    else{
        last=idx;
    }
    
}
//RECURSION
checkNumber(str,ele,idx+1);


}

    public static void main(String [] args){

    checkNumber("maimuna",'m',0);}
}