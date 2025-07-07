package ExercisesSet2;

public class Square {
    private int side;

    public Square(int side) {
        // TODO: Initialize side with the passed value
        this.side = side;
    }

    public int calculateArea() {
        // TODO: Calculate and return the area of the square
        return side <= 0 ? -1 : side*side;
    }

    public int calculatePerimeter() {
        // TODO: Calculate and return the perimeter of the square
        return side <= 0 ? -1 : 4*side;
    }
}
