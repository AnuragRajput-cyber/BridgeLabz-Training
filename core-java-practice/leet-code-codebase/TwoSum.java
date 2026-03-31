package leet_code_codebase;
import java.util.*;
public class TwoSum {
	public static int[] twosm(int[] nums, int target) {
	    Map<Integer, Integer> mp = new HashMap<>();

	    for (int i = 0; i < nums.length; i++) {
	        int nd = target - nums[i];

	        if (mp.containsKey(nd)) {
	            return new int[]{mp.get(nd), i};
	        }

	        mp.put(nums[i], i);
	    }
	    return new int[]{};
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]nums=new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int[]result=twosm(nums,target);
		System.out.println(result[0] + " " + result[1]);
		}
	
   }

