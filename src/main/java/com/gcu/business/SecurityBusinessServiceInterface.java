package com.gcu.business;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;



/**
 * Date: 02/05/2022
 * Interface for the Login service pages
 * 
 * @author Michael Mohler
 * @version 1
 */
public interface SecurityBusinessServiceInterface 
{
	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}