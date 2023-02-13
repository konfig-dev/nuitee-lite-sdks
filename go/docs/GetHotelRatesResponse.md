# GetHotelRatesResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**[]GetHotelRatesResponseDataInner**](GetHotelRatesResponseDataInner.md) |  | [optional] 
**GuestLevel** | Pointer to **int32** | guests loyalty level granting them discounts and benefits | [optional] 
**Sandbox** | Pointer to **bool** |  | [optional] 
**SessionId** | Pointer to **string** |  | [optional] 

## Methods

### NewGetHotelRatesResponse

`func NewGetHotelRatesResponse() *GetHotelRatesResponse`

NewGetHotelRatesResponse instantiates a new GetHotelRatesResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetHotelRatesResponseWithDefaults

`func NewGetHotelRatesResponseWithDefaults() *GetHotelRatesResponse`

NewGetHotelRatesResponseWithDefaults instantiates a new GetHotelRatesResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *GetHotelRatesResponse) GetData() []GetHotelRatesResponseDataInner`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *GetHotelRatesResponse) GetDataOk() (*[]GetHotelRatesResponseDataInner, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *GetHotelRatesResponse) SetData(v []GetHotelRatesResponseDataInner)`

SetData sets Data field to given value.

### HasData

`func (o *GetHotelRatesResponse) HasData() bool`

HasData returns a boolean if a field has been set.

### GetGuestLevel

`func (o *GetHotelRatesResponse) GetGuestLevel() int32`

GetGuestLevel returns the GuestLevel field if non-nil, zero value otherwise.

### GetGuestLevelOk

`func (o *GetHotelRatesResponse) GetGuestLevelOk() (*int32, bool)`

GetGuestLevelOk returns a tuple with the GuestLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestLevel

`func (o *GetHotelRatesResponse) SetGuestLevel(v int32)`

SetGuestLevel sets GuestLevel field to given value.

### HasGuestLevel

`func (o *GetHotelRatesResponse) HasGuestLevel() bool`

HasGuestLevel returns a boolean if a field has been set.

### GetSandbox

`func (o *GetHotelRatesResponse) GetSandbox() bool`

GetSandbox returns the Sandbox field if non-nil, zero value otherwise.

### GetSandboxOk

`func (o *GetHotelRatesResponse) GetSandboxOk() (*bool, bool)`

GetSandboxOk returns a tuple with the Sandbox field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSandbox

`func (o *GetHotelRatesResponse) SetSandbox(v bool)`

SetSandbox sets Sandbox field to given value.

### HasSandbox

`func (o *GetHotelRatesResponse) HasSandbox() bool`

HasSandbox returns a boolean if a field has been set.

### GetSessionId

`func (o *GetHotelRatesResponse) GetSessionId() string`

GetSessionId returns the SessionId field if non-nil, zero value otherwise.

### GetSessionIdOk

`func (o *GetHotelRatesResponse) GetSessionIdOk() (*string, bool)`

GetSessionIdOk returns a tuple with the SessionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSessionId

`func (o *GetHotelRatesResponse) SetSessionId(v string)`

SetSessionId sets SessionId field to given value.

### HasSessionId

`func (o *GetHotelRatesResponse) HasSessionId() bool`

HasSessionId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


