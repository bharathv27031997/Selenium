package RestAssure;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.hamcrest.number.OrderingComparison;
import org.junit.Test;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.hamcrest.Matchers.greaterThan;

public class otherTestDemo {

    public static final String BASE_URL = "https://api.github.com/users/rest-assured";

    @Test
    public void postRequest(){
        //Add new Entitity
        RestAssured
                .given()
                .header("Authorization", "token ")
                .body("{\"name\":\"deleteme-patched\"}")
                .post(BASE_URL)
                .then()
                .header("X-limit", Integer::parseInt, Matchers.equalTo(60))
                .header("date", date-> LocalDate.parse(date, DateTimeFormatter.RFC_1123_DATE_TIME)
                        , OrderingComparison.comparesEqualTo(LocalDate.now()))
                .header("x-ratelimit-limit",
                        response->greaterThan(response.getHeader("x-ratelimit-remaning")));
    }

    @Test()
    public void patchRequest(){
         RestAssured
                .given()
                .header("Authorization", "token ")
                .body("{\"name\":\"deleteme-patched\"}")
                .patch(BASE_URL)
                .then()
                 .statusCode(200);
    }

    @Test()
    public void deleteRequest(){
         RestAssured
                .given()
                .header("Authorization", "token ")
                 .delete(BASE_URL)
                .then()
                 .statusCode(204);
         //no content
    }




}
