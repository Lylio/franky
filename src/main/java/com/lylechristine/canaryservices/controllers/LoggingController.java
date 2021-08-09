package com.lylechristine.canaryservices.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @Value("${logging.level.root}")
    private String logLevel;

    @RequestMapping("/api/v1/logger")
    public String logIndex() {
        logger.trace("A trace message");
        logger.debug("A debug message");
        logger.info("An info message");
        logger.warn("A warn message");
        logger.error("An error message");

        return ("<h2>Howdy! Check out the logs to see the logging messages!<h2>" +
                "<br> <h2>Logging level in application.properties = " + logLevel + "<h2>");
    }
}
