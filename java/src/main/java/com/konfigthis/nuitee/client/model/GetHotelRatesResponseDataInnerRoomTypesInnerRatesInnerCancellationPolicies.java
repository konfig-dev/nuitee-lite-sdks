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
import com.konfigthis.nuitee.client.model.GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies {
  public static final String SERIALIZED_NAME_CANCEL_POLICY_INFOS = "cancelPolicyInfos";
  @SerializedName(SERIALIZED_NAME_CANCEL_POLICY_INFOS)
  private List<GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner> cancelPolicyInfos = null;

  public static final String SERIALIZED_NAME_HOTEL_REMARKS = "hotelRemarks";
  @SerializedName(SERIALIZED_NAME_HOTEL_REMARKS)
  private List<String> hotelRemarks = null;

  public static final String SERIALIZED_NAME_REFUNDABLE_TAG = "refundableTag";
  @SerializedName(SERIALIZED_NAME_REFUNDABLE_TAG)
  private String refundableTag;

  public GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies() {
  }

  public GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies cancelPolicyInfos(List<GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner> cancelPolicyInfos) {
    
    this.cancelPolicyInfos = cancelPolicyInfos;
    return this;
  }

  public GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies addCancelPolicyInfosItem(GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner cancelPolicyInfosItem) {
    if (this.cancelPolicyInfos == null) {
      this.cancelPolicyInfos = new ArrayList<>();
    }
    this.cancelPolicyInfos.add(cancelPolicyInfosItem);
    return this;
  }

   /**
   * Get cancelPolicyInfos
   * @return cancelPolicyInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner> getCancelPolicyInfos() {
    return cancelPolicyInfos;
  }


  public void setCancelPolicyInfos(List<GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner> cancelPolicyInfos) {
    this.cancelPolicyInfos = cancelPolicyInfos;
  }


  public GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies hotelRemarks(List<String> hotelRemarks) {
    
    this.hotelRemarks = hotelRemarks;
    return this;
  }

  public GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies addHotelRemarksItem(String hotelRemarksItem) {
    if (this.hotelRemarks == null) {
      this.hotelRemarks = new ArrayList<>();
    }
    this.hotelRemarks.add(hotelRemarksItem);
    return this;
  }

   /**
   * Get hotelRemarks
   * @return hotelRemarks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getHotelRemarks() {
    return hotelRemarks;
  }


  public void setHotelRemarks(List<String> hotelRemarks) {
    this.hotelRemarks = hotelRemarks;
  }


  public GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies refundableTag(String refundableTag) {
    
    this.refundableTag = refundableTag;
    return this;
  }

   /**
   * Get refundableTag
   * @return refundableTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefundableTag() {
    return refundableTag;
  }


  public void setRefundableTag(String refundableTag) {
    this.refundableTag = refundableTag;
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
   * @return the GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies instance itself
   */
  public GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies putAdditionalProperty(String key, Object value) {
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
    GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies getHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies = (GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies) o;
    return Objects.equals(this.cancelPolicyInfos, getHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies.cancelPolicyInfos) &&
        Objects.equals(this.hotelRemarks, getHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies.hotelRemarks) &&
        Objects.equals(this.refundableTag, getHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies.refundableTag)&&
        Objects.equals(this.additionalProperties, getHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelPolicyInfos, hotelRemarks, refundableTag, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies {\n");
    sb.append("    cancelPolicyInfos: ").append(toIndentedString(cancelPolicyInfos)).append("\n");
    sb.append("    hotelRemarks: ").append(toIndentedString(hotelRemarks)).append("\n");
    sb.append("    refundableTag: ").append(toIndentedString(refundableTag)).append("\n");
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
    openapiFields.add("cancelPolicyInfos");
    openapiFields.add("hotelRemarks");
    openapiFields.add("refundableTag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies is not found in the empty JSON string", GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("cancelPolicyInfos") != null && !jsonObj.get("cancelPolicyInfos").isJsonNull()) {
        JsonArray jsonArraycancelPolicyInfos = jsonObj.getAsJsonArray("cancelPolicyInfos");
        if (jsonArraycancelPolicyInfos != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cancelPolicyInfos").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cancelPolicyInfos` to be an array in the JSON string but got `%s`", jsonObj.get("cancelPolicyInfos").toString()));
          }

          // validate the optional field `cancelPolicyInfos` (array)
          for (int i = 0; i < jsonArraycancelPolicyInfos.size(); i++) {
            GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPoliciesCancelPolicyInfosInner.validateJsonObject(jsonArraycancelPolicyInfos.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("hotelRemarks") != null && !jsonObj.get("hotelRemarks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hotelRemarks` to be an array in the JSON string but got `%s`", jsonObj.get("hotelRemarks").toString()));
      }
      if ((jsonObj.get("refundableTag") != null && !jsonObj.get("refundableTag").isJsonNull()) && !jsonObj.get("refundableTag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refundableTag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refundableTag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies.class));

       return (TypeAdapter<T>) new TypeAdapter<GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies>() {
           @Override
           public void write(JsonWriter out, GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies value) throws IOException {
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
           public GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies
  * @throws IOException if the JSON string is invalid with respect to GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies
  */
  public static GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies.class);
  }

 /**
  * Convert an instance of GetHotelRatesResponseDataInnerRoomTypesInnerRatesInnerCancellationPolicies to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

