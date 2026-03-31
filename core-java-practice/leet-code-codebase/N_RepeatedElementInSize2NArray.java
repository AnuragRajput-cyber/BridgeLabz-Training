package leet_code_codebase;

import java.util.HashMap;

public class N_RepeatedElementInSize2NArray {
    public static int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer>ht=new HashMap<>();
        for(int i:nums){
            ht.put(i,ht.getOrDefault(i,0)+1);

        }
        int n=nums.length/2;

        for(int i:ht.keySet()){
            if(ht.get(i)==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
		int[]arr= {5,1,5,2,5,3,5,4};
		System.out.println(repeatedNTimes(arr));
	}
}