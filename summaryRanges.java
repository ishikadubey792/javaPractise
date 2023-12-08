class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> strList = new ArrayList<>();

       int i = 0;
       while(i<nums.length){
           int j = i;
            while(j+1 < nums.length &&nums[j]+1 == nums[j+1]){
                j++;
           }
           if(i==j){
                 strList.add(nums[i] + "");
           }else{
                 strList.add(nums[i] + "->" + nums[j]);
           }
            i = j+1;
       }

        return strList;
    }
}