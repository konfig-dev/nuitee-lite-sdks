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


package com.konfigthis.nuitee.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.nuitee.client.model.BookResponseDataGuestInfo;
import com.konfigthis.nuitee.client.model.RetrieveResponseDataBookedRoomsInner;
import com.konfigthis.nuitee.client.model.RetrieveResponseDataCancellationPolicies;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.nuitee.client.JSON;

/**
 * RetrieveResponseData
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RetrieveResponseData {
  public static final String SERIALIZED_NAME_BOOKING_ID = "bookingId";
  @SerializedName(SERIALIZED_NAME_BOOKING_ID)
  private String bookingId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_HOTEL_CONFIRMATION_CODE = "hotelConfirmationCode";
  @SerializedName(SERIALIZED_NAME_HOTEL_CONFIRMATION_CODE)
  private String hotelConfirmationCode;

  public static final String SERIALIZED_NAME_CHECKIN = "checkin";
  @SerializedName(SERIALIZED_NAME_CHECKIN)
  private String checkin;

  public static final String SERIALIZED_NAME_CHECKOUT = "checkout";
  @SerializedName(SERIALIZED_NAME_CHECKOUT)
  private String checkout;

  public static final String SERIALIZED_NAME_BOOKED_ROOMS = "bookedRooms";
  @SerializedName(SERIALIZED_NAME_BOOKED_ROOMS)
  private List<RetrieveResponseDataBookedRoomsInner> bookedRooms = null;

  public static final String SERIALIZED_NAME_GUEST_INFO = "guestInfo";
  @SerializedName(SERIALIZED_NAME_GUEST_INFO)
  private BookResponseDataGuestInfo guestInfo;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CANCELLATION_POLICIES = "cancellationPolicies";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_POLICIES)
  private RetrieveResponseDataCancellationPolicies cancellationPolicies;

  public RetrieveResponseData() {
  }

  public RetrieveResponseData bookingId(String bookingId) {
    
    this.bookingId = bookingId;
    return this;
  }

   /**
   * Get bookingId
   * @return bookingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBookingId() {
    return bookingId;
  }


  public void setBookingId(String bookingId) {
    this.bookingId = bookingId;
  }


  public RetrieveResponseData status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public RetrieveResponseData hotelConfirmationCode(String hotelConfirmationCode) {
    
    this.hotelConfirmationCode = hotelConfirmationCode;
    return this;
  }

   /**
   * Get hotelConfirmationCode
   * @return hotelConfirmationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHotelConfirmationCode() {
    return hotelConfirmationCode;
  }


  public void setHotelConfirmationCode(String hotelConfirmationCode) {
    this.hotelConfirmationCode = hotelConfirmationCode;
  }


  public RetrieveResponseData checkin(String checkin) {
    
    this.checkin = checkin;
    return this;
  }

   /**
   * Get checkin
   * @return checkin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCheckin() {
    return checkin;
  }


  public void setCheckin(String checkin) {
    this.checkin = checkin;
  }


  public RetrieveResponseData checkout(String checkout) {
    
    this.checkout = checkout;
    return this;
  }

   /**
   * Get checkout
   * @return checkout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCheckout() {
    return checkout;
  }


  public void setCheckout(String checkout) {
    this.checkout = checkout;
  }


  public RetrieveResponseData bookedRooms(List<RetrieveResponseDataBookedRoomsInner> bookedRooms) {
    
    this.bookedRooms = bookedRooms;
    return this;
  }

  public RetrieveResponseData addBookedRoomsItem(RetrieveResponseDataBookedRoomsInner bookedRoomsItem) {
    if (this.bookedRooms == null) {
      this.bookedRooms = new ArrayList<>();
    }
    this.bookedRooms.add(bookedRoomsItem);
    return this;
  }

   /**
   * Get bookedRooms
   * @return bookedRooms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RetrieveResponseDataBookedRoomsInner> getBookedRooms() {
    return bookedRooms;
  }


  public void setBookedRooms(List<RetrieveResponseDataBookedRoomsInner> bookedRooms) {
    this.bookedRooms = bookedRooms;
  }


  public RetrieveResponseData guestInfo(BookResponseDataGuestInfo guestInfo) {
    
    this.guestInfo = guestInfo;
    return this;
  }

   /**
   * Get guestInfo
   * @return guestInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BookResponseDataGuestInfo getGuestInfo() {
    return guestInfo;
  }


  public void setGuestInfo(BookResponseDataGuestInfo guestInfo) {
    this.guestInfo = guestInfo;
  }


  public RetrieveResponseData createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public RetrieveResponseData cancellationPolicies(RetrieveResponseDataCancellationPolicies cancellationPolicies) {
    
    this.cancellationPolicies = cancellationPolicies;
    return this;
  }

   /**
   * Get cancellationPolicies
   * @return cancellationPolicies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetrieveResponseDataCancellationPolicies getCancellationPolicies() {
    return cancellationPolicies;
  }


  public void setCancellationPolicies(RetrieveResponseDataCancellationPolicies cancellationPolicies) {
    this.cancellationPolicies = cancellationPolicies;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the RetrieveResponseData instance itself
   */
  public RetrieveResponseData putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveResponseData retrieveResponseData = (RetrieveResponseData) o;
    return Objects.equals(this.bookingId, retrieveResponseData.bookingId) &&
        Objects.equals(this.status, retrieveResponseData.status) &&
        Objects.equals(this.hotelConfirmationCode, retrieveResponseData.hotelConfirmationCode) &&
        Objects.equals(this.checkin, retrieveResponseData.checkin) &&
        Objects.equals(this.checkout, retrieveResponseData.checkout) &&
        Objects.equals(this.bookedRooms, retrieveResponseData.bookedRooms) &&
        Objects.equals(this.guestInfo, retrieveResponseData.guestInfo) &&
        Objects.equals(this.createdAt, retrieveResponseData.createdAt) &&
        Objects.equals(this.cancellationPolicies, retrieveResponseData.cancellationPolicies)&&
        Objects.equals(this.additionalProperties, retrieveResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingId, status, hotelConfirmationCode, checkin, checkout, bookedRooms, guestInfo, createdAt, cancellationPolicies, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveResponseData {\n");
    sb.append("    bookingId: ").append(toIndentedString(bookingId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hotelConfirmationCode: ").append(toIndentedString(hotelConfirmationCode)).append("\n");
    sb.append("    checkin: ").append(toIndentedString(checkin)).append("\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
    sb.append("    bookedRooms: ").append(toIndentedString(bookedRooms)).append("\n");
    sb.append("    guestInfo: ").append(toIndentedString(guestInfo)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    cancellationPolicies: ").append(toIndentedString(cancellationPolicies)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("bookingId");
    openapiFields.add("status");
    openapiFields.add("hotelConfirmationCode");
    openapiFields.add("checkin");
    openapiFields.add("checkout");
    openapiFields.add("bookedRooms");
    openapiFields.add("guestInfo");
    openapiFields.add("createdAt");
    openapiFields.add("cancellationPolicies");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetrieveResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveResponseData is not found in the empty JSON string", RetrieveResponseData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("bookingId") != null && !jsonObj.get("bookingId").isJsonNull()) && !jsonObj.get("bookingId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bookingId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bookingId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("hotelConfirmationCode") != null && !jsonObj.get("hotelConfirmationCode").isJsonNull()) && !jsonObj.get("hotelConfirmationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hotelConfirmationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hotelConfirmationCode").toString()));
      }
      if ((jsonObj.get("checkin") != null && !jsonObj.get("checkin").isJsonNull()) && !jsonObj.get("checkin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkin").toString()));
      }
      if ((jsonObj.get("checkout") != null && !jsonObj.get("checkout").isJsonNull()) && !jsonObj.get("checkout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkout").toString()));
      }
      if (jsonObj.get("bookedRooms") != null && !jsonObj.get("bookedRooms").isJsonNull()) {
        JsonArray jsonArraybookedRooms = jsonObj.getAsJsonArray("bookedRooms");
        if (jsonArraybookedRooms != null) {
          // ensure the json data is an array
          if (!jsonObj.get("bookedRooms").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `bookedRooms` to be an array in the JSON string but got `%s`", jsonObj.get("bookedRooms").toString()));
          }

          // validate the optional field `bookedRooms` (array)
          for (int i = 0; i < jsonArraybookedRooms.size(); i++) {
            RetrieveResponseDataBookedRoomsInner.validateJsonObject(jsonArraybookedRooms.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `guestInfo`
      if (jsonObj.get("guestInfo") != null && !jsonObj.get("guestInfo").isJsonNull()) {
        BookResponseDataGuestInfo.validateJsonObject(jsonObj.getAsJsonObject("guestInfo"));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      // validate the optional field `cancellationPolicies`
      if (jsonObj.get("cancellationPolicies") != null && !jsonObj.get("cancellationPolicies").isJsonNull()) {
        RetrieveResponseDataCancellationPolicies.validateJsonObject(jsonObj.getAsJsonObject("cancellationPolicies"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveResponseData>() {
           @Override
           public void write(JsonWriter out, RetrieveResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RetrieveResponseData instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrieveResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveResponseData
  * @throws IOException if the JSON string is invalid with respect to RetrieveResponseData
  */
  public static RetrieveResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveResponseData.class);
  }

 /**
  * Convert an instance of RetrieveResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

