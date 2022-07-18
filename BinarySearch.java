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

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(arr,5)+1);

	}
	  public static int binarySearch(int[] array, int target) {
	    // Write your code here.
	    int left=0;
	    int mid;
	    int right=array.length-1;
	    while(left<=right){
	      mid = (left+right)/2;
	      if(array[mid]<target){
	        left=mid+1;
	      }
	      else if(array[mid]>target)
	        right=mid-1;
	      else if (array[mid]==target)
	       return mid;
	    }
	    return -1;
	  }
}
