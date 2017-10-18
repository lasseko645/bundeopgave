public class Studerende {

    //dette er vores data felt hvor jeg vil lægge nogle default vadier ind

    private String name = "fejlbesked";
    private int age = 0;
    private String hold = "findes ikke";
    private String phone = "0000000000";
    private int id = -00000000;

    // vores constructers, jeg starter med en no arguments constructer

    public Studerende (){

    }

    public Studerende (String name, int id){
        this.name = name;
        this.id = id;

    }

    public Studerende (String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;

    }

    public Studerende (String name, int age, String hold, int id){
        this.name = name;
        this.age = age;
        this.hold = hold;
        this.id = id;

    }

    public Studerende (String name, int age, String hold,String phone, int id){
        this.name = name;
        this.age = age;
        this.hold = hold;
        this.phone = phone;
        this.id = id;

    }


    // her vil jeg lave alle vores get metoder


    public void setAge(int age) {

        this.age = age;
        System.out.println(" this persons age is now changed to, " + age);
        // just for it to look a little nicer in the console
        System.out.println("");
    }

    public void setHold(String hold) {

        this.hold = hold;
        System.out.println(" this person is now part of the team, " + hold);
        // just for it to look a little nicer in the console
        System.out.println("");
    }

    public void setName(String name) {

        this.name = name;
        System.out.println(" this persons name is now changed to, " + name);
        // just for it to look a little nicer in the console
        System.out.println("");
    }

    public void setPhone(String phone) {

        this.phone = phone;
        System.out.println(" this persons phone number is now changed to, " + phone);
        // just for it to look a little nicer in the console
        System.out.println("");
    }


    // her laver jeg vores getmetoder


    public int getAge() {
        return age;
    }

    public String getHold() {
        return hold;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }




    //this is just a method that will be able to make me show that the start main file works
    public void seedata(){
        System.out.println(" the name of person " + id + " is " + name);
        System.out.println(" they are  " + age + " of age ");
        System.out.println(" they are part of the " + hold + " team ");
        System.out.println(" you might be able to contact them via phone, try the number " + phone);
        // just for it to look a little nicer in the console
        System.out.println("\n");
    }


}
