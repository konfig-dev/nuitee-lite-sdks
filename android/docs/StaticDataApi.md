# StaticDataApi

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCities**](StaticDataApi.md#listCities) | **GET** /data/cities | City list
[**listCountries**](StaticDataApi.md#listCountries) | **GET** /data/countries | Country list
[**listCurrencies**](StaticDataApi.md#listCurrencies) | **GET** /data/currencies | Currency list
[**listHotels**](StaticDataApi.md#listHotels) | **GET** /data/hotels | Hotel list
[**listIataCodes**](StaticDataApi.md#listIataCodes) | **GET** /data/iataCodes | IATA code list



## listCities

> ListCitiesResponse listCities(countryCode)

City list



### Example

```java
// Import classes:
//import com.konfigthis.nuitee.client.api.StaticDataApi;

StaticDataApi apiInstance = new StaticDataApi();
String countryCode = null; // String | country code, example \"IT\"
try {
    ListCitiesResponse result = apiInstance.listCities(countryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaticDataApi#listCities");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**| country code, example \&quot;IT\&quot; | [optional] [default to null]

### Return type

[**ListCitiesResponse**](ListCitiesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listCountries

> ListCountriesResponse listCountries()

Country list

countries list

### Example

```java
// Import classes:
//import com.konfigthis.nuitee.client.api.StaticDataApi;

StaticDataApi apiInstance = new StaticDataApi();
try {
    ListCountriesResponse result = apiInstance.listCountries();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaticDataApi#listCountries");
    e.printStackTrace();
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


## listCurrencies

> ListCurrenciesResponse listCurrencies()

Currency list

### Example

```java
// Import classes:
//import com.konfigthis.nuitee.client.api.StaticDataApi;

StaticDataApi apiInstance = new StaticDataApi();
try {
    ListCurrenciesResponse result = apiInstance.listCurrencies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaticDataApi#listCurrencies");
    e.printStackTrace();
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


## listHotels

> ListHotelsResponse listHotels(countryCode, hotelName, cityName, limit, offset, latitude, longitude, distance, iataCode)

Hotel list



### Example

```java
// Import classes:
//import com.konfigthis.nuitee.client.api.StaticDataApi;

StaticDataApi apiInstance = new StaticDataApi();
String countryCode = null; // String | country code Alpha-2 code (example US, RU, CN)
String hotelName = null; // String | hotel name
String cityName = null; // String | city name
Integer limit = null; // Integer | limit results (max value 1000)
Integer offset = null; // Integer | results offset
BigDecimal latitude = null; // BigDecimal | latitude geo coordinates
BigDecimal longitude = null; // BigDecimal | longtude geo coordinates
Integer distance = null; // Integer | the distance starting from the selected geopgraphic point
String iataCode = null; // String | airport iata code
try {
    ListHotelsResponse result = apiInstance.listHotels(countryCode, hotelName, cityName, limit, offset, latitude, longitude, distance, iataCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaticDataApi#listHotels");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**| country code Alpha-2 code (example US, RU, CN) | [default to null]
 **hotelName** | **String**| hotel name | [optional] [default to null]
 **cityName** | **String**| city name | [optional] [default to null]
 **limit** | **Integer**| limit results (max value 1000) | [optional] [default to null]
 **offset** | **Integer**| results offset | [optional] [default to null]
 **latitude** | **BigDecimal**| latitude geo coordinates | [optional] [default to null]
 **longitude** | **BigDecimal**| longtude geo coordinates | [optional] [default to null]
 **distance** | **Integer**| the distance starting from the selected geopgraphic point | [optional] [default to null]
 **iataCode** | **String**| airport iata code | [optional] [default to null]

### Return type

[**ListHotelsResponse**](ListHotelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listIataCodes

> ListIataCodesResponse listIataCodes()

IATA code list

IATA codes list

### Example

```java
// Import classes:
//import com.konfigthis.nuitee.client.api.StaticDataApi;

StaticDataApi apiInstance = new StaticDataApi();
try {
    ListIataCodesResponse result = apiInstance.listIataCodes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StaticDataApi#listIataCodes");
    e.printStackTrace();
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

