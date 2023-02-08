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

package com.konfigthis.nuitee.client.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import com.konfigthis.nuitee.client.models.Cancel400Response
import com.konfigthis.nuitee.client.models.Cancel401Response
import com.konfigthis.nuitee.client.models.Cancel500Response
import com.konfigthis.nuitee.client.models.CancelResponse
import com.konfigthis.nuitee.client.models.ListBookingsResponse
import com.konfigthis.nuitee.client.models.Retrieve400Response
import com.konfigthis.nuitee.client.models.RetrieveResponse

import com.squareup.moshi.Json

import com.konfigthis.nuitee.client.infrastructure.ApiClient
import com.konfigthis.nuitee.client.infrastructure.ApiResponse
import com.konfigthis.nuitee.client.infrastructure.ClientException
import com.konfigthis.nuitee.client.infrastructure.ClientError
import com.konfigthis.nuitee.client.infrastructure.ServerException
import com.konfigthis.nuitee.client.infrastructure.ServerError
import com.konfigthis.nuitee.client.infrastructure.MultiValueMap
import com.konfigthis.nuitee.client.infrastructure.PartConfig
import com.konfigthis.nuitee.client.infrastructure.RequestConfig
import com.konfigthis.nuitee.client.infrastructure.RequestMethod
import com.konfigthis.nuitee.client.infrastructure.ResponseType
import com.konfigthis.nuitee.client.infrastructure.Success
import com.konfigthis.nuitee.client.infrastructure.toMultiValue

class BookingManagementApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://api.nlite.ml/v1.0")
        }
    }

    /**
     * Booking cancel
     * This endpoint allows you to cancel a booking based on a booking ID. The refund amount is based on the cancellation policies. &lt;!-- theme: danger --&gt;
     * @param bookingId (Required) The unique identifier of the booking you would like to update.
     * @return CancelResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun cancel(bookingId: kotlin.String) : CancelResponse {
        val localVarResponse = cancelWithHttpInfo(bookingId = bookingId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CancelResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Booking cancel
     * This endpoint allows you to cancel a booking based on a booking ID. The refund amount is based on the cancellation policies. &lt;!-- theme: danger --&gt;
     * @param bookingId (Required) The unique identifier of the booking you would like to update.
     * @return ApiResponse<CancelResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun cancelWithHttpInfo(bookingId: kotlin.String) : ApiResponse<CancelResponse?> {
        val localVariableConfig = cancelRequestConfig(bookingId = bookingId)

        return request<Unit, CancelResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation cancel
     *
     * @param bookingId (Required) The unique identifier of the booking you would like to update.
     * @return RequestConfig
     */
    fun cancelRequestConfig(bookingId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/bookings/{bookingId}".replace("{"+"bookingId"+"}", encodeURIComponent(bookingId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Booking list
     * List bookings by guestId
     * @param guestId guest id of bookings
     * @return ListBookingsResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listBookings(guestId: kotlin.String) : ListBookingsResponse {
        val localVarResponse = listBookingsWithHttpInfo(guestId = guestId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ListBookingsResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Booking list
     * List bookings by guestId
     * @param guestId guest id of bookings
     * @return ApiResponse<ListBookingsResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun listBookingsWithHttpInfo(guestId: kotlin.String) : ApiResponse<ListBookingsResponse?> {
        val localVariableConfig = listBookingsRequestConfig(guestId = guestId)

        return request<Unit, ListBookingsResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listBookings
     *
     * @param guestId guest id of bookings
     * @return RequestConfig
     */
    fun listBookingsRequestConfig(guestId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("guestId", listOf(guestId.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/bookings",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Booking retrieve
     * This endpoint allows you to retrieve all the information for specific booking ID.
     * @param bookingId (Required) The unique identifier of the booking you would like to update.
     * @return RetrieveResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun retrieve(bookingId: kotlin.String) : RetrieveResponse {
        val localVarResponse = retrieveWithHttpInfo(bookingId = bookingId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as RetrieveResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Booking retrieve
     * This endpoint allows you to retrieve all the information for specific booking ID.
     * @param bookingId (Required) The unique identifier of the booking you would like to update.
     * @return ApiResponse<RetrieveResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun retrieveWithHttpInfo(bookingId: kotlin.String) : ApiResponse<RetrieveResponse?> {
        val localVariableConfig = retrieveRequestConfig(bookingId = bookingId)

        return request<Unit, RetrieveResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation retrieve
     *
     * @param bookingId (Required) The unique identifier of the booking you would like to update.
     * @return RequestConfig
     */
    fun retrieveRequestConfig(bookingId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/bookings/{bookingId}".replace("{"+"bookingId"+"}", encodeURIComponent(bookingId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
