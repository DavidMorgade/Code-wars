public class isADigit {
    
    public static void main(String[] args) {
        System.out.println(isDigit("7"));
    }

    public static boolean isDigit(String s) {
        return s.matches("\\d");
    }
}
