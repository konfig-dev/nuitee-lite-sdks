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

import com.konfigthis.nuitee.client.models.PrebookResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner

import com.squareup.moshi.Json

/**
 * 
 *
 * @param cancelPolicyInfos 
 * @param hotelRemarks 
 * @param refundableTag 
 */


data class RetrieveResponseDataCancellationPolicies (

    @Json(name = "cancelPolicyInfos")
    val cancelPolicyInfos: kotlin.collections.List<PrebookResponseDataRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner>? = null,

    @Json(name = "hotelRemarks")
    val hotelRemarks: kotlin.String? = null,

    @Json(name = "refundableTag")
    val refundableTag: kotlin.String? = null

)

