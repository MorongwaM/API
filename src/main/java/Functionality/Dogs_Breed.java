package Functionality;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class Dogs_Breed {
    public void List_All_Dogs_Breed()
    {
        baseURI = "https://dog.ceo/api/breeds/list/all";

        given().get(baseURI)
                .then()
                .assertThat()
                .statusCode(200)
                .body(containsString(""));


    }
}
