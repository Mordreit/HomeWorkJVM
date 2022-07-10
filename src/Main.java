public class Main {
    public static void main(String[] args)  {

        Thread arr[] = new Thread[3];
        SetGet m = new SetGet();
        arr[0] = new Thread(new Sender(m));
        arr[1] = new Thread(new Receiver5sec(m));
        arr[2] = new Thread(new Receiver7sec(m));
        for (Thread thread : arr) {
            thread.start();
        }
    }
}