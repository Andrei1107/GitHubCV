package multithreading;

public class ThreadsMain {


    public static void main(String[] args) {
//throws InterruptedException
        //InterrupedException=pe parcursul executiei se poate intrerupe metoda si arunca exceptia asta
        //pot sa o tratez si cu try -> catch
        //daca o aruncam cu throws incerca sa o paseze la alta metoda apelanta si ar fi crapat,cu try -> catch o tratez

//Lucru pe doua thread-uri
//        StopWatchThread stopWatch = new StopWatchThread();
//        Thread t1 = new Thread(stopWatch, "->Thread1");
//        Thread t2 = new Thread(stopWatch, "->Thread2");


        //primul parametrul(stopWatch) este o referinta la clasa pe care vreau sa o rulez separat   ->se duce in run automat
//        t1.start();
//        t2.start();
//cu metoda start ii spunei ca thread ul e pregatit sa inceapa,SO decide daca ruleaza sau nu
//ruleaza ambele in paralel pt ca au prioritati egale,asa a decis OS


        //el ruleaza thread ul 3 dupa 2 ,dupa 1 pt ca asa a programat sistemul
//        t1.setDaemon(true);
//        t2.setDaemon(true);
        //setDaemon -seteaza prioritatea cea mai mica,dupa terminarea thread ului 3 nu se mai executa t1 si t2
        //fara daemon s-ar fi afisat si restul iteratiilor
//ca exemplu :GarbageCollector : (el nu se termina niciodata) ,are prioritate foarte scazuta si cand nu mai ruleaza nimic
        //el intra in actiune si dezaloca variabile de care nu mai ai nevoie


//        t1.start();
//       t2.start();
//
//        try {
//            System.out.println("Start thread,will be sleep for 3 seconds"+" ->Thread 3 ");
//            Thread.sleep(3000);
//            System.out.println("Now,thread start after 3 seconds"+" ->Thread 3 ");
//            Thread.sleep(3000);
//            System.out.println("Now ,the thread stops after 3 seconds"+" ->Thread 3");
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//
//runnableMethod();

//StopWatchThread stopWatchThread=new StopWatchThread();
//        stopWatchThread.run();


        //sau


//        Thread t1=new Thread(new StopWatchThread());  //StopWatchThread implementeaza interfata Runnable
//        t1.run();
//
        //sau


        //explicatie: a pornid thread ul principal (main) dupa a pornit thread ul stopWatch
        //


//        Thread t5 = new Thread(new LovesMe());
//        Thread t6 = new Thread(new LovesMeNot());
//        t5.start();
//        t6.start();





//JoinExample Je=new JoinExample();
//
//
//        Thread t7=new Thread(Je,"Thread 1");
//        Thread t8=new Thread(Je,"Thread 2");
//        Thread t9=new Thread(Je,"Thread 3");
//
//
//
//        t7.start();
//
//        try{
//            t7.join(5000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
////asteapta 5 secunde sau asteapta terminarea primului thread pentru executia celui de-al 2-lea
//        t8.start();
//        try{
//            t8.join(5000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
////asteapta 5 secunde sau asteapta terminarea threadului 2  pentru executia celui de-al 3-lea
//
//        t9.start();
//        try{
//            t9.join(5000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
////asteapta 5 secunde sau asteapta terminarea threadului 3
//        System.out.println("Cele 3 threaduri s-au terminat");


//SINCRONIZARE

//        Bench bench=new Bench(2);
//        Thread t1=new Thread(new PlaceTaker(bench));
//        Thread t2=new Thread(new PlaceTaker(bench));
//        Thread t3=new Thread(new PlaceTaker(bench));
////cele 3 threaduri  isi fac o copie dupa nr de banci si nu au treaba unele cu altele
//        //cu synchronized o sa se refere la acclasi bloc de date,adica la aceelasi numar de locuri si fiecare thread o sa decrementeze nr de locuri
//// punem synchronized unde sunt datele comune pentru cele 3 threaduri,adica nr de locuri(takerPlace)
//
//        t1.start();
//        t2.start();
//        t3.start();


        //Notify & Wait

        Message message=new Message("Mesaj 1");
        Consumer consumer=new Consumer(message);
        Producer producer=new Producer(message);

        Thread t1=new Thread(consumer,"Consumer");
        Thread t2=new Thread(producer,"Producer");

      t1.start();
       t2.start();

//trebuie sa afiseze asa:
        //Consumerul a inceput
        //Consumerul asteapta
        //Threadul producer a transmis mesajul ...
        //Mesajul a fost primit
        //Consumer a terminat
        //Producer a terminat

        //dar nu primeste mesajul din cauza SO ului pt ca celorlalti le-a mers







    }









    public static void runnableMethod() {
        StopWatchRunnable stopWatchRunnable = new StopWatchRunnable();
        Thread t4 = new Thread(stopWatchRunnable, " ->Thread 4");
        t4.start();

    }


}
