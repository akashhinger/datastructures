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

public class AddAfterMid {
	Node headnode;
	int size;
	AddAfterMid(){
		size=0;
		headnode=null;
	}
	public class Node{
		int data;
		Node next;
		Node(){
			data=0;
			next=null;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddAfterMid list = new AddAfterMid();
		for(int i=5;i>0;i--) {
			list.insert(i);
		}
		list.printlist();
		list.addAfterMid();
		list.printlist();
	}


	private void printlist() {
		// TODO Auto-generated method stub
		Node curr= headnode;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.print("end\n");
		
	}
	void addAfterMid() {
		Node slow=headnode,fast=headnode;
		while(slow!=null&&fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		Node newnode=new Node();
		newnode.data=22;
		newnode.next=slow.next;
		slow.next=newnode;
		size++;
	}


	private void insert(int key) {
		Node newnode= new Node();
		newnode.data=key;
		newnode.next=null;
		newnode.next=headnode;
		headnode=newnode;
		size++;
		
	}
	

}
