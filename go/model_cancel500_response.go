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

// Cancel500Response struct for Cancel500Response
type Cancel500Response struct {
	Error *Cancel400ResponseError `json:"error,omitempty"`
}

// NewCancel500Response instantiates a new Cancel500Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCancel500Response() *Cancel500Response {
	this := Cancel500Response{}
	return &this
}

// NewCancel500ResponseWithDefaults instantiates a new Cancel500Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCancel500ResponseWithDefaults() *Cancel500Response {
	this := Cancel500Response{}
	return &this
}

// GetError returns the Error field value if set, zero value otherwise.
func (o *Cancel500Response) GetError() Cancel400ResponseError {
	if o == nil || isNil(o.Error) {
		var ret Cancel400ResponseError
		return ret
	}
	return *o.Error
}

// GetErrorOk returns a tuple with the Error field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Cancel500Response) GetErrorOk() (*Cancel400ResponseError, bool) {
	if o == nil || isNil(o.Error) {
    return nil, false
	}
	return o.Error, true
}

// HasError returns a boolean if a field has been set.
func (o *Cancel500Response) HasError() bool {
	if o != nil && !isNil(o.Error) {
		return true
	}

	return false
}

// SetError gets a reference to the given Cancel400ResponseError and assigns it to the Error field.
func (o *Cancel500Response) SetError(v Cancel400ResponseError) {
	o.Error = &v
}

func (o Cancel500Response) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Error) {
		toSerialize["error"] = o.Error
	}
	return json.Marshal(toSerialize)
}

type NullableCancel500Response struct {
	value *Cancel500Response
	isSet bool
}

func (v NullableCancel500Response) Get() *Cancel500Response {
	return v.value
}

func (v *NullableCancel500Response) Set(val *Cancel500Response) {
	v.value = val
	v.isSet = true
}

func (v NullableCancel500Response) IsSet() bool {
	return v.isSet
}

func (v *NullableCancel500Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCancel500Response(val *Cancel500Response) *NullableCancel500Response {
	return &NullableCancel500Response{value: val, isSet: true}
}

func (v NullableCancel500Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCancel500Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


