package Oexcecao.exception.ExceptionCustomizada;

import java.util.Scanner;

/**
 * @author mariana
 * @Project: javacore
 */
public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginException e) {
            throw new RuntimeException(e);
        }

    }

    private static void logar() throws LoginException {
        String senhaDB = "123";
        String usuarioDB = "goku";

        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Senha: ");
        String senha = sc.nextLine();

        if (!usuarioDB.equals(usuario) || !senhaDB.equals(senha)) {
            throw new LoginException("Usuario ou senha inválidos");
        } else
            System.out.println("usuario logado com sucesso");
    }
}
