import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class basics {

    public static void main(String[] args) {
        String url = RestAssured.baseURI = "https://maps.googleapis.com";
        System.out.println(url);



        given()
                .param("location", "33.8670522,151.1957362")
                .param("radius","1500")
                .param("key","AIzaSyCbdUFE3cFlRMfU6If19fCVQFcUeqE_U68");

        when()
                .get("/maps/api/place/nearbysearch/json")
                .then()
                .assertThat().statusCode(200);
    }
}
