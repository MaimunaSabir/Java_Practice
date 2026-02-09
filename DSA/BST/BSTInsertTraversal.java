import java.util.*;

public class BSTInsertTraversal {

    Node builtTree(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data < root.data){
            root.left=builtTree(root.left,data);
        }else{
            root.right=builtTree(root.right,data);
        }
        return root;
    }

    void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    void levelOrder(Node root){
        if(root==null) return;

        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr=q.remove();
            System.out.print(curr.data+" ");

            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
    }

    void printKth(Node root,int k){
        if(root==null) return;

        if(k==1){
            System.out.print(root.data+" ");
            return;
        }
        printKth(root.left,k-1);
        printKth(root.right,k-1);
    }

    void printRange(Node root,int x,int y){
        if(root==null) return;

        if(root.data>=x && root.data<=y){
            printRange(root.left,x,y);
            System.out.print(root.data+" ");
            printRange(root.right,x,y);
        }
        else if(root.data<x){
            printRange(root.right,x,y);
        }
        else{
            printRange(root.left,x,y);
        }
    }

    void printAllPath(Node root,ArrayList<Integer> path){
        if(root==null) return;

        path.add(root.data);

        if(root.left==null && root.right==null){
            System.out.println(path);
        }else{
            printAllPath(root.left,path);
            printAllPath(root.right,path);
        }
        path.remove(path.size()-1);
    }
}