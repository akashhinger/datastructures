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

public class HammingWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=-3;
		System.out.println(hammingWeight(n));
	}
	public static int hammingWeight(int n) {
        int count=0;
        System.out.println(n);
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==('1')){
                count++;
            }
        }
        return count;
    }

}
