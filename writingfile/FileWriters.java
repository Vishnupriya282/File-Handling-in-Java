package writingfile;
import java.io.*;


public class FileWriters {
	
 public static void main(String[] argw)
 {
    try { 
    	File f=new File("D:\\Project Backups\\New Text Document.txt");
    	FileWriter fw=new FileWriter(f);
    	String msg=" Using FileWriter class, It is not necessary to convert message into byte array";
    	
    	fw.write(msg);
    	fw.close();
    	System.out.println("Success..");
    	
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }
 }	   
    			   
 }
