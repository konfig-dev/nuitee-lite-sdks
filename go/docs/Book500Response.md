# Book500Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Error** | Pointer to [**Book400ResponseError**](Book400ResponseError.md) |  | [optional] 

## Methods

### NewBook500Response

`func NewBook500Response() *Book500Response`

NewBook500Response instantiates a new Book500Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBook500ResponseWithDefaults

`func NewBook500ResponseWithDefaults() *Book500Response`

NewBook500ResponseWithDefaults instantiates a new Book500Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetError

`func (o *Book500Response) GetError() Book400ResponseError`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *Book500Response) GetErrorOk() (*Book400ResponseError, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *Book500Response) SetError(v Book400ResponseError)`

SetError sets Error field to given value.

### HasError

`func (o *Book500Response) HasError() bool`

HasError returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


