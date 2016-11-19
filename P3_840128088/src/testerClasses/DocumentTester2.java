package testerClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import dataManagement.Document;
import dataManagement.WordInDocument;

public class DocumentTester2 {

	public static void main(String[] args) throws IOException {
		File fPath = new File("p340354020data", "docs"); 
		fPath = new File(fPath, "doc1.pp3"); 

		RandomAccessFile file = new RandomAccessFile(fPath, "rw"); 
		
		Document doc = new Document(file); 
		
		ArrayList<Long> wp = new ArrayList<>(); 
		wp.add(49l); 
		wp.add(90l); 
		wp.add(1272l);
		wp.add(3341l); 
		wp.add(4896l); 
		wp.add(4921l); 
		wp.add(4956l); 
		
		wp.add(5016l); 
		
		doc.displayDocumentContent(wp);
		
    	file.close();
	}

}
