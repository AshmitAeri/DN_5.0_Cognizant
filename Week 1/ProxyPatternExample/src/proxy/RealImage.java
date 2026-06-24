package proxy;

// Real Subject - loads image from remote server
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromRemoteServer();
    }

    private void loadFromRemoteServer() {
        System.out.println("Loading image '" + filename + "' from remote server...");
        // Simulating a slow network call
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Image '" + filename + "' loaded successfully.");
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
