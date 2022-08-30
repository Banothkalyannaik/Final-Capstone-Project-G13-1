package com.doconnect.doconnectservice.dto;

import java.util.Set;

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
     * Description :Created of Loginresponse data Transfer Object 
     * Params :None
     * Return Type :None 
	 * Exception :None
     */
public class LoginResponse {

    private boolean status;
    
    private Long user_id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Set<String> roles;
}
