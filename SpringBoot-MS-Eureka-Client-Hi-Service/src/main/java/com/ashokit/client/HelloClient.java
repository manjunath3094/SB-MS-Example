package com.ashokit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HELLO-SERVICE") // "HELLO-SERVICE" IS THE NAME OF provider service name
public interface HelloClient {

	@GetMapping(value="/hello/{name}")
	public String invokeHelloService(@PathVariable("name")  String name);
}
