public class Receiver7sec implements Runnable {
    private SetGet m;

    Receiver7sec(SetGet m) {
        this.m = m;
    }
    @Override
    public void run() {
        while (true) {

            if((m.take() + 1) % 7 == 0) {
                System.out.println(Thread.currentThread() + " Сообщение  - " + m.take() + " - Каждые 7 секунд");
            }
        }
    }
}
