package com.evaluation;

import com.evaluation.RestConsumer.RestMessageConsumer;
import com.evaluation.RestProducer.RestMessageProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class RequestController {

    @Autowired
    private RestMessageProducer messageProducer;

    @Autowired
    private RestMessageConsumer messageConsumer;

    private static Logger logger = LoggerFactory.getLogger(RequestController.class);

    @RequestMapping("/sum")
    public ResponseEntity<String> sendMessage(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        try {
            messageProducer.sendMessage("topic-1", "sum," + a + "," + b);
            Thread.sleep(1000);
            String sum = messageConsumer.getResult();
            return ResponseEntity.ok().body("result: " + sum);
        } catch (Exception e) {
            logger.error("An unexpected error occurred: {}", e.getMessage(), e);
            return ResponseEntity.badRequest().body("Error");
        }
    }


    @RequestMapping("/subtraction")
    public ResponseEntity<String> subtraction(@RequestParam BigDecimal a, @RequestParam BigDecimal b){
        try {
            messageProducer.sendMessage("topic-1", "subtraction," + a + "," + b);
            Thread.sleep(1000);
            String subtraction = messageConsumer.getResult();
            return ResponseEntity.ok().body("result: " + subtraction);
        } catch (Exception e) {
            logger.error("An unexpected error occurred: {}", e.getMessage(), e);
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @RequestMapping("/division")
    public ResponseEntity<String> division(@RequestParam BigDecimal a, @RequestParam BigDecimal b){
        try {
            messageProducer.sendMessage("topic-1", "division," + a + "," + b);
            Thread.sleep(1000);
            String division = messageConsumer.getResult();
            return ResponseEntity.ok().body("result: " + division);
        } catch (Exception e) {
            logger.error("An unexpected error occurred: {}", e.getMessage(), e);
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @RequestMapping("/multiplication")
    public ResponseEntity<String> multiplication(@RequestParam BigDecimal a, @RequestParam BigDecimal b) {
        try {
            messageProducer.sendMessage("topic-1", "multiplication," + a + "," + b);
            Thread.sleep(1000);
            String multiplication = messageConsumer.getResult();
            return ResponseEntity.ok().body("result: " + multiplication);
        } catch (Exception e) {
            logger.error("An unexpected error occurred: {}", e.getMessage(), e);
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
