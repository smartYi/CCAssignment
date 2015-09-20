package solution;

/*
 @Author--Yi
 @Version--1.0
 @Date--Sep/15/2015
 */

public class Solution03 {
    
    //This method is to delete the middle element in the linked list with given access to that node.
    public static void deleteMiddle(LinkedListNode node){
        //If head is null or head.next is a null, return null
        if(node == null || node.next == null) return ;
        
        LinkedListNode next = node.next;
        node.data = next.data;
        node.next = next.next;
        return;
    }
    
    //This method is to print out linked list information
    public static void  printLinkedList(LinkedListNode head){
        
        //While head is not null ,print out val.
        while(head!=null){
            if(head.next!=null){
                System.out.print(head.val + "-->");
            }else{
                System.out.print(head.val);
            }
            head = head.next;
        }
        System.out.println();
    }
    
    //Main function
    public static void main(String[] args){
        
        //Here I set two linked list with duplicates
        
        //Case 1: 2-->4-->1-->3-->2-->4
        LinkedListNode head1 = new LinkedListNode(1);
        LinkedListNode node1 = new LinkedListNode(2);
        LinkedListNode node2 = new LinkedListNode(3);
        LinkedListNode node3 = new LinkedListNode(4);
        LinkedListNode node4 = new LinkedListNode(5);
        head1.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        
        //Case 2: 2-->4-->1-->3-->6
        LinkedListNode head2 = new LinkedListNode(2);
        LinkedListNode node6 = new LinkedListNode(4);
        LinkedListNode node7 = new LinkedListNode(1);
        LinkedListNode node8 = new LinkedListNode(3);
        LinkedListNode node9 = new LinkedListNode(6);
        head2.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = null;
        
        
        //Printout information
        System.out.println("Before call function: ");
        printLinkedList(head1);
        printLinkedList(head2);
        
        //After function call 
        System.out.println("After calling function: ");
        
        //Call function
        deleteMiddle(head1);
        deleteMiddle(head2);
        
        printLinkedList(head1);
        printLinkedList(head2);
    }
}
