package com.example.demo.Connection;

import java.io.IOException;

import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class ANL_ContainerData_Jsoup {
	public static void main(String [] args) throws IOException {
		String url="https://www.anl.com.au/ebusiness/tracking/search?SearchBy=Container&Reference=FCIU3406462&search=Search";
		
		
		Document document=Jsoup.connect(url).get();
		System.out.println(document.outerHtml());
//		for(Element row:document.select("div.c-endtoend--wrapper tr")) {
//			//System.out.println(row);
//			if(row.select(".js-openrow.is-header").text().equals("")) {
//				//System.out.println("null");;
//				continue;
//			}
//			else {
//				String date=row.select(".js-openrow.is-header").text();
//				String icon=row.select(".is-icon").text();
//				String moves=row.select(".js-openrow.is-headerdata").text();
//				String location=row.select("td:nth-of-type(4)").text();
//				String vessel=row.select("td:nth-of-type(5)").text();
//				String voyage=row.select("td:nth-of-type(6) > [href^=\"/ebusiness/schedules/voyage/detail\"]").text();
//				System.out.println(date+" "+icon+" "+moves+" "+location+" "+vessel+" "+voyage);
//			}
//		}
		
//		for(Element row:document.select("div.c-endtoend--wrapper tr")) {
//			System.out.println(row);
//		}
		
	}
}
