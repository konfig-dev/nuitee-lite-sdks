/*
Lite API

lite api hotel booking api

API version: 1.0.0
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package nuitee

import (
	"encoding/json"
)

// GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner struct for GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner
type GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner struct {
	CancelTime *string `json:"cancelTime,omitempty"`
	Amount *float32 `json:"amount,omitempty"`
	Type *string `json:"type,omitempty"`
	Currency *string `json:"currency,omitempty"`
}

// NewGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner instantiates a new GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner() *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner {
	this := GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner{}
	return &this
}

// NewGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInnerWithDefaults instantiates a new GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInnerWithDefaults() *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner {
	this := GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner{}
	return &this
}

// GetCancelTime returns the CancelTime field value if set, zero value otherwise.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) GetCancelTime() string {
	if o == nil || isNil(o.CancelTime) {
		var ret string
		return ret
	}
	return *o.CancelTime
}

// GetCancelTimeOk returns a tuple with the CancelTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) GetCancelTimeOk() (*string, bool) {
	if o == nil || isNil(o.CancelTime) {
    return nil, false
	}
	return o.CancelTime, true
}

// HasCancelTime returns a boolean if a field has been set.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) HasCancelTime() bool {
	if o != nil && !isNil(o.CancelTime) {
		return true
	}

	return false
}

// SetCancelTime gets a reference to the given string and assigns it to the CancelTime field.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) SetCancelTime(v string) {
	o.CancelTime = &v
}

// GetAmount returns the Amount field value if set, zero value otherwise.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) GetAmount() float32 {
	if o == nil || isNil(o.Amount) {
		var ret float32
		return ret
	}
	return *o.Amount
}

// GetAmountOk returns a tuple with the Amount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) GetAmountOk() (*float32, bool) {
	if o == nil || isNil(o.Amount) {
    return nil, false
	}
	return o.Amount, true
}

// HasAmount returns a boolean if a field has been set.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) HasAmount() bool {
	if o != nil && !isNil(o.Amount) {
		return true
	}

	return false
}

// SetAmount gets a reference to the given float32 and assigns it to the Amount field.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) SetAmount(v float32) {
	o.Amount = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) GetType() string {
	if o == nil || isNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) GetTypeOk() (*string, bool) {
	if o == nil || isNil(o.Type) {
    return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) HasType() bool {
	if o != nil && !isNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) SetType(v string) {
	o.Type = &v
}

// GetCurrency returns the Currency field value if set, zero value otherwise.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) GetCurrency() string {
	if o == nil || isNil(o.Currency) {
		var ret string
		return ret
	}
	return *o.Currency
}

// GetCurrencyOk returns a tuple with the Currency field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) GetCurrencyOk() (*string, bool) {
	if o == nil || isNil(o.Currency) {
    return nil, false
	}
	return o.Currency, true
}

// HasCurrency returns a boolean if a field has been set.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) HasCurrency() bool {
	if o != nil && !isNil(o.Currency) {
		return true
	}

	return false
}

// SetCurrency gets a reference to the given string and assigns it to the Currency field.
func (o *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) SetCurrency(v string) {
	o.Currency = &v
}

func (o GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.CancelTime) {
		toSerialize["cancelTime"] = o.CancelTime
	}
	if !isNil(o.Amount) {
		toSerialize["amount"] = o.Amount
	}
	if !isNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	if !isNil(o.Currency) {
		toSerialize["currency"] = o.Currency
	}
	return json.Marshal(toSerialize)
}

type NullableGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner struct {
	value *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner
	isSet bool
}

func (v NullableGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) Get() *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner {
	return v.value
}

func (v *NullableGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) Set(val *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) {
	v.value = val
	v.isSet = true
}

func (v NullableGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) IsSet() bool {
	return v.isSet
}

func (v *NullableGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner(val *GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) *NullableGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner {
	return &NullableGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner{value: val, isSet: true}
}

func (v NullableGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


