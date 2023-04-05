package ordinamento;


public class MySort {

    public static void insertionSort(String[] array) {
        for(int i = 1;i<array.length; i++){

            String temp = array[i];
            int j=i-1;

            for(; j>=0 && array[j].compareToIgnoreCase(temp)>= 0; j--){
                array[j+1]=array[j];
            }
            
            array[j+1]=temp;
        }
    }

    //Questo è il bubble sort
    public static void bubbleSort(String[] array) {
        boolean swapped = true;
        while(swapped){
            swapped = false;
             for(int i=0;i<array.length-1;i++){
                if(array[i].compareToIgnoreCase(array[i+1])>0){
                    String temp = array[i+1];
                    array[i+1]=array[i];
                    array[i]=temp;
                    swapped = true;
                }
            }
        }
        

    }

    

    





}
