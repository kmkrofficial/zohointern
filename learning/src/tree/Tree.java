package tree;

public class Tree {

    private TreeNode root;

    public void insert (int a) {
        if (root==null) root = new TreeNode(a);
        else root.insert(a);
    }

}
