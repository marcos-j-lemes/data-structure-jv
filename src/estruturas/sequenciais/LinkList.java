package estruturas.sequenciais;

import java.util.LinkedList;

/*
*   A LinkedList is more commonly used to represent a FIFO,
*  but it has simple methods that allow you to manipulate all the data in the linked list.
*  */

public class LinkList {

    public static void main(String[] args){

        // How to declare an LinkedList;
        LinkedList<String> listNames = new LinkedList<>();

        // In linked list you can use Fourth methods for added elements;
        listNames.add("second");  // index 1, second element at list;
        listNames.addLast("third"); // index 2, third element at list;
        listNames.addFirst("first"); //  index 0, first element at list;
        listNames.add(3, "Fourth"); // index 3;

        for(String l: listNames){
            System.out.println(l);
        }

        // how to delete at elements in linkedlist, you can use same methods, but added 'remove';

        listNames.remove();         // remove first element in list;
        listNames.remove(2);  // remove the element with this index;
        listNames.removeLast();     // remove the last element;
        listNames.removeFirst();    // remove the first element;

        // How to access elements in at Linkedlist, you have three possibly for access the elements in list;

        System.out.println(listNames.get(1));    // get elements in index one;
        System.out.println(listNames.getFirst());// get first element in linkedlist;
        System.out.println(listNames.getLast()); //get last element in linkedlist;

        System.out.println(listNames);
    }

}
