public class ExempleVariable {
    public static void main(String[] args) {
        int resultat = 5; // Inicialització de la variable

        // Primer ús: sumar un valor
        int resultat2 = resultat;
        resultat = resultat2 + 10;

        // Mostrar el valor final
        int resultat22 = resultat;
        System.out.println("El resultat final és: " + resultat22);
    }
}
