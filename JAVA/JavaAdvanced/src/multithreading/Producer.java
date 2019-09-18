package multithreading;
//notify si wait

public class Producer extends Thread {

    private Message message;

    Producer(Message msg) {
        this.message = msg;
    }


    @Override
    public void run() {

        String numeThread = Thread.currentThread().getName();
      //  message.setMessage(numeThread);


        synchronized (message) {
            System.out.println(("Threadul Producer a transmis mesajul " + message.getMessage() + " la momentul " + System.currentTimeMillis()));
            message.notify();
        }





        System.out.println("Producerul a terminat ");

    }


}
