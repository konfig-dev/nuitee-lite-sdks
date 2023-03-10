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
import com.konfigthis.nuitee.client.model.RetrieveResponseDataBookedRoomsInnerRate;
import com.konfigthis.nuitee.client.model.RetrieveResponseDataBookedRoomsInnerRoomType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * RetrieveResponseDataBookedRoomsInner
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RetrieveResponseDataBookedRoomsInner {
  public static final String SERIALIZED_NAME_ROOM_TYPE = "roomType";
  @SerializedName(SERIALIZED_NAME_ROOM_TYPE)
  private RetrieveResponseDataBookedRoomsInnerRoomType roomType;

  public static final String SERIALIZED_NAME_ADULTS = "adults";
  @SerializedName(SERIALIZED_NAME_ADULTS)
  private Integer adults;

  public static final String SERIALIZED_NAME_CHILD_COUNT = "childCount";
  @SerializedName(SERIALIZED_NAME_CHILD_COUNT)
  private Integer childCount;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private RetrieveResponseDataBookedRoomsInnerRate rate;

  public RetrieveResponseDataBookedRoomsInner() {
  }

  public RetrieveResponseDataBookedRoomsInner roomType(RetrieveResponseDataBookedRoomsInnerRoomType roomType) {
    
    this.roomType = roomType;
    return this;
  }

   /**
   * Get roomType
   * @return roomType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetrieveResponseDataBookedRoomsInnerRoomType getRoomType() {
    return roomType;
  }


  public void setRoomType(RetrieveResponseDataBookedRoomsInnerRoomType roomType) {
    this.roomType = roomType;
  }


  public RetrieveResponseDataBookedRoomsInner adults(Integer adults) {
    
    this.adults = adults;
    return this;
  }

   /**
   * Get adults
   * @return adults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAdults() {
    return adults;
  }


  public void setAdults(Integer adults) {
    this.adults = adults;
  }


  public RetrieveResponseDataBookedRoomsInner childCount(Integer childCount) {
    
    this.childCount = childCount;
    return this;
  }

   /**
   * Get childCount
   * @return childCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getChildCount() {
    return childCount;
  }


  public void setChildCount(Integer childCount) {
    this.childCount = childCount;
  }


  public RetrieveResponseDataBookedRoomsInner rate(RetrieveResponseDataBookedRoomsInnerRate rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetrieveResponseDataBookedRoomsInnerRate getRate() {
    return rate;
  }


  public void setRate(RetrieveResponseDataBookedRoomsInnerRate rate) {
    this.rate = rate;
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
   * @return the RetrieveResponseDataBookedRoomsInner instance itself
   */
  public RetrieveResponseDataBookedRoomsInner putAdditionalProperty(String key, Object value) {
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
    RetrieveResponseDataBookedRoomsInner retrieveResponseDataBookedRoomsInner = (RetrieveResponseDataBookedRoomsInner) o;
    return Objects.equals(this.roomType, retrieveResponseDataBookedRoomsInner.roomType) &&
        Objects.equals(this.adults, retrieveResponseDataBookedRoomsInner.adults) &&
        Objects.equals(this.childCount, retrieveResponseDataBookedRoomsInner.childCount) &&
        Objects.equals(this.rate, retrieveResponseDataBookedRoomsInner.rate)&&
        Objects.equals(this.additionalProperties, retrieveResponseDataBookedRoomsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomType, adults, childCount, rate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveResponseDataBookedRoomsInner {\n");
    sb.append("    roomType: ").append(toIndentedString(roomType)).append("\n");
    sb.append("    adults: ").append(toIndentedString(adults)).append("\n");
    sb.append("    childCount: ").append(toIndentedString(childCount)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
    openapiFields.add("roomType");
    openapiFields.add("adults");
    openapiFields.add("childCount");
    openapiFields.add("rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveResponseDataBookedRoomsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RetrieveResponseDataBookedRoomsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveResponseDataBookedRoomsInner is not found in the empty JSON string", RetrieveResponseDataBookedRoomsInner.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `roomType`
      if (jsonObj.get("roomType") != null && !jsonObj.get("roomType").isJsonNull()) {
        RetrieveResponseDataBookedRoomsInnerRoomType.validateJsonObject(jsonObj.getAsJsonObject("roomType"));
      }
      // validate the optional field `rate`
      if (jsonObj.get("rate") != null && !jsonObj.get("rate").isJsonNull()) {
        RetrieveResponseDataBookedRoomsInnerRate.validateJsonObject(jsonObj.getAsJsonObject("rate"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveResponseDataBookedRoomsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveResponseDataBookedRoomsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveResponseDataBookedRoomsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveResponseDataBookedRoomsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveResponseDataBookedRoomsInner>() {
           @Override
           public void write(JsonWriter out, RetrieveResponseDataBookedRoomsInner value) throws IOException {
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
           public RetrieveResponseDataBookedRoomsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RetrieveResponseDataBookedRoomsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RetrieveResponseDataBookedRoomsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveResponseDataBookedRoomsInner
  * @throws IOException if the JSON string is invalid with respect to RetrieveResponseDataBookedRoomsInner
  */
  public static RetrieveResponseDataBookedRoomsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveResponseDataBookedRoomsInner.class);
  }

 /**
  * Convert an instance of RetrieveResponseDataBookedRoomsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

