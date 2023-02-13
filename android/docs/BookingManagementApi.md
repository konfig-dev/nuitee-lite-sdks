# BookingManagementApi

All URIs are relative to *https://api.nlite.ml/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](BookingManagementApi.md#cancel) | **PUT** /bookings/{bookingId} | Booking cancel |
| [**listBookings**](BookingManagementApi.md#listBookings) | **GET** /bookings | Booking list |
| [**retrieve**](BookingManagementApi.md#retrieve) | **GET** /bookings/{bookingId} | Booking retrieve |


<a name="cancel"></a>
# **cancel**
> CancelResponse cancel(bookingId)

Booking cancel

This endpoint allows you to cancel a booking based on a booking ID. The refund amount is based on the cancellation policies. &lt;!-- theme: danger --&gt;

### Example
```java
// Import classes:
import com.konfigthis.nuitee.client.ApiClient;
import com.konfigthis.nuitee.client.ApiException;
import com.konfigthis.nuitee.client.Configuration;
import com.konfigthis.nuitee.client.auth.*;
import com.konfigthis.nuitee.client.model.*;
import com.konfigthis.nuitee.client.api.BookingManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1.0");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BookingManagementApi apiInstance = new BookingManagementApi(defaultClient);
    String bookingId = "SEMkJ9lNM"; // String | (Required) The unique identifier of the booking you would like to update.
    try {
      CancelResponse result = apiInstance.cancel(bookingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingManagementApi#cancel");
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
| **bookingId** | **String**| (Required) The unique identifier of the booking you would like to update. | |

### Return type

[**CancelResponse**](CancelResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful cancel |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

<a name="listBookings"></a>
# **listBookings**
> ListBookingsResponse listBookings(guestId)

Booking list

List bookings by guestId

### Example
```java
// Import classes:
import com.konfigthis.nuitee.client.ApiClient;
import com.konfigthis.nuitee.client.ApiException;
import com.konfigthis.nuitee.client.Configuration;
import com.konfigthis.nuitee.client.auth.*;
import com.konfigthis.nuitee.client.model.*;
import com.konfigthis.nuitee.client.api.BookingManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1.0");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BookingManagementApi apiInstance = new BookingManagementApi(defaultClient);
    String guestId = "guestId_example"; // String | guest id of bookings
    try {
      ListBookingsResponse result = apiInstance.listBookings(guestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingManagementApi#listBookings");
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
| **guestId** | **String**| guest id of bookings | |

### Return type

[**ListBookingsResponse**](ListBookingsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="retrieve"></a>
# **retrieve**
> RetrieveResponse retrieve(bookingId)

Booking retrieve

This endpoint allows you to retrieve all the information for specific booking ID.

### Example
```java
// Import classes:
import com.konfigthis.nuitee.client.ApiClient;
import com.konfigthis.nuitee.client.ApiException;
import com.konfigthis.nuitee.client.Configuration;
import com.konfigthis.nuitee.client.auth.*;
import com.konfigthis.nuitee.client.model.*;
import com.konfigthis.nuitee.client.api.BookingManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1.0");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BookingManagementApi apiInstance = new BookingManagementApi(defaultClient);
    String bookingId = "SEMkJ9lNM"; // String | (Required) The unique identifier of the booking you would like to update.
    try {
      RetrieveResponse result = apiInstance.retrieve(bookingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingManagementApi#retrieve");
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
| **bookingId** | **String**| (Required) The unique identifier of the booking you would like to update. | |

### Return type

[**RetrieveResponse**](RetrieveResponse.md)

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

