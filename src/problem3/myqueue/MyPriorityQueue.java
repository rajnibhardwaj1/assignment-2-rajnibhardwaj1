/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;
import problem3.node.Node;

public class MyPriorityQueue {
    Node head;
    public MyPriorityQueue(){
        head = null;
    }
    public void insert(String name , int roll){
        Node n = new Node();
        n.setName(name);
        n.setRoll(roll);
        Node temp = head;
        if(head == null){
            head = n;
        }
        else{
            if(head.getRoll()>roll){
                n.setNext(head);
                head = temp;
            }
            else{
                while(temp.getNext()!=null && temp.getNext().getRoll()<roll){
                    temp = temp.getNext();
                }
                n.setNext(n);
            }
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.getName()+"\t"+temp.getRoll());
            temp = temp.getNext();
        }
    }
}
