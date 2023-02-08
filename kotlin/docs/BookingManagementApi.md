# BookingManagementApi

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](BookingManagementApi.md#cancel) | **PUT** /bookings/{bookingId} | Booking cancel
[**listBookings**](BookingManagementApi.md#listBookings) | **GET** /bookings | Booking list
[**retrieve**](BookingManagementApi.md#retrieve) | **GET** /bookings/{bookingId} | Booking retrieve


<a name="cancel"></a>
# **cancel**
> CancelResponse cancel(bookingId)

Booking cancel

This endpoint allows you to cancel a booking based on a booking ID. The refund amount is based on the cancellation policies. &lt;!-- theme: danger --&gt;

### Example
```kotlin
// Import classes:
//import com.konfigthis.nuitee.client.infrastructure.*
//import com.konfigthis.nuitee.client.models.*

val apiInstance = BookingManagementApi()
val bookingId : kotlin.String = SEMkJ9lNM // kotlin.String | (Required) The unique identifier of the booking you would like to update.
try {
    val result : CancelResponse = apiInstance.cancel(bookingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingManagementApi#cancel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingManagementApi#cancel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **kotlin.String**| (Required) The unique identifier of the booking you would like to update. |

### Return type

[**CancelResponse**](CancelResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBookings"></a>
# **listBookings**
> ListBookingsResponse listBookings(guestId)

Booking list

List bookings by guestId

### Example
```kotlin
// Import classes:
//import com.konfigthis.nuitee.client.infrastructure.*
//import com.konfigthis.nuitee.client.models.*

val apiInstance = BookingManagementApi()
val guestId : kotlin.String = guestId_example // kotlin.String | guest id of bookings
try {
    val result : ListBookingsResponse = apiInstance.listBookings(guestId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingManagementApi#listBookings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingManagementApi#listBookings")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guestId** | **kotlin.String**| guest id of bookings |

### Return type

[**ListBookingsResponse**](ListBookingsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieve"></a>
# **retrieve**
> RetrieveResponse retrieve(bookingId)

Booking retrieve

This endpoint allows you to retrieve all the information for specific booking ID.

### Example
```kotlin
// Import classes:
//import com.konfigthis.nuitee.client.infrastructure.*
//import com.konfigthis.nuitee.client.models.*

val apiInstance = BookingManagementApi()
val bookingId : kotlin.String = SEMkJ9lNM // kotlin.String | (Required) The unique identifier of the booking you would like to update.
try {
    val result : RetrieveResponse = apiInstance.retrieve(bookingId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookingManagementApi#retrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookingManagementApi#retrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **kotlin.String**| (Required) The unique identifier of the booking you would like to update. |

### Return type

[**RetrieveResponse**](RetrieveResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

