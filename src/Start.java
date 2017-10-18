public class Start {
    public static void main(String[] args) {
        Minemetoder navn = new Minemetoder();
        DatHoldet hold = new DatHoldet();

        hold.stud00000001.seedata();

        hold.stud00000010.seedata();

        hold.stud00000011.seedata();
        hold.stud00000011.setHold("Datamatiker 17");
        hold.stud00000011.seedata();






        // here we have the for loop inside a forloop method
        navn.loop();

        // at this point im just trying to do exactly what the asignment states (i minemetoder, do 5 things that shows what you have learned )
        navn.sout();

        //3/5 hehe jeg vil bare gerne løse opgaven (jeg regner med at det her er nok til at løse opgaven, jeg kunne godt lave men method som gav et random tal, eller en som gør brug a date klassen, men det regner jeg med ikke er nøvendigt)
        Distance point1 = new Distance(7,8);
        System.out.println(point1.distance());
        System.out.println(point1.distance(5,2));

        // im going to consider the "bundeopgave" done at this point





    }
}
