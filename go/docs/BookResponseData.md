# BookResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BookingId** | Pointer to **string** |  | [optional] 
**Status** | Pointer to **string** |  | [optional] 
**HotelConfirmationCode** | Pointer to **string** |  | [optional] 
**Checkin** | Pointer to **string** |  | [optional] 
**Checkout** | Pointer to **string** |  | [optional] 
**Hotel** | Pointer to [**BookResponseDataHotel**](BookResponseDataHotel.md) |  | [optional] 
**BookedRooms** | Pointer to [**[]BookResponseDataBookedRoomsInner**](BookResponseDataBookedRoomsInner.md) |  | [optional] 
**GuestInfo** | Pointer to [**BookResponseDataGuestInfo**](BookResponseDataGuestInfo.md) |  | [optional] 
**CreatedAt** | Pointer to **string** |  | [optional] 
**Cancellation** | Pointer to [**BookResponseDataCancellation**](BookResponseDataCancellation.md) |  | [optional] 
**CancellationPolicies** | Pointer to [**BookResponseDataCancellationPolicies**](BookResponseDataCancellationPolicies.md) |  | [optional] 
**Price** | Pointer to **float32** |  | [optional] 

## Methods

### NewBookResponseData

`func NewBookResponseData() *BookResponseData`

NewBookResponseData instantiates a new BookResponseData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBookResponseDataWithDefaults

`func NewBookResponseDataWithDefaults() *BookResponseData`

NewBookResponseDataWithDefaults instantiates a new BookResponseData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBookingId

`func (o *BookResponseData) GetBookingId() string`

GetBookingId returns the BookingId field if non-nil, zero value otherwise.

### GetBookingIdOk

`func (o *BookResponseData) GetBookingIdOk() (*string, bool)`

GetBookingIdOk returns a tuple with the BookingId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookingId

`func (o *BookResponseData) SetBookingId(v string)`

SetBookingId sets BookingId field to given value.

### HasBookingId

`func (o *BookResponseData) HasBookingId() bool`

HasBookingId returns a boolean if a field has been set.

### GetStatus

