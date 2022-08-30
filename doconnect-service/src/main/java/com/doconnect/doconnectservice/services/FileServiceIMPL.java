package com.doconnect.doconnectservice.services;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
/*
     * @Author : Banoth Kalyan
     * Created Date : 25-8-2022
     * Modified Date : 29-8-2022
     * Description : Implementation of file service
     * Params : None
     * Return Type : None
     */

@Service
public class FileServiceIMPL implements FileService{

	/*
     * @Author : Banoth Kalyan
     * Created Date : 25-8-2022
     * Modified Date : 29-8-2022
     * Description : uploading of image
     * Params : String path, MultipartFile file
     * Return Type :  Name of a file
	 * Exception : IOException
     */


	@Override
	public String uploadImage(String path, MultipartFile file) throws IOException {
		
		
		//file name
		String name=file.getOriginalFilename();
	
		//radom-name generate
		String randomID = UUID.randomUUID().toString();
		String fileName1 = randomID.concat(name.substring(name.lastIndexOf(".")));

	

			
		//full-path
		String filepath = path + File.separator + fileName1;
		

		//create folder if it not  created
		File f=new File(path);
		if(!f.exists()) {
			f.mkdir();
		}
		
		//file copy
		
		Files.copy(file.getInputStream(),Paths.get(filepath));
		return name;
	}
	

}
