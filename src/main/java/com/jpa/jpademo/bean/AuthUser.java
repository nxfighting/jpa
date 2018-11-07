package com.jpa.jpademo.bean;

import javax.persistence.*;

@Entity
@Table(name = "auth_user")
public class AuthUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer authId;
	@Column(name = "auth_name")
	private String authName;
	@Column(name = "auth_pass")
	private String authPass;

	public Integer getAuthId() {
		return authId;
	}

	public void setAuthId(Integer authId) {
		this.authId = authId;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public String getAuthPass() {
		return authPass;
	}

	public void setAuthPass(String authPass) {
		this.authPass = authPass;
	}

}
