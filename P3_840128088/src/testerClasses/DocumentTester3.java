package testerClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import dataManagement.Document;
import dataManagement.WordInDocument;

public class DocumentTester3 {

	public static void main(String[] args) throws IOException {
		File fPath = new File("p340354020data", "docs"); 
		fPath = new File(fPath, "doc1.pp3"); 

		RandomAccessFile file = new RandomAccessFile(fPath, "rw"); 
		
		Document doc = new Document(file); 
		
		ArrayList<Long> wp = new ArrayList<>(); 

		/**/
		for (WordInDocument w : doc) 
			if (w.getWord().equalsIgnoreCase("object"))
				wp.add(w.getLocation()); 
		/**/
		
		
		doc.displayDocumentContent(wp);

		
    	file.close();
	}

}
