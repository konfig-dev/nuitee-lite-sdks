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

// GetHotels401Response struct for GetHotels401Response
type GetHotels401Response struct {
	Error *GetHotels401ResponseError `json:"error,omitempty"`
}

// NewGetHotels401Response instantiates a new GetHotels401Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetHotels401Response() *GetHotels401Response {
	this := GetHotels401Response{}
	return &this
}

// NewGetHotels401ResponseWithDefaults instantiates a new GetHotels401Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetHotels401ResponseWithDefaults() *GetHotels401Response {
	this := GetHotels401Response{}
	return &this
}

// GetError returns the Error field value if set, zero value otherwise.
func (o *GetHotels401Response) GetError() GetHotels401ResponseError {
	if o == nil || isNil(o.Error) {
		var ret GetHotels401ResponseError
		return ret
	}
	return *o.Error
}

// GetErrorOk returns a tuple with the Error field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetHotels401Response) GetErrorOk() (*GetHotels401ResponseError, bool) {
	if o == nil || isNil(o.Error) {
    return nil, false
	}
	return o.Error, true
}

// HasError returns a boolean if a field has been set.
func (o *GetHotels401Response) HasError() bool {
	if o != nil && !isNil(o.Error) {
		return true
	}

	return false
}

// SetError gets a reference to the given GetHotels401ResponseError and assigns it to the Error field.
func (o *GetHotels401Response) SetError(v GetHotels401ResponseError) {
	o.Error = &v
}

func (o GetHotels401Response) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Error) {
		toSerialize["error"] = o.Error
	}
	return json.Marshal(toSerialize)
}

type NullableGetHotels401Response struct {
	value *GetHotels401Response
	isSet bool
}

func (v NullableGetHotels401Response) Get() *GetHotels401Response {
	return v.value
}

func (v *NullableGetHotels401Response) Set(val *GetHotels401Response) {
	v.value = val
	v.isSet = true
}

func (v NullableGetHotels401Response) IsSet() bool {
	return v.isSet
}

func (v *NullableGetHotels401Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetHotels401Response(val *GetHotels401Response) *NullableGetHotels401Response {
	return &NullableGetHotels401Response{value: val, isSet: true}
}

func (v NullableGetHotels401Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetHotels401Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

