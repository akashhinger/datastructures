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

public class NumberOfOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=00000000000000000000000000001011;
		int count=hammingWeight(n);
		System.out.println(count);

	}
	public static int hammingWeight(int n) {
        int count=0;
        String str = Long.toBinaryString(n);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==('1')){
                count++;
            }
        }
        return count;
    }

}
