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
    }

    public void setHold(String hold) {
        this.hold = hold;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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



}
