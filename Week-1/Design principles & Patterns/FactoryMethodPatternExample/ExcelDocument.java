package FactoryMethodPatternExample;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel spreadsheet (.xlsx) with grids...");
    }

    @Override
    public void close() {
        System.out.println("Closing Excel spreadsheet.");
    }
}