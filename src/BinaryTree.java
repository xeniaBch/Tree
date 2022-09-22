import com.sun.source.tree.Tree;

public class BinaryTree {
    TreeNode root;

    public void insert(int value){
        TreeNode temp = new TreeNode();
        temp.value = value;
        if (root == null){
            root = temp;
        }else {
            TreeNode p = root;
            while (true) {
                if (value < p.value) {
                    if (p.leftChild != null) {
                        p = p.leftChild;
                    } else {
                        p.leftChild = temp;
                        return;
                    }
                } else {
                    if (p.rightChild != null) {
                        p = p.rightChild;
                    } else {
                        p.rightChild = temp;
                        return;
                    }
                }
            }
        }
    }

    public boolean search(int value){
        TreeNode p = root;
        while(value != p.value) {
            if (value < p.value) {
                if(p.leftChild != null) {
                    p = p.leftChild;
                }else {
                    return false;
                }
            } else {
                if (p.rightChild != null){
                    p = p.rightChild;
                } else {
                    return false;
                }
            }
        } return true;

    }

    private class TreeNode{
        int value;
        TreeNode leftChild;
        TreeNode rightChild;
    }
}
