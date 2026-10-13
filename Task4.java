public class Task4 {
    public static void main(String[] args) {

        String input = ("Hannah");
        
        String reverse = new StringBuilder(input).reverse().toString();
        
        if (input.equals(reverse)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}

