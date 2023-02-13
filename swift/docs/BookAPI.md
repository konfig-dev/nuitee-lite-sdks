# BookAPI

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**book**](BookAPI.md#book) | **POST** /rates/book | Hotel rate book
[**prebook**](BookAPI.md#prebook) | **POST** /rates/prebook | Hotel rate prebook


# **book**
```swift
    open class func book(bookRequest: BookRequest? = nil, completion: @escaping (_ data: BookResponse?, _ error: Error?) -> Void)
```

Hotel rate book

This endpoint allows you to send a specific prebook ID along with the email to confirm the booking for a specific room in a specific hotel.

### Example
```swift
import Nuitee

let bookRequest = BookRequest(prebookId: "prebookId_example", sessionId: "sessionId_example", guestInfo: BookRequestGuestInfo(guestFirstName: "guestFirstName_example", guestLastName: "guestLastName_example", guestEmail: "guestEmail_example"), rateId: "rateId_example") // BookRequest |  (optional)

// Hotel rate book
BookAPI.book(bookRequest: bookRequest) { (response, error) in
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
 **bookRequest** | [**BookRequest**](BookRequest.md) |  | [optional] 

### Return type

[**BookResponse**](BookResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **prebook**
```swift
    open class func prebook(prebookRequest: PrebookRequest? = nil, completion: @escaping (_ data: PrebookResponse?, _ error: Error?) -> Void)
```

Hotel rate prebook

This endpoint allows you to send a specific rate ID along with the session ID to confirm the room availability, rates and cancellation policies in the response. A prebook-id is also part of the response which can be used to book a specific room in a hotel. 

### Example
```swift
import Nuitee

let prebookRequest = PrebookRequest(sessionId: "sessionId_example", rateId: "rateId_example") // PrebookRequest |  (optional)

// Hotel rate prebook
BookAPI.prebook(prebookRequest: prebookRequest) { (response, error) in
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
 **prebookRequest** | [**PrebookRequest**](PrebookRequest.md) |  | [optional] 

### Return type

[**PrebookResponse**](PrebookResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

