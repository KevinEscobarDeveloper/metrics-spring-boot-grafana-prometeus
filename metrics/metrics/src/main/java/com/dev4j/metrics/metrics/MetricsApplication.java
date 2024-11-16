package com.dev4j.metrics.metrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.composite.CompositeMeterRegistry;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MetricsApplication {

	public static void main(String[] args) {

		SpringApplication.run(MetricsApplication.class, args);

		CompositeMeterRegistry compositeMeter =Metrics.globalRegistry;
		System.out.println(compositeMeter==null);
		/*
		Counter counter = compositeMeterRegistry.counter("numero.empleados","oficina","Benito juarez");
		counter.increment();
		counter.increment(200);

		MeterRegistry registry = new SimpleMeterRegistry();
		compositeMeterRegistry.add(registry);
		System.out.printf("Numero de empleados %f",counter.count());*/
	}

}
