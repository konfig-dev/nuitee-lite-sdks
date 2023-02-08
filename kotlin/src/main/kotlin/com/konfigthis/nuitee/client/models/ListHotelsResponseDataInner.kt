/**
 *
 * Please note:
 * This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.konfigthis.nuitee.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param name 
 * @param hotelDescription 
 * @param hotelImportantInformation 
 * @param currency 
 * @param country 
 * @param city 
 * @param latitude 
 * @param longitude 
 * @param address 
 * @param zip 
 */


data class ListHotelsResponseDataInner (

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "hotelDescription")
    val hotelDescription: kotlin.String? = null,

    @Json(name = "hotelImportantInformation")
    val hotelImportantInformation: kotlin.String? = null,

    @Json(name = "currency")
    val currency: kotlin.String? = null,

    @Json(name = "country")
    val country: kotlin.String? = null,

    @Json(name = "city")
    val city: kotlin.String? = null,

    @Json(name = "latitude")
    val latitude: java.math.BigDecimal? = null,

    @Json(name = "longitude")
    val longitude: java.math.BigDecimal? = null,

    @Json(name = "address")
    val address: kotlin.String? = null,

    @Json(name = "zip")
    val zip: kotlin.String? = null

)

