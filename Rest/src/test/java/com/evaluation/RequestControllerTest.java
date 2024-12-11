package com.evaluation;

import com.evaluation.RestConsumer.RestMessageConsumer;
import com.evaluation.RestProducer.RestMessageProducer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class RequestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private RestMessageProducer messageProducer;

    @Mock
    private RestMessageConsumer messageConsumer;

    @InjectMocks
    private RequestController yourController;

}