`func (o *BookResponseData) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *BookResponseData) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *BookResponseData) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *BookResponseData) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetHotelConfirmationCode

`func (o *BookResponseData) GetHotelConfirmationCode() string`

GetHotelConfirmationCode returns the HotelConfirmationCode field if non-nil, zero value otherwise.

### GetHotelConfirmationCodeOk

`func (o *BookResponseData) GetHotelConfirmationCodeOk() (*string, bool)`

GetHotelConfirmationCodeOk returns a tuple with the HotelConfirmationCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelConfirmationCode

`func (o *BookResponseData) SetHotelConfirmationCode(v string)`

SetHotelConfirmationCode sets HotelConfirmationCode field to given value.

### HasHotelConfirmationCode

`func (o *BookResponseData) HasHotelConfirmationCode() bool`

HasHotelConfirmationCode returns a boolean if a field has been set.

### GetCheckin

`func (o *BookResponseData) GetCheckin() string`

GetCheckin returns the Checkin field if non-nil, zero value otherwise.

### GetCheckinOk

`func (o *BookResponseData) GetCheckinOk() (*string, bool)`

GetCheckinOk returns a tuple with the Checkin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCheckin

`func (o *BookResponseData) SetCheckin(v string)`

SetCheckin sets Checkin field to given value.

### HasCheckin

`func (o *BookResponseData) HasCheckin() bool`

HasCheckin returns a boolean if a field has been set.

### GetCheckout

`func (o *BookResponseData) GetCheckout() string`

GetCheckout returns the Checkout field if non-nil, zero value otherwise.

### GetCheckoutOk

`func (o *BookResponseData) GetCheckoutOk() (*string, bool)`

GetCheckoutOk returns a tuple with the Checkout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCheckout

`func (o *BookResponseData) SetCheckout(v string)`

SetCheckout sets Checkout field to given value.

### HasCheckout

`func (o *BookResponseData) HasCheckout() bool`

HasCheckout returns a boolean if a field has been set.

### GetHotel

`func (o *BookResponseData) GetHotel() BookResponseDataHotel`

GetHotel returns the Hotel field if non-nil, zero value otherwise.

### GetHotelOk

`func (o *BookResponseData) GetHotelOk() (*BookResponseDataHotel, bool)`

GetHotelOk returns a tuple with the Hotel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotel

`func (o *BookResponseData) SetHotel(v BookResponseDataHotel)`

SetHotel sets Hotel field to given value.

### HasHotel

`func (o *BookResponseData) HasHotel() bool`

HasHotel returns a boolean if a field has been set.

### GetBookedRooms

`func (o *BookResponseData) GetBookedRooms() []BookResponseDataBookedRoomsInner`

GetBookedRooms returns the BookedRooms field if non-nil, zero value otherwise.

### GetBookedRoomsOk

`func (o *BookResponseData) GetBookedRoomsOk() (*[]BookResponseDataBookedRoomsInner, bool)`

GetBookedRoomsOk returns a tuple with the BookedRooms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookedRooms

`func (o *BookResponseData) SetBookedRooms(v []BookResponseDataBookedRoomsInner)`

SetBookedRooms sets BookedRooms field to given value.

### HasBookedRooms

`func (o *BookResponseData) HasBookedRooms() bool`

HasBookedRooms returns a boolean if a field has been set.

### GetGuestInfo

`func (o *BookResponseData) GetGuestInfo() BookResponseDataGuestInfo`

GetGuestInfo returns the GuestInfo field if non-nil, zero value otherwise.

### GetGuestInfoOk

`func (o *BookResponseData) GetGuestInfoOk() (*BookResponseDataGuestInfo, bool)`

GetGuestInfoOk returns a tuple with the GuestInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestInfo

`func (o *BookResponseData) SetGuestInfo(v BookResponseDataGuestInfo)`

SetGuestInfo sets GuestInfo field to given value.

### HasGuestInfo

`func (o *BookResponseData) HasGuestInfo() bool`

HasGuestInfo returns a boolean if a field has been set.

### GetCreatedAt

`func (o *BookResponseData) GetCreatedAt() string`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *BookResponseData) GetCreatedAtOk() (*string, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *BookResponseData) SetCreatedAt(v string)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *BookResponseData) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetCancellation

`func (o *BookResponseData) GetCancellation() BookResponseDataCancellation`

GetCancellation returns the Cancellation field if non-nil, zero value otherwise.

### GetCancellationOk

`func (o *BookResponseData) GetCancellationOk() (*BookResponseDataCancellation, bool)`

GetCancellationOk returns a tuple with the Cancellation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancellation

`func (o *BookResponseData) SetCancellation(v BookResponseDataCancellation)`

SetCancellation sets Cancellation field to given value.

### HasCancellation

`func (o *BookResponseData) HasCancellation() bool`

HasCancellation returns a boolean if a field has been set.

### GetCancellationPolicies

`func (o *BookResponseData) GetCancellationPolicies() BookResponseDataCancellationPolicies`

GetCancellationPolicies returns the CancellationPolicies field if non-nil, zero value otherwise.

### GetCancellationPoliciesOk

`func (o *BookResponseData) GetCancellationPoliciesOk() (*BookResponseDataCancellationPolicies, bool)`

GetCancellationPoliciesOk returns a tuple with the CancellationPolicies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancellationPolicies

`func (o *BookResponseData) SetCancellationPolicies(v BookResponseDataCancellationPolicies)`

SetCancellationPolicies sets CancellationPolicies field to given value.

### HasCancellationPolicies

`func (o *BookResponseData) HasCancellationPolicies() bool`

HasCancellationPolicies returns a boolean if a field has been set.

### GetPrice

`func (o *BookResponseData) GetPrice() float32`

GetPrice returns the Price field if non-nil, zero value otherwise.

### GetPriceOk

`func (o *BookResponseData) GetPriceOk() (*float32, bool)`

GetPriceOk returns a tuple with the Price field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrice

`func (o *BookResponseData) SetPrice(v float32)`

SetPrice sets Price field to given value.

### HasPrice

`func (o *BookResponseData) HasPrice() bool`

HasPrice returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


