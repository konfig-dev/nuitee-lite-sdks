# StaticDataAPI

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCities**](StaticDataAPI.md#listcities) | **GET** /data/cities | City list
[**listCountries**](StaticDataAPI.md#listcountries) | **GET** /data/countries | Country list
[**listCurrencies**](StaticDataAPI.md#listcurrencies) | **GET** /data/currencies | Currency list
[**listHotels**](StaticDataAPI.md#listhotels) | **GET** /data/hotels | Hotel list
[**listIataCodes**](StaticDataAPI.md#listiatacodes) | **GET** /data/iataCodes | IATA code list


# **listCities**
```swift
    open class func listCities(countryCode: String? = nil, completion: @escaping (_ data: ListCitiesResponse?, _ error: Error?) -> Void)
```

City list



### Example
```swift
import Nuitee

let countryCode = "countryCode_example" // String | country code, example \"IT\" (optional)

// City list
StaticDataAPI.listCities(countryCode: countryCode) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String** | country code, example \&quot;IT\&quot; | [optional] 

### Return type

[**ListCitiesResponse**](ListCitiesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listCountries**
```swift
    open class func listCountries(completion: @escaping (_ data: ListCountriesResponse?, _ error: Error?) -> Void)
```

Country list

countries list

### Example
```swift
import Nuitee


// Country list
StaticDataAPI.listCountries() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listCurrencies**
```swift
    open class func listCurrencies(completion: @escaping (_ data: ListCurrenciesResponse?, _ error: Error?) -> Void)
```

Currency list

### Example
```swift
import Nuitee


// Currency list
StaticDataAPI.listCurrencies() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listHotels**
```swift
    open class func listHotels(countryCode: String, hotelName: String? = nil, cityName: String? = nil, limit: Int? = nil, offset: Int? = nil, latitude: Double? = nil, longitude: Double? = nil, distance: Int? = nil, iataCode: String? = nil, completion: @escaping (_ data: ListHotelsResponse?, _ error: Error?) -> Void)
```

Hotel list



### Example
```swift
import Nuitee

let countryCode = "countryCode_example" // String | country code Alpha-2 code (example US, RU, CN)
let hotelName = "hotelName_example" // String | hotel name (optional)
let cityName = "cityName_example" // String | city name (optional)
let limit = 987 // Int | limit results (max value 1000) (optional)
let offset = 987 // Int | results offset (optional)
let latitude = 987 // Double | latitude geo coordinates (optional)
let longitude = 987 // Double | longtude geo coordinates (optional)
let distance = 987 // Int | the distance starting from the selected geopgraphic point (optional)
let iataCode = "iataCode_example" // String | airport iata code (optional)

// Hotel list
StaticDataAPI.listHotels(countryCode: countryCode, hotelName: hotelName, cityName: cityName, limit: limit, offset: offset, latitude: latitude, longitude: longitude, distance: distance, iataCode: iataCode) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String** | country code Alpha-2 code (example US, RU, CN) | 
 **hotelName** | **String** | hotel name | [optional] 
 **cityName** | **String** | city name | [optional] 
 **limit** | **Int** | limit results (max value 1000) | [optional] 
 **offset** | **Int** | results offset | [optional] 
 **latitude** | **Double** | latitude geo coordinates | [optional] 
 **longitude** | **Double** | longtude geo coordinates | [optional] 
 **distance** | **Int** | the distance starting from the selected geopgraphic point | [optional] 
 **iataCode** | **String** | airport iata code | [optional] 

### Return type

[**ListHotelsResponse**](ListHotelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listIataCodes**
```swift
    open class func listIataCodes(completion: @escaping (_ data: ListIataCodesResponse?, _ error: Error?) -> Void)
```

IATA code list

IATA codes list

### Example
```swift
import Nuitee


// IATA code list
StaticDataAPI.listIataCodes() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

