/*
 * Lite API
 * lite api hotel booking api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */

package com.konfigthis.nuitee.client.api;

import com.konfigthis.nuitee.client.ApiClient;
import com.konfigthis.nuitee.client.ApiException;
import com.konfigthis.nuitee.client.Configuration;
import com.konfigthis.nuitee.client.auth.ApiKeyAuth;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import com.konfigthis.nuitee.client.model.ListCitiesResponse;
import com.konfigthis.nuitee.client.model.ListCountriesResponse;
import com.konfigthis.nuitee.client.model.ListCurrenciesResponse;
import com.konfigthis.nuitee.client.model.ListHotels400Response;
import com.konfigthis.nuitee.client.model.ListHotels401Response;
import com.konfigthis.nuitee.client.model.ListHotelsResponse;
import com.konfigthis.nuitee.client.model.ListIataCodesResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.Test;
import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StaticDataApi
 */
public class StaticDataApiTest {

    private static StaticDataApi api;

    @BeforeClass
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        ApiKeyAuth apiKey = (ApiKeyAuth) apiClient.getAuthentication("ApiKeyAuth");
        apiKey.setApiKey(System.getenv("NUITEE_API_KEY"));
        api = new StaticDataApi(apiClient);
    }

    /**
     * City list
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Disabled
    @Test
    public void listCitiesTest() throws ApiException {
        String countryCode = null;
        ListCitiesResponse response = api.listCities(countryCode);
        // TODO: test validations
    }

    /**
     * Country list
     *
     * countries list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCountriesTest() throws ApiException {
        ListCountriesResponse response = api.listCountries();
        System.out.println(response);
        assertNotNull("Response is not null", response);
    }

    /**
     * Currency list
     *
     * @throws ApiException if the Api call fails
     */
    @Disabled
    @Test
    public void listCurrenciesTest() throws ApiException {
        ListCurrenciesResponse response = api.listCurrencies();
        // TODO: test validations
    }

    /**
     * Hotel list
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Disabled
    @Test
    public void listHotelsTest() throws ApiException {
        String countryCode = null;
        String hotelName = null;
        String cityName = null;
        Integer limit = null;
        Integer offset = null;
        BigDecimal latitude = null;
        BigDecimal longitude = null;
        Integer distance = null;
        String iataCode = null;
        ListHotelsResponse response = api.listHotels(countryCode, hotelName, cityName, limit, offset, latitude,
                longitude, distance, iataCode);
        // TODO: test validations
    }

    /**
     * IATA code list
     *
     * IATA codes list
     *
     * @throws ApiException if the Api call fails
     */
    @Disabled
    @Test
    public void listIataCodesTest() throws ApiException {
        ListIataCodesResponse response = api.listIataCodes();
        // TODO: test validations
    }

}