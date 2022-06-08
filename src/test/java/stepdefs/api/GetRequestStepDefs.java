package stepdefs.api;

import context.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.*;

public class GetRequestStepDefs extends TestBase {

    TestContextAPI testContextAPI;

    public GetRequestStepDefs(TestContextAPI testContextAPI) {
        this.testContextAPI = testContextAPI;
    }

    @Given("Go rest API is up and running to fetch products")
    public void go_rest_API_is_up_and_running_to_fetch_products() {
        testContextAPI.req_spec = RestAssured.given().baseUri(getUrl);
    }

    @When("I hit the api with get request and end point as {string}")
    public void i_hit_the_api_with_get_request_and_end_point_as(String endPoint) {
        testContextAPI.resp = testContextAPI.req_spec.when().get(endPoint);
        testContextAPI.scn.write("Response of the request is " + testContextAPI.resp.asString());
    }

    @When("I hit thr api with the get request and end point as {string}")
    public void i_hit_thr_api_with_the_get_request_and_end_point_as(String endPoint) {
        // Write code here that turns the phrase above into concrete actions
        testContextAPI.resp = testContextAPI.req_spec.when().get(endPoint);
        testContextAPI.scn.write("Response of the request is " + testContextAPI.resp.asString());
    }

    @Then("API should return the searched products")
    public void api_should_return_the_searched_products() {
        // Write code here that turns the phrase above into concrete actions
        testContextAPI.resp.then().assertThat().statusCode(200);
        testContextAPI.resp.then().assertThat().body("products", not(emptyArray()));
        testContextAPI.resp.then().assertThat().body("products", hasSize(greaterThan(0)));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("id"));
        testContextAPI.resp.then().assertThat().body("products[0]['id']", is(greaterThan(0)));
        testContextAPI.resp.then().assertThat().body("products[0]['id']", isA(Integer.class));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("title"));
        testContextAPI.resp.then().assertThat().body("products[0]['title']", isA(String.class));
        testContextAPI.resp.then().assertThat().body("products[0]['title']", is(notNullValue()));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("description"));
        testContextAPI.resp.then().assertThat().body("products[0]['description']", isA(String.class));
        testContextAPI.resp.then().assertThat().body("products[0]['description']", is(notNullValue()));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("price"));
        testContextAPI.resp.then().assertThat().body("products[0]['price']", isA(Integer.class));
        testContextAPI.resp.then().assertThat().body("products[0]['id']", is(greaterThan(0)));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("discountPercentage"));
        testContextAPI.resp.then().assertThat().body("products[0]['discountPercentage']", isA(Float.class));
        testContextAPI.resp.then().assertThat().body("products[0]['discountPercentage']", is(greaterThan(0.0f)));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("rating"));
        testContextAPI.resp.then().assertThat().body("products[0]['rating']", isA(Float.class));
        testContextAPI.resp.then().assertThat().body("products[0]['rating']", is(greaterThan(0.0f)));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("stock"));
        testContextAPI.resp.then().assertThat().body("products[0]['stock']", isA(Integer.class));
        testContextAPI.resp.then().assertThat().body("products[0]['stock']", is(greaterThan(0)));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("brand"));
        testContextAPI.resp.then().assertThat().body("products[0]['brand']", isA(String.class));
        testContextAPI.resp.then().assertThat().body("products[0]['brand']", is(notNullValue()));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("category"));
        testContextAPI.resp.then().assertThat().body("products[0]['category']", isA(String.class));
        testContextAPI.resp.then().assertThat().body("products[0]['category']", is(notNullValue()));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("thumbnail"));
        testContextAPI.resp.then().assertThat().body("products[0]['thumbnail']", isA(String.class));
        testContextAPI.resp.then().assertThat().body("products[0]['thumbnail']", is(notNullValue()));
        testContextAPI.resp.then().assertThat().body("products[0]['images']", not(emptyArray()));
        testContextAPI.resp.then().assertThat().body("products[0]['images']", hasSize(greaterThan(0)));
        testContextAPI.resp.then().assertThat().body("products[0]['images'][0]", isA(String.class));
        testContextAPI.resp.then().assertThat().body("products[0]['images'][0]", is(notNullValue()));
    }

    @Then("API should return the categories")
    public void api_should_return_the_categories() {
        // Write code here that turns the phrase above into concrete actions
        testContextAPI.resp.then().assertThat().statusCode(200);
        testContextAPI.resp.then().assertThat().body(not(emptyArray()));
        testContextAPI.resp.then().assertThat().body("[0]", isA(String.class));
        testContextAPI.resp.then().assertThat().body("[0]", is(notNullValue()));
    }

    @Then("API should return all products")
    public void API_should_return_all_products() {
        testContextAPI.resp.then().assertThat().statusCode(200);
        testContextAPI.resp.then().assertThat().body("products", not(emptyArray()));
        testContextAPI.resp.then().assertThat().body("products", hasSize(greaterThan(0)));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("id"));
        testContextAPI.resp.then().assertThat().body("products[0]['id']", isA(Integer.class));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("title"));
        testContextAPI.resp.then().assertThat().body("products[0]['title']", isA(String.class));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("description"));
        testContextAPI.resp.then().assertThat().body("products[0]['title']", isA(String.class));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("price"));
        testContextAPI.resp.then().assertThat().body("products[0]['price']", isA(Integer.class));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("discountPercentage"));
        testContextAPI.resp.then().assertThat().body("products[0]['discountPercentage']", isA(Float.class));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("rating"));
        testContextAPI.resp.then().assertThat().body("products[0]['rating']", isA(Float.class));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("stock"));
        testContextAPI.resp.then().assertThat().body("products[0]['stock']", isA(Integer.class));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("brand"));
        testContextAPI.resp.then().assertThat().body("products[0]['brand']", isA(String.class));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("category"));
        testContextAPI.resp.then().assertThat().body("products[0]['category']", isA(String.class));
        testContextAPI.resp.then().assertThat().body("products[0]", hasKey("thumbnail"));
        testContextAPI.resp.then().assertThat().body("products[0]['thumbnail']", isA(String.class));
        testContextAPI.resp.then().assertThat().body("products['images']", not(emptyArray()));
    }

    @Then("API should return a single product")
    public void api_should_return_a_single_product() {
        assert testContextAPI.resp.body().asString().contains("id");
        assert testContextAPI.resp.body().asString().contains("description");
        assert testContextAPI.resp.body().asString().contains("price");
        assert testContextAPI.resp.body().asString().contains("discountPercentage");
        assert testContextAPI.resp.body().asString().contains("rating");
        assert testContextAPI.resp.body().asString().contains("stock");
        assert testContextAPI.resp.body().asString().contains("brand");
        assert testContextAPI.resp.body().asString().contains("category");
        assert testContextAPI.resp.body().asString().contains("thumbnail");
        assert testContextAPI.resp.body().asString().contains("images");
    }

}
