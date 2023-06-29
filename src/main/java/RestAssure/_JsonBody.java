package RestAssure;

import io.restassured.parsing.Parser;
import org.hamcrest.Matchers;
import org.junit.Test;


public class _JsonBody {


    @Test
    public void rootPath() {
        io.restassured.RestAssured.get("http://api.github.com")
                .then()
                .rootPath("node1.nested")
                .body("field1", Matchers.equalTo("x"))
                .body("field2", Matchers.equalTo("y"))
                .rootPath("node2.nested")
                .body("field1", Matchers.equalTo("x"))
                .body("field2", Matchers.equalTo("y"))
                .noRootPath()
                .body("full body again", Matchers.equalTo("z"))
                .body("data.id[1]", Matchers.equalTo("1"))
                .body("data.id[2]", Matchers.equalTo("2"))
                .body("data.first_name", Matchers.hasItem("Eva"))
                .body("data.first_name", Matchers.hasItems("Eva", "Emma"))
                .body("data.first_name", Matchers.hasItems(Matchers.endsWith("Eva")))
                .statusCode(200);
    }

    @Test
    public void roo1tPath() {
        io.restassured.RestAssured.get("http://api.github.com")
                .then()
                    .using()
                .defaultParser(Parser.JSON)
                .body("data.first_name", Matchers.hasItems(Matchers.endsWith("Eva")));

    }
}
