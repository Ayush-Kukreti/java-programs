class Solution
{
    public static Node reverse(Node node, int k)
    {   
        //base condition
        if(node==null || node.next==null) return node; 

        Node p,q,r;
        p=null;q=node;r=node.next;
        int count=0;
        
        while(q!=null && count<k){
            q.next=p; p=q; q=r; 
            if(r!=null) r=r.next;
            count++;
        }
        if(q!=null){
            node.next=reverse(q,k);
        }
        return p;
    }
}
