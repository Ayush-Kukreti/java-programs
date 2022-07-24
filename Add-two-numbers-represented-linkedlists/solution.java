class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // reverse lists
        first=reverse(first);
        second=reverse(second);
        int carry=0;
        int sum=0; 
        
        Node newNode;
        Node root=null;
        Node result=null;
        
        while(first!=null || second!=null){
            
            int data1=first!=null? first.data:0;
            int data2=second!=null? second.data:0;
            
            sum=carry+data1+data2;
            if(sum>=10){sum=sum-10; carry=1;}
            else{ carry=0; }
            
            newNode=new Node(sum);
            if(root==null) root=newNode;
            else result.next=newNode;
            
            result=newNode;
            
            if(first!=null) first=first.next; 
            if(second!=null) second=second.next;    
        }
        
        if(carry==1){
            carry=0; 
            newNode=new Node(1);
            result.next=newNode;
            result=newNode;
        }
        return reverse(root);
    }
    public static Node reverse(Node root){
        Node p,q,r;
        if(root==null && root.next==null) return root;
        
        p=null;q=root;r=root.next;
        
        while(q!=null){
            q.next=p; p=q; q=r;
            if(r!=null) r=r.next;
        }
        return p;
    }
}