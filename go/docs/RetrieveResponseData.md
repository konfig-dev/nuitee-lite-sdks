# RetrieveResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BookingId** | Pointer to **string** |  | [optional] 
**Status** | Pointer to **string** |  | [optional] 
**HotelConfirmationCode** | Pointer to **string** |  | [optional] 
**Checkin** | Pointer to **string** |  | [optional] 
**Checkout** | Pointer to **string** |  | [optional] 
**BookedRooms** | Pointer to [**[]RetrieveResponseDataBookedRoomsInner**](RetrieveResponseDataBookedRoomsInner.md) |  | [optional] 
**GuestInfo** | Pointer to [**BookResponseDataGuestInfo**](BookResponseDataGuestInfo.md) |  | [optional] 
**CreatedAt** | Pointer to **string** |  | [optional] 
**CancellationPolicies** | Pointer to [**RetrieveResponseDataCancellationPolicies**](RetrieveResponseDataCancellationPolicies.md) |  | [optional] 

## Methods

### NewRetrieveResponseData

`func NewRetrieveResponseData() *RetrieveResponseData`

NewRetrieveResponseData instantiates a new RetrieveResponseData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRetrieveResponseDataWithDefaults

`func NewRetrieveResponseDataWithDefaults() *RetrieveResponseData`

NewRetrieveResponseDataWithDefaults instantiates a new RetrieveResponseData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBookingId

`func (o *RetrieveResponseData) GetBookingId() string`

GetBookingId returns the BookingId field if non-nil, zero value otherwise.

### GetBookingIdOk

`func (o *RetrieveResponseData) GetBookingIdOk() (*string, bool)`

GetBookingIdOk returns a tuple with the BookingId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookingId

`func (o *RetrieveResponseData) SetBookingId(v string)`

SetBookingId sets BookingId field to given value.

### HasBookingId

`func (o *RetrieveResponseData) HasBookingId() bool`

HasBookingId returns a boolean if a field has been set.

### GetStatus

`func (o *RetrieveResponseData) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *RetrieveResponseData) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *RetrieveResponseData) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *RetrieveResponseData) HasStatus() bool`

HasStatus returns a boolean if a field has been set.

### GetHotelConfirmationCode

`func (o *RetrieveResponseData) GetHotelConfirmationCode() string`

GetHotelConfirmationCode returns the HotelConfirmationCode field if non-nil, zero value otherwise.

### GetHotelConfirmationCodeOk

`func (o *RetrieveResponseData) GetHotelConfirmationCodeOk() (*string, bool)`

GetHotelConfirmationCodeOk returns a tuple with the HotelConfirmationCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHotelConfirmationCode

`func (o *RetrieveResponseData) SetHotelConfirmationCode(v string)`

SetHotelConfirmationCode sets HotelConfirmationCode field to given value.

### HasHotelConfirmationCode

`func (o *RetrieveResponseData) HasHotelConfirmationCode() bool`

HasHotelConfirmationCode returns a boolean if a field has been set.

### GetCheckin

`func (o *RetrieveResponseData) GetCheckin() string`

GetCheckin returns the Checkin field if non-nil, zero value otherwise.

### GetCheckinOk

`func (o *RetrieveResponseData) GetCheckinOk() (*string, bool)`

GetCheckinOk returns a tuple with the Checkin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCheckin

`func (o *RetrieveResponseData) SetCheckin(v string)`

SetCheckin sets Checkin field to given value.

### HasCheckin

`func (o *RetrieveResponseData) HasCheckin() bool`

HasCheckin returns a boolean if a field has been set.

### GetCheckout

`func (o *RetrieveResponseData) GetCheckout() string`

GetCheckout returns the Checkout field if non-nil, zero value otherwise.

### GetCheckoutOk

`func (o *RetrieveResponseData) GetCheckoutOk() (*string, bool)`

GetCheckoutOk returns a tuple with the Checkout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCheckout

`func (o *RetrieveResponseData) SetCheckout(v string)`

SetCheckout sets Checkout field to given value.

### HasCheckout

`func (o *RetrieveResponseData) HasCheckout() bool`

HasCheckout returns a boolean if a field has been set.

### GetBookedRooms

`func (o *RetrieveResponseData) GetBookedRooms() []RetrieveResponseDataBookedRoomsInner`

GetBookedRooms returns the BookedRooms field if non-nil, zero value otherwise.

### GetBookedRoomsOk

`func (o *RetrieveResponseData) GetBookedRoomsOk() (*[]RetrieveResponseDataBookedRoomsInner, bool)`

GetBookedRoomsOk returns a tuple with the BookedRooms field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookedRooms

`func (o *RetrieveResponseData) SetBookedRooms(v []RetrieveResponseDataBookedRoomsInner)`

SetBookedRooms sets BookedRooms field to given value.

### HasBookedRooms

`func (o *RetrieveResponseData) HasBookedRooms() bool`

HasBookedRooms returns a boolean if a field has been set.

### GetGuestInfo

`func (o *RetrieveResponseData) GetGuestInfo() BookResponseDataGuestInfo`

GetGuestInfo returns the GuestInfo field if non-nil, zero value otherwise.

### GetGuestInfoOk

`func (o *RetrieveResponseData) GetGuestInfoOk() (*BookResponseDataGuestInfo, bool)`

GetGuestInfoOk returns a tuple with the GuestInfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestInfo

`func (o *RetrieveResponseData) SetGuestInfo(v BookResponseDataGuestInfo)`

SetGuestInfo sets GuestInfo field to given value.

### HasGuestInfo

`func (o *RetrieveResponseData) HasGuestInfo() bool`

HasGuestInfo returns a boolean if a field has been set.

### GetCreatedAt

`func (o *RetrieveResponseData) GetCreatedAt() string`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *RetrieveResponseData) GetCreatedAtOk() (*string, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *RetrieveResponseData) SetCreatedAt(v string)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *RetrieveResponseData) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### GetCancellationPolicies

`func (o *RetrieveResponseData) GetCancellationPolicies() RetrieveResponseDataCancellationPolicies`

GetCancellationPolicies returns the CancellationPolicies field if non-nil, zero value otherwise.

### GetCancellationPoliciesOk

`func (o *RetrieveResponseData) GetCancellationPoliciesOk() (*RetrieveResponseDataCancellationPolicies, bool)`

GetCancellationPoliciesOk returns a tuple with the CancellationPolicies field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancellationPolicies

`func (o *RetrieveResponseData) SetCancellationPolicies(v RetrieveResponseDataCancellationPolicies)`

SetCancellationPolicies sets CancellationPolicies field to given value.

### HasCancellationPolicies

`func (o *RetrieveResponseData) HasCancellationPolicies() bool`

HasCancellationPolicies returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


