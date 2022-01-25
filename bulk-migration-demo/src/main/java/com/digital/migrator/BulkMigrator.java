/**
 * 
 */
package com.digital.migrator;

import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.digital.model.TempEntity;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

/**
 * @author M1056182
 *
 */
public class BulkMigrator {
	
	public void migrateLargeFromCSVtoDB() {
		
		System.out.println("Migration will start in ");
		for (int i = 5; i >0; i++) {
		System.out.println(i);	
		}
		System.err.println("File Read Time start: " + LocalDateTime.now());
		try {
		 File csvFile = new File("C:\\CALC-PROJ\\bulk-migration-demo\\Sample-Spreadsheet-1000-rows.csv");
		 //configure input format using
		 FileReader filereader = new FileReader(csvFile);
		 
         // create csvParser object with
         // custom separator semi-colon
         CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

         // create csvReader object with
         // parameter filereader and parser
         CSVReader csvReader = new CSVReaderBuilder(filereader)
                                   .withCSVParser(parser)
                                   .withSkipLines(1)
                                   .build();
	    
        List<String[]> allData = csvReader.readAll();
	    List<TempEntity> tempEntities = new ArrayList<>();	
	    int batchSize = 0;
	    for (String[] row : allData) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
	    
	   
		}
		catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	    
	  
	    
	}
	 
    public Reader getReader(String relativePath) {
        
        try {
			return new InputStreamReader(this.getClass().getResourceAsStream(relativePath), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
        
    }
	

}
