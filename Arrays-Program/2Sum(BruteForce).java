class Solution
  {
    public static int[] twoSum(int nums[],int target)
    {
      for(int i=0;i<nums.length;i++)
        {
          for(int j=0;j<nums.length;j++)
            {
              if(arr[j]+arr[i]==target)
              {
                return new int[]{i,j};
              }
            }
        }

      return new int[]{-1,-1};
    }
  }

//Time Complexity O(N^2)
//Space Complexity O(1)
