package RESTTesting;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class PhilUtils {
	private int responseStatusCode;
	private String responseContent;

	protected int getResponseStatusCode() {
		return responseStatusCode;
	}

	protected String getResponseContent() {
		return responseContent;
	}

	protected void resetServiceState() throws Throwable {
		putRequest("https://www.google.co.uk/?gws_rd=ssl");
		//http://localhost:8080/mock-auth/api/clean,http://192.168.99.100:8080/mock-auth/api/clean
	}
	
	protected void getRequest(String requestStr) throws Throwable {
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(requestStr);
		request.addHeader("accept", "application/json");
		processResponse(client.execute(request));
	}

	protected void putRequest(String requestStr) throws Throwable {
		HttpClient client = HttpClientBuilder.create().build();
		HttpPut request = new HttpPut(requestStr);
		request.addHeader("accept", "application/json");		
		processResponse(client.execute(request));
	}
	
	protected void processResponse(HttpResponse response) throws Throwable{
		responseStatusCode = response.getStatusLine().getStatusCode();
		if (response.getEntity() != null){
			responseContent = EntityUtils.toString(response.getEntity());
		}	
	}

	protected void version(String weburl) throws Throwable{
		getRequest(weburl);
	}
	
}
