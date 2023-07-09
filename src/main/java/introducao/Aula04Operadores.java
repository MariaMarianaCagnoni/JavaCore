package introducao;

/**
 * @author mariana
 * @Project: javacore
 */
public class Aula04Operadores {

    public static void main(String[] args) {

        int valor1 = 10;
        int valor2 = 20;

        System.out.println(valor1 + valor2);
        System.out.println(valor2 - valor1);
        System.out.println(valor1 * valor2);
        System.out.println(valor2 / valor1);
        System.out.println("o resultado é" + valor1 + valor2);// aqui ele vai concatenar tudo
        System.out.println(valor1 + valor2 + " o resultado é"); //aqui ele vai somar os dois primeiros e imprimir a string
        System.out.println(valor1 + valor2 + " o resultado é" + valor1 + valor2); // aqui ele soma os dois primeiros e depois concatena tudo


        System.out.println("o resultado é" + (valor1 + valor2)); //os parenteses evita que tudo seja concatenado

        int resultado = (int) (valor1 / valor2);
        System.out.println(resultado);

        double resultado1 = (valor1 / valor2); //o resultado entre a  divisão de dois numeros inteirios sempre resultará em dois numeros inteiros
        System.out.println(resultado1);

        int valor4 = 10;
        double valor5 = 20;

        double resultado2 = valor4 / valor5; //aqui irá ter o ponto flutuante por conta que um dos numeros é double
        System.out.println(resultado2);

        // System.out.println( 10 /0); //exceção pois nao se pode dividir por zero

        // '%' resto da divisão, ex:
        System.out.println(10 % 3);
        System.out.println(10 % 2);

        // && (AND), || (OR), ! (NOT)

        int idade = 27;
        String name = "mariana";


        boolean ismarianaMaiorDeIdade = idade > 18;
        System.out.println(ismarianaMaiorDeIdade);

        int contador = 0;
        contador += 1;
        System.out.println(contador);
        contador++;
        System.out.println(contador);
        ++contador;

        System.out.println(contador);

    }


}
