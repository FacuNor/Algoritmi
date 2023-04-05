package ordinamento;

import java.util.Arrays;

public class TestOrdinamento {
    
    public static void main(String[] args) {
        String[] array={
            "Ciao",
            "mi",
            "chiamo",
            "Facundo",
            "e",
            "in",
            "questo",
            "momento",
            "vivo",
            "a",
            "Torino"
        };

        System.out.println(Arrays.toString(array));;

        MySort.bubbleSort(array);
        
        System.out.println(Arrays.toString(array));;




    }
}
