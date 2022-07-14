package com.greatlearning.student.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;


	private String username;
	private String password;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch =FetchType.EAGER)
	@JoinTable(name="users_roles",
	            joinColumns = @JoinColumn(name="user_id"),
	            inverseJoinColumns = @JoinColumn(name="role_id"))
	private List<Role> roles = new ArrayList<Role>();

}
