import java.util.HashSet;
import java.util.Set;

public class SinglyLinkedList <T>{
    public Node headnode;
    public int size;

    public SinglyLinkedList(){
        headnode = null;
        size = 0;
    }

    public class Node{
        public T data;
        public Node nextnode;
    }

    public void insertAtHead(T data){
        Node newnode=new Node();
        newnode.data = data;
        newnode.nextnode=headnode;
        headnode=newnode;
        size++;
    }
    
    public void insertAtEnd(T data){
    	if(isEmpty()) {
    		insertAtHead(data);
    		return;
    	}
        Node newnode=new Node();
        newnode.data = data;
        newnode.nextnode=null;
        Node last=headnode;
        while(last.nextnode!=null) {
        	last=last.nextnode;
        }
        last.nextnode=newnode;
        size++;
    }
    public void insertAfter(T data, T prev) {
    	Node newnode= new Node();
    	newnode.data=data;
    	Node trvnode= headnode;
    	while(trvnode!=null && trvnode.data!=prev) {
    		trvnode= trvnode.nextnode;
    	}
    	newnode.nextnode=trvnode.nextnode;
    	trvnode.nextnode=newnode;
    	size++;
    }

    public boolean isEmpty(){
        if (headnode==null) return true;
        return false;
    }
    public void printlist(){
        Node temp;
        temp = headnode;
        if(isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.nextnode;
        }
        System.out.print("null");
    }
    public void deletehead() {
    	headnode= headnode.nextnode;
    	size--;
    }
    public void deleteValue(T data) {
    	Node curr= headnode;
    	Node prev=null;
    	while(curr!=null) {
    		if(curr.data==data) {
    			prev.nextnode=curr.nextnode;
    		}
    		prev=curr;
    		curr= curr.nextnode;
    	}
    }
    public void reverse(SinglyLinkedList list) {
    	Node curr,prev=null,next=null;
    	curr = list.headnode;
    	while(curr!=null) {
    		next = curr.nextnode;
    		curr.nextnode=prev;
    		prev=curr;
    		curr=next;
    	}
    	list.headnode=prev;
    }
    public T findmid(SinglyLinkedList list) {
    	Node slow=list.headnode,fast=list.headnode;
    	while(slow!=null && fast!=null && fast.nextnode!=null) {
    		slow = slow.nextnode;
    		fast =fast.nextnode.nextnode;
    	}
    	return slow.data;
    }
    public void removeDuplicates(SinglyLinkedList list) {
    	Set<Integer> set = new HashSet<Integer>();
    	Node curr = list.headnode;
    	while (curr!=null) {
    		set.add((Integer) curr.data);
    		curr=curr.nextnode;
    	}
    	System.out.println("After removing: "+ set);
    }
}

