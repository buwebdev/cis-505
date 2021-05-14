public class CodeCommentExample02 {
    public static void myName(String firstName, String lastName) {
        System.out.println(String.format("My name is %s %s", firstName, lastName));
    }
    public static void main(String[] args) {
        myName("Richard", "Krasso");
    }
}
