package com.example.demo.Connection;

import java.util.*;
import java.util.Scanner;

import javax.tools.JavaFileObject;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;

public class HttpGetRequestConnection {
	
	public static void main(String [] args)  throws Exception{
	      CloseableHttpClient httpclient = HttpClients.createDefault();
	      HttpGet httpget = new HttpGet("https://connect2india.com/api/login/info");
	      HttpResponse httpresponse = httpclient.execute(httpget);
	      Scanner sc = new Scanner(httpresponse.getEntity().getContent());
	      while(sc.hasNext()) {
	    	  String s=sc.nextLine();
	    	  System.out.println(s);
	    	  JSONObject jsn=new JSONObject(s);
	    	  System.out.println(jsn);
	    	  System.out.println(jsn.get("loggedIn"));
	    	  System.out.println(jsn.get("origin"));
	    	  System.out.println(jsn.get("isOverseasUser"));
	      }
	}
}
