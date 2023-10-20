package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PreOrder-Using-DFS {
    
    public List<Integer> PreOrderTraversal(Node root){
        List<Integer> list = new ArrayList<>();
        
        if(root == null) return list;
        Stack<Integer>  stack = new Stack<>();
        stack.add(root);

        while(!stack.isEmpty()){
            root = stack.pop();
            list.add(root.data);

            if(root.right != null) stack.add(root.right);
            if(root.left != null) stack.add(root.left);

        }

        return list;
    }

    // other way similar way as we do the preorder and and last we will reverse teh collection
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        if(root == null)
            return list;
        Stack<TreeNode> stack = new Stack();
        stack.add(root);
        while(!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            if(root.left != null)
                stack.add(root.left);
            if(root.right != null)
                stack.add(root.right);
        }
        Collections.reverse(list);
        return list;
    }
}
