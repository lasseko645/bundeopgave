public class Minemetoder {

    public void loop () {
        int i;
        int j;


        // jeg havde lidt problemer med at finde ud af hvad jeg skulle skrive ind i den her og hvordan vi skulle gøre brug af den, men det var for det meste bare fordi jeg gerne ville have det til at have en funktion. hvilket jo ikke er nødvendigt

        // jeg starter med at lave en tabel lige som vi gjorde i en af timerne engang i forløbet, det er et multiplikerings tabel

        for  ( i = 1; i <= 10; i++) {
            for (j = 1; j != 10; j++) {
                int output = i*j;

                    // vis tallende er 1 cifret så skal vi have et extra mellemrum på
                    if (output < 10  ){
                        System.out.print(" ");

                    }

                    // her ville vi kunne


                System.out.print(output + " ");



            }

            System.out.println();

        }




    }



}
