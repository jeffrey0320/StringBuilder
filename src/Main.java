public class Main {
    public static void main(String[] args) {
        String message = "Hello World!";
        String str = "goodbye";
        String oldStr = "Hello";
        //String newStr = "wonderful";

        StringBuilder myMsg = new StringBuilder(message);

        int pos = myMsg.indexOf(oldStr);
        System.out.println("Index of " + oldStr + " is " + pos);
        //myMsg.replace(pos,pos+5,"Bye");
        System.out.println(myMsg);
        myMsg.replace(pos,pos+str.length(),str);
        System.out.println(myMsg);
        //myMsg.replace(pos,pos+3,"bad");
        System.out.println(myMsg);
        //myMsg.replace(pos,pos+6,"rotten");
        System.out.println(myMsg);
    }
}
