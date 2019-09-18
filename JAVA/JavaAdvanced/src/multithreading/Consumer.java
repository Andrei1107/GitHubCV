package multithreading;

public class Consumer extends Thread {
    public Message message;

    public Consumer(Message msg) {
        this.message = msg;

    }

    @Override
    public void run() {
        System.out.println("Consumer a inceput ");

        try {
            synchronized (message) {

                System.out.println("Consumerul asteapta");
                message.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Mesajul a fost primit " + message.getMessage() + " de la Producer la momentul " + System.currentTimeMillis());
        System.out.println("Consumerul a terminat");

    }


}
