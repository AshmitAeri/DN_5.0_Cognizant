package proxy;

// Proxy class with lazy initialization and caching
public class ProxyImage implements Image {
    private RealImage realImage; // Cached reference
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
        // Note: RealImage is NOT created here (lazy initialization)
    }

    @Override
    public void display() {
        if (realImage == null) {
            // Lazy initialization: load only when first needed
            System.out.println("[Proxy] Image not cached. Loading for the first time...");
            realImage = new RealImage(filename);
        } else {
            // Caching: reuse the already loaded image
            System.out.println("[Proxy] Image '" + filename + "' found in cache. Skipping reload.");
        }
        realImage.display();
    }
}
