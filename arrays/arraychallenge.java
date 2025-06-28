public class ArrayChallenge {
public static void main(String[] args) {
    String[] orderIDs={"B123" ,"C234", "A345", "C15", "B177", "G3003", "C235", "B179"};
    for (String item : orderIDs) {
        if (item.startsWith("B")){
            System.out.println(item);
        }
    }
}
}
