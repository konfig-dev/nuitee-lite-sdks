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

// RetrieveResponseDataBookedRoomsInnerRate struct for RetrieveResponseDataBookedRoomsInnerRate
type RetrieveResponseDataBookedRoomsInnerRate struct {
	MaxOccupancy *int32 `json:"maxOccupancy,omitempty"`
	RetailRate *BookResponseDataBookedRoomsInnerRateRetailRate `json:"retailRate,omitempty"`
}

// NewRetrieveResponseDataBookedRoomsInnerRate instantiates a new RetrieveResponseDataBookedRoomsInnerRate object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRetrieveResponseDataBookedRoomsInnerRate() *RetrieveResponseDataBookedRoomsInnerRate {
	this := RetrieveResponseDataBookedRoomsInnerRate{}
	return &this
}

// NewRetrieveResponseDataBookedRoomsInnerRateWithDefaults instantiates a new RetrieveResponseDataBookedRoomsInnerRate object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRetrieveResponseDataBookedRoomsInnerRateWithDefaults() *RetrieveResponseDataBookedRoomsInnerRate {
	this := RetrieveResponseDataBookedRoomsInnerRate{}
	return &this
}

// GetMaxOccupancy returns the MaxOccupancy field value if set, zero value otherwise.
func (o *RetrieveResponseDataBookedRoomsInnerRate) GetMaxOccupancy() int32 {
	if o == nil || isNil(o.MaxOccupancy) {
		var ret int32
		return ret
	}
	return *o.MaxOccupancy
}

// GetMaxOccupancyOk returns a tuple with the MaxOccupancy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RetrieveResponseDataBookedRoomsInnerRate) GetMaxOccupancyOk() (*int32, bool) {
	if o == nil || isNil(o.MaxOccupancy) {
    return nil, false
	}
	return o.MaxOccupancy, true
}

// HasMaxOccupancy returns a boolean if a field has been set.
func (o *RetrieveResponseDataBookedRoomsInnerRate) HasMaxOccupancy() bool {
	if o != nil && !isNil(o.MaxOccupancy) {
		return true
	}

	return false
}

// SetMaxOccupancy gets a reference to the given int32 and assigns it to the MaxOccupancy field.
func (o *RetrieveResponseDataBookedRoomsInnerRate) SetMaxOccupancy(v int32) {
	o.MaxOccupancy = &v
}

// GetRetailRate returns the RetailRate field value if set, zero value otherwise.
func (o *RetrieveResponseDataBookedRoomsInnerRate) GetRetailRate() BookResponseDataBookedRoomsInnerRateRetailRate {
	if o == nil || isNil(o.RetailRate) {
		var ret BookResponseDataBookedRoomsInnerRateRetailRate
		return ret
	}
	return *o.RetailRate
}

// GetRetailRateOk returns a tuple with the RetailRate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RetrieveResponseDataBookedRoomsInnerRate) GetRetailRateOk() (*BookResponseDataBookedRoomsInnerRateRetailRate, bool) {
	if o == nil || isNil(o.RetailRate) {
    return nil, false
	}
	return o.RetailRate, true
}

// HasRetailRate returns a boolean if a field has been set.
func (o *RetrieveResponseDataBookedRoomsInnerRate) HasRetailRate() bool {
	if o != nil && !isNil(o.RetailRate) {
		return true
	}

	return false
}

// SetRetailRate gets a reference to the given BookResponseDataBookedRoomsInnerRateRetailRate and assigns it to the RetailRate field.
func (o *RetrieveResponseDataBookedRoomsInnerRate) SetRetailRate(v BookResponseDataBookedRoomsInnerRateRetailRate) {
	o.RetailRate = &v
}

func (o RetrieveResponseDataBookedRoomsInnerRate) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.MaxOccupancy) {
		toSerialize["maxOccupancy"] = o.MaxOccupancy
	}
	if !isNil(o.RetailRate) {
		toSerialize["retailRate"] = o.RetailRate
	}
	return json.Marshal(toSerialize)
}

type NullableRetrieveResponseDataBookedRoomsInnerRate struct {
	value *RetrieveResponseDataBookedRoomsInnerRate
	isSet bool
}

func (v NullableRetrieveResponseDataBookedRoomsInnerRate) Get() *RetrieveResponseDataBookedRoomsInnerRate {
	return v.value
}

func (v *NullableRetrieveResponseDataBookedRoomsInnerRate) Set(val *RetrieveResponseDataBookedRoomsInnerRate) {
	v.value = val
	v.isSet = true
}

func (v NullableRetrieveResponseDataBookedRoomsInnerRate) IsSet() bool {
	return v.isSet
}

func (v *NullableRetrieveResponseDataBookedRoomsInnerRate) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRetrieveResponseDataBookedRoomsInnerRate(val *RetrieveResponseDataBookedRoomsInnerRate) *NullableRetrieveResponseDataBookedRoomsInnerRate {
	return &NullableRetrieveResponseDataBookedRoomsInnerRate{value: val, isSet: true}
}

func (v NullableRetrieveResponseDataBookedRoomsInnerRate) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRetrieveResponseDataBookedRoomsInnerRate) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


