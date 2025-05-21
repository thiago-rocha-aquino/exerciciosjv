package geometria;

public abstract class FormaGeometrica {
    protected String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String getNome() {
        return nome;
    }

    public void exibirInformacoes() {
        System.out.println("Forma: " + getNome());
        System.out.printf("Área: %.2f%n", calcularArea());
        System.out.printf("Perímetro: %.2f%n", calcularPerimetro());
        System.out.println("------------------------");
    }
}