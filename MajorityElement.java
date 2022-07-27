import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] nums = new int[] {2,2,1,1,1,2,2};
 System.out.println(majorityElement(nums));
	}
	public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
                map.put(nums[i],1);
        }
        System.out.println(map);
        Set<Map.Entry<Integer,Integer>> set= new HashSet<>(map.entrySet());
        System.out.println(set);
        for(Map.Entry<Integer,Integer> x:set){
            if(max<x.getValue()&&x.getValue()!=null)
                max=x.getValue();
        }
        return max;
    }

}
