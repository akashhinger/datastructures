import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

public class ZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, -1, 2, -3, 1};
		Arrays.sort(arr);
		for(int i =0;i<arr.length-1;i++) {
			int l=i+1;
			int r =arr.length-1;
			while(l<r) {
				int sum = arr[i]+arr[l]+arr[r];
				if(sum==0) {
					System.out.println(arr[i]+" "+arr[l]+" "+arr[r]);
					l++;
					r--;
				}
				else if(sum<0)
					l++;
				else
					r--;
			}
			
		}
	}

}
