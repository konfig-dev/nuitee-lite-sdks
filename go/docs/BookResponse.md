# BookResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**BookResponseData**](BookResponseData.md) |  | [optional] 
**GuestLevel** | Pointer to **int32** | guests loyalty level granting them discounts and benefit | [optional] 
**Sandbox** | Pointer to **bool** |  | [optional] 

## Methods

### NewBookResponse

`func NewBookResponse() *BookResponse`

NewBookResponse instantiates a new BookResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBookResponseWithDefaults

`func NewBookResponseWithDefaults() *BookResponse`

NewBookResponseWithDefaults instantiates a new BookResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *BookResponse) GetData() BookResponseData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *BookResponse) GetDataOk() (*BookResponseData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *BookResponse) SetData(v BookResponseData)`

SetData sets Data field to given value.

### HasData

`func (o *BookResponse) HasData() bool`

HasData returns a boolean if a field has been set.

### GetGuestLevel

`func (o *BookResponse) GetGuestLevel() int32`

GetGuestLevel returns the GuestLevel field if non-nil, zero value otherwise.

### GetGuestLevelOk

`func (o *BookResponse) GetGuestLevelOk() (*int32, bool)`

GetGuestLevelOk returns a tuple with the GuestLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestLevel

`func (o *BookResponse) SetGuestLevel(v int32)`

SetGuestLevel sets GuestLevel field to given value.

### HasGuestLevel

`func (o *BookResponse) HasGuestLevel() bool`

HasGuestLevel returns a boolean if a field has been set.

### GetSandbox

`func (o *BookResponse) GetSandbox() bool`

GetSandbox returns the Sandbox field if non-nil, zero value otherwise.

### GetSandboxOk

`func (o *BookResponse) GetSandboxOk() (*bool, bool)`

GetSandboxOk returns a tuple with the Sandbox field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSandbox

`func (o *BookResponse) SetSandbox(v bool)`

SetSandbox sets Sandbox field to given value.

### HasSandbox

`func (o *BookResponse) HasSandbox() bool`

HasSandbox returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


