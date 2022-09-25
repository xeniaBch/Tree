import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public void pass(){
        inOrder(root);
    }

    private void inOrder(TreeNode node) {
        if(node == null) {
            return;
        }
        inOrder(node.leftChild);
        System.out.println(node.value);
        inOrder(node.rightChild);

    }

    public void passIterative(){
        inOrderIterative(root);
    }

    private void inOrderIterative (TreeNode node) {
        Stack <TreeNode> st = new Stack<>();
        while(!st.empty() || node != null){
            if (node != null) {
                st.push(node);
                node = node.leftChild;
            } else {
                node = st.pop();
                System.out.println(node.value);
                node = node.rightChild;
            }
        }

    }

    public void passBfs(){
        bfs(root);
    }

    private void bfs(TreeNode node) {
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            node = queue.remove();
            System.out.println(node.value);
            if(node.leftChild != null){
                queue.add(node.leftChild);
            }
            if (node.rightChild != null){
                queue.add(node.rightChild);
            }
        }



    }

    private class TreeNode{
        int value;
        TreeNode leftChild;
        TreeNode rightChild;
    }
}
