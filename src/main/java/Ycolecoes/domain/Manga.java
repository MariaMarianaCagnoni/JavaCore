
package Ycolecoes.domain;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String nome;
    private Double preco;


    public Manga(Long id, String nome, Double preco) {
        Objects.requireNonNull(id, "id cannot be null"); //não pode ser null,se não lança um nullpointer exception
        Objects.requireNonNull(nome, "name canot be null");
        Objects.requireNonNull(preco, "preco cannot be null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome) && Objects.equals(preco, manga.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }


    @Override
    public int compareTo(@NotNull Manga outroManga) {
        //negativo se o this for < outroManga
        //positivo se o this for >  outroManga
        //zero se o this for ==  outroManga
        return this.getId().compareTo(outroManga.getId()); //é possivel implementar por conta do Id ser um Wrapper
        //caso o campo a ser comparado seja um tipo primitivo:
        //return Double.valueOf(Preco).compareTo(outroManga.getPreco());



    }
}

