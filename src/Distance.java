public class Distance {

    // this is just me trying to give some proof that i know how to make use of some of the java funktions, (this was mostly pulled from the recent asignment that we had as homework)

    private int x;
    private int y;


    // lets start with a no argument contructor for starters
    public Distance (){

    }

    // the real constructor
    public Distance (int x, int y){
        this.x = x;
        this.y = y;
    }

    // here we make our getters, just like in the assignment
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    // his one just uses pythagoras to get our right value

    public double distance(){
        double z = Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
        return z;
    }

    // this returns the distance between two points and is used in the method we will write after this
    public double distance(Distance myPoint) {
        return Math.sqrt(Math.pow(myPoint.getX() - x, 2) +  // <-- zeroed in ^_^
                Math.pow(myPoint.getY() - y, 2));           // <-- zeroed in
    }

    // this uses the one we just wrote, and finaly returns the distance of two points after they have been zeroed in
    public double distance (int x, int y){
        return distance(new Distance(x, y));
    }


}
