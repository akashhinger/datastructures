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

public class Question {
	public static void main(String[] args) {
		String str = "23456122233333787";
		for (int i =0;i<str.length();i++) {
			if(str.charAt(i)=='1') {
				System.out.print(' ');
			}
			if(str.charAt(i)=='2') {
				System.out.print('a');
			}
			if(str.charAt(i)=='3') {
				System.out.print('d');
			}
			if(str.charAt(i)=='4') {
				System.out.print('g');
			}
			if(str.charAt(i)=='5') {
				System.out.print('j');
			}
			if(str.charAt(i)=='6') {
				System.out.print('m');
			}
			if(str.charAt(i)=='7') {
				System.out.print('p');
			}
			if(str.charAt(i)=='8') {
				System.out.print('t');
			}
			if(str.charAt(i)=='9') {
				System.out.print('w');
			}
			
		}
		System.out.println("\n");
		for (int i = 0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				if(str.charAt(i)=='1') {
					System.out.print(' ');
				}
				if(str.charAt(i)=='2') {
					System.out.print('b');
				}
				if(str.charAt(i)=='3') {
					System.out.print('e');
				}
				if(str.charAt(i)=='4') {
					System.out.print('h');
				}
				if(str.charAt(i)=='5') {
					System.out.print('k');
				}
				if(str.charAt(i)=='6') {
					System.out.print('n');
				}
				if(str.charAt(i)=='7') {
					System.out.print('q');
				}
				if(str.charAt(i)=='8') {
					System.out.print('r');
				}
				if(str.charAt(i)=='9') {
					System.out.print('x');
				}
				
			}
			
		}
		System.out.println("\n");
	
	for (int i = 0;i<str.length()-2;i= i+2) {
		if(str.charAt(i)==str.charAt(i+1)) {
			if(str.charAt(i)=='1') {
				System.out.print(' ');
			}
			if(str.charAt(i)=='2') {
				System.out.print('c');
			}
			if(str.charAt(i)=='3') {
				System.out.print('f');
			}
			if(str.charAt(i)=='4') {
				System.out.print('i');
			}
			if(str.charAt(i)=='5') {
				System.out.print('l');
			}
			if(str.charAt(i)=='6') {
				System.out.print('o');
			}
			if(str.charAt(i)=='7') {
				System.out.print('r');
			}
			if(str.charAt(i)=='8') {
				System.out.print('s');
			}
			if(str.charAt(i)=='9') {
				System.out.print('y');
			}
			
		}
		
	}
	System.out.println("\n");
	}
}
