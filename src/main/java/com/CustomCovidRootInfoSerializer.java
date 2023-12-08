package com;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.model.CovidRootInfoDTO;

public class CustomCovidRootInfoSerializer extends JsonSerializer<CovidRootInfoDTO> {
	
	@Override
	public void serialize(CovidRootInfoDTO value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeStartObject();
		gen.writeObjectField(value.getStateCode(), value.getCovidInfoDTO());
		gen.writeEndObject();
	}
}