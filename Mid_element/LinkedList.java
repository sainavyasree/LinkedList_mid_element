package Mid_element;

public class LinkedList {
    
        static Node head;
        public void push(int new_data) 
        { 
            Node new_node = new Node(new_data); 
            new_node.next = head; 
            head = new_node; 
        } 
        public void printList() 
        { 
            Node tnode = head; 
            while (tnode != null) 
            { 
                System.out.print(tnode.data+"->"); 
                tnode = tnode.next; 
            } 
            System.out.println("NULL"); 
        }
        public static int printMiddle() 
        { 
        int count=0;
        Node ptr=head;
        Node ptr1=head;
        while(ptr!=null)
        {
            if (head != null) 
            { 
               count++;
           ptr=ptr.next;
            } 
        }
        if(count%2!=0)
        {
        count=(count/2);
        while(count!=0) 
        {
        ptr1=ptr1.next;
        count--;
        }
        }
        else
        {
        count=count/2;
        while(count!=0) 
        {
        ptr1=ptr1.next;
        count--;
        }
        }
        return ptr1.data;
        
        } 
}
