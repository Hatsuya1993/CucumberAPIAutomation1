package stepdefs.api;

import context.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.emptyArray;
import static org.hamcrest.Matchers.not;

public class GetRequestStepDefs extends TestBase {

    TestContextAPI testContextAPI;

    public GetRequestStepDefs(TestContextAPI testContextAPI) {
        this.testContextAPI = testContextAPI;
    }

    @Given("Go rest API is up and running")
    public void go_rest_api_is_up_and_running() {
        testContextAPI.req_spec = RestAssured.given().baseUri(getUrl);
    }

    @When("I hit the api with get request and end point as {string}")
    public void i_hit_the_api_with_get_request_and_end_point_as(String endPoint) {
        testContextAPI.resp = testContextAPI.req_spec.when().get(endPoint);
        testContextAPI.scn.write("Response of the request is " + testContextAPI.resp.asString());
    }

    @Then("API should return all products")
    public void API_should_return_all_products() {
        testContextAPI.resp.then().assertThat().statusCode(200).body("products", not(emptyArray()));
    }

}
