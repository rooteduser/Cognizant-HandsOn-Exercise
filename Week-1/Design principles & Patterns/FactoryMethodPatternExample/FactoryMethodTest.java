package FactoryMethodPatternExample;

public class FactoryMethodTest {
    public static void main(String[] args) {
        System.out.println("=== Factory Method Pattern Test ===\n");

        // 1. Instantiate and use the Word Factory
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.close();

        System.out.println("---------------------------------");

        // 2. Instantiate and use the PDF Factory
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.close();

        System.out.println("---------------------------------");

        // 3. Instantiate and use the Excel Factory
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.close();
    }
}