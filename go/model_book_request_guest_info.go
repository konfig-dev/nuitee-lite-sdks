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

// BookRequestGuestInfo struct for BookRequestGuestInfo
type BookRequestGuestInfo struct {
	// traveler first name
	GuestFirstName string `json:"guestFirstName"`
	// traveler last name
	GuestLastName string `json:"guestLastName"`
	// traveler email
	GuestEmail string `json:"guestEmail"`
}

// NewBookRequestGuestInfo instantiates a new BookRequestGuestInfo object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBookRequestGuestInfo(guestFirstName string, guestLastName string, guestEmail string) *BookRequestGuestInfo {
	this := BookRequestGuestInfo{}
	this.GuestFirstName = guestFirstName
	this.GuestLastName = guestLastName
	this.GuestEmail = guestEmail
	return &this
}

// NewBookRequestGuestInfoWithDefaults instantiates a new BookRequestGuestInfo object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBookRequestGuestInfoWithDefaults() *BookRequestGuestInfo {
	this := BookRequestGuestInfo{}
	return &this
}

// GetGuestFirstName returns the GuestFirstName field value
func (o *BookRequestGuestInfo) GetGuestFirstName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.GuestFirstName
}

// GetGuestFirstNameOk returns a tuple with the GuestFirstName field value
// and a boolean to check if the value has been set.
func (o *BookRequestGuestInfo) GetGuestFirstNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.GuestFirstName, true
}

// SetGuestFirstName sets field value
func (o *BookRequestGuestInfo) SetGuestFirstName(v string) {
	o.GuestFirstName = v
}

// GetGuestLastName returns the GuestLastName field value
func (o *BookRequestGuestInfo) GetGuestLastName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.GuestLastName
}

// GetGuestLastNameOk returns a tuple with the GuestLastName field value
// and a boolean to check if the value has been set.
func (o *BookRequestGuestInfo) GetGuestLastNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.GuestLastName, true
}

// SetGuestLastName sets field value
func (o *BookRequestGuestInfo) SetGuestLastName(v string) {
	o.GuestLastName = v
}

// GetGuestEmail returns the GuestEmail field value
func (o *BookRequestGuestInfo) GetGuestEmail() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.GuestEmail
}

// GetGuestEmailOk returns a tuple with the GuestEmail field value
// and a boolean to check if the value has been set.
func (o *BookRequestGuestInfo) GetGuestEmailOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.GuestEmail, true
}

// SetGuestEmail sets field value
func (o *BookRequestGuestInfo) SetGuestEmail(v string) {
	o.GuestEmail = v
}

func (o BookRequestGuestInfo) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["guestFirstName"] = o.GuestFirstName
	}
	if true {
		toSerialize["guestLastName"] = o.GuestLastName
	}
	if true {
		toSerialize["guestEmail"] = o.GuestEmail
	}
	return json.Marshal(toSerialize)
}

type NullableBookRequestGuestInfo struct {
	value *BookRequestGuestInfo
	isSet bool
}

func (v NullableBookRequestGuestInfo) Get() *BookRequestGuestInfo {
	return v.value
}

func (v *NullableBookRequestGuestInfo) Set(val *BookRequestGuestInfo) {
	v.value = val
	v.isSet = true
}

func (v NullableBookRequestGuestInfo) IsSet() bool {
	return v.isSet
}

func (v *NullableBookRequestGuestInfo) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBookRequestGuestInfo(val *BookRequestGuestInfo) *NullableBookRequestGuestInfo {
	return &NullableBookRequestGuestInfo{value: val, isSet: true}
}

func (v NullableBookRequestGuestInfo) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBookRequestGuestInfo) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


