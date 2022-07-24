// Using 1D array 

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()==0) return 0;
        
        int l=0,r=0;
        int table[]=new int[128];
        int max=1;
        
        while(r<s.length()){
            char ch1=s.charAt(r);
            
            table[ch1]++;
            
            if(table[ch1]==1){
                max=Math.max(max,r-l+1);
                r++;
            }else if(table[ch1]>1){
                
                while(table[ch1]>1){
                    char ch2=s.charAt(l);
                    table[ch2]--;
                    l++;
                }
                r++;
            }
        }
        return max;
    }
}





// Using HashMap 

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l=0,r=0;
        Map<Character,Integer> map=new HashMap<>();
        int max=0;
        
        while(r<s.length()){
            char ch1=s.charAt(r);
            // if(!map.isEmpty() && )
            map.put(ch1, map.getOrDefault(ch1,0)+1);
            
            if(map.get(ch1)==1){
                max=Math.max(max,r-l+1);
                r++;
            }else if(map.get(ch1)>1){
                
                while(map.get(ch1)>1){
                    char ch2=s.charAt(l);
                    map.put(ch2, map.getOrDefault(ch2,0)-1);
                    if(map.get(ch2)==0) map.remove(ch2);
                    l++;
                }
                r++;
            }
        }
        return max;
    }
}


// Using Hashmap and aditya verma SW format

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l=0,r=0;
        Map<Character,Integer> map=new HashMap<>();
        int max=0;
        
        while(r<s.length()){
            char ch1=s.charAt(r);
            map.put(ch1, map.getOrDefault(ch1,0)+1);
            
            if(map.size()==r-l+1){
                max=Math.max(max,r-l+1);
                r++;
            }else if(map.size()<r-l+1){
                while(map.size()<r-l+1){
                    char ch2=s.charAt(l);
                    map.put(ch2, map.getOrDefault(ch2,0)-1);
                    if(map.get(ch2)==0) map.remove(ch2);
                    l++;
                }
                r++;
            }
        }
        return max;
    }
}