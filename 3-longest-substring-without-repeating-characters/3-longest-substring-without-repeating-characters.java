class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        //check if input is valid
        if(s.length() == 0) return 0;
        
        //Pointers and counters to determine length 
        int i = 0; 
        int j = 0;
        int max = 0;
        
        HashSet<Character> set = new HashSet<Character>();
        
        //To iterate pointers recall that you have to use while loops
        
        while(i < s.length()) //i-pointer needs to keep moving until the end
        {
            char c = s.charAt(i);
            
           while(set.contains(c)) //this moves the j-pointer only up to the point where it needs to remove the character
           {
               set.remove(s.charAt(j));
               j++;
           }
            
            set.add(c);
            max = Math.max(max, i - j + 1); //important formula needed for length of substring
            i++;
        }
        
        return max;
        
        
    
    
        
    }
}