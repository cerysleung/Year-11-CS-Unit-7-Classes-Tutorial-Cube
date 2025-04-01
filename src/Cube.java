public class Cube {
    private int side;

    //constructor 1
    public Cube () {
        this.side = 1;
    }
    //constructor 2
    public Cube (int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        this.side = side;
    }
    //getter method
    public int getSide (){
        return side;
    }
    //setter method
    public void setSide (int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        }
        this.side = side;
    }
    //surface area of cube
    public int calculateSurfaceArea () {
        return 6 * side * side;
    }
    //volume of cube
    public int calculateVolume () {
        return side * side * side;
    }
    //toString method
    public String toString (){
        return "Cube{side=" + side + "}";
    }
}
