package com.example.demo.Service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.*;
import java.util.ArrayList;

import com.example.demo.Connection.HttpGetRequestConnection;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;

	public UserService(UserRepository repo) {
		super();
		this.repo = repo;
	}
	public void save(User user) {
		
		String str="INSERT INTO company VALUES(DEFAULT,'"+user.getComId()+"','"+user.getComName()+"','"+user.getEmp()+"')";
		//System.out.println(str);
		try {
			UserConnection c=new UserConnection();
			c.s.executeUpdate(str);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public User findByComId(String comId) {
		String comName=null,emp=null;
		int id=0;
		User user=null;
		String str="SELECT * FROM company WHERE comId='"+comId+"'";
		//System.out.println(str);
		try {
			UserConnection c=new UserConnection();
			
			ResultSet rs=c.s.executeQuery(str);
			while(rs.next()) {
				comName=rs.getString("comName");
				emp=rs.getString("emp");
				id=rs.getInt(1);
				user=new User(id,comName,comId,emp);
				//System.out.println(id+" "+comName+" "+comId+" "+emp);
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
			
		return user;
	}
	public ArrayList<User> getAllUsers(){
		String str="SELECT * FROM company";
		ArrayList<User> allUsers=new ArrayList<>();
		try {
			UserConnection c=new UserConnection();
			ResultSet rs=c.s.executeQuery(str);
			while(rs.next()) {
				User user=new User(rs.getInt("id"),rs.getString("comName"),rs.getString("comId"),rs.getString("emp"));
				allUsers.add(user);
				//System.out.println(user);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return allUsers;
	}
	
	
}
