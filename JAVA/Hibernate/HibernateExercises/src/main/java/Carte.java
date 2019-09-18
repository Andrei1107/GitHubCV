import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema="testdb",name = "biblioteca")
public class Carte {

    public Carte(){

    }


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long bookId;

    @Column(name = "nume")
    private String numeCarte;


    @Column(name = "autor")
    private String autor;


    @Column(name = "editura")
    private String editura;


    @Column(name = "categorie")
    private String categorie;

    @Column(name = "exemplare")
    private int nrExemplare;

    public int getNrExemplare() {
        return nrExemplare;
    }

    public void setNrExemplare(int nrExemplare) {
        this.nrExemplare = nrExemplare;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getNumeCarte() {
        return numeCarte;
    }

    public void setNumeCarte(String numeCarte) {
        this.numeCarte = numeCarte;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
