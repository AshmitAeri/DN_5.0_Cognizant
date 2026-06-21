public class FactoryMethodPatternExample {

    public static void main(String[] args) {

        DocumentFactory factory1 = new WordFactory();
        Document doc1 = factory1.createDocument();
        doc1.open();

        DocumentFactory factory2 = new PdfFactory();
        Document doc2 = factory2.createDocument();
        doc2.open();

        DocumentFactory factory3 = new ExcelFactory();
        Document doc3 = factory3.createDocument();
        doc3.open();
    }
}