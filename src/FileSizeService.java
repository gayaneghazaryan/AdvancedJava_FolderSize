import java.io.File;

public class FileSizeService {
    public static long totalSize = 0;

    public static void findSize(String path) {
        File folder= new File(path);

        File[] folderFiles = folder.listFiles();
        if (folderFiles != null) {
            for (File file : folderFiles) {
                if (file.isDirectory()) {
                    findSize(file.getAbsolutePath());
                } else {
                    totalSize += file.length();
                    System.out.println(SizeConverter(totalSize));
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static String SizeConverter(long bytes) {
        String result = "";
        double kB = 1024;
        double MB = 1024 * 1024;
        double GB = 1024 * 1024 * 1024;

        if(bytes / GB >= 1) {
            result = Math.round(bytes/GB)+" GB";
        } else if(bytes/MB >= 1) {
            result = Math.round(bytes/MB)+" MB";
        } else if(bytes/kB > 0) {
            result = Math.round(bytes/kB)+" kB";
        }
        return result;
    }
}
