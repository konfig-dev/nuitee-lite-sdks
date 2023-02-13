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

// PrebookResponse struct for PrebookResponse
type PrebookResponse struct {
	Data *PrebookResponseData `json:"data,omitempty"`
	// guests loyalty level granting them discounts and benefit
	GuestLevel *int32 `json:"guestLevel,omitempty"`
	Sandbox *bool `json:"sandbox,omitempty"`
}

// NewPrebookResponse instantiates a new PrebookResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPrebookResponse() *PrebookResponse {
	this := PrebookResponse{}
	return &this
}

// NewPrebookResponseWithDefaults instantiates a new PrebookResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPrebookResponseWithDefaults() *PrebookResponse {
	this := PrebookResponse{}
	return &this
}

// GetData returns the Data field value if set, zero value otherwise.
func (o *PrebookResponse) GetData() PrebookResponseData {
	if o == nil || isNil(o.Data) {
		var ret PrebookResponseData
		return ret
	}
	return *o.Data
}

// GetDataOk returns a tuple with the Data field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponse) GetDataOk() (*PrebookResponseData, bool) {
	if o == nil || isNil(o.Data) {
    return nil, false
	}
	return o.Data, true
}

// HasData returns a boolean if a field has been set.
func (o *PrebookResponse) HasData() bool {
	if o != nil && !isNil(o.Data) {
		return true
	}

	return false
}

// SetData gets a reference to the given PrebookResponseData and assigns it to the Data field.
func (o *PrebookResponse) SetData(v PrebookResponseData) {
	o.Data = &v
}

// GetGuestLevel returns the GuestLevel field value if set, zero value otherwise.
func (o *PrebookResponse) GetGuestLevel() int32 {
	if o == nil || isNil(o.GuestLevel) {
		var ret int32
		return ret
	}
	return *o.GuestLevel
}

// GetGuestLevelOk returns a tuple with the GuestLevel field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponse) GetGuestLevelOk() (*int32, bool) {
	if o == nil || isNil(o.GuestLevel) {
    return nil, false
	}
	return o.GuestLevel, true
}

// HasGuestLevel returns a boolean if a field has been set.
func (o *PrebookResponse) HasGuestLevel() bool {
	if o != nil && !isNil(o.GuestLevel) {
		return true
	}

	return false
}

// SetGuestLevel gets a reference to the given int32 and assigns it to the GuestLevel field.
func (o *PrebookResponse) SetGuestLevel(v int32) {
	o.GuestLevel = &v
}

// GetSandbox returns the Sandbox field value if set, zero value otherwise.
func (o *PrebookResponse) GetSandbox() bool {
	if o == nil || isNil(o.Sandbox) {
		var ret bool
		return ret
	}
	return *o.Sandbox
}

// GetSandboxOk returns a tuple with the Sandbox field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponse) GetSandboxOk() (*bool, bool) {
	if o == nil || isNil(o.Sandbox) {
    return nil, false
	}
	return o.Sandbox, true
}

// HasSandbox returns a boolean if a field has been set.
func (o *PrebookResponse) HasSandbox() bool {
	if o != nil && !isNil(o.Sandbox) {
		return true
	}

	return false
}

// SetSandbox gets a reference to the given bool and assigns it to the Sandbox field.
func (o *PrebookResponse) SetSandbox(v bool) {
	o.Sandbox = &v
}

func (o PrebookResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Data) {
		toSerialize["data"] = o.Data
	}
	if !isNil(o.GuestLevel) {
		toSerialize["guestLevel"] = o.GuestLevel
	}
	if !isNil(o.Sandbox) {
		toSerialize["sandbox"] = o.Sandbox
	}
	return json.Marshal(toSerialize)
}

type NullablePrebookResponse struct {
	value *PrebookResponse
	isSet bool
}

func (v NullablePrebookResponse) Get() *PrebookResponse {
	return v.value
}

func (v *NullablePrebookResponse) Set(val *PrebookResponse) {
	v.value = val
	v.isSet = true
}

func (v NullablePrebookResponse) IsSet() bool {
	return v.isSet
}

func (v *NullablePrebookResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePrebookResponse(val *PrebookResponse) *NullablePrebookResponse {
	return &NullablePrebookResponse{value: val, isSet: true}
}

func (v NullablePrebookResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePrebookResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

