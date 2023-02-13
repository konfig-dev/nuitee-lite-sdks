# ListHotelsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**[]ListHotelsResponseDataInner**](ListHotelsResponseDataInner.md) |  | [optional] 
**Total** | Pointer to **int32** |  | [optional] 

## Methods

### NewListHotelsResponse

`func NewListHotelsResponse() *ListHotelsResponse`

NewListHotelsResponse instantiates a new ListHotelsResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewListHotelsResponseWithDefaults

`func NewListHotelsResponseWithDefaults() *ListHotelsResponse`

NewListHotelsResponseWithDefaults instantiates a new ListHotelsResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ListHotelsResponse) GetData() []ListHotelsResponseDataInner`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ListHotelsResponse) GetDataOk() (*[]ListHotelsResponseDataInner, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ListHotelsResponse) SetData(v []ListHotelsResponseDataInner)`

SetData sets Data field to given value.

### HasData

`func (o *ListHotelsResponse) HasData() bool`

HasData returns a boolean if a field has been set.

### GetTotal

`func (o *ListHotelsResponse) GetTotal() int32`

GetTotal returns the Total field if non-nil, zero value otherwise.

### GetTotalOk

`func (o *ListHotelsResponse) GetTotalOk() (*int32, bool)`

GetTotalOk returns a tuple with the Total field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotal

`func (o *ListHotelsResponse) SetTotal(v int32)`

SetTotal sets Total field to given value.

### HasTotal

`func (o *ListHotelsResponse) HasTotal() bool`

HasTotal returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


