# SearchApi

All URIs are relative to *https://api.nlite.ml/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHotelRates**](SearchApi.md#getHotelRates) | **GET** /hotels/rates | Hotel full rate availability |
| [**getHotels**](SearchApi.md#getHotels) | **GET** /hotels | Hotel minimum rate availability |


<a name="getHotelRates"></a>
# **getHotelRates**
> GetHotelRatesResponse getHotelRates(hotelIds, checkin, checkout, adults, guestNationality, currency, children, sessionId, travelerId)

Hotel full rate availability

This endpoint allows you to send a hotel ID with a specific date range and in response receive all the rooms, rates that are available along with the cancelllation policies.

### Example
```java
// Import classes:
import com.konfigthis.nuitee.client.ApiClient;
import com.konfigthis.nuitee.client.ApiException;
import com.konfigthis.nuitee.client.Configuration;
import com.konfigthis.nuitee.client.auth.*;
import com.konfigthis.nuitee.client.model.*;
import com.konfigthis.nuitee.client.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1.0");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    String hotelIds = "2345,557,565,4239"; // String | hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56)
    LocalDate checkin = LocalDate.parse("2023-01-15"); // LocalDate | start date yyyy-mm-dd format
    LocalDate checkout = LocalDate.parse("2023-01-16"); // LocalDate | end date yyyy-mm-dd format
    Integer adults = 1; // Integer | adults number
    String guestNationality = "US"; // String | guest nationality country code iso-2 example (US)
    String currency = "USD"; // String | currency code example (USD)
    String children = "5,9"; // String | children ages separated by a comma
    String sessionId = "GIYDEMZNGAYS2MJVPQZDAMRTFUYDCLJRGZ6DC7D4JVAXY7DZM5MDMQKKJJAXKZY"; // String | session id if retrieved from hotels search
    String travelerId = "travelerId_example"; // String | traveler unique id
    try {
      GetHotelRatesResponse result = apiInstance.getHotelRates(hotelIds, checkin, checkout, adults, guestNationality, currency, children, sessionId, travelerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#getHotelRates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hotelIds** | **String**| hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56) | |
| **checkin** | **LocalDate**| start date yyyy-mm-dd format | |
| **checkout** | **LocalDate**| end date yyyy-mm-dd format | |
| **adults** | **Integer**| adults number | |
| **guestNationality** | **String**| guest nationality country code iso-2 example (US) | |
| **currency** | **String**| currency code example (USD) | |
| **children** | **String**| children ages separated by a comma | [optional] |
| **sessionId** | **String**| session id if retrieved from hotels search | [optional] |
| **travelerId** | **String**| traveler unique id | [optional] |

### Return type

[**GetHotelRatesResponse**](GetHotelRatesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

<a name="getHotels"></a>
# **getHotels**
> GetHotelsResponse getHotels(hotelIds, checkin, checkout, country, adults, currency, guestNationality, latitude, longitude, distance, children, travelerId)

Hotel minimum rate availability

This endpoint allows you to send a list of hotel ID&#39;s for a specific date range and in response receive the best rate available for each of the hotel ID&#39;s. The limit is set to 200 hotels

### Example
```java
// Import classes:
import com.konfigthis.nuitee.client.ApiClient;
import com.konfigthis.nuitee.client.ApiException;
import com.konfigthis.nuitee.client.Configuration;
import com.konfigthis.nuitee.client.auth.*;
import com.konfigthis.nuitee.client.model.*;
import com.konfigthis.nuitee.client.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1.0");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    String hotelIds = "2345,557,565,4239"; // String | hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56)
    LocalDate checkin = LocalDate.parse("Sun Jan 14 16:00:00 PST 2024"); // LocalDate | 
    LocalDate checkout = LocalDate.parse("Fri Jan 19 16:00:00 PST 2024"); // LocalDate | 
    String country = "US"; // String | 
    Integer adults = 2; // Integer | 
    String currency = "USD"; // String | 
    String guestNationality = "CA"; // String | 
    BigDecimal latitude = new BigDecimal("32.31823"); // BigDecimal | 
    BigDecimal longitude = new BigDecimal("-86.902298"); // BigDecimal | 
    Integer distance = 20; // Integer | 
    String children = "7,14"; // String | 
    String travelerId = "TMX54RS4"; // String | 
    try {
      GetHotelsResponse result = apiInstance.getHotels(hotelIds, checkin, checkout, country, adults, currency, guestNationality, latitude, longitude, distance, children, travelerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#getHotels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hotelIds** | **String**| hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56) | |
| **checkin** | **LocalDate**|  | |
| **checkout** | **LocalDate**|  | |
| **country** | **String**|  | |
| **adults** | **Integer**|  | |
| **currency** | **String**|  | |
| **guestNationality** | **String**|  | |
| **latitude** | **BigDecimal**|  | [optional] |
| **longitude** | **BigDecimal**|  | [optional] |
| **distance** | **Integer**|  | [optional] |
| **children** | **String**|  | [optional] |
| **travelerId** | **String**|  | [optional] |

### Return type

[**GetHotelsResponse**](GetHotelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Type -  <br>  * Date -  <br>  * Content-Length -  <br>  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

