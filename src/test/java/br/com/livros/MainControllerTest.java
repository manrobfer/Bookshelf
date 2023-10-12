package br.com.livros;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class MainControllerTest {

   // @BeforeAll
    public static void setup(){
        RestAssured.baseURI = "http://localhost:8090";
        RestAssured.port = 8090;
    }

    //@Test
    public void deveRetornarInformacaoDoProjeto(){
        RestAssured.given()
                .when()
                .log().all()
                .get("/test")
                .then()
                .log().all();


    }
}
