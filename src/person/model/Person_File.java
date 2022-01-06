package person.model;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

//package kr.co.practice.util;

public class Person_File {
	
	
	public static String filepath = "c:\\save\\";
    public static String filename = "savedata.txt";

	public static List<SaramVo> readFile(File file) throws IOException {
		
		
		FileReader fileReader = null;
		
		List<SaramVo> listInfo = new ArrayList<SaramVo>();

		try {
			fileReader = new FileReader(file);
			
			listInfo = readReader(fileReader);
		} finally {
			if (fileReader != null)
				fileReader.close();
		}
		return listInfo;
	}
	

	public static List<SaramVo> readReader(Reader input) throws IOException {
		try {
			
			BufferedReader bufferedRead = new BufferedReader(input);
			String line;

			List<SaramVo> InfoList = new ArrayList<SaramVo>();

			
			while ((line = bufferedRead.readLine()) != null) {
			
				String[] writeStr = line.split(",");

				
				if (writeStr.length != 4)
					continue;

				SaramVo saramVo = new SaramVo();

				
				saramVo.setNo(Integer.parseInt(writeStr[0]));
				saramVo.setName((writeStr[1]));
				saramVo.setPhone((writeStr[2]));
				saramVo.setEmail((writeStr[3]));

				InfoList.add(saramVo);
			}

			return InfoList;
		} finally {
			input.close();
		}
	}
	
	   public static void writeFile(List<SaramVo> InfoList ) throws IOException {
	        OutputStream outputStream = null;
	        try {
	            File dirent = new File(filepath);
	            

	            if(!dirent.exists()) {
	                dirent.mkdir();
	            }
	 
	            File outFile = new File(filepath, filename);
	 
	            
	            if(outFile.exists()) {
	                outFile.delete();
	            }
	 
	          
	            outputStream = new BufferedOutputStream(new FileOutputStream(outFile));
	            for(int i=0; i < InfoList.size(); i++) {
	                
	                String writeStr = InfoList.get(i).getNo() + "," + InfoList.get(i).getName() + "," + InfoList.get(i).getPhone() + ","+ InfoList.get(i).getEmail() +"\n";
	 
	              
	                byte[] b = writeStr.getBytes();
	                
	               
	                outputStream.write(b);
	            }
	        } catch (IOException ioe) {
	            
	            ioe.printStackTrace();
	            throw ioe;
	        } finally {
	            try {
	                
	                if (outputStream != null) outputStream.close();
	            } catch (Exception e) {
	            }
	        }
	    } 
	   
}
