package RestAssure;


import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.mapper.ObjectMapperType;
import org.junit.Assert;
import org.junit.Test;
import RestAssured.PojoObject.Users;

public class ObjectMapping {

    public static final String BASE_URL = "https://api.github.com/users/rest-assured";

    @Test
    public void objectMapping1(){
        Users user= RestAssured.get(BASE_URL)
                .as(Users.class);
        Assert.assertEquals(user.getLogin(),"rest_assured");
        Assert.assertEquals(user.getId(),123455);
    }
    @Test
    public void objectMapping2(){
        Users user= RestAssured.get(BASE_URL)
                .as(Users.class, ObjectMapperType.JACKSON_2);
        Assert.assertEquals(user.getLogin(),"rest_assured");
        Assert.assertEquals(user.getId(),123455);
    }
    @Test
    public void objectMappingUsingSpecificMapper(){

        ObjectMapper mapper=new ObjectMapper() {
            @Override
            public Object deserialize(ObjectMapperDeserializationContext objectMapperDeserializationContext) {
                 return null;
            }

            @Override
            public Object serialize(ObjectMapperSerializationContext objectMapperSerializationContext) {
                return null;
            }
        };

         Users user= RestAssured.get(BASE_URL)
                .as( Users.class, ObjectMapperType.JACKSON_2);
        Assert.assertEquals(user.getLogin(),"rest_assured");
        Assert.assertEquals(user.getId(),123455);
    }
}
