public class BSTAdvancedOpt {

    // delete
    Node delete(Node root,int data){
        if(root==null) return null;

        if(data<root.data)
            root.left=delete(root.left,data);
        else if(data>root.data)
            root.right=delete(root.right,data);
        else{
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;

            Node IS=findIS(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }

    Node findIS(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    // VALID BST
    boolean isValid(Node root,Node min,Node max){
        if(root==null) return true;

        if(min!=null && root.data<=min.data) return false;
        if(max!=null && root.data>=max.data) return false;

        return isValid(root.left,min,root) &&
               isValid(root.right,root,max);
    }

    // LCA
    Node lca(Node root,Node p,Node q){
        if(root==null) return null;

        if(p.data<root.data && q.data<root.data)
            return lca(root.left,p,q);

        if(p.data>root.data && q.data>root.data)
            return lca(root.right,p,q);

        return root;
    }
}