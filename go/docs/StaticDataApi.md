# \StaticDataApi

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ListCities**](StaticDataApi.md#ListCities) | **Get** /data/cities | City list
[**ListCountries**](StaticDataApi.md#ListCountries) | **Get** /data/countries | Country list
[**ListCurrencies**](StaticDataApi.md#ListCurrencies) | **Get** /data/currencies | Currency list
[**ListHotels**](StaticDataApi.md#ListHotels) | **Get** /data/hotels | Hotel list
[**ListIataCodes**](StaticDataApi.md#ListIataCodes) | **Get** /data/iataCodes | IATA code list



## ListCities

> ListCitiesResponse ListCities(ctx).CountryCode(countryCode).Execute()

City list



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    nuitee "github.com/konfig-dev/nuitee-lite-sdks/go"
)

func main() {
    countryCode := "countryCode_example" // string | country code, example \"IT\" (optional)

    configuration := nuitee.NewConfiguration()
    apiClient := nuitee.NewAPIClient(configuration)
    resp, r, err := apiClient.StaticDataApi.ListCities(context.Background()).CountryCode(countryCode).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StaticDataApi.ListCities``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListCities`: ListCitiesResponse
    fmt.Fprintf(os.Stdout, "Response from `StaticDataApi.ListCities`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListCitiesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **string** | country code, example \&quot;IT\&quot; | 

### Return type

[**ListCitiesResponse**](ListCitiesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListCountries

> ListCountriesResponse ListCountries(ctx).Execute()

Country list



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    nuitee "github.com/konfig-dev/nuitee-lite-sdks/go"
)

func main() {

    configuration := nuitee.NewConfiguration()
    apiClient := nuitee.NewAPIClient(configuration)
    resp, r, err := apiClient.StaticDataApi.ListCountries(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StaticDataApi.ListCountries``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListCountries`: ListCountriesResponse
    fmt.Fprintf(os.Stdout, "Response from `StaticDataApi.ListCountries`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiListCountriesRequest struct via the builder pattern


### Return type

[**ListCountriesResponse**](ListCountriesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListCurrencies

> ListCurrenciesResponse ListCurrencies(ctx).Execute()

Currency list

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    nuitee "github.com/konfig-dev/nuitee-lite-sdks/go"
)

func main() {

    configuration := nuitee.NewConfiguration()
    apiClient := nuitee.NewAPIClient(configuration)
    resp, r, err := apiClient.StaticDataApi.ListCurrencies(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StaticDataApi.ListCurrencies``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListCurrencies`: ListCurrenciesResponse
    fmt.Fprintf(os.Stdout, "Response from `StaticDataApi.ListCurrencies`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiListCurrenciesRequest struct via the builder pattern


### Return type

[**ListCurrenciesResponse**](ListCurrenciesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListHotels

> ListHotelsResponse ListHotels(ctx).CountryCode(countryCode).HotelName(hotelName).CityName(cityName).Limit(limit).Offset(offset).Latitude(latitude).Longitude(longitude).Distance(distance).IataCode(iataCode).Execute()

Hotel list



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    nuitee "github.com/konfig-dev/nuitee-lite-sdks/go"
)

func main() {
    countryCode := "countryCode_example" // string | country code Alpha-2 code (example US, RU, CN)
    hotelName := "hotelName_example" // string | hotel name (optional)
    cityName := "cityName_example" // string | city name (optional)
    limit := int32(56) // int32 | limit results (max value 1000) (optional)
    offset := int32(56) // int32 | results offset (optional)
    latitude := float32(8.14) // float32 | latitude geo coordinates (optional)
    longitude := float32(8.14) // float32 | longtude geo coordinates (optional)
    distance := int32(56) // int32 | the distance starting from the selected geopgraphic point (optional)
    iataCode := "iataCode_example" // string | airport iata code (optional)

    configuration := nuitee.NewConfiguration()
    apiClient := nuitee.NewAPIClient(configuration)
    resp, r, err := apiClient.StaticDataApi.ListHotels(context.Background()).CountryCode(countryCode).HotelName(hotelName).CityName(cityName).Limit(limit).Offset(offset).Latitude(latitude).Longitude(longitude).Distance(distance).IataCode(iataCode).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StaticDataApi.ListHotels``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListHotels`: ListHotelsResponse
    fmt.Fprintf(os.Stdout, "Response from `StaticDataApi.ListHotels`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListHotelsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **string** | country code Alpha-2 code (example US, RU, CN) | 
 **hotelName** | **string** | hotel name | 
 **cityName** | **string** | city name | 
 **limit** | **int32** | limit results (max value 1000) | 
 **offset** | **int32** | results offset | 
 **latitude** | **float32** | latitude geo coordinates | 
 **longitude** | **float32** | longtude geo coordinates | 
 **distance** | **int32** | the distance starting from the selected geopgraphic point | 
 **iataCode** | **string** | airport iata code | 

### Return type

[**ListHotelsResponse**](ListHotelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListIataCodes

> ListIataCodesResponse ListIataCodes(ctx).Execute()

IATA code list



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    nuitee "github.com/konfig-dev/nuitee-lite-sdks/go"
)

func main() {

    configuration := nuitee.NewConfiguration()
    apiClient := nuitee.NewAPIClient(configuration)
    resp, r, err := apiClient.StaticDataApi.ListIataCodes(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `StaticDataApi.ListIataCodes``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListIataCodes`: ListIataCodesResponse
    fmt.Fprintf(os.Stdout, "Response from `StaticDataApi.ListIataCodes`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiListIataCodesRequest struct via the builder pattern


### Return type

[**ListIataCodesResponse**](ListIataCodesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

