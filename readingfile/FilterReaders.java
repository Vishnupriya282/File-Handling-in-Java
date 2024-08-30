package readingfile;

import java.io.File;
import java.io.FileReader;
import java.io.FilterReader;

public class FilterReaders {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("D:\\Project Backups\\New Text Document.txt");
			
			FileReader fr = new FileReader(f);
			
			FilterReader br = new FilterReader(fr) { };
			
			int x;
			
			while((x=br.read())!=-1) {
				
				char ch = (char)x;
				
				System.out.print(ch);
			}
			
			br.close();
			
			fr.close();
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
