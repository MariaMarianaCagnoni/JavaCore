package Aintroducaoclasses.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Estudante {

    public String nome;
    public int idade;
    public char sexo;
    public String cpf;


    public boolean isMaiorIdade(Estudante estudante){
        //Objects.requireNonNull(pessoa,"pessoa não pode ser nulo");
        if (estudante == null){
            throw new IllegalArgumentException("pessoa não pode ser nula");
        }
        return estudante.getIdade() >= 18;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
