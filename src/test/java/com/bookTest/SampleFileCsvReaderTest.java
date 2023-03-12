package com.bookTest;


import com.bookClasses.SampleFileCsvReader;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SampleFileCsvReaderTest {
    String csvTestFile="C:\\Users\\Amit_Kumar10\\IdeaProjects\\book-details\\src\\main\\resources\\myBook.csv";
    SampleFileCsvReader sampleFileCsvReader=new SampleFileCsvReader();

    @Test
    public void verify_that_csv_file_is_not_null()
    {
        //Verifying that if file is not null
        Assert.assertNotNull(sampleFileCsvReader.readMyCSV(csvTestFile));
        }

    @Test
    public void verify_that_csv_file_size_is_as_expected()
    {
        //Here verifying the total number of row in csv
        Assert.assertEquals(sampleFileCsvReader.readMyCSV(csvTestFile).size(), 4);
    }

    @Test
    public void verify_the_first_book_entry_in_csv()
    {
        //Verifying the first row of CSV file is expected.
        Assert.assertEquals(sampleFileCsvReader.readMyCSV(csvTestFile).get(0).toString(),"{title='Database', author='Alex', price='100'}");
    }

}



