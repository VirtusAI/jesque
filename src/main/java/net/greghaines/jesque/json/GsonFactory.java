package net.greghaines.jesque.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * A helper that creates a fully-configured singleton Gson.
 */
public final class GsonFactory {
    
	private static final Gson gson;
	
	static {
		GsonBuilder gsonBuilder = new GsonBuilder();  
		gsonBuilder.serializeNulls();  
		gson = gsonBuilder.create();
	}

	/**
	 * @return a fully-configured Gson
	 */
	public static Gson get() {
		return gson;
	}

	private GsonFactory() {
	    // Utility class
	}
}
