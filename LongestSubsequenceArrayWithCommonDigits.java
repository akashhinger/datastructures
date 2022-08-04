import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 *  $URL$
 *  $Date$
 *  
 *  $Copyright-Start$
 *
 *  Copyright (c) 2022
 *  JDA Corporation
 *  All Rights Reserved
 *
 *  This software is furnished under a corporate license for use on a
 *  single computer system and can be copied (with inclusion of the
 *  above copyright) only for use on such a system.
 *
 *  The information in this document is subject to change without notice
 *  and should not be construed as a commitment by JDA Corporation.
 *
 *  JDA Corporation assumes no responsibility for the use of the
 *  software described in this document on equipment which has not been
 *  supplied or approved by JDA Corporation.
 *
 *  $Copyright-End$
 */

public class LongestSubsequenceArrayWithCommonDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {21, 12, 23, 74, 13};
		longestSubsequence(arr);
	}

	private static void longestSubsequence(int[] arr) {
		// TODO Auto-generated method stub
		int x=0;
		int tail=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			x=arr[i];
			while(x>0) {
				tail=x%10;
				if(map.containsKey(tail)) {
					map.put(tail, map.get(tail)+1);
					break;
				}
				else
					map.put(tail, 1);
				x=x/10;
			}
		}
		int max=0;
		int m=0;
		int currmax=0;
		for(Map.Entry<Integer, Integer> v:map.entrySet()) {
			currmax=v.getValue();
			if(max<currmax) {
				max=currmax;
				m=v.getKey();
			}
		}
		int[] res=new int[3];
		int k=0;
		System.out.println(map);
		System.out.println(m);
		for(int i=0;i<arr.length;i++) {
			x=arr[i];
			while(x>0) {
				tail=x%10;
				if(tail==m) {
					res[k++]=arr[i];
				}
				x=x/10;
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
