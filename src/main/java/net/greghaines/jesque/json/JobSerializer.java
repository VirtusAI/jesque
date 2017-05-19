package net.greghaines.jesque.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import net.greghaines.jesque.Job;

public class JobSerializer extends StdSerializer<Job> {
	private static final long serialVersionUID = 1L;

	public JobSerializer() {
        this(null);
    }
  
    public JobSerializer(Class<Job> t) {
        super(t);
    }

    @Override
    public void serialize(Job value, JsonGenerator jgen, SerializerProvider provider) 
      throws IOException, JsonProcessingException {
    	jgen.writeRawValue(GsonFactory.get().toJson(value));
    }
}
