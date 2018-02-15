package app.services;

import org.springframework.web.client.RestTemplate;
import app.models.Beer;

public class ApiCall {
	private String url;
	private Beer[] resultMulti;
	private Beer resultSingle;
	
	public ApiCall(String url, String a) {
		setUrl(url);
		RestTemplate restTemplate = new RestTemplate();
		setResultMulti(restTemplate.getForObject(getUrl(), Beer[].class));
	}
	
	public ApiCall(String url, int a) {
		setUrl(url);
		RestTemplate restTemplate = new RestTemplate();
		setResultSingle(restTemplate.getForObject(getUrl(), Beer.class));
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setResultSingle(Beer resultSingle) {
		this.resultSingle = resultSingle;
	}
	
	public Beer getResultSingle() {
		return resultSingle;
	}
	
	public void setResultMulti(Beer[] result) {
		this.resultMulti = result;
	}
	
	public Beer[] getResultMulti() {
		return resultMulti;
	}
}
