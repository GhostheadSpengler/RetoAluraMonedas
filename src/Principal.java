import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        while (true) { //CICLO INFINITO
            Scanner teclado = new Scanner(System.in);
            ConsumoApi convierte=new ConsumoApi(); //Aca conecta con la API
            int opciones = 7;
            System.out.println(" ****** CONVERSOR DE MONEDAS ******\n");

            System.out.println("""
                    Elija la opcion que deseas realizar:
                                    
                    1. Dolar a Pesos
                    2. Pesos a Dolar
                    3. Dolar a Euros
                    4. Euros a Dolar
                    5. Dolar a Yuang
                    6. Yuang a Dolar
                                    
                    Para "REINICIAR" presiona (0) \n""");

            //Mientras sea DIFERENTE DE 0 se va a ejecutar el programa
            while (opciones != 0) {
                opciones = teclado.nextInt();

                switch (opciones) {

                    case 1:
                     ConsumoApi consumoApi=new ConsumoApi();
                     //CAMBIAR EL USO HACIA LA CONSOLA
                     consumoApi.moneda("USA","MXN",70);
                        System.out.println("*** DOLAR A PESO ***\n");
                        System.out.println("Ingresa el monto a convertir:");
                        System.out.println(consumoApi);

                        //CONSUMIR API y CONVERTIRLA


                        break;

                    case 2:
                        System.out.println("\n*** PESO A DOLAR ***");
                        System.out.println("Ingresa el monto a convertir:");
                        break;

                }
            }
        }
    }
}

/* **************** OBSERVACIONES ******************
1. Conversion dolar a peso,ejemplo:

        Dolar= Dolar*Peso

 ----- Peso a Dolar:

        Peso= Peso/Dolar

 */
