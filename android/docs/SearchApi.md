# SearchApi

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHotelRates**](SearchApi.md#getHotelRates) | **GET** /hotels/rates | Hotel full rate availability
[**getHotels**](SearchApi.md#getHotels) | **GET** /hotels | Hotel minimum rate availability



## getHotelRates

> GetHotelRatesResponse getHotelRates(hotelIds, checkin, checkout, adults, guestNationality, currency, children, sessionId, travelerId)

Hotel full rate availability

This endpoint allows you to send a hotel ID with a specific date range and in response receive all the rooms, rates that are available along with the cancelllation policies.

### Example

```java
// Import classes:
//import com.konfigthis.nuitee.client.api.SearchApi;

SearchApi apiInstance = new SearchApi();
String hotelIds = null; // String | hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56)
Date checkin = null; // Date | start date yyyy-mm-dd format
Date checkout = null; // Date | end date yyyy-mm-dd format
Integer adults = null; // Integer | adults number
String guestNationality = null; // String | guest nationality country code iso-2 example (US)
String currency = null; // String | currency code example (USD)
String children = null; // String | children ages separated by a comma
String sessionId = null; // String | session id if retrieved from hotels search
String travelerId = null; // String | traveler unique id
try {
    GetHotelRatesResponse result = apiInstance.getHotelRates(hotelIds, checkin, checkout, adults, guestNationality, currency, children, sessionId, travelerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getHotelRates");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelIds** | **String**| hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56) | [default to null]
 **checkin** | **Date**| start date yyyy-mm-dd format | [default to null]
 **checkout** | **Date**| end date yyyy-mm-dd format | [default to null]
 **adults** | **Integer**| adults number | [default to null]
 **guestNationality** | **String**| guest nationality country code iso-2 example (US) | [default to null]
 **currency** | **String**| currency code example (USD) | [default to null]
 **children** | **String**| children ages separated by a comma | [optional] [default to null]
 **sessionId** | **String**| session id if retrieved from hotels search | [optional] [default to null]
 **travelerId** | **String**| traveler unique id | [optional] [default to null]

### Return type

[**GetHotelRatesResponse**](GetHotelRatesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getHotels

> GetHotelsResponse getHotels(hotelIds, checkin, checkout, country, adults, currency, guestNationality, latitude, longitude, distance, children, travelerId)

Hotel minimum rate availability

This endpoint allows you to send a list of hotel ID&#39;s for a specific date range and in response receive the best rate available for each of the hotel ID&#39;s. The limit is set to 200 hotels

### Example

```java
// Import classes:
//import com.konfigthis.nuitee.client.api.SearchApi;

SearchApi apiInstance = new SearchApi();
String hotelIds = null; // String | hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56)
Date checkin = null; // Date | 
Date checkout = null; // Date | 
String country = null; // String | 
Integer adults = null; // Integer | 
String currency = null; // String | 
String guestNationality = null; // String | 
BigDecimal latitude = null; // BigDecimal | 
BigDecimal longitude = null; // BigDecimal | 
Integer distance = null; // Integer | 
String children = null; // String | 
String travelerId = null; // String | 
try {
    GetHotelsResponse result = apiInstance.getHotels(hotelIds, checkin, checkout, country, adults, currency, guestNationality, latitude, longitude, distance, children, travelerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getHotels");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelIds** | **String**| hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56) | [default to null]
 **checkin** | **Date**|  | [default to null]
 **checkout** | **Date**|  | [default to null]
 **country** | **String**|  | [default to null]
 **adults** | **Integer**|  | [default to null]
 **currency** | **String**|  | [default to null]
 **guestNationality** | **String**|  | [default to null]
 **latitude** | **BigDecimal**|  | [optional] [default to null]
 **longitude** | **BigDecimal**|  | [optional] [default to null]
 **distance** | **Integer**|  | [optional] [default to null]
 **children** | **String**|  | [optional] [default to null]
 **travelerId** | **String**|  | [optional] [default to null]

### Return type

[**GetHotelsResponse**](GetHotelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

