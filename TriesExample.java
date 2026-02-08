
class TriesExample{

    class Node {
       boolean  eow;
        Node children []=new Node [26];

        Node(){
               eow=false;
            for (int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

Node root=new Node();

// INSERT

void insert(String word){

  Node curr=root;

  for(int i=0;i<word.length();i++){
   int idx=word.charAt(i)-'a';

   if(curr.children[idx]==null){
    curr.children[idx]=new Node();
   }
   if(i==word.length()-1){
    curr.children[idx].eow=true;
   }

   curr=curr.children[idx];

  }


}

// SEARCH 

boolean search(String key){

Node curr=root;
for(int i=0;i<key.length();i++){
   int idx=key.charAt(i)-'a';

   if(curr.children[idx]==null){
    return false;
   }
   if(i==key.length()-1 && curr.children[idx].eow==false){
    return false;
   }

   curr=curr.children[idx];

}
return true;
}

// WORD BREAK

boolean wordBreak(String key){

    if(key.length()==0){
        return true;
    }
    for(int i=1;i<=key.length();i++){

    String firstpath =key.substring(0, i);
    String secondpath =key.substring(i);

    if(search(firstpath) && wordBreak(secondpath)){
        return true;
    }


    }
    return false;
}

// START WITH problem

boolean startsWith(String key){

    Node curr=root;

for(int i=0;i<key.length();i++){
   int idx=key.charAt(i)-'a';

   if(curr.children[idx]==null){
    return false;
   }
  
   curr=curr.children[idx];

}
return true;
}


// COUNT ALL NODES --> All prefix of sufix

void suffix(String key){

    for(int i=0;i<key.length();i++){
        String suffix=key.substring(i);
        insert(suffix);
    
    }
    System.out.println(count(root));
}

int count (Node root){

    Node curr=root;
    int count=0;
    for(int i=0;i<26;i++){

        if(curr.children[i]!=null){
            count+=count(curr.children[i]);
        }
    }
    return count+1;
}



    public static void main (String [] args){

TriesExample t=new TriesExample();
   String word []={"there","a","their","any"};
for(int i=0;i<word.length;i++){
    t.insert(word[i]);
  

}
  System.out.println(t.search("there"));
  System.out.println(t.wordBreak("ilike"));
  t.suffix("apple");
    }
        
}