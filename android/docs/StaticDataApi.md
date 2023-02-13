# StaticDataApi

All URIs are relative to *https://api.nlite.ml/v1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listCities**](StaticDataApi.md#listCities) | **GET** /data/cities | City list |
| [**listCountries**](StaticDataApi.md#listCountries) | **GET** /data/countries | Country list |
| [**listCurrencies**](StaticDataApi.md#listCurrencies) | **GET** /data/currencies | Currency list |
| [**listHotels**](StaticDataApi.md#listHotels) | **GET** /data/hotels | Hotel list |
| [**listIataCodes**](StaticDataApi.md#listIataCodes) | **GET** /data/iataCodes | IATA code list |


<a name="listCities"></a>
# **listCities**
> ListCitiesResponse listCities(countryCode)

City list



### Example
```java
// Import classes:
import com.konfigthis.nuitee.client.ApiClient;
import com.konfigthis.nuitee.client.ApiException;
import com.konfigthis.nuitee.client.Configuration;
import com.konfigthis.nuitee.client.auth.*;
import com.konfigthis.nuitee.client.model.*;
import com.konfigthis.nuitee.client.api.StaticDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1.0");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StaticDataApi apiInstance = new StaticDataApi(defaultClient);
    String countryCode = "countryCode_example"; // String | country code, example \"IT\"
    try {
      ListCitiesResponse result = apiInstance.listCities(countryCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticDataApi#listCities");
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
| **countryCode** | **String**| country code, example \&quot;IT\&quot; | [optional] |

### Return type

[**ListCitiesResponse**](ListCitiesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listCountries"></a>
# **listCountries**
> ListCountriesResponse listCountries()

Country list

countries list

### Example
```java
// Import classes:
import com.konfigthis.nuitee.client.ApiClient;
import com.konfigthis.nuitee.client.ApiException;
import com.konfigthis.nuitee.client.Configuration;
import com.konfigthis.nuitee.client.auth.*;
import com.konfigthis.nuitee.client.model.*;
import com.konfigthis.nuitee.client.api.StaticDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1.0");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StaticDataApi apiInstance = new StaticDataApi(defaultClient);
    try {
      ListCountriesResponse result = apiInstance.listCountries();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticDataApi#listCountries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListCountriesResponse**](ListCountriesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listCurrencies"></a>
# **listCurrencies**
> ListCurrenciesResponse listCurrencies()

Currency list

### Example
```java
// Import classes:
import com.konfigthis.nuitee.client.ApiClient;
import com.konfigthis.nuitee.client.ApiException;
import com.konfigthis.nuitee.client.Configuration;
import com.konfigthis.nuitee.client.auth.*;
import com.konfigthis.nuitee.client.model.*;
import com.konfigthis.nuitee.client.api.StaticDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1.0");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StaticDataApi apiInstance = new StaticDataApi(defaultClient);
    try {
      ListCurrenciesResponse result = apiInstance.listCurrencies();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticDataApi#listCurrencies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListCurrenciesResponse**](ListCurrenciesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listHotels"></a>
# **listHotels**
> ListHotelsResponse listHotels(countryCode, hotelName, cityName, limit, offset, latitude, longitude, distance, iataCode)

Hotel list



### Example
```java
// Import classes:
import com.konfigthis.nuitee.client.ApiClient;
import com.konfigthis.nuitee.client.ApiException;
import com.konfigthis.nuitee.client.Configuration;
import com.konfigthis.nuitee.client.auth.*;
import com.konfigthis.nuitee.client.model.*;
import com.konfigthis.nuitee.client.api.StaticDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1.0");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StaticDataApi apiInstance = new StaticDataApi(defaultClient);
    String countryCode = "countryCode_example"; // String | country code Alpha-2 code (example US, RU, CN)
    String hotelName = "hotelName_example"; // String | hotel name
    String cityName = "cityName_example"; // String | city name
    Integer limit = 56; // Integer | limit results (max value 1000)
    Integer offset = 56; // Integer | results offset
    BigDecimal latitude = new BigDecimal(78); // BigDecimal | latitude geo coordinates
    BigDecimal longitude = new BigDecimal(78); // BigDecimal | longtude geo coordinates
    Integer distance = 56; // Integer | the distance starting from the selected geopgraphic point
    String iataCode = "iataCode_example"; // String | airport iata code
    try {
      ListHotelsResponse result = apiInstance.listHotels(countryCode, hotelName, cityName, limit, offset, latitude, longitude, distance, iataCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticDataApi#listHotels");
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
| **countryCode** | **String**| country code Alpha-2 code (example US, RU, CN) | |
| **hotelName** | **String**| hotel name | [optional] |
| **cityName** | **String**| city name | [optional] |
| **limit** | **Integer**| limit results (max value 1000) | [optional] |
| **offset** | **Integer**| results offset | [optional] |
| **latitude** | **BigDecimal**| latitude geo coordinates | [optional] |
| **longitude** | **BigDecimal**| longtude geo coordinates | [optional] |
| **distance** | **Integer**| the distance starting from the selected geopgraphic point | [optional] |
| **iataCode** | **String**| airport iata code | [optional] |

### Return type

[**ListHotelsResponse**](ListHotelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

<a name="listIataCodes"></a>
# **listIataCodes**
> ListIataCodesResponse listIataCodes()

IATA code list

IATA codes list

### Example
```java
// Import classes:
import com.konfigthis.nuitee.client.ApiClient;
import com.konfigthis.nuitee.client.ApiException;
import com.konfigthis.nuitee.client.Configuration;
import com.konfigthis.nuitee.client.auth.*;
import com.konfigthis.nuitee.client.model.*;
import com.konfigthis.nuitee.client.api.StaticDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1.0");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StaticDataApi apiInstance = new StaticDataApi(defaultClient);
    try {
      ListIataCodesResponse result = apiInstance.listIataCodes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticDataApi#listIataCodes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListIataCodesResponse**](ListIataCodesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

