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

public class SpecialLinkedList {
	Node headnode;
	int size;
	public class Node{
		int data;
		Node next;
		Node random;
		Node(){
			data=0;
			next= null;
			random=null;
		}
	}
	public void insertAtHead(int key) {
		Node newnode= new Node();
		newnode.data=key;
		newnode.next=null;
		
		if(headnode==null) {
			headnode=newnode;
		}
		else {
			newnode.next=headnode;
			headnode= newnode;
		}
		size++;
	}
	public void printList() {
		Node curr=headnode;
		while(curr!=null) {
			System.out.print(" -> "+curr.data );
			System.out.print(" * "+curr.random.data );
			curr=curr.next;
		}
	}
	public void makeSpecial() {
		Node curr=headnode;
		Node prev=null;
		while(curr!=null) {
			if(curr.data==1) {
				curr.random=curr.next.next;
			}
			if(curr.data==2) {
				curr.random=prev;
			}
			if(curr.data==3) {
				curr.random=curr.next.next;
			}
			if(curr.data==4) {
				curr.random=prev;
			}
			if(curr.data==5) {
				curr.random=headnode.next;
			}
			prev=curr;
			curr=curr.next;
		}
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		SpecialLinkedList list= new SpecialLinkedList();
		for(int i=5;i>0;i--) {
			list.insertAtHead(i);
		}
		list.makeSpecial();
		list.printList();
	}
	
}
