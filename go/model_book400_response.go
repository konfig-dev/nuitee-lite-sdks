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

// Book400Response struct for Book400Response
type Book400Response struct {
	Error *Book400ResponseError `json:"error,omitempty"`
}

// NewBook400Response instantiates a new Book400Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBook400Response() *Book400Response {
	this := Book400Response{}
	return &this
}

// NewBook400ResponseWithDefaults instantiates a new Book400Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBook400ResponseWithDefaults() *Book400Response {
	this := Book400Response{}
	return &this
}

// GetError returns the Error field value if set, zero value otherwise.
func (o *Book400Response) GetError() Book400ResponseError {
	if o == nil || isNil(o.Error) {
		var ret Book400ResponseError
		return ret
	}
	return *o.Error
}

// GetErrorOk returns a tuple with the Error field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Book400Response) GetErrorOk() (*Book400ResponseError, bool) {
	if o == nil || isNil(o.Error) {
    return nil, false
	}
	return o.Error, true
}

// HasError returns a boolean if a field has been set.
func (o *Book400Response) HasError() bool {
	if o != nil && !isNil(o.Error) {
		return true
	}

	return false
}

// SetError gets a reference to the given Book400ResponseError and assigns it to the Error field.
func (o *Book400Response) SetError(v Book400ResponseError) {
	o.Error = &v
}

func (o Book400Response) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Error) {
		toSerialize["error"] = o.Error
	}
	return json.Marshal(toSerialize)
}

type NullableBook400Response struct {
	value *Book400Response
	isSet bool
}

func (v NullableBook400Response) Get() *Book400Response {
	return v.value
}

func (v *NullableBook400Response) Set(val *Book400Response) {
	v.value = val
	v.isSet = true
}

func (v NullableBook400Response) IsSet() bool {
	return v.isSet
}

func (v *NullableBook400Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBook400Response(val *Book400Response) *NullableBook400Response {
	return &NullableBook400Response{value: val, isSet: true}
}

func (v NullableBook400Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBook400Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


