package Functionality;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Login {

    public void log_Response()

    {
      String url = "https://dog.ceo/api/breeds/list/all";
        given().get(url)
                .then()
                .assertThat()
                .log().all();
    }
}
