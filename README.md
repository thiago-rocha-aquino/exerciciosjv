Exercício de Laboratório Java:  <strong>Modelagem de Formas Geométricas</strong>
1- Crie uma Classe Abstrata FormaGeometrica:<br>
 Esta classe servirá como base para todas as formas geométricas.<br>
 Declare um atributo protegido nome (String) para armazenar o nome da forma.<br>
 Crie um construtor que receba o nome da forma e o inicialize.<br>
 Declare um método abstrato calcularArea() que não recebe nenhum argumento e retorna um double 
representando a área da forma.<br>
 Declare um método abstrato calcularPerimetro() que não recebe nenhum argumento e retorna um double 
representando o perímetro da forma.<br>
 Crie um método concreto getNome() que retorna o nome da forma.<br>
 Crie um método concreto exibirInformacoes() que imprima o nome, a área e o perímetro da forma. Este 
método deve chamar os métodos abstratos calcularArea() e calcularPerimetro().<br>
2- Crie Classes Concretas que Herdam de FormaGeometrica:
Círculo:<br>
 Declare um atributo privado raio (double).<br>
 Crie um construtor que receba o nome e o raio do círculo e chame o construtor da superclasse.<br>
 Implemente o método calcularArea() para retornar a área do círculo (πr2). Utilize Math.PI.<br>
 Implemente o método calcularPerimetro() para retornar o perímetro do círculo (2πr). Utilize Math.PI.<br>
Retângulo:<br>
 Declare atributos privados base (double) e altura (double).<br>
 Crie um construtor que receba o nome, a base e a altura do retângulo e chame o construtor da superclasse.<br>
 Implemente o método calcularArea() para retornar a área do retângulo (base×altura).<br>
 Implemente o método calcularPerimetro() para retornar o perímetro do retângulo (2×(base+altura)).
Triangulo:<br>
 Declare atributos privados lado1, lado2 e lado3 (double).<br>
 Crie um construtor que receba o nome e os três lados do triângulo e chame o construtor da superclasse.<br>
 Implemente o método calcularArea() utilizando a fórmula de Heron: A=s(s−a)(s−b)(s−c), onde s é o <br>
semiperímetro (s=(a+b+c)/2).<br>
 Implemente o método calcularPerimetro() para retornar a soma dos três lados (lado1+lado2+lado3).<br>
3- Crie uma Classe Main para Testar as Formas:<br>
 No método main(), crie instâncias de cada uma das classes concretas (Circulo, Retangulo e, opcionalmente, 
Triangulo), fornecendo valores para seus atributos.<br>
 Chame o método exibirInformacoes() de cada objeto para mostrar suas informações (nome, área e 
perímetro).<br>
 Demonstre o conceito de polimorfismo criando um array (ou uma List) do tipo FormaGeometrica e 
adicionando as instâncias das formas concretas a ele.<br>
 Itere sobre o array/lista e chame o método exibirInformacoes() para cada elemento. Observe como o 
método correto para calcular a área e o perímetro é chamado dinamicamente para cada tipo de forma.
