package com.abhilash.error;

public class PracticeThrows3 {
    public static void main(String[] args) {
        DocumentImporter importer = new CsvImporter();
        try {
            importer.importDocument("customers-bad.csv");
        } catch (Exception e) {
            System.out.println("Import failed: " + e.getMessage());
        }
    }

    interface DocumentImporter {
        void importDocument(String name) throws ImportException;
    }

    static class CsvImporter implements DocumentImporter {
        @Override
        public void importDocument(String name) throws CsvFormatException {
        	if(name.equals("customers-bad.csv")) {
        		throw new CsvFormatException(name, 14);
        	}
            System.out.println("Imported " + name);
        }
    }

    static class ImportException extends Exception {
        ImportException(String message) {
            super(message);
        }
    }

    static class CsvFormatException extends ImportException {
        CsvFormatException(String name, int line) {
            super("CSV format error in " + name + " at line " + line);
        }
    }
}