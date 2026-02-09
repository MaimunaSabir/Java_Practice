import java.util.*;

public class Main {

    public static void main(String[] args){

        int arr[]={4,6,2,12,34,9,10,5};

        BSTInsertTraversal bst = new BSTInsertTraversal();
        BSTBasicOps basic = new BSTBasicOps();

        Node root=null;

        for(int x:arr){
            root = bst.builtTree(root,x);
        }

        bst.inorder(root);
        System.out.println();

        System.out.println("Min : "+basic.findMin(root));
        System.out.println("Height : "+basic.height(root));
        System.out.println("Average : "+basic.findAvg(root));
    }
}