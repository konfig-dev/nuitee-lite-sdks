# BookRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PrebookId** | **string** | prebook id retrived from prebook response | 
**SessionId** | Pointer to **string** | session id retrieved from rates response | [optional] 
**GuestInfo** | Pointer to [**BookRequestGuestInfo**](BookRequestGuestInfo.md) |  | [optional] 
**RateId** | **string** | rate id retrieved from prebook response | 

## Methods

### NewBookRequest

`func NewBookRequest(prebookId string, rateId string, ) *BookRequest`

NewBookRequest instantiates a new BookRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBookRequestWithDefaults

`func NewBookRequestWithDefaults() *BookRequest`

NewBookRequestWithDefaults instantiates a new BookRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPrebookId

`func (o *BookRequest) GetPrebookId() string`

GetPrebookId returns the PrebookId field if non-nil, zero value otherwise.

### GetPrebookIdOk

`func (o *BookRequest) GetPrebookIdOk() (*string, bool)`

GetPrebookIdOk returns a tuple with the PrebookId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrebookId

`func (o *BookRequest) SetPrebookId(v string)`

SetPrebookId sets PrebookId field to given value.


### GetSessionId

`func (o *BookRequest) GetSessionId() string`

GetSessionId returns the SessionId field if non-nil, zero value otherwise.

### GetSessionIdOk

`func (o *BookRequest) GetSessionIdOk() (*string, bool)`

GetSessionIdOk returns a tuple with the SessionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSessionId

`func (o *BookRequest) SetSessionId(v string)`

SetSessionId sets SessionId field to given value.

### HasSessionId

`func (o *BookRequest) HasSessionId() bool`

HasSessionId returns a boolean if a field has been set.

### GetGuestInfo

`func (o *BookRequest) GetGuestInfo() BookRequestGuestInfo`

GetGuestInfo returns the GuestInfo field if non-nil, zero value otherwise.

### GetGuestInfoOk

`func (o *BookRequest) GetGuestInfoOk() (*BookRequestGuestInfo, bool)`

GetGuestInfoOk returns a tuple with the GuestInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestInfo

`func (o *BookRequest) SetGuestInfo(v BookRequestGuestInfo)`

SetGuestInfo sets GuestInfo field to given value.

### HasGuestInfo

`func (o *BookRequest) HasGuestInfo() bool`

HasGuestInfo returns a boolean if a field has been set.

### GetRateId

`func (o *BookRequest) GetRateId() string`

GetRateId returns the RateId field if non-nil, zero value otherwise.

### GetRateIdOk

`func (o *BookRequest) GetRateIdOk() (*string, bool)`

GetRateIdOk returns a tuple with the RateId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateId

`func (o *BookRequest) SetRateId(v string)`

SetRateId sets RateId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


