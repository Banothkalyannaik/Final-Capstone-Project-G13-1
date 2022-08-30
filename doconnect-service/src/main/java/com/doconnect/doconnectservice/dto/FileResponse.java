package com.doconnect.doconnectservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

/*
     * @Author : Banoth Kalyan
     * Created Date : 25-8-2022
     * Modified Date : 29-8-2022
     * Description : Created FileReponse class  of dto
     * Params :None
     * Return Type : None
	 * Exception : None
     */

public class FileResponse {
	
	private String fileName;
	private String message;

}
