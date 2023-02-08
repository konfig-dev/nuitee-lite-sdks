# StaticDataApi

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCities**](StaticDataApi.md#listCities) | **GET** /data/cities | City list
[**listCountries**](StaticDataApi.md#listCountries) | **GET** /data/countries | Country list
[**listCurrencies**](StaticDataApi.md#listCurrencies) | **GET** /data/currencies | Currency list
[**listHotels**](StaticDataApi.md#listHotels) | **GET** /data/hotels | Hotel list
[**listIataCodes**](StaticDataApi.md#listIataCodes) | **GET** /data/iataCodes | IATA code list


<a name="listCities"></a>
# **listCities**
> ListCitiesResponse listCities(countryCode)

City list



### Example
```kotlin
// Import classes:
//import com.konfigthis.nuitee.client.infrastructure.*
//import com.konfigthis.nuitee.client.models.*

val apiInstance = StaticDataApi()
val countryCode : kotlin.String = countryCode_example // kotlin.String | country code, example \"IT\"
try {
    val result : ListCitiesResponse = apiInstance.listCities(countryCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StaticDataApi#listCities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StaticDataApi#listCities")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **kotlin.String**| country code, example \&quot;IT\&quot; | [optional]

### Return type

[**ListCitiesResponse**](ListCitiesResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCountries"></a>
# **listCountries**
> ListCountriesResponse listCountries()

Country list

countries list

### Example
```kotlin
// Import classes:
//import com.konfigthis.nuitee.client.infrastructure.*
//import com.konfigthis.nuitee.client.models.*

val apiInstance = StaticDataApi()
try {
    val result : ListCountriesResponse = apiInstance.listCountries()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StaticDataApi#listCountries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StaticDataApi#listCountries")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListCountriesResponse**](ListCountriesResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCurrencies"></a>
# **listCurrencies**
> ListCurrenciesResponse listCurrencies()

Currency list

### Example
```kotlin
// Import classes:
//import com.konfigthis.nuitee.client.infrastructure.*
//import com.konfigthis.nuitee.client.models.*

val apiInstance = StaticDataApi()
try {
    val result : ListCurrenciesResponse = apiInstance.listCurrencies()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StaticDataApi#listCurrencies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StaticDataApi#listCurrencies")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListCurrenciesResponse**](ListCurrenciesResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listHotels"></a>
# **listHotels**
> ListHotelsResponse listHotels(countryCode, hotelName, cityName, limit, offset, latitude, longitude, distance, iataCode)

Hotel list



### Example
```kotlin
// Import classes:
//import com.konfigthis.nuitee.client.infrastructure.*
//import com.konfigthis.nuitee.client.models.*

val apiInstance = StaticDataApi()
val countryCode : kotlin.String = countryCode_example // kotlin.String | country code Alpha-2 code (example US, RU, CN)
val hotelName : kotlin.String = hotelName_example // kotlin.String | hotel name
val cityName : kotlin.String = cityName_example // kotlin.String | city name
val limit : kotlin.Int = 56 // kotlin.Int | limit results (max value 1000)
val offset : kotlin.Int = 56 // kotlin.Int | results offset
val latitude : java.math.BigDecimal = 8.14 // java.math.BigDecimal | latitude geo coordinates
val longitude : java.math.BigDecimal = 8.14 // java.math.BigDecimal | longtude geo coordinates
val distance : kotlin.Int = 56 // kotlin.Int | the distance starting from the selected geopgraphic point
val iataCode : kotlin.String = iataCode_example // kotlin.String | airport iata code
try {
    val result : ListHotelsResponse = apiInstance.listHotels(countryCode, hotelName, cityName, limit, offset, latitude, longitude, distance, iataCode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StaticDataApi#listHotels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StaticDataApi#listHotels")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **kotlin.String**| country code Alpha-2 code (example US, RU, CN) |
 **hotelName** | **kotlin.String**| hotel name | [optional]
 **cityName** | **kotlin.String**| city name | [optional]
 **limit** | **kotlin.Int**| limit results (max value 1000) | [optional]
 **offset** | **kotlin.Int**| results offset | [optional]
 **latitude** | **java.math.BigDecimal**| latitude geo coordinates | [optional]
 **longitude** | **java.math.BigDecimal**| longtude geo coordinates | [optional]
 **distance** | **kotlin.Int**| the distance starting from the selected geopgraphic point | [optional]
 **iataCode** | **kotlin.String**| airport iata code | [optional]

### Return type

[**ListHotelsResponse**](ListHotelsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIataCodes"></a>
# **listIataCodes**
> ListIataCodesResponse listIataCodes()

IATA code list

IATA codes list

### Example
```kotlin
// Import classes:
//import com.konfigthis.nuitee.client.infrastructure.*
//import com.konfigthis.nuitee.client.models.*

val apiInstance = StaticDataApi()
try {
    val result : ListIataCodesResponse = apiInstance.listIataCodes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StaticDataApi#listIataCodes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StaticDataApi#listIataCodes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListIataCodesResponse**](ListIataCodesResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

