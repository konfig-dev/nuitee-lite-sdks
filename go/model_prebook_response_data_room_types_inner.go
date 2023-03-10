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

// PrebookResponseDataRoomTypesInner struct for PrebookResponseDataRoomTypesInner
type PrebookResponseDataRoomTypesInner struct {
	MaxOccupancy *int32 `json:"maxOccupancy,omitempty"`
	Rates []PrebookResponseDataRoomTypesInnerRatesInner `json:"rates,omitempty"`
}

// NewPrebookResponseDataRoomTypesInner instantiates a new PrebookResponseDataRoomTypesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPrebookResponseDataRoomTypesInner() *PrebookResponseDataRoomTypesInner {
	this := PrebookResponseDataRoomTypesInner{}
	return &this
}

// NewPrebookResponseDataRoomTypesInnerWithDefaults instantiates a new PrebookResponseDataRoomTypesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPrebookResponseDataRoomTypesInnerWithDefaults() *PrebookResponseDataRoomTypesInner {
	this := PrebookResponseDataRoomTypesInner{}
	return &this
}

// GetMaxOccupancy returns the MaxOccupancy field value if set, zero value otherwise.
func (o *PrebookResponseDataRoomTypesInner) GetMaxOccupancy() int32 {
	if o == nil || isNil(o.MaxOccupancy) {
		var ret int32
		return ret
	}
	return *o.MaxOccupancy
}

// GetMaxOccupancyOk returns a tuple with the MaxOccupancy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseDataRoomTypesInner) GetMaxOccupancyOk() (*int32, bool) {
	if o == nil || isNil(o.MaxOccupancy) {
    return nil, false
	}
	return o.MaxOccupancy, true
}

// HasMaxOccupancy returns a boolean if a field has been set.
func (o *PrebookResponseDataRoomTypesInner) HasMaxOccupancy() bool {
	if o != nil && !isNil(o.MaxOccupancy) {
		return true
	}

	return false
}

// SetMaxOccupancy gets a reference to the given int32 and assigns it to the MaxOccupancy field.
func (o *PrebookResponseDataRoomTypesInner) SetMaxOccupancy(v int32) {
	o.MaxOccupancy = &v
}

// GetRates returns the Rates field value if set, zero value otherwise.
func (o *PrebookResponseDataRoomTypesInner) GetRates() []PrebookResponseDataRoomTypesInnerRatesInner {
	if o == nil || isNil(o.Rates) {
		var ret []PrebookResponseDataRoomTypesInnerRatesInner
		return ret
	}
	return o.Rates
}

// GetRatesOk returns a tuple with the Rates field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseDataRoomTypesInner) GetRatesOk() ([]PrebookResponseDataRoomTypesInnerRatesInner, bool) {
	if o == nil || isNil(o.Rates) {
    return nil, false
	}
	return o.Rates, true
}

// HasRates returns a boolean if a field has been set.
func (o *PrebookResponseDataRoomTypesInner) HasRates() bool {
	if o != nil && !isNil(o.Rates) {
		return true
	}

	return false
}

// SetRates gets a reference to the given []PrebookResponseDataRoomTypesInnerRatesInner and assigns it to the Rates field.
func (o *PrebookResponseDataRoomTypesInner) SetRates(v []PrebookResponseDataRoomTypesInnerRatesInner) {
	o.Rates = v
}

func (o PrebookResponseDataRoomTypesInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.MaxOccupancy) {
		toSerialize["maxOccupancy"] = o.MaxOccupancy
	}
	if !isNil(o.Rates) {
		toSerialize["rates"] = o.Rates
	}
	return json.Marshal(toSerialize)
}

type NullablePrebookResponseDataRoomTypesInner struct {
	value *PrebookResponseDataRoomTypesInner
	isSet bool
}

func (v NullablePrebookResponseDataRoomTypesInner) Get() *PrebookResponseDataRoomTypesInner {
	return v.value
}

func (v *NullablePrebookResponseDataRoomTypesInner) Set(val *PrebookResponseDataRoomTypesInner) {
	v.value = val
	v.isSet = true
}

func (v NullablePrebookResponseDataRoomTypesInner) IsSet() bool {
	return v.isSet
}

func (v *NullablePrebookResponseDataRoomTypesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePrebookResponseDataRoomTypesInner(val *PrebookResponseDataRoomTypesInner) *NullablePrebookResponseDataRoomTypesInner {
	return &NullablePrebookResponseDataRoomTypesInner{value: val, isSet: true}
}

func (v NullablePrebookResponseDataRoomTypesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePrebookResponseDataRoomTypesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


