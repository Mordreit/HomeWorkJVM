public class Receiver5sec implements Runnable {
    private SetGet m;

    Receiver5sec(SetGet m) {
        this.m = m;
    }
    @Override
    public void run() {
        while (true) {

            if ((m.take() + 1) % 5 == 0) {
                System.out.println(Thread.currentThread() + " Сообщение  - " + m.take() + " - каждые 5 секунд");
            }
        }
    }
}
