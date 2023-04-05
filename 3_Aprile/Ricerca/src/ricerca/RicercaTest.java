package ricerca;


public class RicercaTest {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,6,7,9,10};
        int elementoDaTrovare = 7;

        boolean trovato = Ricerca.ricercaBinaria(array, elementoDaTrovare);
        if(trovato){
            System.out.println("Elemento "+ elementoDaTrovare + " trovato");
        }else{
            System.out.println("Elemento " + elementoDaTrovare + " non trovato");
        }

        return;
    }
}
