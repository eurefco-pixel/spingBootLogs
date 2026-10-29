package com.example.springBootLogs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping("/log-test")
    public String logTest() {
        logger.info("Тестовый INFO-лог из Spring Boot");
        logger.warn("Тестовый WARN-лог");
        logger.error("Тестовый ERROR-лог");
        return "Check logs in logs/app.json.log";
    }
}