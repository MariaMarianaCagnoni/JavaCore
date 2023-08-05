package Oexcecao.exception.ExceptionCustomizada;

/**
 * @author mariana
 * @Project: javacore
 */
public class LoginException extends Exception{
    public LoginException(){
        super("Usuário ou senha inválidos");
    }

    public LoginException(String message){
        super(message);
    }
}
