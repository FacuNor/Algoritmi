package testprodotti;

import java.util.Scanner;

/**
 * TestProdotti
 */
public class TestProdotti {

    public static void main(String[] args) {

        boolean ciclo = true;
        Scanner s = new Scanner(System.in);
        String input;
        double spesaTot = 0;
        String[] menu ={"Panino 5.,5€",
                        "Panino vegano €4.0",
                        "Patatine €2.0",
                        "Coca €1.5",
                        "Acqua €1.0",
                        "Caramelle €0.5"};
        
        for (String string : menu) {
            System.out.println(string);
        }

        while(ciclo){
            System.out.print("Inserisci un prodotto: ");
            
            input = s.nextLine();
            switch (input) {
                case "Panino":
                    spesaTot += 5.5;
                    break;
                case "Panino vegano":
                    spesaTot += 4.0;
                    break;
                case "Patatine":
                spesaTot += 2.0;
                    break;
                case "Coca":
                    spesaTot += 4.0;
                    break;
                case "Acqua":
                    spesaTot += 1.0;
                    break;
                case "Aranciata":
                    spesaTot += 1.5;
                    break;
                case "Caramelle":
                    spesaTot += 0.5;
                    break;
                default:
                    ciclo = false;
                    break;
            }

        }

        System.out.println("Costo totale: "+spesaTot);
        System.out.println("Grazie mille e arrivederci.");

        s.close();



    }
    
}