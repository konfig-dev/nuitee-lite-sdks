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

// PrebookResponseData struct for PrebookResponseData
type PrebookResponseData struct {
	PrebookId *string `json:"prebookId,omitempty"`
	HotelId *string `json:"hotelId,omitempty"`
	Currency *string `json:"currency,omitempty"`
	TermsAndConditions *string `json:"termsAndConditions,omitempty"`
	RoomTypes []PrebookResponseDataRoomTypesInner `json:"roomTypes,omitempty"`
	Price *float32 `json:"price,omitempty"`
	// the difference percentage if rate price has changed
	PriceDifferencePercent *float32 `json:"priceDifferencePercent,omitempty"`
	// has cancellation changed
	CancellationChanged *bool `json:"cancellationChanged,omitempty"`
	// has board changed
	BoardChanged *bool `json:"boardChanged,omitempty"`
}

// NewPrebookResponseData instantiates a new PrebookResponseData object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPrebookResponseData() *PrebookResponseData {
	this := PrebookResponseData{}
	return &this
}

// NewPrebookResponseDataWithDefaults instantiates a new PrebookResponseData object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPrebookResponseDataWithDefaults() *PrebookResponseData {
	this := PrebookResponseData{}
	return &this
}

// GetPrebookId returns the PrebookId field value if set, zero value otherwise.
func (o *PrebookResponseData) GetPrebookId() string {
	if o == nil || isNil(o.PrebookId) {
		var ret string
		return ret
	}
	return *o.PrebookId
}

// GetPrebookIdOk returns a tuple with the PrebookId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseData) GetPrebookIdOk() (*string, bool) {
	if o == nil || isNil(o.PrebookId) {
    return nil, false
	}
	return o.PrebookId, true
}

// HasPrebookId returns a boolean if a field has been set.
func (o *PrebookResponseData) HasPrebookId() bool {
	if o != nil && !isNil(o.PrebookId) {
		return true
	}

	return false
}

// SetPrebookId gets a reference to the given string and assigns it to the PrebookId field.
func (o *PrebookResponseData) SetPrebookId(v string) {
	o.PrebookId = &v
}

// GetHotelId returns the HotelId field value if set, zero value otherwise.
func (o *PrebookResponseData) GetHotelId() string {
	if o == nil || isNil(o.HotelId) {
		var ret string
		return ret
	}
	return *o.HotelId
}

// GetHotelIdOk returns a tuple with the HotelId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseData) GetHotelIdOk() (*string, bool) {
	if o == nil || isNil(o.HotelId) {
    return nil, false
	}
	return o.HotelId, true
}

// HasHotelId returns a boolean if a field has been set.
func (o *PrebookResponseData) HasHotelId() bool {
	if o != nil && !isNil(o.HotelId) {
		return true
	}

	return false
}

// SetHotelId gets a reference to the given string and assigns it to the HotelId field.
func (o *PrebookResponseData) SetHotelId(v string) {
	o.HotelId = &v
}

// GetCurrency returns the Currency field value if set, zero value otherwise.
func (o *PrebookResponseData) GetCurrency() string {
	if o == nil || isNil(o.Currency) {
		var ret string
		return ret
	}
	return *o.Currency
}

// GetCurrencyOk returns a tuple with the Currency field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseData) GetCurrencyOk() (*string, bool) {
	if o == nil || isNil(o.Currency) {
    return nil, false
	}
	return o.Currency, true
}

// HasCurrency returns a boolean if a field has been set.
func (o *PrebookResponseData) HasCurrency() bool {
	if o != nil && !isNil(o.Currency) {
		return true
	}

	return false
}

// SetCurrency gets a reference to the given string and assigns it to the Currency field.
func (o *PrebookResponseData) SetCurrency(v string) {
	o.Currency = &v
}

// GetTermsAndConditions returns the TermsAndConditions field value if set, zero value otherwise.
func (o *PrebookResponseData) GetTermsAndConditions() string {
	if o == nil || isNil(o.TermsAndConditions) {
		var ret string
		return ret
	}
	return *o.TermsAndConditions
}

// GetTermsAndConditionsOk returns a tuple with the TermsAndConditions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseData) GetTermsAndConditionsOk() (*string, bool) {
	if o == nil || isNil(o.TermsAndConditions) {
    return nil, false
	}
	return o.TermsAndConditions, true
}

// HasTermsAndConditions returns a boolean if a field has been set.
func (o *PrebookResponseData) HasTermsAndConditions() bool {
	if o != nil && !isNil(o.TermsAndConditions) {
		return true
	}

	return false
}

// SetTermsAndConditions gets a reference to the given string and assigns it to the TermsAndConditions field.
func (o *PrebookResponseData) SetTermsAndConditions(v string) {
	o.TermsAndConditions = &v
}

// GetRoomTypes returns the RoomTypes field value if set, zero value otherwise.
func (o *PrebookResponseData) GetRoomTypes() []PrebookResponseDataRoomTypesInner {
	if o == nil || isNil(o.RoomTypes) {
		var ret []PrebookResponseDataRoomTypesInner
		return ret
	}
	return o.RoomTypes
}

// GetRoomTypesOk returns a tuple with the RoomTypes field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseData) GetRoomTypesOk() ([]PrebookResponseDataRoomTypesInner, bool) {
	if o == nil || isNil(o.RoomTypes) {
    return nil, false
	}
	return o.RoomTypes, true
}

// HasRoomTypes returns a boolean if a field has been set.
func (o *PrebookResponseData) HasRoomTypes() bool {
	if o != nil && !isNil(o.RoomTypes) {
		return true
	}

	return false
}

