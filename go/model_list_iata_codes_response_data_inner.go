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

// ListIataCodesResponseDataInner struct for ListIataCodesResponseDataInner
type ListIataCodesResponseDataInner struct {
	// IATA code
	Code *string `json:"code,omitempty"`
	// IATA location name
	Name *string `json:"name,omitempty"`
	Latitude *float32 `json:"latitude,omitempty"`
	Longitude *float32 `json:"longitude,omitempty"`
	// country code
	CountryCode *string `json:"countryCode,omitempty"`
}

// NewListIataCodesResponseDataInner instantiates a new ListIataCodesResponseDataInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewListIataCodesResponseDataInner() *ListIataCodesResponseDataInner {
	this := ListIataCodesResponseDataInner{}
	return &this
}

// NewListIataCodesResponseDataInnerWithDefaults instantiates a new ListIataCodesResponseDataInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewListIataCodesResponseDataInnerWithDefaults() *ListIataCodesResponseDataInner {
	this := ListIataCodesResponseDataInner{}
	return &this
}

// GetCode returns the Code field value if set, zero value otherwise.
func (o *ListIataCodesResponseDataInner) GetCode() string {
	if o == nil || isNil(o.Code) {
		var ret string
		return ret
	}
	return *o.Code
}

// GetCodeOk returns a tuple with the Code field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ListIataCodesResponseDataInner) GetCodeOk() (*string, bool) {
	if o == nil || isNil(o.Code) {
    return nil, false
	}
	return o.Code, true
}

// HasCode returns a boolean if a field has been set.
func (o *ListIataCodesResponseDataInner) HasCode() bool {
	if o != nil && !isNil(o.Code) {
		return true
	}

	return false
}

// SetCode gets a reference to the given string and assigns it to the Code field.
func (o *ListIataCodesResponseDataInner) SetCode(v string) {
	o.Code = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *ListIataCodesResponseDataInner) GetName() string {
	if o == nil || isNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ListIataCodesResponseDataInner) GetNameOk() (*string, bool) {
	if o == nil || isNil(o.Name) {
    return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *ListIataCodesResponseDataInner) HasName() bool {
	if o != nil && !isNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *ListIataCodesResponseDataInner) SetName(v string) {
	o.Name = &v
}

// GetLatitude returns the Latitude field value if set, zero value otherwise.
func (o *ListIataCodesResponseDataInner) GetLatitude() float32 {
	if o == nil || isNil(o.Latitude) {
		var ret float32
		return ret
	}
	return *o.Latitude
}

// GetLatitudeOk returns a tuple with the Latitude field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ListIataCodesResponseDataInner) GetLatitudeOk() (*float32, bool) {
	if o == nil || isNil(o.Latitude) {
    return nil, false
	}
	return o.Latitude, true
}

// HasLatitude returns a boolean if a field has been set.
func (o *ListIataCodesResponseDataInner) HasLatitude() bool {
	if o != nil && !isNil(o.Latitude) {
		return true
	}

	return false
}

// SetLatitude gets a reference to the given float32 and assigns it to the Latitude field.
func (o *ListIataCodesResponseDataInner) SetLatitude(v float32) {
	o.Latitude = &v
}

// GetLongitude returns the Longitude field value if set, zero value otherwise.
func (o *ListIataCodesResponseDataInner) GetLongitude() float32 {
	if o == nil || isNil(o.Longitude) {
		var ret float32
		return ret
	}
	return *o.Longitude
}

// GetLongitudeOk returns a tuple with the Longitude field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ListIataCodesResponseDataInner) GetLongitudeOk() (*float32, bool) {
	if o == nil || isNil(o.Longitude) {
    return nil, false
	}
	return o.Longitude, true
}

// HasLongitude returns a boolean if a field has been set.
func (o *ListIataCodesResponseDataInner) HasLongitude() bool {
	if o != nil && !isNil(o.Longitude) {
		return true
	}

	return false
}

// SetLongitude gets a reference to the given float32 and assigns it to the Longitude field.
func (o *ListIataCodesResponseDataInner) SetLongitude(v float32) {
	o.Longitude = &v
}

// GetCountryCode returns the CountryCode field value if set, zero value otherwise.
func (o *ListIataCodesResponseDataInner) GetCountryCode() string {
	if o == nil || isNil(o.CountryCode) {
		var ret string
		return ret
	}
	return *o.CountryCode
}

// GetCountryCodeOk returns a tuple with the CountryCode field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ListIataCodesResponseDataInner) GetCountryCodeOk() (*string, bool) {
	if o == nil || isNil(o.CountryCode) {
    return nil, false
	}
	return o.CountryCode, true
}

// HasCountryCode returns a boolean if a field has been set.
func (o *ListIataCodesResponseDataInner) HasCountryCode() bool {
	if o != nil && !isNil(o.CountryCode) {
		return true
	}

	return false
}

// SetCountryCode gets a reference to the given string and assigns it to the CountryCode field.
func (o *ListIataCodesResponseDataInner) SetCountryCode(v string) {
	o.CountryCode = &v
}

func (o ListIataCodesResponseDataInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Code) {
		toSerialize["code"] = o.Code
	}
	if !isNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !isNil(o.Latitude) {
		toSerialize["latitude"] = o.Latitude
	}
	if !isNil(o.Longitude) {
		toSerialize["longitude"] = o.Longitude
	}
	if !isNil(o.CountryCode) {
		toSerialize["countryCode"] = o.CountryCode
	}
	return json.Marshal(toSerialize)
}

type NullableListIataCodesResponseDataInner struct {
	value *ListIataCodesResponseDataInner
	isSet bool
}

func (v NullableListIataCodesResponseDataInner) Get() *ListIataCodesResponseDataInner {
	return v.value
}

func (v *NullableListIataCodesResponseDataInner) Set(val *ListIataCodesResponseDataInner) {
	v.value = val
	v.isSet = true
}

func (v NullableListIataCodesResponseDataInner) IsSet() bool {
	return v.isSet
}

func (v *NullableListIataCodesResponseDataInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableListIataCodesResponseDataInner(val *ListIataCodesResponseDataInner) *NullableListIataCodesResponseDataInner {
	return &NullableListIataCodesResponseDataInner{value: val, isSet: true}
}

func (v NullableListIataCodesResponseDataInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableListIataCodesResponseDataInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

