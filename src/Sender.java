public class Sender implements Runnable {
    int i = 0;
    public SetGet m;

    Sender(SetGet m) {
        this.m = m;
    }
    @Override
    public void run() {

        while (true) {

            System.out.println(Thread.currentThread() + " Секунда - " + String.valueOf(i));
            m.put(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception");
            }
        }
    }
}
