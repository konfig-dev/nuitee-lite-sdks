# BookingManagementAPI

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](BookingManagementAPI.md#cancel) | **PUT** /bookings/{bookingId} | Booking cancel
[**listBookings**](BookingManagementAPI.md#listbookings) | **GET** /bookings | Booking list
[**retrieve**](BookingManagementAPI.md#retrieve) | **GET** /bookings/{bookingId} | Booking retrieve


# **cancel**
```swift
    open class func cancel(bookingId: String, completion: @escaping (_ data: CancelResponse?, _ error: Error?) -> Void)
```

Booking cancel

This endpoint allows you to cancel a booking based on a booking ID. The refund amount is based on the cancellation policies. <!-- theme: danger -->

### Example
```swift
import Nuitee

let bookingId = "bookingId_example" // String | (Required) The unique identifier of the booking you would like to update.

// Booking cancel
BookingManagementAPI.cancel(bookingId: bookingId) { (response, error) in
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
 **bookingId** | **String** | (Required) The unique identifier of the booking you would like to update. | 

### Return type

[**CancelResponse**](CancelResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listBookings**
```swift
    open class func listBookings(guestId: String, completion: @escaping (_ data: ListBookingsResponse?, _ error: Error?) -> Void)
```

Booking list

List bookings by guestId

### Example
```swift
import Nuitee

let guestId = "guestId_example" // String | guest id of bookings

// Booking list
BookingManagementAPI.listBookings(guestId: guestId) { (response, error) in
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
 **guestId** | **String** | guest id of bookings | 

### Return type

[**ListBookingsResponse**](ListBookingsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve**
```swift
    open class func retrieve(bookingId: String, completion: @escaping (_ data: RetrieveResponse?, _ error: Error?) -> Void)
```

Booking retrieve

This endpoint allows you to retrieve all the information for specific booking ID.

### Example
```swift
import Nuitee

let bookingId = "bookingId_example" // String | (Required) The unique identifier of the booking you would like to update.

// Booking retrieve
BookingManagementAPI.retrieve(bookingId: bookingId) { (response, error) in
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
 **bookingId** | **String** | (Required) The unique identifier of the booking you would like to update. | 

### Return type

[**RetrieveResponse**](RetrieveResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

