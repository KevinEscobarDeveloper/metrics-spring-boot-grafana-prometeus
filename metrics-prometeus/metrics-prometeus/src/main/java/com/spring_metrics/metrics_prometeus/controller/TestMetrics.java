package com.spring_metrics.metrics_prometeus.controller;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/devs3j/metrics")
public class TestMetrics {
    @Autowired
    private MeterRegistry registry;

    @GetMapping
    @Timed("devs4j.timer")
    public ResponseEntity<String> get() {
        //registry.counter("devs4j.metrics").increment();
        /*Timer timer = registry.timer("devs4j.timer");
        timer.record(() -> {
        try {
            Thread.sleep(1000);
        } catch(Exception e ){
            log.info("Unless task");
        }
        });*/
        log.info("MeterRegistry used {} ",registry.getClass().getName());
        log.error("Log de error ");
        return new ResponseEntity<String>("@Raidentrance", HttpStatus.OK);
    }
}
