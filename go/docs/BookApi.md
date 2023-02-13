# \BookApi

All URIs are relative to *https://api.nlite.ml/v1.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Book**](BookApi.md#Book) | **Post** /rates/book | Hotel rate book
[**Prebook**](BookApi.md#Prebook) | **Post** /rates/prebook | Hotel rate prebook



## Book

> BookResponse Book(ctx).BookRequest(bookRequest).Execute()

Hotel rate book



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
    bookRequest := *nuitee.NewBookRequest("PrebookId_example", "RateId_example") // BookRequest |  (optional)

    configuration := nuitee.NewConfiguration()
    apiClient := nuitee.NewAPIClient(configuration)
    resp, r, err := apiClient.BookApi.Book(context.Background()).BookRequest(bookRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BookApi.Book``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Book`: BookResponse
    fmt.Fprintf(os.Stdout, "Response from `BookApi.Book`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiBookRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookRequest** | [**BookRequest**](BookRequest.md) |  | 

### Return type

[**BookResponse**](BookResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Prebook

> PrebookResponse Prebook(ctx).PrebookRequest(prebookRequest).Execute()

Hotel rate prebook



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
    prebookRequest := *nuitee.NewPrebookRequest("RateId_example") // PrebookRequest |  (optional)

    configuration := nuitee.NewConfiguration()
    apiClient := nuitee.NewAPIClient(configuration)
    resp, r, err := apiClient.BookApi.Prebook(context.Background()).PrebookRequest(prebookRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BookApi.Prebook``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Prebook`: PrebookResponse
    fmt.Fprintf(os.Stdout, "Response from `BookApi.Prebook`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiPrebookRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prebookRequest** | [**PrebookRequest**](PrebookRequest.md) |  | 

### Return type

[**PrebookResponse**](PrebookResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

