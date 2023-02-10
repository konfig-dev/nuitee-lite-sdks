# BookingManagementApi

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](BookingManagementApi.md#cancel) | **PUT** /bookings/{bookingId} | Booking cancel
[**listBookings**](BookingManagementApi.md#listBookings) | **GET** /bookings | Booking list
[**retrieve**](BookingManagementApi.md#retrieve) | **GET** /bookings/{bookingId} | Booking retrieve



## cancel

> CancelResponse cancel(bookingId)

Booking cancel

This endpoint allows you to cancel a booking based on a booking ID. The refund amount is based on the cancellation policies. &lt;!-- theme: danger --&gt;

### Example

```java
// Import classes:
//import com.konfigthis.nuitee.client.api.BookingManagementApi;

BookingManagementApi apiInstance = new BookingManagementApi();
String bookingId = null; // String | (Required) The unique identifier of the booking you would like to update.
try {
    CancelResponse result = apiInstance.cancel(bookingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingManagementApi#cancel");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **String**| (Required) The unique identifier of the booking you would like to update. | [default to null]

### Return type

[**CancelResponse**](CancelResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## listBookings

> ListBookingsResponse listBookings(guestId)

Booking list

List bookings by guestId

### Example

```java
// Import classes:
//import com.konfigthis.nuitee.client.api.BookingManagementApi;

BookingManagementApi apiInstance = new BookingManagementApi();
String guestId = null; // String | guest id of bookings
try {
    ListBookingsResponse result = apiInstance.listBookings(guestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingManagementApi#listBookings");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guestId** | **String**| guest id of bookings | [default to null]

### Return type

[**ListBookingsResponse**](ListBookingsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## retrieve

> RetrieveResponse retrieve(bookingId)

Booking retrieve

This endpoint allows you to retrieve all the information for specific booking ID.

### Example

```java
// Import classes:
//import com.konfigthis.nuitee.client.api.BookingManagementApi;

BookingManagementApi apiInstance = new BookingManagementApi();
String bookingId = null; // String | (Required) The unique identifier of the booking you would like to update.
try {
    RetrieveResponse result = apiInstance.retrieve(bookingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingManagementApi#retrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **String**| (Required) The unique identifier of the booking you would like to update. | [default to null]

### Return type

[**RetrieveResponse**](RetrieveResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

