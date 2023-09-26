package com.example.finalsdaproject;

// import com.example.finalsdaproject.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FinalSdaProjectApplicationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private FinalSdaProjectApplication productService; // Mock the FinalSdaProjectApplication

    @Test
    void contextLoads() {
        // Your Spring Boot application context loads test
    }

    @Test
    public void testMyMethod() {
        // Define the behavior of a method in the mock
        when(productService.myMethod()).thenReturn("Mocked Result");

        // Perform some actions in your code that use the mock
        String result = productService.myMethod();

        // Assert the result
        assertEquals("Mocked Result", result);
    }


//package com.example.finalsdaproject;
//
//        import org.junit.jupiter.api.Test;
//        import org.springframework.beans.factory.annotation.Autowired;
//        import org.springframework.boot.test.context.SpringBootTest;
//        import org.springframework.boot.test.web.client.TestRestTemplate;
//        import org.springframework.boot.test.web.server.LocalServerPort;
//        import org.springframework.http.ResponseEntity;
//
//        import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//class ProductIntegrationTest {
//
//    @Test
//    void contextLoads() {
//
//    }
//
//
//
//
//
//}
    }