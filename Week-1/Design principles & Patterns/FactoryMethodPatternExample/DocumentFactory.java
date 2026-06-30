package FactoryMethodPatternExample;

public abstract class DocumentFactory {
    // The core Factory Method that subclasses must implement
    public abstract Document createDocument();

    // An optional helper method that demonstrates operation on the product
    public void manageDocument() {
        Document doc = createDocument();
        doc.open();
        // Additional operations can go here
        doc.close();
    }
}