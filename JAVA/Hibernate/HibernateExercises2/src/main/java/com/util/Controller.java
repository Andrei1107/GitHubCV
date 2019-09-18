package com.util;

import com.sda.Book;
import com.sda.Status;
import com.sda.User;
import com.sda.UserDao;

import java.util.*;

public class Controller {

    private String currentUser;

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public void loginOrRegister() {
        UserDao userDao = new UserDao();
        Scanner scanner = new Scanner(System.in);
        String username;
        Status status;
        List userNameList = new ArrayList();
        userNameList = userDao.selectUserName();


        int choise;
        System.out.println("Do you have an account?");
        System.out.println("1--YES    0--NO");
        choise = scanner.nextInt();

        switch (choise) {

            case 1:
                Scanner scanner2 = new Scanner(System.in);
                System.out.print("Username:  ");
                username = scanner2.nextLine();
                if (userDao.verifyIfUserExist(username)) {
                    System.out.println("Welcome " + username);
                    setCurrentUser(username);
                    status = Status.Connected;
                } else {

                    while (!userDao.verifyIfUserExist(username)) {
                        System.out.println("Username wrong,please type again:");
                        username = scanner.nextLine();

                        if (userDao.verifyIfUserExist(username)) {
                            System.out.println("Welcome " + username);
                            setCurrentUser(username);
                        }

                    }

                }

                break;

            case 0:
                Scanner scanner1 = new Scanner(System.in);
                String newUser;
                System.out.println("****NEW-ACCOUNT****");

                System.out.print("Username: ");
                newUser = scanner1.nextLine();
                while (userNameList.contains(newUser)) {
                    System.out.println("User already exist! \n Please enter an original username:");
                    newUser = scanner1.nextLine();
                }

                User userNew = new User();
                userNew.setUsername(newUser);
                Date date = new Date();
                userNew.setRegisterDate(date);
                userNew.setStatus(Status.Connected);
                userDao.createUser(userNew);
                System.out.println("You are logged with " + userNew.getUsername());
                setCurrentUser(userNew.getUsername());
                break;

            default:
                System.out.println("Please select a valid option!!");


        }


    }

    public void menu() {

        Scanner scanner = new Scanner(System.in);

        int choise;
        Tools tools = new Tools();

        System.out.println("1.Add a book in library");
        System.out.println("2.Delete a book from library");
        System.out.println("3.Show all books from library");
        System.out.println("4.Borrow a book");
        System.out.println("5.Search a book");
        System.out.println("6.Registry");
        System.out.println("0-Exit");
        System.out.println("Select one option:");
        choise = 4000;
        int idCarte;
        char choise2 = ' ';
        char choise3 = ' ';

        while (choise != 0) {
            choise = scanner.nextInt();

            switch (choise) {

                case 1:
                    System.out.println("Add  a book in library:");
                    //  adaugaOCarte();
                    break;
                case 2:
                    //  stergeCarteInterfata();
                    choise2 = scanner.next().charAt(0);

                    switch (choise2) {

                        case 'a':
                            //  stergeDupaId();

                            break;
                        case 'b':
                            //  stergeDupaNumeCarte();
                            break;

                        case 'c':
                            //stergeDupaEditura();
                            break;

                        case 'd':

                            // stergeDupaAutor();
                            break;

                    }

                    break;

                case 3:
                    tools.showAllBooks();
                    menu();
                    break;

                case 4:


                    UserDao userDao2 = new UserDao();
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Select id book:");
                    Long id = scanner2.nextLong();
                    List<List<Book>> borrowed = new ArrayList<>();
                    List<Book> booksBorrowed=new ArrayList<>();
                    while (id != 0) {

                        //borrowed.add(tools.borrow_Book(id));
                        booksBorrowed.add(tools.borrow_Book(id));
                        userDao2.updateDB(id);
                        System.out.println("Select id book:");
                        id = scanner2.nextLong();

                    }
                        for(Book b:booksBorrowed){
                            System.out.println(b);
                        }

                       Map<Book,String> uniqueBooks=new HashMap<>();

                        for(int i=0;i<booksBorrowed.size();i++){
                            //for(String l:booksBorrowed.get(i).getName())
                        }


                    menu();
                    break;

                case 5:
                    //  cautaCarteInterfata();
                    choise3 = scanner.next().charAt(0);
                    switch (choise3) {

                        case 'a':
                            //   cautaCarteDupaAutor();
                            break;
                        case 'b':
                            //  cautaCarteDupaCategorie();
                            break;

                        case 'c':
                            //   cautaCarteDupaEditura();
                            break;

                        case 'd':
                            //   cautaCarteDupaNume();
                    }

                    break;

                case 6:
                    // registru();

                    break;

                default:
                    System.out.println("Select a valid option!!");
            }

        }


    }

}
