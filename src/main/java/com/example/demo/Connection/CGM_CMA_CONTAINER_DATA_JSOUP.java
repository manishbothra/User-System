package com.example.demo.Connection;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;;
public class CGM_CMA_CONTAINER_DATA_JSOUP {
	
	
	public static void main(String [] args) {
		String url="https://www.cma-cgm.com/ebusiness/tracking/search?SearchBy=Container&Reference=TLLU4265452&search=Search";
		try {
			Document document=Jsoup.connect(url).get();
			//System.out.println(document.outerHtml());
//			for(Element row:document.select("div.c-endtoend--wrapper tr")) {
//				//System.out.println(row));
//				if(row.select(".js-openrow.is-header").text().equals("")) {
//					//System.out.println("null");
//					continue;
//				}
//				else {
//					String date=row.select(".js-openrow.is-header").text();
//					//System.out.println(date);
//					String icon=row.select(".is-icon").text();
//					String moves=row.select(".js-openrow.is-headerdata").text();
//					String location=row.select("td:nth-of-type(4)").text();
//					String vessel=row.select("td:nth-of-type(5)").text();
//					String voyage=row.select("td:nth-of-type(6) > [href^=\"/ebusiness/schedules/voyage/detail\"]").text();
//					
//					//System.out.println(date+" "+icon+" "+moves+" "+location+" "+vessel+" "+voyage);
//					System.out.println(date+"  "+icon+"     "+moves+"     "+location+"    "+vessel+"    "+voyage);
//				}
//			}
			for(Element row:document.getAllElements()) {
				System.out.println(row);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
