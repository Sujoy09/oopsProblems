package com.bridgelabz.oopsProblems;

import java.io.File;
import java.util.List;
import com.bridgelabz.oopsProblems.Model.Stock;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	
	public List<Stock> convertJsonToObj(String filepath) {
		try {
		ObjectMapper objectmapper = new ObjectMapper();
		File jsonFile = new File(filepath);
		List<Stock> stockList = objectmapper.readValue(jsonFile, new TypeReference<List<Stock>>(){});
		return stockList;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
