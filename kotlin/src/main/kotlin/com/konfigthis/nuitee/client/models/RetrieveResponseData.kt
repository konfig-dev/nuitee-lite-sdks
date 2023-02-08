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

import com.konfigthis.nuitee.client.models.BookResponseDataGuestInfo
import com.konfigthis.nuitee.client.models.RetrieveResponseDataBookedRoomsInner
import com.konfigthis.nuitee.client.models.RetrieveResponseDataCancellationPolicies

import com.squareup.moshi.Json

/**
 * 
 *
 * @param bookingId 
 * @param status 
 * @param hotelConfirmationCode 
 * @param checkin 
 * @param checkout 
 * @param bookedRooms 
 * @param guestInfo 
 * @param createdAt 
 * @param cancellationPolicies 
 */


data class RetrieveResponseData (

    @Json(name = "bookingId")
    val bookingId: kotlin.String? = null,

    @Json(name = "status")
    val status: kotlin.String? = null,

    @Json(name = "hotelConfirmationCode")
    val hotelConfirmationCode: kotlin.String? = null,

    @Json(name = "checkin")
    val checkin: kotlin.String? = null,

    @Json(name = "checkout")
    val checkout: kotlin.String? = null,

    @Json(name = "bookedRooms")
    val bookedRooms: kotlin.collections.List<RetrieveResponseDataBookedRoomsInner>? = null,

    @Json(name = "guestInfo")
    val guestInfo: BookResponseDataGuestInfo? = null,

    @Json(name = "createdAt")
    val createdAt: kotlin.String? = null,

    @Json(name = "cancellationPolicies")
    val cancellationPolicies: RetrieveResponseDataCancellationPolicies? = null

)

