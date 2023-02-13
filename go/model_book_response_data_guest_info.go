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

// BookResponseDataGuestInfo struct for BookResponseDataGuestInfo
type BookResponseDataGuestInfo struct {
	GuestFirstName *string `json:"guestFirstName,omitempty"`
	GuestLastName *string `json:"guestLastName,omitempty"`
	GuestEmail *string `json:"guestEmail,omitempty"`
}

// NewBookResponseDataGuestInfo instantiates a new BookResponseDataGuestInfo object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBookResponseDataGuestInfo() *BookResponseDataGuestInfo {
	this := BookResponseDataGuestInfo{}
	return &this
}

// NewBookResponseDataGuestInfoWithDefaults instantiates a new BookResponseDataGuestInfo object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBookResponseDataGuestInfoWithDefaults() *BookResponseDataGuestInfo {
	this := BookResponseDataGuestInfo{}
	return &this
}

// GetGuestFirstName returns the GuestFirstName field value if set, zero value otherwise.
func (o *BookResponseDataGuestInfo) GetGuestFirstName() string {
	if o == nil || isNil(o.GuestFirstName) {
		var ret string
		return ret
	}
	return *o.GuestFirstName
}

// GetGuestFirstNameOk returns a tuple with the GuestFirstName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BookResponseDataGuestInfo) GetGuestFirstNameOk() (*string, bool) {
	if o == nil || isNil(o.GuestFirstName) {
    return nil, false
	}
	return o.GuestFirstName, true
}

// HasGuestFirstName returns a boolean if a field has been set.
func (o *BookResponseDataGuestInfo) HasGuestFirstName() bool {
	if o != nil && !isNil(o.GuestFirstName) {
		return true
	}

	return false
}

// SetGuestFirstName gets a reference to the given string and assigns it to the GuestFirstName field.
func (o *BookResponseDataGuestInfo) SetGuestFirstName(v string) {
	o.GuestFirstName = &v
}

// GetGuestLastName returns the GuestLastName field value if set, zero value otherwise.
func (o *BookResponseDataGuestInfo) GetGuestLastName() string {
	if o == nil || isNil(o.GuestLastName) {
		var ret string
		return ret
	}
	return *o.GuestLastName
}

// GetGuestLastNameOk returns a tuple with the GuestLastName field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BookResponseDataGuestInfo) GetGuestLastNameOk() (*string, bool) {
	if o == nil || isNil(o.GuestLastName) {
    return nil, false
	}
	return o.GuestLastName, true
}

// HasGuestLastName returns a boolean if a field has been set.
func (o *BookResponseDataGuestInfo) HasGuestLastName() bool {
	if o != nil && !isNil(o.GuestLastName) {
		return true
	}

	return false
}

// SetGuestLastName gets a reference to the given string and assigns it to the GuestLastName field.
func (o *BookResponseDataGuestInfo) SetGuestLastName(v string) {
	o.GuestLastName = &v
}

// GetGuestEmail returns the GuestEmail field value if set, zero value otherwise.
func (o *BookResponseDataGuestInfo) GetGuestEmail() string {
	if o == nil || isNil(o.GuestEmail) {
		var ret string
		return ret
	}
	return *o.GuestEmail
}

// GetGuestEmailOk returns a tuple with the GuestEmail field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BookResponseDataGuestInfo) GetGuestEmailOk() (*string, bool) {
	if o == nil || isNil(o.GuestEmail) {
    return nil, false
	}
	return o.GuestEmail, true
}

// HasGuestEmail returns a boolean if a field has been set.
func (o *BookResponseDataGuestInfo) HasGuestEmail() bool {
	if o != nil && !isNil(o.GuestEmail) {
		return true
	}

	return false
}

// SetGuestEmail gets a reference to the given string and assigns it to the GuestEmail field.
func (o *BookResponseDataGuestInfo) SetGuestEmail(v string) {
	o.GuestEmail = &v
}

func (o BookResponseDataGuestInfo) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.GuestFirstName) {
		toSerialize["guestFirstName"] = o.GuestFirstName
	}
	if !isNil(o.GuestLastName) {
		toSerialize["guestLastName"] = o.GuestLastName
	}
	if !isNil(o.GuestEmail) {
		toSerialize["guestEmail"] = o.GuestEmail
	}
	return json.Marshal(toSerialize)
}

type NullableBookResponseDataGuestInfo struct {
	value *BookResponseDataGuestInfo
	isSet bool
}

func (v NullableBookResponseDataGuestInfo) Get() *BookResponseDataGuestInfo {
	return v.value
}

func (v *NullableBookResponseDataGuestInfo) Set(val *BookResponseDataGuestInfo) {
	v.value = val
	v.isSet = true
}

func (v NullableBookResponseDataGuestInfo) IsSet() bool {
	return v.isSet
}

func (v *NullableBookResponseDataGuestInfo) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBookResponseDataGuestInfo(val *BookResponseDataGuestInfo) *NullableBookResponseDataGuestInfo {
	return &NullableBookResponseDataGuestInfo{value: val, isSet: true}
}

func (v NullableBookResponseDataGuestInfo) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBookResponseDataGuestInfo) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

