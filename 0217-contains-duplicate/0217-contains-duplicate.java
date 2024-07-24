class Solution {
    public boolean containsDuplicate(int[] nums) {
    //     Arrays.sort(nums); //O(nlogn)
    //     int n=nums.length;
    //     for(int i=1;i<n;i++){
    //         if(nums[i]==nums[i-1])
    //         return true;
    //     }
    //    return false; 

    //HASHSET O(n)

    HashSet<Integer> dup = new HashSet<>();
    for(int num:nums){
        if(dup.contains(num))
        return true;
        dup.add(num);
    }
    return false;
    }
}