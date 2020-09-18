/**
 * 
 */
package com.ishaqkhan.springsecurityjwt.services;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author ishaqkhan
 * 
 */
@Service
public class MyUserDetailsService implements UserDetailsService{

	
	@Override public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new User("ishaq", "ishaq", new ArrayList<>());
	}
	

}
