public class BSTBasicOpt {

    int findMin(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root.data;
    }

    boolean search(Node root,int key){
        if(root==null) return false;
        if(root.data==key) return true;

        if(key<root.data)
            return search(root.left,key);
        else
            return search(root.right,key);
    }

    int countNode(Node root){
        if(root==null) return 0;
        return countNode(root.left)+countNode(root.right)+1;
    }

    int sumNode(Node root){
        if(root==null) return 0;
        return sumNode(root.left)+sumNode(root.right)+root.data;
    }

    float findAvg(Node root){
        return (float)sumNode(root)/countNode(root);
    }

    int countLeaves(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;

        return countLeaves(root.left)+countLeaves(root.right);
    }

    int height(Node root){
        if(root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
}