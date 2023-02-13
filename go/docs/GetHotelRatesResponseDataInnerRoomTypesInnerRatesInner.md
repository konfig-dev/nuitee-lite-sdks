# GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RateId** | Pointer to **string** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**MaxOccupancy** | Pointer to **int32** |  | [optional] 
**RetailRate** | Pointer to [**GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerRetailRate**](GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerRetailRate.md) |  | [optional] 
**CancellationPolicies** | Pointer to [**GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies**](GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies.md) |  | [optional] 

## Methods

### NewGetHotelRatesResponseDataInnerRoomTypesInnerRatesInner

`func NewGetHotelRatesResponseDataInnerRoomTypesInnerRatesInner() *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner`

NewGetHotelRatesResponseDataInnerRoomTypesInnerRatesInner instantiates a new GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerWithDefaults

`func NewGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerWithDefaults() *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner`

NewGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerWithDefaults instantiates a new GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRateId

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) GetRateId() string`

GetRateId returns the RateId field if non-nil, zero value otherwise.

### GetRateIdOk

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) GetRateIdOk() (*string, bool)`

GetRateIdOk returns a tuple with the RateId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRateId

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) SetRateId(v string)`

SetRateId sets RateId field to given value.

### HasRateId

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) HasRateId() bool`

HasRateId returns a boolean if a field has been set.

### GetName

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetMaxOccupancy

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) GetMaxOccupancy() int32`

GetMaxOccupancy returns the MaxOccupancy field if non-nil, zero value otherwise.

### GetMaxOccupancyOk

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) GetMaxOccupancyOk() (*int32, bool)`

GetMaxOccupancyOk returns a tuple with the MaxOccupancy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxOccupancy

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) SetMaxOccupancy(v int32)`

SetMaxOccupancy sets MaxOccupancy field to given value.

### HasMaxOccupancy

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) HasMaxOccupancy() bool`

HasMaxOccupancy returns a boolean if a field has been set.

### GetRetailRate

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) GetRetailRate() GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerRetailRate`

GetRetailRate returns the RetailRate field if non-nil, zero value otherwise.

### GetRetailRateOk

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) GetRetailRateOk() (*GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerRetailRate, bool)`

GetRetailRateOk returns a tuple with the RetailRate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetailRate

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) SetRetailRate(v GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerRetailRate)`

SetRetailRate sets RetailRate field to given value.

### HasRetailRate

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) HasRetailRate() bool`

HasRetailRate returns a boolean if a field has been set.

### GetCancellationPolicies

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) GetCancellationPolicies() GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies`

GetCancellationPolicies returns the CancellationPolicies field if non-nil, zero value otherwise.

### GetCancellationPoliciesOk

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) GetCancellationPoliciesOk() (*GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies, bool)`

GetCancellationPoliciesOk returns a tuple with the CancellationPolicies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancellationPolicies

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) SetCancellationPolicies(v GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies)`

SetCancellationPolicies sets CancellationPolicies field to given value.

### HasCancellationPolicies

`func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner) HasCancellationPolicies() bool`

HasCancellationPolicies returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


