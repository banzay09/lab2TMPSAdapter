import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        String url = "https://imgur.com/a/JhSgZ7T";
        System.out.println("Init proxy");
        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy(url);

        try {
            System.out.println("---");
            System.out.println("Call real service 1st: ");
            fileDownloaderProxy.download();

            System.out.println("---");
            System.out.println("Call real service 2nd: ");
            fileDownloaderProxy.download();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}