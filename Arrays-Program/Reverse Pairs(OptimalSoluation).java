class Solution {
private static void merge(int [] nums,int low,int mid,int high)
{
    ArrayList<Integer> temp = new ArrayList<>();
    int left=low;
    int right=mid+1;
    //storing array in temp
    while(left<=mid && right<=high)
    {
        if(nums[left]<=nums[right])
        {
            temp.add(nums[left]);
            left++;
        }
        else
        {
            temp.add(nums[right]);
            right++;
        }
    }
    //if any element is left from left array
    while(left<=mid)
    {
        temp.add(nums[left]);
        left++;
    }
    //if any element on the right is left from right array
    while(right<=high)
    {
        temp.add(nums[right]);
        right++;
    }
    //transefing all elements from left to right

    for(int i=low;i<=high;i++)
    {
        nums[i]=temp.get(i-low);
    }

}

public static int countPairs(int nums[],int low,int mid,int high)
    {
        int right=mid+1;
        int count=0;
        for(int i=low;i<=mid;i++)
        {
            while(right<=high && (long)nums[i]>2L*nums[right]) right++;
            count+=right-(mid+1);
        }
        return count;
    }

    public static int mergeSort(int nums[],int low,int high)
    {
        int count =0;
        if(low>=high) return count;

        int mid = (low+high)/2;
        count+=mergeSort(nums,low,mid);
        count+=mergeSort(nums,mid+1,high);
        count+=countPairs(nums,low,mid,high);
         merge(nums,low,mid,high);

        return count;
    }




    public int reversePairs(int[] nums) {
int n=nums.length;
        return mergeSort(nums,0,n-1);
        
    }
}

//Time Complexity - 2(n log n)
//Space Complexity - 0(n);
