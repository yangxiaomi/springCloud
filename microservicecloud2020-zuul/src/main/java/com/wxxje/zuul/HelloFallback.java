package com.wxxje.zuul;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.assertj.core.api.ByteArrayAssert;
import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

@Component		//zuul环境中启动它作为一个断路器
public class HelloFallback implements ZuulFallbackProvider{

	@Override
	public String getRoute() {
		// TODO Auto-generated method stub
		return "*";
	}

	@Override
	public ClientHttpResponse fallbackResponse() {
		// TODO Auto-generated method stub
		return new ClientHttpResponse() {
			
			@Override	//头信息
			public HttpHeaders getHeaders() {
				// TODO Auto-generated method stub
				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
				return headers;
			}
			
			@Override			//返回的内容
			public InputStream getBody() throws IOException {
				// TODO Auto-generated method stub
				String msg = "tonyzuul";   //可以构造对象的josn
				return new ByteArrayInputStream(msg.getBytes());
			}
			
			@Override		//状态文字的描述
			public String getStatusText() throws IOException {
				// TODO Auto-generated method stub
				return HttpStatus.BAD_REQUEST.getReasonPhrase();
			}
			
			@Override		//状态码
			public HttpStatus getStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return HttpStatus.BAD_REQUEST;
			}
			
			@Override		//返回状态的值
			public int getRawStatusCode() throws IOException {
				// TODO Auto-generated method stub
				return HttpStatus.BAD_REQUEST.value();
			}
			
			@Override
			public void close() {
				// TODO Auto-generated method stub
			}
		};
	}
	
}
