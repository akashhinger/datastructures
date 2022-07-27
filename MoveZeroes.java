import java.util.Arrays;

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

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= new int[] {0,1,0,3,12};
		moveZeroes(arr);
	}

	private static void moveZeroes(int[] arr) {
		// TODO Auto-generated method stub
		int j =0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j]=arr[i];
				j++;
			}
		}
		for(int i =j;i<arr.length;i++) {
			arr[i]=0;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
