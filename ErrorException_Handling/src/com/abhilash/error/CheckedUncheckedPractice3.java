package com.abhilash.error;

public class CheckedUncheckedPractice3 {
    public static void main(String[] args) {
        try {
            exportReport("missing-report.csv");
            System.out.println("Report exported");
        } catch (ReportFileException e) {
            System.out.println("Checked custom: " + e.getMessage());
        }

        try {
            startJob(-1);
            System.out.println("Job started");
        } catch (InvalidJobStateException e) {
            System.out.println("Unchecked custom: " + e.getMessage());
        }
    }

    static void exportReport(String fileName) throws ReportFileException {
        if (fileName.equals("missing-report.csv")) {
        	throw new ReportFileException("cannot write " + fileName);
        }
    }

    static void startJob(int retryCount) {
        if (retryCount < 0) {
        	throw new InvalidJobStateException("negative retries: " + retryCount);
        }
    }

    static class ReportFileException extends Exception {
        ReportFileException(String message) {
            super(message);
        }
    }

    static class InvalidJobStateException extends RuntimeException {
        InvalidJobStateException(String message) {
            super(message);
        }
    }
}