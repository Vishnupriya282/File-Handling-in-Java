package writingfile;

import java.io.*;

public class FileOutputStreams {
	 public static void main(String[] argw)
     {
		 try {
				File f=new File("D:\\Project Backups\\write1.txt");
				FileOutputStream fout=new FileOutputStream(f);
				String msg="Welcome to File Handling in java";
				byte[] by=msg.getBytes();
				fout.write(by);
				fout.close();
				System.out.println("Success");
				
		 }
		 catch(Exception e)
			{
				e.printStackTrace();
			}
}
}
