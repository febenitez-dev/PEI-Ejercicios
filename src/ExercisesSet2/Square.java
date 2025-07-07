package ExercisesSet2;

public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int calculateArea() {
        return side <= 0 ? -1 : side*side;
    }

    public int calculatePerimeter() {
        return side <= 0 ? -1 : 4*side;
    }
}
