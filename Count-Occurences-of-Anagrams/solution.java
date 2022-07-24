class Solution {
    int search(String pat, String txt) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c : pat.toCharArray()) map.put(c, map.getOrDefault(c,0)-1 );
        int count=0;
        //sliding window
        int l=0,r=0;
        
        while(r<txt.length()){
            
            // calculating the right pointer
            char ch1=txt.charAt(r);
            map.put(ch1, map.getOrDefault(ch1,0)+1 );
            if (map.get(ch1)==0) map.remove(ch1);
            
            if(r-l+1 < pat.length()) r++;
            
            else if( r-l+1==pat.length()){
                
                //calculations when window size is hit
                if(map.size()==0) count++;
                
                // update the map before dropping the left pointer
                char ch2=txt.charAt(l);
                map.put(ch2,map.getOrDefault(ch2,0)-1);
                if (map.get(ch2)==0) map.remove(ch2);
                
                // move lrft and right pointer
                l++; r++;
            }
        }
        return count;
    }
}