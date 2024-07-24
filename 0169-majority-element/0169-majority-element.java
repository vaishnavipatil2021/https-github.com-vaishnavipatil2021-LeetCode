class Solution {
    public int majorityElement(int[] nums) {

        //sol 1: count appearence of each element and check the highest count(takes lot of time)
        //sol 2: sort the array, and return middle element, as majority element will always be somewhere in the middle , but sorting takes O(nlogn)  (quick sort)
        //sol 3: better , use hashtable, store element and its frequency in hash, if element present just increase frequency , if not add element with fq 1(only one pass)(but new DS takes more space)
        //sol 4:voting solution O(n), check first element , increase vote by 1, traverse through array , if same number again, increase vote, if not decrease vote

        int n=nums.length;
        int votes=0;
        int  majority=nums[0];
        for(int i=0;i<n;i++){
           if(votes==0){
            votes++;
            majority=nums[i];
           } else if(majority==nums[i]){
            votes++;
           } else{
           votes--;
        }
        }
        return majority;
}
}