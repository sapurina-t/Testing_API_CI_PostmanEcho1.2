package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTest {
    @Test
    void shouldReturnBalance123() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("balance: 123")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("balance: 123"))
        ;
    }

    @Test
    void shouldReturnSomeData2() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("some value")
                .when()
                .post("/post")
                .then()
                .body("data", equalTo("some value"))
        ;
    }
}

