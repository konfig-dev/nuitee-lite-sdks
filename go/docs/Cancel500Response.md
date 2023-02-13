# Cancel500Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Error** | Pointer to [**Cancel400ResponseError**](Cancel400ResponseError.md) |  | [optional] 

## Methods

### NewCancel500Response

`func NewCancel500Response() *Cancel500Response`

NewCancel500Response instantiates a new Cancel500Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCancel500ResponseWithDefaults

`func NewCancel500ResponseWithDefaults() *Cancel500Response`

NewCancel500ResponseWithDefaults instantiates a new Cancel500Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetError

`func (o *Cancel500Response) GetError() Cancel400ResponseError`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *Cancel500Response) GetErrorOk() (*Cancel400ResponseError, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *Cancel500Response) SetError(v Cancel400ResponseError)`

SetError sets Error field to given value.

### HasError

`func (o *Cancel500Response) HasError() bool`

HasError returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


