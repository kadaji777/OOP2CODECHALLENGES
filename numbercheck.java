public class NumberCheck {
    public void checknumber(int number) {
        if (number>0) {
            System.out.println("The number is positive.");
        } else if (number<0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

public static void main(String[] args) {
    (new NumberCheck()).checknumber(10);

}
}
