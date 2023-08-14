package Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mariana
 * @Project: javacore
 */
public class EmailValidator {
    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
}
    public static void main(String[] args) {
        String email = "exemplo@email.com";
        if (isValidEmail(email)) {
            System.out.println("Email válido");
        } else {
            System.out.println("Email inválido");
        }
    }
}
