package com.doconnect.doconnectservice.services;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;
/*
     * @Author : Banoth Kalyan
     * Created Date : 25-8-2022
     * Modified Date : 29-8-2022
     * Description : File Service interface class
     * Params : String path, MultipartFile file
     * Return Type : None
	 * Exception : IOException
     */


public interface FileService {
	
	String uploadImage(String path, MultipartFile file) throws IOException;

}
