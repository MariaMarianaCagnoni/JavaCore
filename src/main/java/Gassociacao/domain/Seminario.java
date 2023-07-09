package Gassociacao.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Seminario {

    private String titulo;

    private Local local;
    private Estudante[]  estudantes;

    public void seminariosPrint(){
        System.out.println("titulo do seminário: " + this.titulo);
        System.out.println("local do seminário: " + this.local);
        if(estudantes == null){
            System.out.println("sem estudantes cadastrados");
        }else{
            System.out.println("estudantes participantes");
            for(Estudante estudante: estudantes){
                System.out.println(estudante.getNome());
            }
        }
    }
    public Seminario(String titulo, Local local, Estudante[] estudantes) {
        this.titulo = titulo;
        this.local = local;
        this.estudantes = estudantes;
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
}
