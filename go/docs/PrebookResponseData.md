# PrebookResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PrebookId** | Pointer to **string** |  | [optional] 
**HotelId** | Pointer to **string** |  | [optional] 
**Currency** | Pointer to **string** |  | [optional] 
**TermsAndConditions** | Pointer to **string** |  | [optional] 
**RoomTypes** | Pointer to [**[]PrebookResponseDataRoomTypesInner**](PrebookResponseDataRoomTypesInner.md) |  | [optional] 
**Price** | Pointer to **float32** |  | [optional] 
**PriceDifferencePercent** | Pointer to **float32** | the difference percentage if rate price has changed | [optional] 
**CancellationChanged** | Pointer to **bool** | has cancellation changed | [optional] 
**BoardChanged** | Pointer to **bool** | has board changed | [optional] 

## Methods

### NewPrebookResponseData

`func NewPrebookResponseData() *PrebookResponseData`

NewPrebookResponseData instantiates a new PrebookResponseData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPrebookResponseDataWithDefaults

`func NewPrebookResponseDataWithDefaults() *PrebookResponseData`

NewPrebookResponseDataWithDefaults instantiates a new PrebookResponseData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPrebookId

`func (o *PrebookResponseData) GetPrebookId() string`

GetPrebookId returns the PrebookId field if non-nil, zero value otherwise.

### GetPrebookIdOk

`func (o *PrebookResponseData) GetPrebookIdOk() (*string, bool)`

GetPrebookIdOk returns a tuple with the PrebookId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrebookId

`func (o *PrebookResponseData) SetPrebookId(v string)`

SetPrebookId sets PrebookId field to given value.

### HasPrebookId

`func (o *PrebookResponseData) HasPrebookId() bool`

HasPrebookId returns a boolean if a field has been set.

### GetHotelId

`func (o *PrebookResponseData) GetHotelId() string`

GetHotelId returns the HotelId field if non-nil, zero value otherwise.

### GetHotelIdOk

`func (o *PrebookResponseData) GetHotelIdOk() (*string, bool)`

GetHotelIdOk returns a tuple with the HotelId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelId

`func (o *PrebookResponseData) SetHotelId(v string)`

SetHotelId sets HotelId field to given value.

### HasHotelId

`func (o *PrebookResponseData) HasHotelId() bool`

HasHotelId returns a boolean if a field has been set.

### GetCurrency

`func (o *PrebookResponseData) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *PrebookResponseData) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *PrebookResponseData) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *PrebookResponseData) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetTermsAndConditions

`func (o *PrebookResponseData) GetTermsAndConditions() string`

GetTermsAndConditions returns the TermsAndConditions field if non-nil, zero value otherwise.

### GetTermsAndConditionsOk

`func (o *PrebookResponseData) GetTermsAndConditionsOk() (*string, bool)`

GetTermsAndConditionsOk returns a tuple with the TermsAndConditions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTermsAndConditions

`func (o *PrebookResponseData) SetTermsAndConditions(v string)`

SetTermsAndConditions sets TermsAndConditions field to given value.

### HasTermsAndConditions

`func (o *PrebookResponseData) HasTermsAndConditions() bool`

HasTermsAndConditions returns a boolean if a field has been set.

### GetRoomTypes

`func (o *PrebookResponseData) GetRoomTypes() []PrebookResponseDataRoomTypesInner`

GetRoomTypes returns the RoomTypes field if non-nil, zero value otherwise.

### GetRoomTypesOk

`func (o *PrebookResponseData) GetRoomTypesOk() (*[]PrebookResponseDataRoomTypesInner, bool)`

GetRoomTypesOk returns a tuple with the RoomTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRoomTypes

`func (o *PrebookResponseData) SetRoomTypes(v []PrebookResponseDataRoomTypesInner)`

SetRoomTypes sets RoomTypes field to given value.

### HasRoomTypes

`func (o *PrebookResponseData) HasRoomTypes() bool`

HasRoomTypes returns a boolean if a field has been set.

### GetPrice

`func (o *PrebookResponseData) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *PrebookResponseData) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *PrebookResponseData) SetPrice(v float32)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *PrebookResponseData) HasPrice() bool`

HasPrice returns a boolean if a field has been set.

### GetPriceDifferencePercent

`func (o *PrebookResponseData) GetPriceDifferencePercent() float32`

GetPriceDifferencePercent returns the PriceDifferencePercent field if non-nil, zero value otherwise.

### GetPriceDifferencePercentOk

`func (o *PrebookResponseData) GetPriceDifferencePercentOk() (*float32, bool)`

GetPriceDifferencePercentOk returns a tuple with the PriceDifferencePercent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriceDifferencePercent

`func (o *PrebookResponseData) SetPriceDifferencePercent(v float32)`

SetPriceDifferencePercent sets PriceDifferencePercent field to given value.

### HasPriceDifferencePercent

`func (o *PrebookResponseData) HasPriceDifferencePercent() bool`

HasPriceDifferencePercent returns a boolean if a field has been set.

### GetCancellationChanged

`func (o *PrebookResponseData) GetCancellationChanged() bool`

GetCancellationChanged returns the CancellationChanged field if non-nil, zero value otherwise.

### GetCancellationChangedOk

`func (o *PrebookResponseData) GetCancellationChangedOk() (*bool, bool)`

GetCancellationChangedOk returns a tuple with the CancellationChanged field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancellationChanged

`func (o *PrebookResponseData) SetCancellationChanged(v bool)`

SetCancellationChanged sets CancellationChanged field to given value.

### HasCancellationChanged

`func (o *PrebookResponseData) HasCancellationChanged() bool`

HasCancellationChanged returns a boolean if a field has been set.

### GetBoardChanged

`func (o *PrebookResponseData) GetBoardChanged() bool`

GetBoardChanged returns the BoardChanged field if non-nil, zero value otherwise.

### GetBoardChangedOk

`func (o *PrebookResponseData) GetBoardChangedOk() (*bool, bool)`

GetBoardChangedOk returns a tuple with the BoardChanged field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBoardChanged

`func (o *PrebookResponseData) SetBoardChanged(v bool)`

SetBoardChanged sets BoardChanged field to given value.

### HasBoardChanged

`func (o *PrebookResponseData) HasBoardChanged() bool`

HasBoardChanged returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


