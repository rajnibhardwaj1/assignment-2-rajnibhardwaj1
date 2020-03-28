/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class
import problem1.mybst.MyBinarySearchTree;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args){
        MyBinarySearchTree obj = new MyBinarySearchTree();
        //Scanner scanner = new Scanner(System.in);
        obj.insert(5);
        obj.insert(1);
        obj.insert(10);
        obj.insert(6);
        System.out.println("All Left Nodes");
        obj.printLeftNode();
        System.out.println(" count of nodes not  having left node ");
        obj.countNodeLeft();

    }
}
