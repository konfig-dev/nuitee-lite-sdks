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

// ListCitiesResponseDataInner struct for ListCitiesResponseDataInner
type ListCitiesResponseDataInner struct {
	City *string `json:"city,omitempty"`
}

// NewListCitiesResponseDataInner instantiates a new ListCitiesResponseDataInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewListCitiesResponseDataInner() *ListCitiesResponseDataInner {
	this := ListCitiesResponseDataInner{}
	return &this
}

// NewListCitiesResponseDataInnerWithDefaults instantiates a new ListCitiesResponseDataInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewListCitiesResponseDataInnerWithDefaults() *ListCitiesResponseDataInner {
	this := ListCitiesResponseDataInner{}
	return &this
}

// GetCity returns the City field value if set, zero value otherwise.
func (o *ListCitiesResponseDataInner) GetCity() string {
	if o == nil || isNil(o.City) {
		var ret string
		return ret
	}
	return *o.City
}

// GetCityOk returns a tuple with the City field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ListCitiesResponseDataInner) GetCityOk() (*string, bool) {
	if o == nil || isNil(o.City) {
    return nil, false
	}
	return o.City, true
}

// HasCity returns a boolean if a field has been set.
func (o *ListCitiesResponseDataInner) HasCity() bool {
	if o != nil && !isNil(o.City) {
		return true
	}

	return false
}

// SetCity gets a reference to the given string and assigns it to the City field.
func (o *ListCitiesResponseDataInner) SetCity(v string) {
	o.City = &v
}

func (o ListCitiesResponseDataInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.City) {
		toSerialize["city"] = o.City
	}
	return json.Marshal(toSerialize)
}

type NullableListCitiesResponseDataInner struct {
	value *ListCitiesResponseDataInner
	isSet bool
}

func (v NullableListCitiesResponseDataInner) Get() *ListCitiesResponseDataInner {
	return v.value
}

func (v *NullableListCitiesResponseDataInner) Set(val *ListCitiesResponseDataInner) {
	v.value = val
	v.isSet = true
}

func (v NullableListCitiesResponseDataInner) IsSet() bool {
	return v.isSet
}

func (v *NullableListCitiesResponseDataInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableListCitiesResponseDataInner(val *ListCitiesResponseDataInner) *NullableListCitiesResponseDataInner {
	return &NullableListCitiesResponseDataInner{value: val, isSet: true}
}

func (v NullableListCitiesResponseDataInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableListCitiesResponseDataInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

