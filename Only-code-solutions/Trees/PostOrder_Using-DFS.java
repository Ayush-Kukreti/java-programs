package Trees;

public class PostOrder_Using-DFS {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        while(!stack.isEmpty() || root != null) {
            if(root != null) {
                stack.add(root);
                root = root.left;
            } else {
                TreeNode temp = stack.peek().right;
                if(temp == null) {
                    temp = stack.pop();
                    list.add(temp.val);
                    while(!stack.isEmpty() && temp ==  stack.peek().right) {
                        temp = stack.pop();
                        list.add(temp.val);
                    }
                } else {
                    root = temp;
                }
            }
        }
        
        return list;
    }
}
