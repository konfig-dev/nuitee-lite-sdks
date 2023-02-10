# BookApi

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**book**](BookApi.md#book) | **POST** /rates/book | Hotel rate book
[**prebook**](BookApi.md#prebook) | **POST** /rates/prebook | Hotel rate prebook



## book

> BookResponse book(bookRequest)

Hotel rate book

This endpoint allows you to send a specific prebook ID along with the email to confirm the booking for a specific room in a specific hotel.

### Example

```java
// Import classes:
//import com.konfigthis.nuitee.client.api.BookApi;

BookApi apiInstance = new BookApi();
BookRequest bookRequest = new BookRequest(); // BookRequest | 
try {
    BookResponse result = apiInstance.book(bookRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookApi#book");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookRequest** | [**BookRequest**](BookRequest.md)|  | [optional]

### Return type

[**BookResponse**](BookResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## prebook

> PrebookResponse prebook(prebookRequest)

Hotel rate prebook

This endpoint allows you to send a specific rate ID along with the session ID to confirm the room availability, rates and cancellation policies in the response. A prebook-id is also part of the response which can be used to book a specific room in a hotel. 

### Example

```java
// Import classes:
//import com.konfigthis.nuitee.client.api.BookApi;

BookApi apiInstance = new BookApi();
PrebookRequest prebookRequest = new PrebookRequest(); // PrebookRequest | 
try {
    PrebookResponse result = apiInstance.prebook(prebookRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookApi#prebook");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prebookRequest** | [**PrebookRequest**](PrebookRequest.md)|  | [optional]

### Return type

[**PrebookResponse**](PrebookResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

