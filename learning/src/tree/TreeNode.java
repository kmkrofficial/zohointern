package tree;

public class TreeNode {

    private TreeNode left;
    private TreeNode right;
    private int data;

    public TreeNode(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void insert(int d) {
        if(d == this.data) {
            return;
        }
        if (d > this.data) {
            if (right == null) right = new TreeNode(d);
            else left.insert(d);
        }
        if (d < this.data) {
            if (left == null) left = new TreeNode(d);
            else left.insert(d);
        }


    }

}
