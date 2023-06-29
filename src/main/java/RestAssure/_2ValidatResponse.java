package RestAssure;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.checkerframework.checker.index.qual.LessThan;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.number.OrderingComparison;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.*;

public class _2ValidatResponse {

    private final String BASE_URI="http://api.github.com";
    Map<String, String>  expectedHeaders =Map.of("X-Frame-Options"
            , "X-Content-Type-Options", "X-XSS-Protection",
            "Referrer-Policy",
            "Content-Security-Policy",
            "Content-Type", "charset"
            , "X-GitHub-Media-Type", "format", "*");

    @Test
    public void basicValidableExample(){
        RestAssured.get(BASE_URI)
                .then()
                .assertThat()
                .statusCode(200)
                .statusCode(lessThan(300))
                .statusCode(equalTo(200))
                .and()
                .assertThat()
                .contentType(ContentType.JSON)
                .header("X-RateLimit-Limit", "60")
                .header("x-limit", not(emptyString()))
                .header("x-limit", notNullValue())
                .statusCode(anyOf(equalTo(200), equalTo(201)));
    }

    @Test
    public void simpleHamcres(){

        RestAssured.get(BASE_URI)
                .then()
                .statusCode(Matchers.lessThan(300))
                .statusCode(Matchers.greaterThan(100    ))
                .header("str", Matchers.containsStringIgnoringCase("abc"))
                .time(Matchers.greaterThan(2L), TimeUnit.SECONDS)
                .header("etag", Matchers.notNullValue())
                .header("etag", Matchers.not(emptyString()));
    }

    @Test
    public void complexHermCrest(){

        RestAssured.get(BASE_URI)
                .then()
                .header("X-limit", Integer::parseInt, Matchers.equalTo(60))
                .header("date", date->LocalDate.parse(date, DateTimeFormatter.RFC_1123_DATE_TIME)
                        ,OrderingComparison.comparesEqualTo(LocalDate.now()))
                .header("x-ratelimit-limit",
                        response->greaterThan(response.getHeader("x-ratelimit-remaning")));
    }

    @Test
    public void usingMapsToTestHeaders(){

        RestAssured.get(BASE_URI)
                .then()
                .headers(expectedHeaders);
    }
}
