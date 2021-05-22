package RoofStacks;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CaseStudy2 {

    @Test
    public void GetMethod(){
        Response response = given().accept(ContentType.JSON)
                .when().get("https://generator.swagger.io/api/gen/clients/ada");

        response.prettyPrint();
        if(response.statusCode()==200){
            System.out.println("Başarılı");
        }else {
            System.out.println("Başarısız");
        }

    }
    @Test
    public void PostMethod(){
        Map<String,Object> payload=new HashMap<>();
                payload.put("spec","{}");
                payload.put("options.additionalProp1","string");
                payload.put("options.additionalProp2","string");
                payload.put("options.additionalProp3","string");
                payload.put("swaggerUrl","http://petstore.swagger.io/v2/swagger.json");
                payload.put("authorizationValue.value","string");
                payload.put("authorizationValue.type","string");
                payload.put("authorizationValue.keyName","string");
                payload.put("securityDefinition.type","string");
                payload.put("securityDefinition.description","string");

        Response response = given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().body(payload)
                .and().log().all()
                .when().post("https://generator.swagger.io/api/gen/clients/ada");

        response.prettyPrint();
        System.out.println("statusCode() = " + response.statusCode());
        if(response.statusCode()==200){
            System.out.println("Başarılı");
        }else {
            System.out.println("Başarısız");
        }


    }



}
