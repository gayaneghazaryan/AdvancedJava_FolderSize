public class MyThread extends Thread{
    private String path;

    public MyThread(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        FileSizeService.findSize(path);
    }
}
