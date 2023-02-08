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

import com.konfigthis.nuitee.client.models.GetHotelsResponseDataInner

import com.squareup.moshi.Json

/**
 * 
 *
 * @param `data` 
 * @param guestLevel guests loyalty level granting them discounts and benefits 
 * @param sandbox 
 * @param sessionId 
 */


data class GetHotelsResponse (

    @Json(name = "data")
    val `data`: kotlin.collections.List<GetHotelsResponseDataInner>? = null,

    /* guests loyalty level granting them discounts and benefits  */
    @Json(name = "guestLevel")
    val guestLevel: kotlin.Int? = null,

    @Json(name = "sandbox")
    val sandbox: kotlin.Boolean? = null,

    @Json(name = "sessionId")
    val sessionId: kotlin.String? = null

)

