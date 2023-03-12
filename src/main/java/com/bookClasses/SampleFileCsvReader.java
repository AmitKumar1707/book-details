package com.bookClasses;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SampleFileCsvReader {
    public List<Book> readMyCSV(String csvFile){

        // reading CSV file with CSV reader object
        CSVReader csvReader = null;
        List<Book> listOfBooks = new ArrayList<>();
        try {
            csvReader = new CSVReader(new FileReader(csvFile));
            String[] value;
            while ((value = csvReader.readNext()) != null) {
                Book tempInstance = new Book();
                tempInstance.setTitle(value[0]);
                tempInstance.setAuthor(value[1]);
                tempInstance.setPrice(value[2]);
                listOfBooks.add(tempInstance);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return listOfBooks;
    }
}
