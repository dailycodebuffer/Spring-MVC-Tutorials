package com.dailycodebuffer.dekorate;

import io.dekorate.kubernetes.annotation.KubernetesApplication;
import io.dekorate.kubernetes.annotation.Label;
import io.dekorate.kubernetes.annotation.Port;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@KubernetesApplication(
		replicas = 4,
		ports = @Port(name = "http", containerPort = 9090),
		labels = @Label(key = "version", value = "v1"),
		expose = false
)
public class DekorateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DekorateApplication.class, args);
	}

}
