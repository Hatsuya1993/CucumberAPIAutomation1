package TestingTrial;

import context.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class APITestCase extends TestBase {

    @Test
    public void t_01_get_request() {

        given().baseUri(getUrl).
                when().get("/products").
                then().
                assertThat().statusCode(200);

    }
}
