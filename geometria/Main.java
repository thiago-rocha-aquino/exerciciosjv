package geometria;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo("Círculo", 5);
        FormaGeometrica retangulo = new Retangulo("Retângulo", 4, 6);
        FormaGeometrica triangulo = new Triangulo("Triângulo", 3, 4, 5);

        
        circulo.exibirInformacoes();
        retangulo.exibirInformacoes();
        triangulo.exibirInformacoes();

        
        List<FormaGeometrica> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(retangulo);
        formas.add(triangulo);

        System.out.println("=== Iterando com Polimorfismo ===");
        for (FormaGeometrica forma : formas) {
            forma.exibirInformacoes();
        }
    }
}