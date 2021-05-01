public class Auteur {
    private int id_author;
    private String name;

    public Auteur(int id_author, String name) {
        this.id_author = id_author;
        this.name = name;
    }

    public int getId_author() {
        return this.id_author;
    }

    public void setId_author(int id_author) {
        this.id_author = id_author;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
