package Exercises.Set2;

// Defining a Point class to represent a point in 2-dimensional space
public class Point {

    // x-coordinate of the point
    private int x;

    // y-coordinate of the point
    private int y;

    // Constructor for the Point class
    public Point(int x, int y) {
        this.x = x;  // Assigning x-coordinate of the point
        this.y = y;  // Assigning y-coordinate of the point
    }

    // Method to get the x-coordinate of the point
    public int getX() {
        return x;
    }

    // Method to get the y-coordinate of the point
    public int getY() {
        return y;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public double distanceTo(Point other) {
        int diffx = this.x - other.x;
        int diffy = this.y - other.y;
        return Math.sqrt(diffx*diffx + diffy*diffy);
    }
}