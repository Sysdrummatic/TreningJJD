public class NewString {
    public static void main(String[] args) {

        String someLiteral = "some constant value";
        System.out.println(someLiteral);

        System.out.println("Some" + " " + "string" + " " + "literal.");

        int x = 10;
        Object y = new Object();
        System.out.println("Some" + " " + x + " " + "literal" + " " + y);

        System.out.println(1 + 2 + "test");
        System.out.println("test" + 1 + 2);

        String text1 = "Some";
        String text2 = " literal.";
        System.out.println(text1.concat(text2));

        String some = "Some";
        String space = " ";
        String random = "random";
        String string = "string";

        String someString = some + space + random + space + string;
        System.out.println(someString);

        compilerConcatenationFiddling();
    }

    public static void compilerConcatenationFiddling(){
        String some = "Some";
        String space = " ";
        String random = "random";
        String string = "string";

        StringBuilder someStringBuilder = new StringBuilder();
        someStringBuilder.append(some);
        someStringBuilder.append(space);
        someStringBuilder.append(random);
        someStringBuilder.append(space);
        someStringBuilder.append(string);

        String someString2 = someStringBuilder.toString();
        System.out.println(someString2);
/*
        String finalString = "";
        for (int counter = 0; counter < 1000; counter++){
            finalString = finalString + "" + counter;
            System.out.println(finalString);
        }
*/
        StringBuilder finalStringBuilder = new StringBuilder();
        for (int counter = 0; counter < 1000; counter++){

           finalStringBuilder.append(counter);
           finalStringBuilder.append("-");
        }
        String finalString = finalStringBuilder.toString();
        System.out.println(finalString);

    }

}
