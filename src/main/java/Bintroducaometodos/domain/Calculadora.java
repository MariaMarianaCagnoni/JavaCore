package Bintroducaometodos.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public void divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Não é possível dividir por zero");
        }
    }

    public double divideDoisNumeros2(double num1, double num2) {
        if (num2 == 0) {
            {
                return 0;
            }
        }
        return num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 19;
        num2 = 20;
        System.out.println(num1);
        System.out.println(num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;

        if (numeros != null && numeros.length > 0) {
            for (int num : numeros) {
                soma += num;
            }
            System.out.println(soma);
        } else if (numeros == null) {
            System.out.println("Array não pode ser nulo");
        }
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;

        if (numeros != null && numeros.length > 0) {
            for (int num : numeros) {
                soma += num;
            }
            System.out.println(soma);
        } else if (numeros == null) {
            System.out.println("Array não pode ser nulo");
        }
    }


//    public void somaTresValores(@NotNull("valor nao pode ser null") String a) {
//
//        System.out.println(a );
//        System.out.println("TESTE");
//    } @Notnull lança uma excessão

}

