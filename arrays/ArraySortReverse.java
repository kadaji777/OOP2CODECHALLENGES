import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main(String[] args) {
        //initial array of pallet IDs
        String[] pallets ={"B14", "A11", "B12", "A13"};

        //sorting
        System.out.println("Sorted ...");
        Arrays.sort(pallets);

        //Reverse the sorted array
        System.out.println("\nReversed ..." );
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList);
        for (String pallet : palletList) {
            System.out.println(pallet);
        }
        //outputting sorted list
        for (String pallet : pallets) {
            System.out.println("--" + pallet);
        }
    }
}
