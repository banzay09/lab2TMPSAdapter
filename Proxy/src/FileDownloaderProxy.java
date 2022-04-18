import java.io.IOException;

public class FileDownloaderProxy implements Downloader {
    private FileDownloader fileDownloader;
    private String url;

    public FileDownloaderProxy(String url) {
        this.url = url;
        System.out.println("File unloaded: " + this.url);
    }

    @Override
    public void download() throws IOException {
        if (fileDownloader == null) {
            fileDownloader = new FileDownloader("FireFox", this.url);
        } else {
            System.out.println("File was uploaded: " + this.url);
        }
        fileDownloader.download();
    }
}