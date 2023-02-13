# \SearchApi

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetHotelRates**](SearchApi.md#GetHotelRates) | **Get** /hotels/rates | Hotel full rate availability
[**GetHotels**](SearchApi.md#GetHotels) | **Get** /hotels | Hotel minimum rate availability



## GetHotelRates

> GetHotelRatesResponse GetHotelRates(ctx).HotelIds(hotelIds).Checkin(checkin).Checkout(checkout).Adults(adults).GuestNationality(guestNationality).Currency(currency).Children(children).SessionId(sessionId).TravelerId(travelerId).Execute()

Hotel full rate availability



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    nuitee "github.com/konfig-dev/nuitee-lite-sdks/go"
)

func main() {
    hotelIds := "2345,557,565,4239" // string | hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56)
    checkin := time.Now() // string | start date yyyy-mm-dd format
    checkout := time.Now() // string | end date yyyy-mm-dd format
    adults := int32(1) // int32 | adults number
    guestNationality := "US" // string | guest nationality country code iso-2 example (US)
    currency := "USD" // string | currency code example (USD)
    children := "5,9" // string | children ages separated by a comma (optional)
    sessionId := "GIYDEMZNGAYS2MJVPQZDAMRTFUYDCLJRGZ6DC7D4JVAXY7DZM5MDMQKKJJAXKZY" // string | session id if retrieved from hotels search (optional)
    travelerId := "travelerId_example" // string | traveler unique id (optional)

    configuration := nuitee.NewConfiguration()
    apiClient := nuitee.NewAPIClient(configuration)
    resp, r, err := apiClient.SearchApi.GetHotelRates(context.Background()).HotelIds(hotelIds).Checkin(checkin).Checkout(checkout).Adults(adults).GuestNationality(guestNationality).Currency(currency).Children(children).SessionId(sessionId).TravelerId(travelerId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SearchApi.GetHotelRates``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetHotelRates`: GetHotelRatesResponse
    fmt.Fprintf(os.Stdout, "Response from `SearchApi.GetHotelRates`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetHotelRatesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelIds** | **string** | hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56) | 
 **checkin** | **string** | start date yyyy-mm-dd format | 
 **checkout** | **string** | end date yyyy-mm-dd format | 
 **adults** | **int32** | adults number | 
 **guestNationality** | **string** | guest nationality country code iso-2 example (US) | 
 **currency** | **string** | currency code example (USD) | 
 **children** | **string** | children ages separated by a comma | 
 **sessionId** | **string** | session id if retrieved from hotels search | 
 **travelerId** | **string** | traveler unique id | 

### Return type

[**GetHotelRatesResponse**](GetHotelRatesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetHotels

> GetHotelsResponse GetHotels(ctx).HotelIds(hotelIds).Checkin(checkin).Checkout(checkout).Country(country).Adults(adults).Currency(currency).GuestNationality(guestNationality).Latitude(latitude).Longitude(longitude).Distance(distance).Children(children).TravelerId(travelerId).Execute()

Hotel minimum rate availability



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    nuitee "github.com/konfig-dev/nuitee-lite-sdks/go"
)

func main() {
    hotelIds := "2345,557,565,4239" // string | hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56)
    checkin := time.Now() // string | 
    checkout := time.Now() // string | 
    country := "US" // string | 
    adults := int32(2) // int32 | 
    currency := "USD" // string | 
    guestNationality := "CA" // string | 
    latitude := float32(32.31823) // float32 |  (optional)
    longitude := float32(-86.902298) // float32 |  (optional)
    distance := int32(20) // int32 |  (optional)
    children := "7,14" // string |  (optional)
    travelerId := "TMX54RS4" // string |  (optional)

    configuration := nuitee.NewConfiguration()
    apiClient := nuitee.NewAPIClient(configuration)
    resp, r, err := apiClient.SearchApi.GetHotels(context.Background()).HotelIds(hotelIds).Checkin(checkin).Checkout(checkout).Country(country).Adults(adults).Currency(currency).GuestNationality(guestNationality).Latitude(latitude).Longitude(longitude).Distance(distance).Children(children).TravelerId(travelerId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `SearchApi.GetHotels``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetHotels`: GetHotelsResponse
    fmt.Fprintf(os.Stdout, "Response from `SearchApi.GetHotels`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetHotelsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelIds** | **string** | hotel ids separated by comma, max number of hotel ids is 10, example (2345,557,56) | 
 **checkin** | **string** |  | 
 **checkout** | **string** |  | 
 **country** | **string** |  | 
 **adults** | **int32** |  | 
 **currency** | **string** |  | 
 **guestNationality** | **string** |  | 
 **latitude** | **float32** |  | 
 **longitude** | **float32** |  | 
 **distance** | **int32** |  | 
 **children** | **string** |  | 
 **travelerId** | **string** |  | 

### Return type

[**GetHotelsResponse**](GetHotelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

