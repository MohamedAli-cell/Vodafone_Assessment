package Tests;

import API.BaseTest;
import API.Mirror_Actions;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

import static API.BaseTest.baseURL;

public class MirrorTestCases {
    Mirror_Actions actions = new Mirror_Actions();
    @BeforeTest
    public void setUp()
    {
        RestAssured.baseURI = baseURL;
    }
    @Test
    public void createNewAvatar()
    {
        File photo = new File("src/test/resources/Images/pngimg.com - face_PNG11760.png");
        Response response = actions.newAvatar("anime",photo);
        response.then().log().body();
        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test (priority = 1)
    public void createSticker()
    {
        Response response = actions.createSticker("he_he_he");
        response.then().log().body();
        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test (priority = 1)
    public void getAllParts()
    {
        Response response = actions.getFaceParts();
        response.then().log().body();
        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test (priority = 1)
    public void getAllAttributes()
    {
        Response response = actions.getFaceAttributes();
        response.then().log().body();
        Assert.assertEquals(response.getStatusCode(),200);
    }



}
