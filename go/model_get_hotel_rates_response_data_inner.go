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

// GetHotelRatesResponseDataInner struct for GetHotelRatesResponseDataInner
type GetHotelRatesResponseDataInner struct {
	HotelId *string `json:"hotelId,omitempty"`
	TermsAndConditions *string `json:"termsAndConditions,omitempty"`
	RoomTypes []GetHotelRatesResponseDataInnerRoomTypesInner `json:"roomTypes,omitempty"`
}

// NewGetHotelRatesResponseDataInner instantiates a new GetHotelRatesResponseDataInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGetHotelRatesResponseDataInner() *GetHotelRatesResponseDataInner {
	this := GetHotelRatesResponseDataInner{}
	return &this
}

// NewGetHotelRatesResponseDataInnerWithDefaults instantiates a new GetHotelRatesResponseDataInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGetHotelRatesResponseDataInnerWithDefaults() *GetHotelRatesResponseDataInner {
	this := GetHotelRatesResponseDataInner{}
	return &this
}

// GetHotelId returns the HotelId field value if set, zero value otherwise.
func (o *GetHotelRatesResponseDataInner) GetHotelId() string {
	if o == nil || isNil(o.HotelId) {
		var ret string
		return ret
	}
	return *o.HotelId
}

// GetHotelIdOk returns a tuple with the HotelId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetHotelRatesResponseDataInner) GetHotelIdOk() (*string, bool) {
	if o == nil || isNil(o.HotelId) {
    return nil, false
	}
	return o.HotelId, true
}

// HasHotelId returns a boolean if a field has been set.
func (o *GetHotelRatesResponseDataInner) HasHotelId() bool {
	if o != nil && !isNil(o.HotelId) {
		return true
	}

	return false
}

// SetHotelId gets a reference to the given string and assigns it to the HotelId field.
func (o *GetHotelRatesResponseDataInner) SetHotelId(v string) {
	o.HotelId = &v
}

// GetTermsAndConditions returns the TermsAndConditions field value if set, zero value otherwise.
func (o *GetHotelRatesResponseDataInner) GetTermsAndConditions() string {
	if o == nil || isNil(o.TermsAndConditions) {
		var ret string
		return ret
	}
	return *o.TermsAndConditions
}

// GetTermsAndConditionsOk returns a tuple with the TermsAndConditions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetHotelRatesResponseDataInner) GetTermsAndConditionsOk() (*string, bool) {
	if o == nil || isNil(o.TermsAndConditions) {
    return nil, false
	}
	return o.TermsAndConditions, true
}

// HasTermsAndConditions returns a boolean if a field has been set.
func (o *GetHotelRatesResponseDataInner) HasTermsAndConditions() bool {
	if o != nil && !isNil(o.TermsAndConditions) {
		return true
	}

	return false
}

// SetTermsAndConditions gets a reference to the given string and assigns it to the TermsAndConditions field.
func (o *GetHotelRatesResponseDataInner) SetTermsAndConditions(v string) {
	o.TermsAndConditions = &v
}

// GetRoomTypes returns the RoomTypes field value if set, zero value otherwise.
func (o *GetHotelRatesResponseDataInner) GetRoomTypes() []GetHotelRatesResponseDataInnerRoomTypesInner {
	if o == nil || isNil(o.RoomTypes) {
		var ret []GetHotelRatesResponseDataInnerRoomTypesInner
		return ret
	}
	return o.RoomTypes
}

// GetRoomTypesOk returns a tuple with the RoomTypes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *GetHotelRatesResponseDataInner) GetRoomTypesOk() ([]GetHotelRatesResponseDataInnerRoomTypesInner, bool) {
	if o == nil || isNil(o.RoomTypes) {
    return nil, false
	}
	return o.RoomTypes, true
}

// HasRoomTypes returns a boolean if a field has been set.
func (o *GetHotelRatesResponseDataInner) HasRoomTypes() bool {
	if o != nil && !isNil(o.RoomTypes) {
		return true
	}

	return false
}

// SetRoomTypes gets a reference to the given []GetHotelRatesResponseDataInnerRoomTypesInner and assigns it to the RoomTypes field.
func (o *GetHotelRatesResponseDataInner) SetRoomTypes(v []GetHotelRatesResponseDataInnerRoomTypesInner) {
	o.RoomTypes = v
}

func (o GetHotelRatesResponseDataInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.HotelId) {
		toSerialize["hotelId"] = o.HotelId
	}
	if !isNil(o.TermsAndConditions) {
		toSerialize["termsAndConditions"] = o.TermsAndConditions
	}
	if !isNil(o.RoomTypes) {
		toSerialize["roomTypes"] = o.RoomTypes
	}
	return json.Marshal(toSerialize)
}

type NullableGetHotelRatesResponseDataInner struct {
	value *GetHotelRatesResponseDataInner
	isSet bool
}

func (v NullableGetHotelRatesResponseDataInner) Get() *GetHotelRatesResponseDataInner {
	return v.value
}

func (v *NullableGetHotelRatesResponseDataInner) Set(val *GetHotelRatesResponseDataInner) {
	v.value = val
	v.isSet = true
}

func (v NullableGetHotelRatesResponseDataInner) IsSet() bool {
	return v.isSet
}

func (v *NullableGetHotelRatesResponseDataInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGetHotelRatesResponseDataInner(val *GetHotelRatesResponseDataInner) *NullableGetHotelRatesResponseDataInner {
	return &NullableGetHotelRatesResponseDataInner{value: val, isSet: true}
}

func (v NullableGetHotelRatesResponseDataInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGetHotelRatesResponseDataInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


