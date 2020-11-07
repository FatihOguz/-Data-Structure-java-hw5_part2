/**
 * taken from the book.
 */


import java.io.Serializable;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class BinaryTree<E> extends Problems implements Serializable  {

    protected static class Node<E> implements Serializable{
        protected E data;
        protected Node<E> left;
        protected Node<E> right;

        //No parameter constructor
        public Node(){

        }
        public Node(E data){
            this.data=data;
            left=null;
            right=null;
        }

        public  Node(E dataVal, Node<E> left, Node<E> right) {
                this.data = dataVal;
                this.left=left;
                this.right=right;
        }

        public String toString(){
            return data.toString();
        }
    }
    /********************************************************************************************************/
    //DATA FIELD
    protected Node<E> root;


    //CONSTRUCTOR

    public BinaryTree(){
        root=null;
    }

    /**
     * The constructor that takes a Node as a parameter is a protected constructor.
     * This is because client classes do not know about the Node<E> class
     * This constructor can be used only by methods internal to the BinaryTree class and its subclass
     * @param root is head of binaryTree
     */
    protected BinaryTree(Node<E> root){
        this.root = root;
    }

    public BinaryTree(E data,BinaryTree<E> leftTree,BinaryTree<E> rightTree){
        root = new Node<>(data);

        if(leftTree != null){
            root.left = leftTree.root;
        }
        else{
            root.left=null;
        }
        if(rightTree != null){
            root.right=rightTree.root;
        }
        else{
            root.right = null;
        }
    }



    //METHODS
    public BinaryTree<E> getLeftSubtree(){
        if(root!=null && root.left!=null){
            return new BinaryTree<>(root.left);
        }
        else
        {
            return null;
        }
    }
    public BinaryTree<E> getRightSubtree(){
        if(root!=null && root.right!=null){
            return new BinaryTree<>(root.right);
        }
        else
        {
            return null;
        }

    }
    public E getData(){
        return this.root.data;
    }
    public boolean isLeaf(){
        return (root.left==null && root.right==null);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        toString(root,1,sb);
        return sb.toString();
    }
    private void toString(Node<E> node,int depth,StringBuilder sb){
        /**
        for(int i = 1 ;i< depth;i++){
            sb.append(" ");
        }
         */
        if(node==null){
            //sb.append("null\n");
        }
        else{
            sb.append(node.toString());
            sb.append(" ");
            toString(node.left,depth+1,sb);
            toString(node.right,depth+1,sb);


        }
    }



    /**
     * Starter method for preorder traversal
     * @param consumer an object that instantiates
     *                 the BiConsumer interface.Its method implement
     *                 abstract method apply.
     */
    public void preOrderTraverse(BiConsumer<E,Integer> consumer){
        preOrderTraverse(root,1,consumer);
    }

    /**
     *  Performs a recursive preorder traversal of the tree,
     *  applying the action specified in the consumer object.
     * @param node
     * @param depth
     * @param consumer object whose accept method specifies the action to be performed on each node
     */
    private void preOrderTraverse(Node<E> node ,int depth,BiConsumer<E,Integer> consumer){
        if(node==null){
            consumer.accept(null,depth);
        }else{
            consumer.accept(node.data,depth);
            preOrderTraverse(node.left,depth+1,consumer);
            preOrderTraverse(node.right,depth+1,consumer);
        }
    }

    /**
     * Method to read a binary tree
     * pre: The input consists of a preorder traversal of the binary tree .
     * The line "null" indicates a null tree.
     * @param scan the scanner attached to the input file
     * @return the binary tree
     */
    public  BinaryTree readBinaryTree(Scanner scan){

        //Read a line and trim leading and tailing spaces.

        String data = scan.nextLine().trim();

        if(data.equals("null")){
            return null;
        }
        else{
            BinaryTree<String> leftTree = readBinaryTree(scan);
            BinaryTree<String> rightTree = readBinaryTree(scan);
            return new BinaryTree<> (data,leftTree,rightTree);
        }
    }








}
