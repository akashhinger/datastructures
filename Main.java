public class Main {
	public static void main( String args[] ) {
    SinglyLinkedList<Integer> sl1=new SinglyLinkedList<Integer>();

    for (int i=1;i<10;i++){
        sl1.insertAtEnd(i);
    }
    int j=7;
    int k=7;
    //sl1.insertAfter(j,k);
    //sl1.reverse(sl1);
    sl1.printlist();
    System.out.println("  Middle is  : " + sl1.findmid(sl1));
    sl1.removeDuplicates(sl1);
    sl1.removeNthFromEnd(3);
    System.out.println("  Remove nth node from end  : ");
    sl1.printlist();
}
}