// SetRoomTypes gets a reference to the given []PrebookResponseDataRoomTypesInner and assigns it to the RoomTypes field.
func (o *PrebookResponseData) SetRoomTypes(v []PrebookResponseDataRoomTypesInner) {
	o.RoomTypes = v
}

// GetPrice returns the Price field value if set, zero value otherwise.
func (o *PrebookResponseData) GetPrice() float32 {
	if o == nil || isNil(o.Price) {
		var ret float32
		return ret
	}
	return *o.Price
}

// GetPriceOk returns a tuple with the Price field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseData) GetPriceOk() (*float32, bool) {
	if o == nil || isNil(o.Price) {
    return nil, false
	}
	return o.Price, true
}

// HasPrice returns a boolean if a field has been set.
func (o *PrebookResponseData) HasPrice() bool {
	if o != nil && !isNil(o.Price) {
		return true
	}

	return false
}

// SetPrice gets a reference to the given float32 and assigns it to the Price field.
func (o *PrebookResponseData) SetPrice(v float32) {
	o.Price = &v
}

// GetPriceDifferencePercent returns the PriceDifferencePercent field value if set, zero value otherwise.
func (o *PrebookResponseData) GetPriceDifferencePercent() float32 {
	if o == nil || isNil(o.PriceDifferencePercent) {
		var ret float32
		return ret
	}
	return *o.PriceDifferencePercent
}

// GetPriceDifferencePercentOk returns a tuple with the PriceDifferencePercent field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseData) GetPriceDifferencePercentOk() (*float32, bool) {
	if o == nil || isNil(o.PriceDifferencePercent) {
    return nil, false
	}
	return o.PriceDifferencePercent, true
}

// HasPriceDifferencePercent returns a boolean if a field has been set.
func (o *PrebookResponseData) HasPriceDifferencePercent() bool {
	if o != nil && !isNil(o.PriceDifferencePercent) {
		return true
	}

	return false
}

// SetPriceDifferencePercent gets a reference to the given float32 and assigns it to the PriceDifferencePercent field.
func (o *PrebookResponseData) SetPriceDifferencePercent(v float32) {
	o.PriceDifferencePercent = &v
}

// GetCancellationChanged returns the CancellationChanged field value if set, zero value otherwise.
func (o *PrebookResponseData) GetCancellationChanged() bool {
	if o == nil || isNil(o.CancellationChanged) {
		var ret bool
		return ret
	}
	return *o.CancellationChanged
}

// GetCancellationChangedOk returns a tuple with the CancellationChanged field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseData) GetCancellationChangedOk() (*bool, bool) {
	if o == nil || isNil(o.CancellationChanged) {
    return nil, false
	}
	return o.CancellationChanged, true
}

// HasCancellationChanged returns a boolean if a field has been set.
func (o *PrebookResponseData) HasCancellationChanged() bool {
	if o != nil && !isNil(o.CancellationChanged) {
		return true
	}

	return false
}

// SetCancellationChanged gets a reference to the given bool and assigns it to the CancellationChanged field.
func (o *PrebookResponseData) SetCancellationChanged(v bool) {
	o.CancellationChanged = &v
}

// GetBoardChanged returns the BoardChanged field value if set, zero value otherwise.
func (o *PrebookResponseData) GetBoardChanged() bool {
	if o == nil || isNil(o.BoardChanged) {
		var ret bool
		return ret
	}
	return *o.BoardChanged
}

// GetBoardChangedOk returns a tuple with the BoardChanged field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PrebookResponseData) GetBoardChangedOk() (*bool, bool) {
	if o == nil || isNil(o.BoardChanged) {
    return nil, false
	}
	return o.BoardChanged, true
}

// HasBoardChanged returns a boolean if a field has been set.
func (o *PrebookResponseData) HasBoardChanged() bool {
	if o != nil && !isNil(o.BoardChanged) {
		return true
	}

	return false
}

// SetBoardChanged gets a reference to the given bool and assigns it to the BoardChanged field.
func (o *PrebookResponseData) SetBoardChanged(v bool) {
	o.BoardChanged = &v
}

func (o PrebookResponseData) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.PrebookId) {
		toSerialize["prebookId"] = o.PrebookId
	}
	if !isNil(o.HotelId) {
		toSerialize["hotelId"] = o.HotelId
	}
	if !isNil(o.Currency) {
		toSerialize["currency"] = o.Currency
	}
	if !isNil(o.TermsAndConditions) {
		toSerialize["termsAndConditions"] = o.TermsAndConditions
	}
	if !isNil(o.RoomTypes) {
		toSerialize["roomTypes"] = o.RoomTypes
	}
	if !isNil(o.Price) {
		toSerialize["price"] = o.Price
	}
	if !isNil(o.PriceDifferencePercent) {
		toSerialize["priceDifferencePercent"] = o.PriceDifferencePercent
	}
	if !isNil(o.CancellationChanged) {
		toSerialize["cancellationChanged"] = o.CancellationChanged
	}
	if !isNil(o.BoardChanged) {
		toSerialize["boardChanged"] = o.BoardChanged
	}
	return json.Marshal(toSerialize)
}

type NullablePrebookResponseData struct {
	value *PrebookResponseData
	isSet bool
}

func (v NullablePrebookResponseData) Get() *PrebookResponseData {
	return v.value
}

func (v *NullablePrebookResponseData) Set(val *PrebookResponseData) {
	v.value = val
	v.isSet = true
}

func (v NullablePrebookResponseData) IsSet() bool {
	return v.isSet
}

func (v *NullablePrebookResponseData) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePrebookResponseData(val *PrebookResponseData) *NullablePrebookResponseData {
	return &NullablePrebookResponseData{value: val, isSet: true}
}

func (v NullablePrebookResponseData) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePrebookResponseData) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


