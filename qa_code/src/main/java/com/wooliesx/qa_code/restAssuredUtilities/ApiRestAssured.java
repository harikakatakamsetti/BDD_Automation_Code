package com.wooliesx.qa_code.restAssuredUtilities;

import com.wooliesx.qa_code.utilities.LoadConfigProperties;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

/**
 * @author ADMIN
 *
 */
/**
 * @author ADMIN
 *
 */
public class ApiRestAssured {
	public static LoadConfigProperties loadConfig;
    public static String apibaseurl;
    public static String api_key;
    public static String endpoint;
    public Response response;
    
	public ApiRestAssured()
	    {
	        loadConfig = LoadConfigProperties.getInstance();
	        apibaseurl = loadConfig.getApiBaseUrl();
	        api_key = loadConfig.getApiKey();
	       }

	 
	  /**
	   * This method will perform the Get request using
	 * @param city
	 * @return response for successful request
	 * @throws Exception
	 * @author Harika
	 */
	public Response  performGetRequest(String city) throws Exception
	    {
	        //RestAssured.baseURI=apibaseurl;
          if(city!=null)
	      {
        	  System.out.println(apibaseurl);
	          response  = RestAssured.given().
	        		    when().queryParam("q", city)
						 .queryParam("APPID",api_key)
						.get(apibaseurl).then().log().all().contentType(ContentType.JSON).
                        extract().response();
	         

	      }
	      else {
	          System.out.println("something went wrong");
	      }
          System.out.println(response);
	      return response;
	    }
	  
	  /**
	   * This method will validate the status code 
	   * of response
	 * @param status_code
	 * @throws Exception
	 * @author Harika
	 */
	public void getStatusCode(String status_code) throws Exception
	    {
	        try{
	            if(response!=null)
	            {
	                switch (status_code)
	                {
	                    case "201":
	                        response.then().assertThat().statusCode(Integer.parseInt(status_code)).statusCode(201);
	                        break;
	                    case "400":
	                        response.then().assertThat().statusCode(Integer.parseInt(status_code)).statusCode(400);
	                        break;
	                    case "204":
	                        response.then().assertThat().statusCode(Integer.parseInt(status_code)).statusCode(204);
	                        break;
	                }
	            }
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
	  
	  /**
	   * This method will return the value in Json response
	 * @param value
	 * @return value
	 * @throws Exception
	 * @author Harika
	 */
	public String getValueResponse(String value) throws Exception
	    {
	        String respvalue = null;
	        try{
	            if(response!=null)
	            {
	               respvalue = response.then().extract().body().jsonPath().get(value);
	            }
	           return respvalue;
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        return respvalue;
	    }
	        
}
