import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(schema="testdb",name = "users")
public class User {


    //tabela cu toti userii bibliotecii
    //trebuie sa il leg la biblioteca ca sa vad ce user a imprumutat carti,pt ce perioada,etc..


   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
    private Long id;


   @Column(name = "numeUilizator")
    private String numeUtilizator;

   @Column(name = "carti_imprumutate")
    private int cariImprumutate;

   @Column(name = "dataImprumut")
    private Date date;







}
