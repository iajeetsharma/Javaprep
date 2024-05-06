import java.util.HashMap;
import java.util.Scanner;

public class Twosum
{
    public static int[] twoSum (int[] nums, int target)
    {

        int[] index = new int[2];  
        index[0] = index[1] = -1;
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++)
        {
            int rem = target - nums[i];
            if(hmap.containsKey(rem))
            {
                index[0] = hmap.get(rem);
                index[1] = i;

                return index;
            }

            hmap.put(nums[i], i);

        }

    return index;


    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter Size of array");
        int len = sc.nextInt();
    
        int[] arr = new int[len];
    
        System.out.println("Enter numbers in array");
    
        for(int i= 0; i<len; i++)
        {
            arr[i]=sc.nextInt();
    
        }
    
        System.out.println("Enter target value");
        int target = sc.nextInt();
    
        int[] ans = twoSum(arr, target);
    
        System.out.println("This is the index to get target sum [" + ans[0] + ", "+ ans[1] + "]");

        sc.close();
        
    }
}

