package Exercises.Set3;

public class TriangleValidator {
    public static boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // Validar que todos los lados sean positivos
        if (angle1 <= 0 || angle2 <= 0 || angle3 <=0) {
            return false;
        }

        // Si la suma da igual a 180 es un triángulo
        return (angle1 + angle2 + angle3) == 180;
    }

    public static boolean isRightAngled(int side1, int side2, int side3) {
        // Validar que todos los lados sean positivos
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return false;
        }

        // Aplicar el teorema de Pitágoras para todas las combinaciones posibles
        return (side1 * side1 + side2 * side2 == side3 * side3) ||
                (side1 * side1 + side3 * side3 == side2 * side2) ||
                (side2 * side2 + side3 * side3 == side1 * side1);
    }

}
