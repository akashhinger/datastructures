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

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aa";
		String str1=str.toLowerCase();
		System.out.println(isPalindrome(str1));
	}
	public static boolean isPalindrome(String s) {
        int i=0;
        int k =0;
        int j=s.length()-1;
        while(i<j){
        	System.out.println(s.charAt(i));
        	System.out.println(s.charAt(j));
            if(!Character.isLetter(s.charAt(i))) {
                i++;
                k++;
                }
            if(!Character.isLetter(s.charAt(j)))
                j--;
            if(s.charAt(i)!=s.charAt(j)
               &&Character.isLetter(s.charAt(i))
               &&Character.isLetter(s.charAt(j))){
                return false;
            }
            else if(s.charAt(i)==s.charAt(j)
                    &&Character.isLetter(s.charAt(i))
                    &&Character.isLetter(s.charAt(j))){
                i++;
                j--;
            }        
        }
        System.out.println(i+" "+j+" "+k);
        if(--i==++j)
            return true;
        return false;
    }

}
