class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int n=nums.length;
        int[] freq=new int[n+1];

        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }

        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<n+1;i++)
        {
            if(freq[i]==0)
            {
                ans.add(i);
            }
        }

        return ans;
    }
}