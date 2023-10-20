class solution {

    public list<Integer> preOrderTraversal(Node root){
        List<Integer> list = new ArrayList<>();

        Stack<Integer> stack = new Stack();

        while( stack.size() > 0 || root != null){
            while(root != null){
                stack.add(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.data);
            root = root.right;
        }
        return list;
    }
}