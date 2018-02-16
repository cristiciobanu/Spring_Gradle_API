package app.utils;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:global.properties")
@ConfigurationProperties("api")
public class GlobalProperties {

    private static String camsHost, camsPath;
    
    private static String weatherHost, weatherPath;

	public static String getCamsHost() {
		return camsHost;
	}

	public static void setCamsHost(String camsHost) {
		GlobalProperties.camsHost = camsHost;
	}

	public static String getCamsPath() {
		return camsPath;
	}

	public static void setCamsPath(String camsPath) {
		GlobalProperties.camsPath = camsPath;
	}

	public static String getWeatherHost() {
		return weatherHost;
	}

	public static void setWeatherHost(String weatherHost) {
		GlobalProperties.weatherHost = weatherHost;
	}

	public static String getWeatherPath() {
		return weatherPath;
	}

	public static void setWeatherPath(String weatherPath) {
		GlobalProperties.weatherPath = weatherPath;
	}

}
