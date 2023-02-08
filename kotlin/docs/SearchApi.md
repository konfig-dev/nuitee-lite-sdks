# SearchApi

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHotelRates**](SearchApi.md#getHotelRates) | **GET** /hotels/rates | Hotel full rate availability
[**getHotels**](SearchApi.md#getHotels) | **GET** /hotels | Hotel minimum rate availability


<a name="getHotelRates"></a>
# **getHotelRates**
> GetHotelRatesResponse getHotelRates(hotelIds, checkin, checkout, adults, guestNationality, currency, children, sessionId, travelerId)

Hotel full rate availability

This endpoint allows you to send a hotel ID with a specific date range and in response receive all the rooms, rates that are available along with the cancelllation policies.

### Example
```kotlin
// Import classes:
//import com.konfigthis.nuitee.client.infrastructure.*
//import com.konfigthis.nuitee.client.models.*

val apiInstance = SearchApi()
val hotelIds : kotlin.String = 2345,557,565,4239 // kotlin.String | hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56)
val checkin : kotlin.String = 2023-01-15 // kotlin.String | start date yyyy-mm-dd format
val checkout : kotlin.String = 2023-01-16 // kotlin.String | end date yyyy-mm-dd format
val adults : kotlin.Int = 1 // kotlin.Int | adults number
val guestNationality : kotlin.String = US // kotlin.String | guest nationality country code iso-2 example (US)
val currency : kotlin.String = USD // kotlin.String | currency code example (USD)
val children : kotlin.String = 5,9 // kotlin.String | children ages separated by a comma
val sessionId : kotlin.String = GIYDEMZNGAYS2MJVPQZDAMRTFUYDCLJRGZ6DC7D4JVAXY7DZM5MDMQKKJJAXKZY // kotlin.String | session id if retrieved from hotels search
val travelerId : kotlin.String = travelerId_example // kotlin.String | traveler unique id
try {
    val result : GetHotelRatesResponse = apiInstance.getHotelRates(hotelIds, checkin, checkout, adults, guestNationality, currency, children, sessionId, travelerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#getHotelRates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#getHotelRates")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelIds** | **kotlin.String**| hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56) |
 **checkin** | **kotlin.String**| start date yyyy-mm-dd format |
 **checkout** | **kotlin.String**| end date yyyy-mm-dd format |
 **adults** | **kotlin.Int**| adults number |
 **guestNationality** | **kotlin.String**| guest nationality country code iso-2 example (US) |
 **currency** | **kotlin.String**| currency code example (USD) |
 **children** | **kotlin.String**| children ages separated by a comma | [optional]
 **sessionId** | **kotlin.String**| session id if retrieved from hotels search | [optional]
 **travelerId** | **kotlin.String**| traveler unique id | [optional]

### Return type

[**GetHotelRatesResponse**](GetHotelRatesResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHotels"></a>
# **getHotels**
> GetHotelsResponse getHotels(checkin, checkout, country, adults, currency, guestNationality, latitude, longitude, distance, children, travelerId)

Hotel minimum rate availability

This endpoint allows you to send a list of hotel ID&#39;s for a specific date range and in response receive the best rate available for each of the hotel ID&#39;s. The limit is set to 200 hotels

### Example
```kotlin
// Import classes:
//import com.konfigthis.nuitee.client.infrastructure.*
//import com.konfigthis.nuitee.client.models.*

val apiInstance = SearchApi()
val checkin : java.time.LocalDate = Sun Jan 14 16:00:00 PST 2024 // java.time.LocalDate | 
val checkout : java.time.LocalDate = Fri Jan 19 16:00:00 PST 2024 // java.time.LocalDate | 
val country : kotlin.String = US // kotlin.String | 
val adults : kotlin.Int = 2 // kotlin.Int | 
val currency : kotlin.String = USD // kotlin.String | 
val guestNationality : kotlin.String = CA // kotlin.String | 
val latitude : java.math.BigDecimal = 32.31823 // java.math.BigDecimal | 
val longitude : java.math.BigDecimal = -86.902298 // java.math.BigDecimal | 
val distance : kotlin.Int = 20 // kotlin.Int | 
val children : kotlin.String = 7,14 // kotlin.String | 
val travelerId : kotlin.String = TMX54RS4 // kotlin.String | 
try {
    val result : GetHotelsResponse = apiInstance.getHotels(checkin, checkout, country, adults, currency, guestNationality, latitude, longitude, distance, children, travelerId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SearchApi#getHotels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SearchApi#getHotels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkin** | **java.time.LocalDate**|  |
 **checkout** | **java.time.LocalDate**|  |
 **country** | **kotlin.String**|  |
 **adults** | **kotlin.Int**|  |
 **currency** | **kotlin.String**|  |
 **guestNationality** | **kotlin.String**|  |
 **latitude** | **java.math.BigDecimal**|  | [optional]
 **longitude** | **java.math.BigDecimal**|  | [optional]
 **distance** | **kotlin.Int**|  | [optional]
 **children** | **kotlin.String**|  | [optional]
 **travelerId** | **kotlin.String**|  | [optional]

### Return type

[**GetHotelsResponse**](GetHotelsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

