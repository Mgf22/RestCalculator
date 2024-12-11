package com.evaluation.CalculatorConsumer;

import com.evaluation.CalculatorService;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CalculatorMessageConsumer {
    @Autowired
    CalculatorService calculatorService;

    @KafkaListener(topics = "topic-1", groupId = "my-group-id")
    public void listen(String message){
        String [] values = message.split(",");
        switch (values[0]){
            case "sum": {
                calculatorService.sum(new BigDecimal(values[1]),new BigDecimal(values[2]));
                break;
            }
            case "subtraction": {
                calculatorService.subtraction(new BigDecimal(values[1]),new BigDecimal(values[2]));
                break;
            }
            case "division": {
                calculatorService.division(new BigDecimal(values[1]),new BigDecimal(values[2]));
                break;
            }
            case "multiplication": {
                calculatorService.multiplication(new BigDecimal(values[1]),new BigDecimal(values[2]));
                break;
            }
        }
    }
}
