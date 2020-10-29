package com.example.demo.Connection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;

public class DAL_ContainerData_HttpPost {
	public static void main(String [] args) throws Exception {
		
		
		String para="{\"jsonrpc\":\"2.0\",\"method\":\"getDataByEqNo\",\"params\":[\"DAYU2155484\"],\"id\":1,\"module\":\"tracking\"}";
		JSONObject jObject=new JSONObject(para);
		StringEntity entity = new StringEntity(jObject.toString(2),  "UTF-8");
		HttpPost request=new HttpPost("https://my.dal.biz/anon_jsonrpc");
		request.addHeader("Content-Type", "application/json; charset=utf-8");
		request.setEntity(entity);
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpResponse response = httpClient.execute(request);
		BufferedReader in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line="";
        while ((line=in.readLine())!=null){
        	System.out.println(line);
        }
	}
}
