package leet_code_codebase;
import java.util.*;
public class TwoSum {
	public static int[] Twosm(int[]nums,int target) {
		List<Integer>ll=new ArrayList<>();
        for(int i =0;i<nums.length;i++){
           ll.add(nums[i]);
        }


        for(int i=0;i<ll.size();i++){
           for(int j=i+1;j<ll.size();j++){
               if(ll.get(i)+ll.get(j)==target){
                   return new int[] {i,j};
               }
           }
        }
        return new int[] {}; 
            
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]nums=new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int[]result=Twosm(nums,target);
		
		}
	
   }

