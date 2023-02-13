# PrebookResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**PrebookResponseData**](PrebookResponseData.md) |  | [optional] 
**GuestLevel** | Pointer to **int32** | guests loyalty level granting them discounts and benefit | [optional] 
**Sandbox** | Pointer to **bool** |  | [optional] 

## Methods

### NewPrebookResponse

`func NewPrebookResponse() *PrebookResponse`

NewPrebookResponse instantiates a new PrebookResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPrebookResponseWithDefaults

`func NewPrebookResponseWithDefaults() *PrebookResponse`

NewPrebookResponseWithDefaults instantiates a new PrebookResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *PrebookResponse) GetData() PrebookResponseData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *PrebookResponse) GetDataOk() (*PrebookResponseData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *PrebookResponse) SetData(v PrebookResponseData)`

SetData sets Data field to given value.

### HasData

`func (o *PrebookResponse) HasData() bool`

HasData returns a boolean if a field has been set.

### GetGuestLevel

`func (o *PrebookResponse) GetGuestLevel() int32`

GetGuestLevel returns the GuestLevel field if non-nil, zero value otherwise.

### GetGuestLevelOk

`func (o *PrebookResponse) GetGuestLevelOk() (*int32, bool)`

GetGuestLevelOk returns a tuple with the GuestLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestLevel

`func (o *PrebookResponse) SetGuestLevel(v int32)`

SetGuestLevel sets GuestLevel field to given value.

### HasGuestLevel

`func (o *PrebookResponse) HasGuestLevel() bool`

HasGuestLevel returns a boolean if a field has been set.

### GetSandbox

`func (o *PrebookResponse) GetSandbox() bool`

GetSandbox returns the Sandbox field if non-nil, zero value otherwise.

### GetSandboxOk

`func (o *PrebookResponse) GetSandboxOk() (*bool, bool)`

GetSandboxOk returns a tuple with the Sandbox field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSandbox

`func (o *PrebookResponse) SetSandbox(v bool)`

SetSandbox sets Sandbox field to given value.

### HasSandbox

`func (o *PrebookResponse) HasSandbox() bool`

HasSandbox returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


