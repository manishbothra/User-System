package com.example.demo.Connection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
@SuppressWarnings("deprecation")
public class EmiratesLine_ContainerData_HttpPost {
	public static void main(String [] args) throws Exception {
		String para="ctid=ESPU2007641&g-recaptcha-response=03AGdBq2641xceySmiHjFEKcWdebbtj-CKhoo1llPS7xY1a45X8wyVkWdl2w8vtbBFP3EuaODWdyqyTLk9z4duIhCWfHPa73peKK0UL7YPn6QL2Cxxwc4q1c2HosOH6vgvQ-woBSvNRELmEPdu77I8ePaA-6_LSe7PJEOCFOhUdHXqlyJ58UYQxgEfcQHzNFyCTrMAHAyK4FP_mvC_pKn7fYRK70Zx_6cksj3oGUI3_JrPDRAnDaTup0UYaZDUnuWrCsmh5PcbMRFmc5z-TRt0TRZQodCjwIXMdO8JpOjOLCiMwU9UsfzQI3LqjVlz6E1LdIts-VzW2o8W7qk2i361ctm9H2GA1jO6iKnBtCtMPI1I_2qzRWwqpXzWeePLzWyNB5tMPkYAt8EZIlSEkOXpfpi3N8oe8REQ0LVcyxE4bbkOPuAkVI2mFS6tLFfmt_d6-3VEdGOJGkVkW_1MGzxmfnTuMU1Mn7MspQ&scode=tgCQK3v3QbHHzFs6";
//		HttpPost httppost=new HttpPost("http://www.emiratesline.com/cargo-tracking?"+para);
//		
//		httppost.addHeader("Content-Type", "application/json; charset=UTF-8");
//		try (DefaultHttpClient httpclient = new DefaultHttpClient()) {
//			HttpResponse response=httpclient.execute(httppost);
//			BufferedReader in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
//			String line="";
//			while ((line=in.readLine())!=null){
//				System.out.println(line);
//			}
//		}
		
		
		String url="http://www.emiratesline.com/cargo-tracking?ctid=ESPU2007641&g-recaptcha-response=03AGdBq2641xceySmiHjFEKcWdebbtj-CKhoo1llPS7xY1a45X8wyVkWdl2w8vtbBFP3EuaODWdyqyTLk9z4duIhCWfHPa73peKK0UL7YPn6QL2Cxxwc4q1c2HosOH6vgvQ-woBSvNRELmEPdu77I8ePaA-6_LSe7PJEOCFOhUdHXqlyJ58UYQxgEfcQHzNFyCTrMAHAyK4FP_mvC_pKn7fYRK70Zx_6cksj3oGUI3_JrPDRAnDaTup0UYaZDUnuWrCsmh5PcbMRFmc5z-TRt0TRZQodCjwIXMdO8JpOjOLCiMwU9UsfzQI3LqjVlz6E1LdIts-VzW2o8W7qk2i361ctm9H2GA1jO6iKnBtCtMPI1I_2qzRWwqpXzWeePLzWyNB5tMPkYAt8EZIlSEkOXpfpi3N8oe8REQ0LVcyxE4bbkOPuAkVI2mFS6tLFfmt_d6-3VEdGOJGkVkW_1MGzxmfnTuMU1Mn7MspQ&scode=tgCQK3v3QbHHzFs6";
		Document document=Jsoup.connect(url).get();
		System.out.println(document.outerHtml());
	}
}
