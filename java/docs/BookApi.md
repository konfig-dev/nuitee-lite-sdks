# BookApi

All URIs are relative to *https://api.nlite.ml/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**book**](BookApi.md#book) | **POST** /rates/book | Hotel rate book |
| [**prebook**](BookApi.md#prebook) | **POST** /rates/prebook | Hotel rate prebook |


<a name="book"></a>
# **book**
> BookResponse book(bookRequest)

Hotel rate book

This endpoint allows you to send a specific prebook ID along with the email to confirm the booking for a specific room in a specific hotel.

### Example
```java
// Import classes:
import com.konfigthis.nuitee.client.ApiClient;
import com.konfigthis.nuitee.client.ApiException;
import com.konfigthis.nuitee.client.Configuration;
import com.konfigthis.nuitee.client.auth.*;
import com.konfigthis.nuitee.client.model.*;
import com.konfigthis.nuitee.client.api.BookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1.0");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BookApi apiInstance = new BookApi(defaultClient);
    BookRequest bookRequest = new BookRequest(); // BookRequest | 
    try {
      BookResponse result = apiInstance.book(bookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#book");
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
| **bookRequest** | [**BookRequest**](BookRequest.md)|  | [optional] |

### Return type

[**BookResponse**](BookResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

<a name="prebook"></a>
# **prebook**
> PrebookResponse prebook(prebookRequest)

Hotel rate prebook

This endpoint allows you to send a specific rate ID along with the session ID to confirm the room availability, rates and cancellation policies in the response. A prebook-id is also part of the response which can be used to book a specific room in a hotel. 

### Example
```java
// Import classes:
import com.konfigthis.nuitee.client.ApiClient;
import com.konfigthis.nuitee.client.ApiException;
import com.konfigthis.nuitee.client.Configuration;
import com.konfigthis.nuitee.client.auth.*;
import com.konfigthis.nuitee.client.model.*;
import com.konfigthis.nuitee.client.api.BookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1.0");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BookApi apiInstance = new BookApi(defaultClient);
    PrebookRequest prebookRequest = new PrebookRequest(); // PrebookRequest | 
    try {
      PrebookResponse result = apiInstance.prebook(prebookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#prebook");
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
| **prebookRequest** | [**PrebookRequest**](PrebookRequest.md)|  | [optional] |

### Return type

[**PrebookResponse**](PrebookResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

