import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DAOBiblioteca {

    public void createBook(Carte carte) {
        Transaction transaction = null;


        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.save(carte);
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            } else {
                System.out.println("Carte adaugata cu success");
            }
        }


    }


    public void stergeDupaAutor(String numeleAutorului) {
        Transaction transaction = null;
        Session session;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Query query = session.createQuery("DELETE from Carte where autor= :numeautor");
            query.setParameter("numeautor", numeleAutorului);
            int result = query.executeUpdate();
            transaction.commit();


        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }


    }

    public static void stergeDupaEditura(String editura) {
        Transaction transaction = null;
        Session session;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Query query = session.createQuery("DELETE from Carte where editura= :numeeditura");
            query.setParameter("numeeditura", editura);
            int result = query.executeUpdate();
            transaction.commit();


        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }


    }

    public static void StergeDupaNumeCarte(String numecarte) {
        Transaction transaction = null;
        Session session;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Query query = session.createQuery("DELETE from Carte where nume= :numecarte");
            query.setParameter("numecarte", numecarte);
            int result = query.executeUpdate();
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }


    }


    public static void stergeDupaId(Long Bookid) {
        Transaction transaction = null;
        Session session;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Query query = session.createQuery("DELETE from Carte where id= :bookId");
            query.setParameter("bookId", Bookid);
            int result = query.executeUpdate();
            transaction.commit();


        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }


    }

    public static List<Carte> afiseazaToateCartile() {
        List<Carte> carti = new ArrayList<Carte>();
        Transaction transaction = null;
        Session session;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Query query = session.createQuery("From Carte");
            carti = query.getResultList();
            int result = query.executeUpdate();
            transaction.commit();


        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }


        return carti;
    }


    public static void update(int exemplare, Long id) {
        Transaction transaction = null;
        Session session;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Query query = session.createQuery("UPDATE Carte Set exemplare = :exemplareParam where bookid = :idparam");
            query.setParameter("exemplareParam", exemplare);
            query.setParameter("idparam", id);
            int result = query.executeUpdate();
            transaction.commit();


        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }


    }


}
