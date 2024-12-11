package com.evaluation;


import com.evaluation.CalculatorProducer.CalculatorMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

@Service
public class CalculatorService {

    @Autowired
    private CalculatorMessageProducer messageProducer;

    private static Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    public void sum(BigDecimal a, BigDecimal b) {
        try {
            BigDecimal subtraction = a.add(b);
            messageProducer.sendMessage("topic-2", subtraction.toString());
        } catch (Exception e) {
            logger.error("An unexpected error occurred: {}", e.getMessage(), e);
        }
    }

    public void subtraction(BigDecimal a, BigDecimal b) {
        try {
            BigDecimal subtraction = a.subtract(b);
            messageProducer.sendMessage("topic-2", subtraction.toString());
        } catch (Exception e) {
            logger.error("An unexpected error occurred: {}", e.getMessage(), e);
        }
    }

    public void division(BigDecimal a, BigDecimal b) {
        try {
            BigDecimal division = a.divide(b);
            messageProducer.sendMessage("topic-2", division.toString());
        } catch (Exception e) {
            logger.error("An unexpected error occurred: {}", e.getMessage(), e);
        }
    }

    public void multiplication(BigDecimal a, BigDecimal b) {
        try {
            BigDecimal multiplication = a.multiply(b);
            messageProducer.sendMessage("topic-2", multiplication.toString());
        } catch (Exception e) {
            logger.error("An unexpected error occurred: {}", e.getMessage(), e);
        }
    }


}
