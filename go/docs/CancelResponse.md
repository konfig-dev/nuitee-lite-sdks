# CancelResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BookingId** | Pointer to **string** |  | [optional] 
**CancellationFee** | Pointer to **int32** |  | [optional] 
**Currency** | Pointer to **string** |  | [optional] 
**RefundAmount** | Pointer to **float32** |  | [optional] 
**Status** | Pointer to **string** |  | [optional] 

## Methods

### NewCancelResponse

`func NewCancelResponse() *CancelResponse`

NewCancelResponse instantiates a new CancelResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCancelResponseWithDefaults

`func NewCancelResponseWithDefaults() *CancelResponse`

NewCancelResponseWithDefaults instantiates a new CancelResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBookingId

`func (o *CancelResponse) GetBookingId() string`

GetBookingId returns the BookingId field if non-nil, zero value otherwise.

### GetBookingIdOk

`func (o *CancelResponse) GetBookingIdOk() (*string, bool)`

GetBookingIdOk returns a tuple with the BookingId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBookingId

`func (o *CancelResponse) SetBookingId(v string)`

SetBookingId sets BookingId field to given value.

### HasBookingId

`func (o *CancelResponse) HasBookingId() bool`

HasBookingId returns a boolean if a field has been set.

### GetCancellationFee

`func (o *CancelResponse) GetCancellationFee() int32`

GetCancellationFee returns the CancellationFee field if non-nil, zero value otherwise.

### GetCancellationFeeOk

`func (o *CancelResponse) GetCancellationFeeOk() (*int32, bool)`

GetCancellationFeeOk returns a tuple with the CancellationFee field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCancellationFee

`func (o *CancelResponse) SetCancellationFee(v int32)`

SetCancellationFee sets CancellationFee field to given value.

### HasCancellationFee

`func (o *CancelResponse) HasCancellationFee() bool`

HasCancellationFee returns a boolean if a field has been set.

### GetCurrency

`func (o *CancelResponse) GetCurrency() string`

GetCurrency returns the Currency field if non-nil, zero value otherwise.

### GetCurrencyOk

`func (o *CancelResponse) GetCurrencyOk() (*string, bool)`

GetCurrencyOk returns a tuple with the Currency field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCurrency

`func (o *CancelResponse) SetCurrency(v string)`

SetCurrency sets Currency field to given value.

### HasCurrency

`func (o *CancelResponse) HasCurrency() bool`

HasCurrency returns a boolean if a field has been set.

### GetRefundAmount

`func (o *CancelResponse) GetRefundAmount() float32`

GetRefundAmount returns the RefundAmount field if non-nil, zero value otherwise.

### GetRefundAmountOk

`func (o *CancelResponse) GetRefundAmountOk() (*float32, bool)`

GetRefundAmountOk returns a tuple with the RefundAmount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRefundAmount

`func (o *CancelResponse) SetRefundAmount(v float32)`

SetRefundAmount sets RefundAmount field to given value.

### HasRefundAmount

`func (o *CancelResponse) HasRefundAmount() bool`

HasRefundAmount returns a boolean if a field has been set.

### GetStatus

`func (o *CancelResponse) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CancelResponse) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CancelResponse) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *CancelResponse) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


