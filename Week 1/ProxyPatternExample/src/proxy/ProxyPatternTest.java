package proxy;

// Test class to demonstrate the Proxy Pattern
public class ProxyPatternTest {
    public static void main(String[] args) {
        System.out.println("=== Proxy Pattern Example ===\n");

        // Create proxy images (no loading happens yet - lazy initialization)
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        System.out.println("Proxy images created. No images loaded yet.\n");

        // First display - triggers loading from remote server
        System.out.println("--- First display of image1 ---");
        image1.display();

        System.out.println();

        // Second display - uses cached image (no reloading)
        System.out.println("--- Second display of image1 (cached) ---");
        image1.display();

        System.out.println();

        // First display of image2 - triggers loading
        System.out.println("--- First display of image2 ---");
        image2.display();

        System.out.println();

        // Second display of image2 - uses cached image
        System.out.println("--- Second display of image2 (cached) ---");
        image2.display();
    }
}
