package ricerca;


import java.util.Arrays;

public class Ricerca {
    

    //O(n) Omega(1)
    public static boolean ricercaLineare(int[] array, int elementoDaTrovare) {
        for (int i : array) {
            if(i == elementoDaTrovare){//1 passo
                return true;//1 passo
            }
        }
        return false;//1 passo 
    }


    //O(n) Omega(n) = Theta (n)
    public static int ricercaMassimo(int[] array) {
        
        int massimo = array[0];

        for (int i : array) {
            if(i > massimo){
                massimo = i;
            }
        }
        return massimo;

    }

    public static boolean ricercaBinaria(int[] array, int elementoDaTrovare){
        //CASO FINALE
        if(array.length == 1){
            if(array[0]==elementoDaTrovare){
                return true;
            }else{
                return false;
            }
        }
        //Interrompo se trovo il numero
        if(array[array.length/2]==elementoDaTrovare){
            return true;
        } 

        //Cerco sulla parte sx del vettore
        if(array[array.length / 2] > elementoDaTrovare){
            int[] newArray = Arrays.copyOfRange(array, 0, array.length/2);
            //System.out.println("Vettore dx: "+Arrays.toString(newArray));
            return ricercaBinaria(newArray, elementoDaTrovare);

        }else{//Cerco sulla parte dx del vettore
            int[] newArray = Arrays.copyOfRange(array, array.length/2, array.length);
            //System.out.println("Vettore dx: "+Arrays.toString(newArray));
            return ricercaBinaria(newArray, elementoDaTrovare);
        }
    }







}
