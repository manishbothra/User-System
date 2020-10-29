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
public class Kambara_Kisen_ContainerData_HttpPost {
	public static void main(String [] args) throws Exception {
		String para="f_cmd=125&cntr_no=KMBU4060753&bkg_no=KNCA100HR214&cop_no=CNGB0514064745";
		HttpPost request=new HttpPost("http://esvc.kambara-kisen.co.jp/clt/CUP_HOM_3301GS.do?"+para);
		request.addHeader("Content-Type", "application/json; charset=UTF-8");
		//request.setEntity(entity);
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpResponse response = httpClient.execute(request);
		BufferedReader in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line="";
        while ((line=in.readLine())!=null){
        	System.out.println(line);
        }
	}
}
