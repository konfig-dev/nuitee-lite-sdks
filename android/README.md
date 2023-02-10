# nuitee-android-sdk

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.konfigthis.nuitee</groupId>
    <artifactId>nuitee-android-sdk</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.konfigthis.nuitee:nuitee-android-sdk:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/nuitee-android-sdk-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.konfigthis.nuitee.client.ApiClient;
import com.konfigthis.nuitee.client.ApiException;
import com.konfigthis.nuitee.client.Configuration;
import com.konfigthis.nuitee.client.auth.*;
import com.konfigthis.nuitee.client.model.*;
import com.konfigthis.nuitee.client.api.BookApi;

public class Example {
  public static void main(String[] args) {

    ApiClient apiClient = Configuration.getDefaultApiClient();
    apiClient.setBasePath("https://api.nlite.ml/v1.0");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) apiClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BookApi apiInstance = new BookApi(apiClient);
    BookRequest bookRequest = new BookRequest(); // BookRequest | 
    try {
      BookResponse result = apiInstance.book(bookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookApi#book");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.nlite.ml/v1.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BookApi* | [**book**](docs/BookApi.md#book) | **POST** /rates/book | Hotel rate book
*BookApi* | [**prebook**](docs/BookApi.md#prebook) | **POST** /rates/prebook | Hotel rate prebook
*BookingManagementApi* | [**cancel**](docs/BookingManagementApi.md#cancel) | **PUT** /bookings/{bookingId} | Booking cancel
*BookingManagementApi* | [**listBookings**](docs/BookingManagementApi.md#listBookings) | **GET** /bookings | Booking list
*BookingManagementApi* | [**retrieve**](docs/BookingManagementApi.md#retrieve) | **GET** /bookings/{bookingId} | Booking retrieve
*SearchApi* | [**getHotelRates**](docs/SearchApi.md#getHotelRates) | **GET** /hotels/rates | Hotel full rate availability
*SearchApi* | [**getHotels**](docs/SearchApi.md#getHotels) | **GET** /hotels | Hotel minimum rate availability
*StaticDataApi* | [**listCities**](docs/StaticDataApi.md#listCities) | **GET** /data/cities | City list
*StaticDataApi* | [**listCountries**](docs/StaticDataApi.md#listCountries) | **GET** /data/countries | Country list
*StaticDataApi* | [**listCurrencies**](docs/StaticDataApi.md#listCurrencies) | **GET** /data/currencies | Currency list
*StaticDataApi* | [**listHotels**](docs/StaticDataApi.md#listHotels) | **GET** /data/hotels | Hotel list
*StaticDataApi* | [**listIataCodes**](docs/StaticDataApi.md#listIataCodes) | **GET** /data/iataCodes | IATA code list


## Documentation for Models

 - [Book400Response](docs/Book400Response.md)
 - [Book400ResponseError](docs/Book400ResponseError.md)
 - [Book401Response](docs/Book401Response.md)
 - [Book500Response](docs/Book500Response.md)
 - [BookRequest](docs/BookRequest.md)
 - [BookRequestGuestInfo](docs/BookRequestGuestInfo.md)
 - [BookResponse](docs/BookResponse.md)
 - [BookResponseData](docs/BookResponseData.md)
 - [BookResponseDataBookedRoomsInner](docs/BookResponseDataBookedRoomsInner.md)
 - [BookResponseDataBookedRoomsInnerRate](docs/BookResponseDataBookedRoomsInnerRate.md)
 - [BookResponseDataBookedRoomsInnerRateRetailRate](docs/BookResponseDataBookedRoomsInnerRateRetailRate.md)
 - [BookResponseDataBookedRoomsInnerRoomType](docs/BookResponseDataBookedRoomsInnerRoomType.md)
 - [BookResponseDataCancellation](docs/BookResponseDataCancellation.md)
 - [BookResponseDataCancellationFee](docs/BookResponseDataCancellationFee.md)
 - [BookResponseDataCancellationPolicies](docs/BookResponseDataCancellationPolicies.md)
 - [BookResponseDataGuestInfo](docs/BookResponseDataGuestInfo.md)
 - [BookResponseDataHotel](docs/BookResponseDataHotel.md)
 - [BookResponseDataHotelAddress](docs/BookResponseDataHotelAddress.md)
 - [BookResponseDataHotelLocation](docs/BookResponseDataHotelLocation.md)
 - [Cancel400Response](docs/Cancel400Response.md)
 - [Cancel400ResponseError](docs/Cancel400ResponseError.md)
 - [Cancel401Response](docs/Cancel401Response.md)
 - [Cancel500Response](docs/Cancel500Response.md)
 - [CancelResponse](docs/CancelResponse.md)
 - [GetHotelRates400Response](docs/GetHotelRates400Response.md)
 - [GetHotelRates401Response](docs/GetHotelRates401Response.md)
 - [GetHotelRatesResponse](docs/GetHotelRatesResponse.md)
 - [GetHotelRatesResponseDataInner](docs/GetHotelRatesResponseDataInner.md)
 - [GetHotelRatesResponseDataInnerRoomTypesInner](docs/GetHotelRatesResponseDataInnerRoomTypesInner.md)
 - [GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner](docs/GetHotelRatesResponseDataInnerRoomTypesInnerRatesInner.md)
 - [GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies](docs/GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies.md)
 - [GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner](docs/GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner.md)
 - [GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerRetailRate](docs/GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerRetailRate.md)
 - [GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner](docs/GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerRetailRateTaxesAndFeesInner.md)
 - [GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerRetailRateTotalInner](docs/GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerRetailRateTotalInner.md)
 - [GetHotels400Response](docs/GetHotels400Response.md)
 - [GetHotels400ResponseError](docs/GetHotels400ResponseError.md)
 - [GetHotels401Response](docs/GetHotels401Response.md)
 - [GetHotels401ResponseError](docs/GetHotels401ResponseError.md)
 - [GetHotelsResponse](docs/GetHotelsResponse.md)
 - [GetHotelsResponseDataInner](docs/GetHotelsResponseDataInner.md)
 - [ListBookingsResponse](docs/ListBookingsResponse.md)
 - [ListBookingsResponseDataInner](docs/ListBookingsResponseDataInner.md)
 - [ListCitiesResponse](docs/ListCitiesResponse.md)
 - [ListCitiesResponseDataInner](docs/ListCitiesResponseDataInner.md)
 - [ListCountriesResponse](docs/ListCountriesResponse.md)
 - [ListCountriesResponseDataInner](docs/ListCountriesResponseDataInner.md)
 - [ListCurrenciesResponse](docs/ListCurrenciesResponse.md)
 - [ListCurrenciesResponseDataInner](docs/ListCurrenciesResponseDataInner.md)
 - [ListHotels400Response](docs/ListHotels400Response.md)
 - [ListHotels401Response](docs/ListHotels401Response.md)
 - [ListHotelsResponse](docs/ListHotelsResponse.md)
 - [ListHotelsResponseDataInner](docs/ListHotelsResponseDataInner.md)
 - [ListIataCodesResponse](docs/ListIataCodesResponse.md)
 - [ListIataCodesResponseDataInner](docs/ListIataCodesResponseDataInner.md)
 - [Prebook401Response](docs/Prebook401Response.md)
 - [PrebookRequest](docs/PrebookRequest.md)
 - [PrebookResponse](docs/PrebookResponse.md)
 - [PrebookResponseData](docs/PrebookResponseData.md)
 - [PrebookResponseDataRoomTypesInner](docs/PrebookResponseDataRoomTypesInner.md)
 - [PrebookResponseDataRoomTypesInnerRatesInner](docs/PrebookResponseDataRoomTypesInnerRatesInner.md)
 - [PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies](docs/PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies.md)
 - [PrebookResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner](docs/PrebookResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner.md)
 - [PrebookResponseDataRoomTypesInnerRatesInnerRetailRate](docs/PrebookResponseDataRoomTypesInnerRatesInnerRetailRate.md)
 - [Retrieve400Response](docs/Retrieve400Response.md)
 - [Retrieve400ResponseError](docs/Retrieve400ResponseError.md)
 - [RetrieveResponse](docs/RetrieveResponse.md)
 - [RetrieveResponseData](docs/RetrieveResponseData.md)
 - [RetrieveResponseDataBookedRoomsInner](docs/RetrieveResponseDataBookedRoomsInner.md)
 - [RetrieveResponseDataBookedRoomsInnerRate](docs/RetrieveResponseDataBookedRoomsInnerRate.md)
 - [RetrieveResponseDataBookedRoomsInnerRoomType](docs/RetrieveResponseDataBookedRoomsInnerRoomType.md)
 - [RetrieveResponseDataCancellationPolicies](docs/RetrieveResponseDataCancellationPolicies.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key

- **API key parameter name**: X-API-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
