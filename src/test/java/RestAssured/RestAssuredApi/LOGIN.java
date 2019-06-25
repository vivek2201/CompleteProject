package RestAssured.RestAssuredApi;

import org.testng.annotations.Test;
import io.restassured.*;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;

public class LOGIN {
	@Test
	public void SignIn()
	{
	RestAssured.baseURI="https://user.test.pointsbet.com.au";
	given().urlEncodingEnabled(true).
	body("{\"title\":\"Mrs\",\"firstName\":\"priya006\",\"lastName\":\"priya006\",\"DOB\":\"1989/03/03\",\"contactNumber\":\"0424942959\",\"email\":\"priya006@gmail.com\",\"username\":\"priya006\",\"password\":\"password1\",\"confirmPassword\":\"password1\",\"addressLine1\":\"155 cremorne street\",\"addressLine2\":\"\",\"addressSuburb\":\"Melbourne\",\"addressPostCode\":\"3000\",\"addressState\":\"Victoria\",\"addressCountry\":\"Australia\",\"termsAccepted\":true,\"promotionCode\":\"WELCOME\",\"campaignTrackingInfo\":\"\",\"ssn\":\"\",\"mfaMode\":null,\"termsConditionsTime\":\"\"}").log().all().
	when().
	post("/asl/api/account").
	then().
	assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("Success", equalTo("true"));

	}
	
	/*@Test
	public void getdata()
	{
		RestAssured.baseURI="https://user.test.pointsbet.com.au";
		given().
	}
*/
}
