//to import random class
import java.util.Random;

public class OrderIDGenerator {
    public static void main(String[] args) {
        //instantiating the random class
        Random random = new Random();
        //array decalaration of size 10
        String[] orderIDs= new String[10];
//to loop through each element of the array
        for(int i=0; i<orderIDs.length; i++){

            char prefix=(char)(random.nextInt(5)+'A');
//generates random number between 1 and 999
            int number =random.nextInt(999)+1;
//number formatting to 3 digits
            String suffix =String.format("%03d",number);
            //combining the prefix and suffix
            orderIDs[i]=prefix+suffix;

        }
        //to loop through each element in the array
        for(String orderID : orderIDs){
            System.out.println(orderID);
        }

    }
}
