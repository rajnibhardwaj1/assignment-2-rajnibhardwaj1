/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
import problem1.node.TreeNode;
// to implement BinarySearchTree
public class MyBinarySearchTree {
    TreeNode root ;
    int count;
    public MyBinarySearchTree(){
        root = null;
        count = 0;
    }
    public void insert(int data) {
        TreeNode n = new TreeNode();
        n.setdata(data);
        if(root == null){
            root = n;

        }else{
            TreeNode current = root;
            while(true){
                if(data > current.getdata()){
                    if(current.getRight() == null){
                        current.setRight(n);
                        break;
                    }else{
                        current = current.getRight();
                    }
                }else{
                    if(current.getLeft() == null){
                        current.setLeft(n);
                        break;
                    }else{
                        current = current.getLeft();
                    }
                }
            }
        }

    }
    private void LeftNode(TreeNode root ){
        if(root == null)
            return;
        else{
            if(root.getLeft()!= null)
                System.out.println(root.getLeft().getdata());
            else
                count++;
            LeftNode(root.getLeft());
            LeftNode(root.getRight());
        }
    }
    public void printLeftNode(){
        LeftNode(root);

    }
    public  void countNodeLeft(){
        System.out.println(count);
    }
    public void preorder(TreeNode root){
        if(root == null)
            return;
        else{
            System.out.println(root.getdata()+"\t");
            preorder(root.getLeft());
            preorder(root.getRight());
            System.out.println(root.getdata()+"\t");


        }
    }
    public void preVSpost(){
        postorder(root);
        System.out.println();
        preorder(root);


    }

    private void postorder(TreeNode root) {

    }

    public TreeNode getroot(){
        return root;
    }
}
