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

// PrebookResponseDataRoomTypesInnerRatesInner struct for PrebookResponseDataRoomTypesInnerRatesInner
type PrebookResponseDataRoomTypesInnerRatesInner struct {
	RateId *string `json:"rateId,omitempty"`
	Name *string `json:"name,omitempty"`
	MaxOccupancy *int32 `json:"maxOccupancy,omitempty"`
	RetailRate *PrebookResponseDataRoomTypesInnerRatesInnerRetailRate `json:"retailRate,omitempty"`
	CancellationPolicies *PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies `json:"cancellationPolicies,omitempty"`
}

// NewPrebookResponseDataRoomTypesInnerRatesInner instantiates a new PrebookResponseDataRoomTypesInnerRatesInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPrebookResponseDataRoomTypesInnerRatesInner() *PrebookResponseDataRoomTypesInnerRatesInner {
	this := PrebookResponseDataRoomTypesInnerRatesInner{}
	return &this
}

// NewPrebookResponseDataRoomTypesInnerRatesInnerWithDefaults instantiates a new PrebookResponseDataRoomTypesInnerRatesInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPrebookResponseDataRoomTypesInnerRatesInnerWithDefaults() *PrebookResponseDataRoomTypesInnerRatesInner {
	this := PrebookResponseDataRoomTypesInnerRatesInner{}
	return &this
}

// GetRateId returns the RateId field value if set, zero value otherwise.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) GetRateId() string {
	if o == nil || isNil(o.RateId) {
		var ret string
		return ret
	}
	return *o.RateId
}

// GetRateIdOk returns a tuple with the RateId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) GetRateIdOk() (*string, bool) {
	if o == nil || isNil(o.RateId) {
    return nil, false
	}
	return o.RateId, true
}

// HasRateId returns a boolean if a field has been set.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) HasRateId() bool {
	if o != nil && !isNil(o.RateId) {
		return true
	}

	return false
}

// SetRateId gets a reference to the given string and assigns it to the RateId field.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) SetRateId(v string) {
	o.RateId = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) GetName() string {
	if o == nil || isNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) GetNameOk() (*string, bool) {
	if o == nil || isNil(o.Name) {
    return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) HasName() bool {
	if o != nil && !isNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) SetName(v string) {
	o.Name = &v
}

// GetMaxOccupancy returns the MaxOccupancy field value if set, zero value otherwise.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) GetMaxOccupancy() int32 {
	if o == nil || isNil(o.MaxOccupancy) {
		var ret int32
		return ret
	}
	return *o.MaxOccupancy
}

// GetMaxOccupancyOk returns a tuple with the MaxOccupancy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) GetMaxOccupancyOk() (*int32, bool) {
	if o == nil || isNil(o.MaxOccupancy) {
    return nil, false
	}
	return o.MaxOccupancy, true
}

// HasMaxOccupancy returns a boolean if a field has been set.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) HasMaxOccupancy() bool {
	if o != nil && !isNil(o.MaxOccupancy) {
		return true
	}

	return false
}

// SetMaxOccupancy gets a reference to the given int32 and assigns it to the MaxOccupancy field.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) SetMaxOccupancy(v int32) {
	o.MaxOccupancy = &v
}

// GetRetailRate returns the RetailRate field value if set, zero value otherwise.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) GetRetailRate() PrebookResponseDataRoomTypesInnerRatesInnerRetailRate {
	if o == nil || isNil(o.RetailRate) {
		var ret PrebookResponseDataRoomTypesInnerRatesInnerRetailRate
		return ret
	}
	return *o.RetailRate
}

// GetRetailRateOk returns a tuple with the RetailRate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) GetRetailRateOk() (*PrebookResponseDataRoomTypesInnerRatesInnerRetailRate, bool) {
	if o == nil || isNil(o.RetailRate) {
    return nil, false
	}
	return o.RetailRate, true
}

// HasRetailRate returns a boolean if a field has been set.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) HasRetailRate() bool {
	if o != nil && !isNil(o.RetailRate) {
		return true
	}

	return false
}

// SetRetailRate gets a reference to the given PrebookResponseDataRoomTypesInnerRatesInnerRetailRate and assigns it to the RetailRate field.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) SetRetailRate(v PrebookResponseDataRoomTypesInnerRatesInnerRetailRate) {
	o.RetailRate = &v
}

// GetCancellationPolicies returns the CancellationPolicies field value if set, zero value otherwise.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) GetCancellationPolicies() PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies {
	if o == nil || isNil(o.CancellationPolicies) {
		var ret PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies
		return ret
	}
	return *o.CancellationPolicies
}

// GetCancellationPoliciesOk returns a tuple with the CancellationPolicies field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) GetCancellationPoliciesOk() (*PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies, bool) {
	if o == nil || isNil(o.CancellationPolicies) {
    return nil, false
	}
	return o.CancellationPolicies, true
}

// HasCancellationPolicies returns a boolean if a field has been set.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) HasCancellationPolicies() bool {
	if o != nil && !isNil(o.CancellationPolicies) {
		return true
	}

	return false
}

// SetCancellationPolicies gets a reference to the given PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies and assigns it to the CancellationPolicies field.
func (o *PrebookResponseDataRoomTypesInnerRatesInner) SetCancellationPolicies(v PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies) {
	o.CancellationPolicies = &v
}

func (o PrebookResponseDataRoomTypesInnerRatesInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.RateId) {
		toSerialize["rateId"] = o.RateId
	}
	if !isNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !isNil(o.MaxOccupancy) {
		toSerialize["maxOccupancy"] = o.MaxOccupancy
	}
	if !isNil(o.RetailRate) {
		toSerialize["retailRate"] = o.RetailRate
	}
	if !isNil(o.CancellationPolicies) {
		toSerialize["cancellationPolicies"] = o.CancellationPolicies
	}
	return json.Marshal(toSerialize)
}

type NullablePrebookResponseDataRoomTypesInnerRatesInner struct {
	value *PrebookResponseDataRoomTypesInnerRatesInner
	isSet bool
}

func (v NullablePrebookResponseDataRoomTypesInnerRatesInner) Get() *PrebookResponseDataRoomTypesInnerRatesInner {
	return v.value
}

func (v *NullablePrebookResponseDataRoomTypesInnerRatesInner) Set(val *PrebookResponseDataRoomTypesInnerRatesInner) {
	v.value = val
	v.isSet = true
}

func (v NullablePrebookResponseDataRoomTypesInnerRatesInner) IsSet() bool {
	return v.isSet
}

func (v *NullablePrebookResponseDataRoomTypesInnerRatesInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePrebookResponseDataRoomTypesInnerRatesInner(val *PrebookResponseDataRoomTypesInnerRatesInner) *NullablePrebookResponseDataRoomTypesInnerRatesInner {
	return &NullablePrebookResponseDataRoomTypesInnerRatesInner{value: val, isSet: true}
}

func (v NullablePrebookResponseDataRoomTypesInnerRatesInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePrebookResponseDataRoomTypesInnerRatesInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


