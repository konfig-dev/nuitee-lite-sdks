# BookApi

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**book**](BookApi.md#book) | **POST** /rates/book | Hotel rate book
[**prebook**](BookApi.md#prebook) | **POST** /rates/prebook | Hotel rate prebook


<a name="book"></a>
# **book**
> BookResponse book(bookRequest)

Hotel rate book

This endpoint allows you to send a specific prebook ID along with the email to confirm the booking for a specific room in a specific hotel.

### Example
```kotlin
// Import classes:
//import com.konfigthis.nuitee.client.infrastructure.*
//import com.konfigthis.nuitee.client.models.*

val apiInstance = BookApi()
val bookRequest : BookRequest = {"prebookId":"v43KK76NH","sessionId":"GIYDEMZNGAZS2MJVPQZDAMRTFUYDGLJRGZ6DC7BRGIWDS7CNIF6HYMLEMRWV6Z3EKNXGC","contact":{"firstName":"Steve","lastName":"Kim","email":"test@nlite.ml"},"rateId":"2_3P6L4TRYIFKLFM3DRKUQ4SBFCSO3QJBU27UQ76RU6HTAVUULOUZN3HLFLDS6HRUUQXXZNPELVXHLEXZF3J26PGYXGZEMZOPATZGAUBZLMB7BR6OL7QW4FIAIWTOCOLVHBIRGQFE7UJLTQP5RB6AXVPADIRT34YR56BBBSLSAWK2BMTRYBFRZCYG6HQKMULTSO6JIWWTEGVSBOHNFO7KTFXFMGCULXME2B4PZDCFWK62PT3EL4XUVOEB37V2EA7CWJKOZZU4OYDFB36YWUCID6LWVCCRMVU4PYZH2WBTJ6SLVVEGVZHTVGCVXA5GXEOCUE4ARMWXCIGRPASA5WBFI2T557GWUUZ6YMBZZMPUPCWI7DVO2OG6KY36WWASVBLEJRYFHJRRGQKDV5HY6INAD3YARYKVNFMITJ6BX5LVBVXNF33OZF34ZQDE5S74ND73FMHCYSSTZFOBCOBKYDHQ5BWGRYS7GALROITVAFG2OIFSXLUSKRT3MEURPJL7S3MHWEJMAYJFGGPMRZBEQZXAXDJI","travelerId":"fr5Yght9","IP":"212.56.43.5"} // BookRequest | 
try {
    val result : BookResponse = apiInstance.book(bookRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookApi#book")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookApi#book")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookRequest** | [**BookRequest**](BookRequest.md)|  | [optional]

### Return type

[**BookResponse**](BookResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="prebook"></a>
# **prebook**
> PrebookResponse prebook(prebookRequest)

Hotel rate prebook

This endpoint allows you to send a specific rate ID along with the session ID to confirm the room availability, rates and cancellation policies in the response. A prebook-id is also part of the response which can be used to book a specific room in a hotel. 

### Example
```kotlin
// Import classes:
//import com.konfigthis.nuitee.client.infrastructure.*
//import com.konfigthis.nuitee.client.models.*

val apiInstance = BookApi()
val prebookRequest : PrebookRequest = {"sessionId":"GIYDEMZNGAZS2MJVPQZDAMRTFUYDGLJRGZ6DC7BRGIWDS7CNIF6HYMLEMRWV6Z3EKNXGC","rateId":"2_3P6L4TRYIFKLFM3DRKUQ4SBFCSO3QJBU27UQ76RU6HTAVUULOUZN3HLFLDS6HRUUQXXZNPELVXHLEXZF3J26PGYXGZEMZOPATZGAUBZLMB7BR6OL7QW4FIAIWTOCOLVHBIRGQFE7UJLTQP5RB6AXVPADIRT34YR56BBBSLSAWK2BMTRYBFRZCYG6HQKMULTSO6JIWWTEGVSBOHNFO7KTFXFMGCULXME2B4PZDCFWK62PT3EL4XUVOEB37V2EA7CWJKOZZU4OYDFB36YWUCID6LWVCCRMVU4PYZH2WBTJ6SLVVEGVZHTVGCVXA5GXEOCUE4ARMWXCIGRPASA5WBFI2T557GWUUZ6YMBZZMPUPCWI7DVO2OG6KY36WWASVBLEJRYFHJRRGQKDV5HY6INAD3YARYKVNFMITJ6BX5LVBVXNF33OZF34ZQDE5S74ND73FMHCYSSTZFOBCOBKYDHQ5BWGRYS7GALROITVAFG2OIFSXLUSKRT3MEURPJL7S3MHWEJMAYJFGGPMRZBEQZXAXDJI","travelerId":"FrT56hfty"} // PrebookRequest | 
try {
    val result : PrebookResponse = apiInstance.prebook(prebookRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookApi#prebook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookApi#prebook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prebookRequest** | [**PrebookRequest**](PrebookRequest.md)|  | [optional]

### Return type

[**PrebookResponse**](PrebookResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["X-API-Key"] = ""
    ApiClient.apiKeyPrefix["X-API-Key"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

