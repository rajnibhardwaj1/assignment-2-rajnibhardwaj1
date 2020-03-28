/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
import problem5.node.Node;
import problem5.student.Student;
//to implement circular queue
public class MyCircularQueue {
    Node front;
    Node rear;
    int count;
    public MyCircularQueue(){
        front = null;
        rear = null;
        count = 0;
    }
    public void enqueue(int roll , int backlog, int a_count){
        Student s = new Student(roll,backlog,a_count);
        Node n = new Node();
        n.setStudent(s);
        if(front == null){
            front = n;
        }
        else{
            rear.setNext(n);
        }
        rear = n;
        rear.setNext(front);
        count++;
    }
    public void removeBackLog(){
        while(count-->0){
            Student ss = front.getStudent();
            if((ss.getBacklog()-ss.getA_count())>0){
                front = front.getNext();
            }
        }
    }
    public void display(){
        Node temp = front;
        System.out.println();
        while (temp.getNext()!=front){
            System.out.println(temp.getStudent());
            temp = temp.getNext();
        }
        System.out.println(temp.getStudent());
    }

}
