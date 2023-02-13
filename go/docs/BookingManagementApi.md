# \BookingManagementApi

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Cancel**](BookingManagementApi.md#Cancel) | **Put** /bookings/{bookingId} | Booking cancel
[**ListBookings**](BookingManagementApi.md#ListBookings) | **Get** /bookings | Booking list
[**Retrieve**](BookingManagementApi.md#Retrieve) | **Get** /bookings/{bookingId} | Booking retrieve



## Cancel

> CancelResponse Cancel(ctx, bookingId).Execute()

Booking cancel



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
    bookingId := "SEMkJ9lNM" // string | (Required) The unique identifier of the booking you would like to update.

    configuration := nuitee.NewConfiguration()
    apiClient := nuitee.NewAPIClient(configuration)
    resp, r, err := apiClient.BookingManagementApi.Cancel(context.Background(), bookingId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BookingManagementApi.Cancel``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Cancel`: CancelResponse
    fmt.Fprintf(os.Stdout, "Response from `BookingManagementApi.Cancel`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**bookingId** | **string** | (Required) The unique identifier of the booking you would like to update. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCancelRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**CancelResponse**](CancelResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListBookings

> ListBookingsResponse ListBookings(ctx).GuestId(guestId).Execute()

Booking list



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
    guestId := "guestId_example" // string | guest id of bookings

    configuration := nuitee.NewConfiguration()
    apiClient := nuitee.NewAPIClient(configuration)
    resp, r, err := apiClient.BookingManagementApi.ListBookings(context.Background()).GuestId(guestId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BookingManagementApi.ListBookings``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListBookings`: ListBookingsResponse
    fmt.Fprintf(os.Stdout, "Response from `BookingManagementApi.ListBookings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListBookingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guestId** | **string** | guest id of bookings | 

### Return type

[**ListBookingsResponse**](ListBookingsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Retrieve

> RetrieveResponse Retrieve(ctx, bookingId).Execute()

Booking retrieve



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
    bookingId := "SEMkJ9lNM" // string | (Required) The unique identifier of the booking you would like to update.

    configuration := nuitee.NewConfiguration()
    apiClient := nuitee.NewAPIClient(configuration)
    resp, r, err := apiClient.BookingManagementApi.Retrieve(context.Background(), bookingId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BookingManagementApi.Retrieve``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Retrieve`: RetrieveResponse
    fmt.Fprintf(os.Stdout, "Response from `BookingManagementApi.Retrieve`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**bookingId** | **string** | (Required) The unique identifier of the booking you would like to update. | 

### Other Parameters

Other parameters are passed through a pointer to a apiRetrieveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**RetrieveResponse**](RetrieveResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

