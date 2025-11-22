package src.com.Aritmetic;

public class Formulari {

    public static double calcularRaizCubica1A(Double volumenTotalTa) {
        final Double PI = 3.1416;

        // Fórmula
        double formula = (volumenTotalTa) / (PI);

        // Calcular la raíz cúbica
        double raizCubica = Math.cbrt(formula);

        return raizCubica;
    }
    
    public static double calcularRaizCubica1(double volumenTotal) {
        final double PI = 3.1416;
        final double constante = 4;
        final double variable = 6;

        // Fórmula
        double formula = constante * volumenTotal / (variable * PI);

        // Calcular la raíz cúbica
        double raizCubica = Math.cbrt(formula);

        return raizCubica;
    }
    
    public static double calcularRaizCubica2(double volumenTotal) {
        final double PI = 3.1416;
        final double constante = 4;
        final double variable = 5;

        // Fórmula
        double formula = constante * volumenTotal / (variable * PI);

        // Calcular la raíz cúbica
        double raizCubica = Math.cbrt(formula);

        return raizCubica;
    }
    
    public static double calcularRaizCubica3(double volumenTotal) {
        final double PI = 3.1416;
        final double constante = 4;
        final double variable = 4;

        // Fórmula
        double formula = constante * volumenTotal / (variable * PI);

        // Calcular la raíz cúbica
        double raizCubica = Math.cbrt(formula);

        return raizCubica;
    }

    public static double calcularRaizCubica4(double volumenTotal) {
        final double PI = 3.1416;
        final double constante = 4;
        final double variable = 3;

        // Fórmula
        double formula = constante * volumenTotal / (variable * PI);

        // Calcular la raíz cúbica
        double raizCubica = Math.cbrt(formula);

        return raizCubica;
    }

    public static boolean isString(String str) {
        return str.matches("[a-zA-Z\\s\\p{Punct}]+$");
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isNumericIn(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
