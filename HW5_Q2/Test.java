/**
 * testing ExpressionTree metods
 * create  prefix and postfix tree
 * and evaluate these trees
 */
public class Test {

    public static void main(String[] args){



        String str =
                      " null\n" +
                        " null\n" +
                        "2\n"+
                        " null\n" +
                        " null\n" +
                        "4\n"+
                        "-\n"+
                        " null\n" +
                        " null\n" +
                        "24\n"+
                        " null\n" +
                        " null\n"+
                        "2\n"+
                        "/\n"+
                        "+\n"+
                        " null\n" +
                        " null\n" +
                        "50\n"+
                        " null\n" +
                        " null\n" +
                        "40\n"+
                        "-\n"+
                        " null\n" +
                        " null\n" +
                        "4\n"+
                        " null\n" +
                        " null\n"+
                        "2\n"+
                        "/\n"+
                        "*\n"+
                        "-\n"+
                        " null\n" +
                        " null\n" +
                        "5\n"+
                        " null\n" +
                        " null\n" +
                        "45\n"+
                        "+\n"+
                        " null\n" +
                        " null\n" +
                        "40\n"+
                        " null\n" +
                        " null\n"+
                        "2\n"+
                        "-\n"+
                        "+\n"+
                        " null\n" +
                        " null\n" +
                        "8\n"+
                        " null\n" +
                        " null\n" +
                        "4\n"+
                        "/\n"+
                        " null\n" +
                        " null\n" +
                        "4\n"+
                        " null\n" +
                        " null\n"+
                        "2\n"+
                        "+\n"+
                        "*\n"+
                        "-\n"+
                        "+\n";










                                 String str1 =
                                     " null\n" +
                                    " null\n" +
                                    "50\n"+
                                    " null\n" +
                                    " null\n" +
                                    "2\n"+
                                    "/\n"+
                                    " null\n" +
                                    " null\n" +
                                    "40\n"+
                                    " null\n" +
                                    " null\n"+
                                    "2\n"+
                                    "/\n"+
                                    "+\n"+
                                 " null\n" +
                                 " null\n" +
                                 "5\n"+
                                 " null\n" +
                                 " null\n" +
                                 "4\n"+
                                 "*\n"+
                                 " null\n" +
                                 " null\n" +
                                 "4\n"+
                                 " null\n" +
                                 " null\n"+
                                 "2\n"+
                                 "/\n"+
                                 "*\n"+
                                 "+\n";




        String str2 =
                " null\n" +
                " null\n" +
                "5\n"+
                " null\n" +
                " null\n" +
                "4\n"+
                "+\n"+
                " null\n" +
                " null\n" +
                "4\n"+
                " null\n" +
                " null\n"+
                "2\n"+
                "/\n"+
                "*\n";




        String str3 ="*\n"+
                "+\n"+
                "5\n"+
                " null\n" +
                " null\n" +
                "4\n"+
                " null\n" +
                " null\n" +
                "/\n"+
                "10\n"+
                " null\n" +
                " null\n" +
                "2\n"+
                " null\n" +
                " null\n" ;




        String str4 = "+\n"+
                "*\n"+
                "+\n"+
                "5\n"+
                " null\n" +
                " null\n" +
                "4\n"+
                " null\n" +
                " null\n" +
                "/\n"+
                "16\n"+
                " null\n" +
                " null\n" +
                "2\n"+
                " null\n" +
                " null\n" +
                "/\n"+
                "+\n"+
                "24\n"+
                " null\n" +
                " null\n" +
                "40\n"+
                " null\n" +
                " null\n" +
                "/\n"+
                "80\n"+
                " null\n" +
                " null\n" +
                "20\n"+
                " null\n" +
                " null\n";





        String str5 ="+\n"+
                "*\n"+
                "-\n"+
                "+\n"+
                "5\n"+
                " null\n" +
                " null\n" +
                "4\n"+
                " null\n" +
                " null\n" +
                "/\n"+
                "30\n"+
                " null\n" +
                " null\n" +
                "2\n"+
                " null\n" +
                " null\n"+
                "/\n"+
                "+\n"+
                "4\n"+
                " null\n" +
                " null\n" +
                "2\n"+
                " null\n" +
                " null\n" +
                "-\n"+
                "8\n"+
                " null\n" +
                " null\n" +
                "2\n"+
                " null\n" +
                " null\n"+
                "+\n"+
                "/\n"+
                "-\n"+
                "78\n"+
                " null\n" +
                " null\n" +
                "40\n"+
                " null\n" +
                " null\n" +
                "+\n"+
                "12\n"+
                " null\n" +
                " null\n" +
                "26\n"+
                " null\n" +
                " null\n"+
                "+\n"+
                "-\n"+
                "86\n"+
                " null\n" +
                " null\n" +
                "22\n"+
                " null\n" +
                " null\n" +
                "*\n"+
                "2\n"+
                " null\n" +
                " null\n" +
                "2\n"+
                " null\n" +
                " null\n";

        ExpressionTree<String> ex = new ExpressionTree<>(str);
        System.out.println(ex.toString2());
        System.out.println(ex.eval());;

        System.out.println("***********************************************");



        ExpressionTree<String> ex1 = new ExpressionTree<>(str1);
        System.out.println(ex1.toString2());
        System.out.println(ex1.eval());;

        System.out.println("***********************************************");



        ExpressionTree<String> ex2 = new ExpressionTree<>(str2);
        System.out.println(ex2.toString2());
        System.out.println(ex2.eval());

        System.out.println("************************************************");

        ExpressionTree<String> ex3=new ExpressionTree<>(str3);
        System.out.println(ex3.toString());
        System.out.println(ex3.eval());


        System.out.println("************************************************");

        ExpressionTree<String> ex4 = new ExpressionTree<>(str4);
        System.out.println(ex4.toString());
        System.out.println(ex4.eval());



        System.out.println("************************************************");

        ExpressionTree<String> ex5 = new ExpressionTree<>(str5);
        System.out.println(ex5.toString());
        System.out.println(ex5.eval());

    }
}
