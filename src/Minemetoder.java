public class Minemetoder {

    public void loop () {


        // jeg havde lidt problemer med at finde ud af hvad jeg skulle skrive ind i den her og hvordan vi skulle gøre brug af den, men det var for det meste bare fordi jeg gerne ville have det til at have en funktion. hvilket jo ikke er nødvendigt

        // jeg starter med at lave en tabel lige som vi gjorde i en af timerne engang i forløbet, det er et multiplikerings tabel

        for  (int i = 1; i <= 10; i++) {
            for (int j = 1; j != 10; j++) {
                int output = i*j;

                    // vis tallende er 1 cifret så skal vi have et extra mellemrum på
                    if (output < 10  ){
                        System.out.print(" ");

                    }

                    // her ville vi kunne lave en masse forskelige ting så som at lave det til en titabel, som var hvad vi jorde i undervisningen tror jeg nok, jeg vil her for at vise at jeg forstår hvad der foregår, lave det til en 7 abel

                    //min if statement skal se således ud for at det bliver en tabel som viser alle værdier der går op i 7
                    if (output % 7 == 0){
                        // her printer vi noget som skal give brugeren en ide om at det er dette nummer som går op i vores tabel. i klasse brugte vi * tegnet, det vil jeg også gøre da det giver mest mening
                        System.out.print("*");
                    }

                    // if i stopped here it would make the tabel kinda off cause the spacing i fixed before would not be enough, so ill fix that here with another if statement
                    if (output % 7 != 0){
                        // here i just state that as long as the value int our tabel is not one of the number that the user is looking for then the starts digit will be fille with a space instead
                        System.out.print(" ");
                    }


                System.out.print(output + " ");



            }

            System.out.println();

        }




    }

    public void sout () {
        System.out.println("look i can do this too ");
        System.out.println();
    }

    public void distance (){



    }



}
