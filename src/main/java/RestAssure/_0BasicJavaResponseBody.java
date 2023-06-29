package RestAssure;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.Test;


import java.util.Map;

public class _0BasicJavaResponseBody {

    public final String BASE_URI = "https://api.github.com/rate_limit";

    @Test
    public void jsonPathResponse(){

        Response res = RestAssured.get(BASE_URI);
        JsonPath jsonPath = res.getBody().jsonPath();
        Map<String, String> fullJson=jsonPath.get();
        Map<String, String> fullJson1=jsonPath.get("resources");
        Map<String, String> fullJson2=jsonPath.get("resources.core");

        int value = jsonPath.get("resources.core.limit");
        int value1 = jsonPath.get("resources.graphql.remaining");
        System.out.println(jsonPath);
        System.out.println(fullJson);
        System.out.println(fullJson1);
        System.out.println(fullJson2);
        System.out.println(value);
        System.out.println(value1 );

    }
}
