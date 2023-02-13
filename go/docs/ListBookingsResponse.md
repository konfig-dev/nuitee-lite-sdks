# ListBookingsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**[]ListBookingsResponseDataInner**](ListBookingsResponseDataInner.md) |  | [optional] 

## Methods

### NewListBookingsResponse

`func NewListBookingsResponse() *ListBookingsResponse`

NewListBookingsResponse instantiates a new ListBookingsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListBookingsResponseWithDefaults

`func NewListBookingsResponseWithDefaults() *ListBookingsResponse`

NewListBookingsResponseWithDefaults instantiates a new ListBookingsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ListBookingsResponse) GetData() []ListBookingsResponseDataInner`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListBookingsResponse) GetDataOk() (*[]ListBookingsResponseDataInner, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListBookingsResponse) SetData(v []ListBookingsResponseDataInner)`

SetData sets Data field to given value.

### HasData

`func (o *ListBookingsResponse) HasData() bool`

HasData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


