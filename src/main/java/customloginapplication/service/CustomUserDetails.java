package customloginapplication.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {
	
	private String username;
	private String password;
	private Collection<? extends GrantedAuthority> authorities;
	private String fullname;
	
	
	

	public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities,
			String fullname) {
		
		this.username = username;
		this.password = password;
		this.authorities = authorities;
		this.fullname = fullname;
		
		
	}
	 
	public String getFullname() {
		return fullname;
	}
	
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return authorities;
	}

	@Override
	public String getPassword() {
		
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
