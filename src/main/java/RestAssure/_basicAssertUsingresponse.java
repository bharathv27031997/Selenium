package RestAssure;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class _basicAssertUsingresponse {

    private final String BASE_URI="http://api.github.com";

    @Test
    public void someTest(){
        RestAssured.get("http://api.github.com")
                .then()
                .statusCode(200);
    }

    @Test
    public void peek(){
        RestAssured.get(BASE_URI).peek();
    }
    @Test
    public void preetyPeek(){
        RestAssured.get(BASE_URI).prettyPeek();
    }

    @Test
    public void print(){
        RestAssured.get(BASE_URI).print();
    }
    @Test
    public void prettyPrint(){
        RestAssured.get(BASE_URI).prettyPrint();
    }

    @Test
    public void convenciedResponse(){
        Response res=RestAssured.get(BASE_URI);
        Assert.assertEquals(res.getStatusCode(), 200);
        Assert.assertEquals(res.getContentType(), "application/json");
    }

    @Test
    public void genericMethods(){
        Response res=RestAssured.get(BASE_URI);
        Assert.assertEquals(res.getHeader("server"), "GitHub.com");
        Assert.assertEquals(res.getHeader("X-RateLimit-Limit"), "60");
    }

    @Test
    public void headers(){
        Response res=RestAssured.get(BASE_URI);
        Headers hds = res.getHeaders();
        hds.getValue("headers");
        int size=hds.size();
        List<Header> lst =  hds.asList();
        Assert.assertTrue(hds.hasHeaderWithName("bha"));
    }

    @Test
    public void timeExample(){

        Response res=RestAssured.get(BASE_URI);
        System.out.println(res.getTime());
        System.out.println(res.getTimeIn(TimeUnit.MICROSECONDS));
    }


}
