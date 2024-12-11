package com.evaluation;

import com.evaluation.CalculatorProducer.CalculatorMessageProducer;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;

import java.math.BigDecimal;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;

@SpringBootTest
class CalculatorServiceTest {

    @Mock
    private CalculatorMessageProducer messageProducer;

    @Mock
    private Logger logger;

    @InjectMocks
    private CalculatorService calculatorService;

    @Test
    public void sum_sends_correct_value() {
        // Arrange
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("3");

        // Act
        calculatorService.sum(a, b);

        // Assert
        verify(messageProducer, times(1)).sendMessage(eq("topic-2"), eq("8"));
    }

    @Test
    public void subtraction_sends_correct_value() {
        // Arrange
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("3");

        // Act
        calculatorService.subtraction(a, b);

        // Assert
        verify(messageProducer, times(1)).sendMessage(eq("topic-2"), eq("2"));
    }

    @Test
    public void division_sends_correct_value() {
        // Arrange
        BigDecimal a = new BigDecimal("8");
        BigDecimal b = new BigDecimal("2");

        // Act
        calculatorService.division(a, b);

        // Assert
        verify(messageProducer, times(1)).sendMessage(eq("topic-2"), eq("4"));
    }

    @Test
    public void multiplication_sends_correct_value() {
        // Arrange
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("3");

        // Act
        calculatorService.multiplication(a, b);

        // Assert
        verify(messageProducer, times(1)).sendMessage(eq("topic-2"), eq("15"));
    }





}