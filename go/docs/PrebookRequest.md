# PrebookRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SessionId** | Pointer to **string** | session id retrievied from rates response | [optional] 
**RateId** | **string** | rate id retrieved from rates response | 

## Methods

### NewPrebookRequest

`func NewPrebookRequest(rateId string, ) *PrebookRequest`

NewPrebookRequest instantiates a new PrebookRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPrebookRequestWithDefaults

`func NewPrebookRequestWithDefaults() *PrebookRequest`

NewPrebookRequestWithDefaults instantiates a new PrebookRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSessionId

`func (o *PrebookRequest) GetSessionId() string`

GetSessionId returns the SessionId field if non-nil, zero value otherwise.

### GetSessionIdOk

`func (o *PrebookRequest) GetSessionIdOk() (*string, bool)`

GetSessionIdOk returns a tuple with the SessionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSessionId

`func (o *PrebookRequest) SetSessionId(v string)`

SetSessionId sets SessionId field to given value.

### HasSessionId

`func (o *PrebookRequest) HasSessionId() bool`

HasSessionId returns a boolean if a field has been set.

### GetRateId

`func (o *PrebookRequest) GetRateId() string`

GetRateId returns the RateId field if non-nil, zero value otherwise.

### GetRateIdOk

`func (o *PrebookRequest) GetRateIdOk() (*string, bool)`

GetRateIdOk returns a tuple with the RateId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateId

`func (o *PrebookRequest) SetRateId(v string)`

SetRateId sets RateId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


