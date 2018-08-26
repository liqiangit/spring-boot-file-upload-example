package com.mkyong;

import java.io.File;
import java.util.HashMap;

import org.junit.Test;

public class MultipartFormUtilTest {

	@Test
	public void testSingleFileUploadWithParameters() {
		HashMap<String, String> parameters=new HashMap<>();
		parameters.put("username","李强");
		File uploadFile=new File("E:/3.jpg");
		String actionURL = "http://localhost:8080/upload";
		String result=MultipartFormUtil.singleFileUploadWithParameters(actionURL,"name", uploadFile, parameters);
		System.out.println(result);
	}

}
