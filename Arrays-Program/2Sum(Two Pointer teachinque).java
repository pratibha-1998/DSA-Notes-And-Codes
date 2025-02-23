class Solution
  {
    public static int[] twoSum(int nums[],int target)
    {
      int left=0,right=nums.length-1;
      while(right<left)
        {
          int sum=nums[right]+nums[left];
          if(sum==target)
          {
            return new int []{right,left}
          }
          else if(sum<target)
          {
            left++;
          }else
          {
            right--;
          }
        }
      return new int[]{-1,-1};
    }
  }

//Time Complexity 0(n log n)
//space Complexity 0(1)
