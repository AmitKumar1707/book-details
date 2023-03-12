package com.bookClasses;

import com.google.inject.Inject;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import java.io.IOException;
import static java.lang.System.out;


public class PrintCSVData {
    String csvFile="C:\\Users\\Amit_Kumar10\\IdeaProjects\\book-details\\src\\main\\resources\\myBook.csv";
    @Inject
    public SampleFileCsvReader sampleFileCsvReader;

    public void csvPrintBookDetails()
    {
        SampleFileCsvReader sampleFileCsvReader=new SampleFileCsvReader();
        try {
               CSVPrinter printer = new CSVPrinter(out, CSVFormat.RFC4180);
               printer.printRecords(sampleFileCsvReader.readMyCSV(csvFile));
               out.close();
            } catch (IOException e) {
                    e.printStackTrace();
           }
    }
    public static void main(String args[]) {
        PrintCSVData printCSVData = new PrintCSVData();
        printCSVData.csvPrintBookDetails();

    }

}
