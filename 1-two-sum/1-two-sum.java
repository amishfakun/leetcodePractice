class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result[] = new int[2];
        
        if(nums.length == 0) return null;
        
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];
            
            if(map.containsKey(complement) && map.get(complement) != i) 
            {
                result[0] = i;
                result[1] = map.get(complement);
                return result;
                
                //alternate return statememt
                //creates and returns an array of two ints                   that contains the given initializers, i and   
                //map.get(complement)
                //return new int[] { i, map.get(complement) };
            }
            
     
        }
        
        //In case there is no solution we return null
        return null;
        
     
        
        
        
    }
}


/*
Understand

        0 1  2  3
nums = [2,7,11,15]
target = 9

2 + 7 = 9
7 is present in array 
return [0,1]

        0 1 2
nums = [3,2,4] 
target = 6

compl = 6 - 3 = 3 (not in array)
compl = 6 - 2 = 4 (in array)
-> return [1,2]
-> Stop execution of algorithm because we want a unique solution 


nums = [3,3], target = 6
compl = 6 - 3 = 3
in the array [0,1]

edge cases -> if array is empty, return null
 
 0 1 2 3 4 5
[1,2,3,4,5,6] target is 10 

4 and 6 work return  (3,5)
5 and 5 does not work because unique solution and duplicate numbers 

------------------------------------------------------------------------------------------------

Match -> Hashmap because we have to return indices in our result array 

nums[i] i
 2      0
 7      1
 11     2
 15     3
------------------------------------------------------------------------------------------------------
Plan/Implement

int result[] = new int[1];

for(int i = 0; i < nums.length; i++)
{
    int complement = target - nums[i];
    if(map.containsKey(complement) && map.get(complement) != map.get(i) {
        //append array with results 
        result[0] = i;
        result[1] = map.get(complement);
        break;
    
    }
    
    map.put(nums[i], i);


}

  return result;






*/