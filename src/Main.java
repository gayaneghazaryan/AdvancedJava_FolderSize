public class Main {
    public static void main(String[] args) {
        String path = "E:\\Downloads\\FSFeedback";
        MyThread myThread = new MyThread(path);
        myThread.start();

    }
}
