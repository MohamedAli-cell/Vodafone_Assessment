package API;

import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;

public class Mirror_Actions extends BaseTest {

    public Response newAvatar(String style, File photo) {
        Response response = given()
                .header("X-Token", Token)
                .queryParam("style", style)
                .multiPart("photo",photo)
                .when()
                .post("/generate");
        if (response.getStatusCode() == 200) {
            Face_ID = response.jsonPath().getString("face.id");
        }
        return response;
    }

    public Response createSticker (String stickerName)
    {
        return given()
                .header("X-Token", Token)
                .queryParams("sticker", stickerName, "face_id", Face_ID)
                .when()
                .get("/sticker");
    }

    public Response getFaceParts()
    {
        return given()
                .header("X-Token", Token)
                .queryParam("face_id", Face_ID)
                .when()
                .get("/get_all_parts");
    }

    public Response getFaceAttributes()
    {
        return given()
                .header("X-Token", Token)
                .queryParam("face_id", Face_ID)
                .when()
                .get("/attrs");
    }

}