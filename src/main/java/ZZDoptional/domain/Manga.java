package ZZDoptional.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class Manga {
    private Long id;
    private String title;
    private int chapter;


    public Manga(Long id, String title, int chapter) {
        this.id = id;
        this.title = title;
        this.chapter = chapter;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getChapter() {
        return chapter;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", chapter=" + chapter +
                '}';
    }
}
