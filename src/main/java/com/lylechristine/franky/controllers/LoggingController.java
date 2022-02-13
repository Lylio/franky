package com.lylechristine.franky.controllers;

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

    @RequestMapping("/api/v2/logger")
    public String logIndex() {
        logger.trace("A trace message: Tracing the path of the app, like a rubber duck floating down a river");
        logger.debug("A debug message: Lots and lots and lots of info here");
        logger.info("An info message: Some info, for your convenience");
        logger.warn("A warn message: Serious stuff to be checked on");
        logger.error("An error message: DANGER!!!!");

        return ("<h2>Howdy! Check out the logs to see the logging messages!<h2>" +
                "<br> <h2>Logging level in application.properties = " + logLevel + "<h2>");
    }
}
