package com.zayyni.testingapp;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

//@SpringBootTest
@Slf4j
class TestingAppApplicationTests {

    @BeforeEach
    void setUp(){
        log.info("Setting up application config");
    }

    @AfterEach
    void tearDown(){
        log.info("Shutting down application config");
    }


    @BeforeAll
    static void setUpOnce(){
        log.info("Setting up application config once");
    }

    @AfterAll
    static void tearDownOnce(){
        log.info("Shutting down application config once");
    }

    @Test
//    @Disabled
    void testNumberOne() {
        int a = 5;
        int b = 5;
        int result = addTwoNumbers(a, b);
//        Assertions.assertEquals(10,result);
        assertThat(result).isEqualTo(10)
                .isCloseTo(11, Offset.offset(1));



        assertThat("Apple").isEqualTo("Apple")
                .startsWith("App")
                .endsWith("le")
                .hasSize(5);



    }

    @Test
//    @DisplayName("displayTestNameTwo")
    void testDivideTwoNumbers_whenDenominatorIsZero_ThenArithmeticException() {
        int a = 5;
        int b = 0;

        assertThatThrownBy(()-> divideTwoNumbers(a, b))
        .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("Cannot divide by zero");

    }


    int addTwoNumbers(int a, int b){
        return a+b;
    }

    double divideTwoNumbers(int a, int b){
        try {
            return a /b;
        }catch (ArithmeticException e){
            log.error("ArithmeticException occurred" + e.getMessage());
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

}
