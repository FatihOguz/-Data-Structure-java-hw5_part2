/**
 * @author fatih oguz 151044025
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BiConsumer;
/**
 * In this class we give the constructor a statement and from this statement we generate a prefix or postfix tree.
 * We evaluate these trees by using the evaluate methods we have defined in the previous assignment.
 */

public class ExpressionTree<E> extends BinaryTree<E> {
    /**
     * root of binaryTree
     */
    BinaryTree<E> binaryTree ;

    /**
     * no parameter constructor
      */

    public ExpressionTree(){
        binaryTree = null;
    }

    /**
     * the string is assigned to the scanner and the tree is created by calling the read method .(prefix or postfix)
     * readBinaryTree is overriden
     * @param str is prefix or postfix
     */
    public ExpressionTree(String str){
        binaryTree = new BinaryTree<>();
        Scanner scanner = new Scanner(str);
        binaryTree =  readBinaryTree(scanner);
    }

    /**
     * create tree (postfix or prefix)
     * @param scan the scanner attached to the input file
     * @return tree
     */

    public  BinaryTree readBinaryTree(Scanner scan) {

        if(!scan.hasNext()){
            return null;
        }
              String data = scan.nextLine().trim();
            BinaryTree<String> leftTree = readBinaryTree(scan);
            BinaryTree<String> rightTree = readBinaryTree(scan);
            return new BinaryTree<> (data,leftTree,rightTree);

    }


    /**
     * Starter method for postorder traversal
     * @param consumer an object that instantiates
     *                 the BiConsumer interface.Its method implement
     *                 abstract method apply.
     */



    public void postOrderTraverse(BiConsumer<E,Integer> consumer){
        postOrderTraverse(root,1,consumer);
    }


    private void postOrderTraverse(Node<E> node ,int depth,BiConsumer<E,Integer> consumer){
        if(node==null){
            consumer.accept(null,depth);
        }else{

            postOrderTraverse(node.left,depth+1,consumer);
            postOrderTraverse(node.right,depth+1,consumer);
            consumer.accept(node.data,depth);
        }
    }

    /**
     * evaluate these trees by using the evaluate methods I have defined in the previous assignment.
     * Problems class and ProblemInterface defined in the previous assignment
     *  evaluateResultPrefix and evaluateResultPostfix evaluate  prefix or postfix
     *  if first data is null ,this tree is postfix otherwise prefix
     * @return
     */
    public int eval(){
        int res=0;
        String str = this.toString();
        String[] data = str.split(" ");
        for(int i=0;i<data.length;i++){
            data[i] = data[i].trim();
        }
        if(data[0].equals("null")){
            ArrayList<String> arrayList = new ArrayList<>();

            for(int i=0;i<data.length;i++){
                if(data[i].equals("null")){

                }
                else {
                    arrayList.add(data[i]);
                }
            }
            String[] data1 = new String[arrayList.size()];
            for(int i = 0;i<arrayList.size();i++){
                data1[i] = arrayList.get(i);
            }

            return evaluateResultPostfix(data1,0,data1.length,res);

        }
        else{
            ArrayList<String> arrayList = new ArrayList<>();

            for(int i=0;i<data.length;i++){
                if(data[i].equals("null")){

                }
                else {
                    arrayList.add(data[i]);
                }
            }
            String[] data1 = new String[arrayList.size()];
            for(int i = 0;i<arrayList.size();i++){
                data1[i] = arrayList.get(i);
            }

            return evaluateResultPrefix(data1,data1.length-1,data1.length,res);


        }
    }


    /**
     * print prefix tree
     * @return
     */
    @Override
public String toString() {
        return
                "" + binaryTree
                ;
        }

    /**
     * print postfix tree
     * @return
     */
    public String toString2() {
        return
                "" + binaryTree
                ;
    }
}
