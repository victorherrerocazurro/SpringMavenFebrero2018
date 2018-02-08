package com.ejemplo.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.View;

public class MiView implements View{

	@Override
	public String getContentType() {
		return MediaType.TEXT_HTML_VALUE;
	}

	@Override
	public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.getWriter().print("Hola " + model.get("dato") + "!!!!");
		
	}

}
