# SearchAPI

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHotelRates**](SearchAPI.md#gethotelrates) | **GET** /hotels/rates | Hotel full rate availability
[**getHotels**](SearchAPI.md#gethotels) | **GET** /hotels | Hotel minimum rate availability


# **getHotelRates**
```swift
    open class func getHotelRates(hotelIds: String, checkin: String, checkout: String, adults: Int, guestNationality: String, currency: String, children: String? = nil, sessionId: String? = nil, travelerId: String? = nil, completion: @escaping (_ data: GetHotelRatesResponse?, _ error: Error?) -> Void)
```

Hotel full rate availability

This endpoint allows you to send a hotel ID with a specific date range and in response receive all the rooms, rates that are available along with the cancelllation policies.

### Example
```swift
import Nuitee

let hotelIds = "hotelIds_example" // String | hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56)
let checkin = "checkin_example" // String | start date yyyy-mm-dd format
let checkout = "checkout_example" // String | end date yyyy-mm-dd format
let adults = 987 // Int | adults number
let guestNationality = "guestNationality_example" // String | guest nationality country code iso-2 example (US)
let currency = "currency_example" // String | currency code example (USD)
let children = "children_example" // String | children ages separated by a comma (optional)
let sessionId = "sessionId_example" // String | session id if retrieved from hotels search (optional)
let travelerId = "travelerId_example" // String | traveler unique id (optional)

// Hotel full rate availability
SearchAPI.getHotelRates(hotelIds: hotelIds, checkin: checkin, checkout: checkout, adults: adults, guestNationality: guestNationality, currency: currency, children: children, sessionId: sessionId, travelerId: travelerId) { (response, error) in
    guard error == nil else {
        print(error!)
        return
    }

    if response != nil {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelIds** | **String** | hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56) | 
 **checkin** | **String** | start date yyyy-mm-dd format | 
 **checkout** | **String** | end date yyyy-mm-dd format | 
 **adults** | **Int** | adults number | 
 **guestNationality** | **String** | guest nationality country code iso-2 example (US) | 
 **currency** | **String** | currency code example (USD) | 
 **children** | **String** | children ages separated by a comma | [optional] 
 **sessionId** | **String** | session id if retrieved from hotels search | [optional] 
 **travelerId** | **String** | traveler unique id | [optional] 

### Return type

[**GetHotelRatesResponse**](GetHotelRatesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **getHotels**
```swift
    open class func getHotels(hotelIds: String, checkin: String, checkout: String, country: String, adults: Int, currency: String, guestNationality: String, latitude: Double? = nil, longitude: Double? = nil, distance: Int? = nil, children: String? = nil, travelerId: String? = nil, completion: @escaping (_ data: GetHotelsResponse?, _ error: Error?) -> Void)
```

Hotel minimum rate availability

This endpoint allows you to send a list of hotel ID's for a specific date range and in response receive the best rate available for each of the hotel ID's. The limit is set to 200 hotels

### Example
```swift
import Nuitee

let hotelIds = "hotelIds_example" // String | hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56)
let checkin = "checkin_example" // String | 
let checkout = "checkout_example" // String | 
let country = "country_example" // String | 
let adults = 987 // Int | 
let currency = "currency_example" // String | 
let guestNationality = "guestNationality_example" // String | 
let latitude = 987 // Double |  (optional)
let longitude = 987 // Double |  (optional)
let distance = 987 // Int |  (optional)
let children = "children_example" // String |  (optional)
let travelerId = "travelerId_example" // String |  (optional)

// Hotel minimum rate availability
SearchAPI.getHotels(hotelIds: hotelIds, checkin: checkin, checkout: checkout, country: country, adults: adults, currency: currency, guestNationality: guestNationality, latitude: latitude, longitude: longitude, distance: distance, children: children, travelerId: travelerId) { (response, error) in
    guard error == nil else {
        print(error!)
        return
    }

    if response != nil {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelIds** | **String** | hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56) | 
 **checkin** | **String** |  | 
 **checkout** | **String** |  | 
 **country** | **String** |  | 
 **adults** | **Int** |  | 
 **currency** | **String** |  | 
 **guestNationality** | **String** |  | 
 **latitude** | **Double** |  | [optional] 
 **longitude** | **Double** |  | [optional] 
 **distance** | **Int** |  | [optional] 
 **children** | **String** |  | [optional] 
 **travelerId** | **String** |  | [optional] 

### Return type

[**GetHotelsResponse**](GetHotelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

