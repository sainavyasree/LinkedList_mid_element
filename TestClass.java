import Mid_element.*;
import java.util.Scanner;

public class TestClass {
        
        public static void main(String [] args) 
        { 
            Scanner ob=new Scanner(System.in);
            System.out.println("Enter number of series");//series range
            int range=ob.nextInt();
            
            LinkedList llist = new LinkedList(); 
            for (int i=range; i>0; --i) 
            { 
                llist.push(i); 
            } 
            llist.printList();
           int middle= LinkedList.printMiddle();
           System.out.println(middle);
        ob.close();
    }
    }
