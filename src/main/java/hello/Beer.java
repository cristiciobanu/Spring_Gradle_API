package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Beer {

	private String name;
    private String description;
    
    public String getName() {
		return name;
	}
    
    public String getDescription() {
		return description;
	}

}
