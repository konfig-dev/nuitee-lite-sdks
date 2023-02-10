/**
 * Lite API
 * lite api hotel booking api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * https://konfigthis.com
 * Do not edit the class manually.
 */


package com.konfigthis.nuitee.client.api;

import com.konfigthis.nuitee.client.ApiException;
import java.math.BigDecimal;
import com.konfigthis.nuitee.client.model.ListCitiesResponse;
import com.konfigthis.nuitee.client.model.ListCountriesResponse;
import com.konfigthis.nuitee.client.model.ListCurrenciesResponse;
import com.konfigthis.nuitee.client.model.ListHotels400Response;
import com.konfigthis.nuitee.client.model.ListHotels401Response;
import com.konfigthis.nuitee.client.model.ListHotelsResponse;
import com.konfigthis.nuitee.client.model.ListIataCodesResponse;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StaticDataApi
 */
@Ignore
public class StaticDataApiTest {

    private final StaticDataApi api = new StaticDataApi();

    /**
     * City list
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCitiesTest() throws Exception {
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
    public void listCountriesTest() throws Exception {
        ListCountriesResponse response = api.listCountries();
        // TODO: test validations
    }

    /**
     * Currency list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCurrenciesTest() throws Exception {
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
    @Test
    public void listHotelsTest() throws Exception {
        String countryCode = null;
        String hotelName = null;
        String cityName = null;
        Integer limit = null;
        Integer offset = null;
        BigDecimal latitude = null;
        BigDecimal longitude = null;
        Integer distance = null;
        String iataCode = null;
        ListHotelsResponse response = api.listHotels(countryCode, hotelName, cityName, limit, offset, latitude, longitude, distance, iataCode);
        // TODO: test validations
    }

    /**
     * IATA code list
     *
     * IATA codes list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listIataCodesTest() throws Exception {
        ListIataCodesResponse response = api.listIataCodes();
        // TODO: test validations
    }

}
