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
import com.konfigthis.nuitee.client.model.PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies;
import com.konfigthis.nuitee.client.model.PrebookResponseDataRoomTypesInnerRatesInnerRetailRate;
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
 * PrebookResponseDataRoomTypesInnerRatesInner
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PrebookResponseDataRoomTypesInnerRatesInner {
  public static final String SERIALIZED_NAME_RATE_ID = "rateId";
  @SerializedName(SERIALIZED_NAME_RATE_ID)
  private String rateId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MAX_OCCUPANCY = "maxOccupancy";
  @SerializedName(SERIALIZED_NAME_MAX_OCCUPANCY)
  private Integer maxOccupancy;

  public static final String SERIALIZED_NAME_RETAIL_RATE = "retailRate";
  @SerializedName(SERIALIZED_NAME_RETAIL_RATE)
  private PrebookResponseDataRoomTypesInnerRatesInnerRetailRate retailRate;

  public static final String SERIALIZED_NAME_CANCELLATION_POLICIES = "cancellationPolicies";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_POLICIES)
  private PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies cancellationPolicies;

  public PrebookResponseDataRoomTypesInnerRatesInner() {
  }

  public PrebookResponseDataRoomTypesInnerRatesInner rateId(String rateId) {
    
    this.rateId = rateId;
    return this;
  }

   /**
   * Get rateId
   * @return rateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRateId() {
    return rateId;
  }


  public void setRateId(String rateId) {
    this.rateId = rateId;
  }


  public PrebookResponseDataRoomTypesInnerRatesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PrebookResponseDataRoomTypesInnerRatesInner maxOccupancy(Integer maxOccupancy) {
    
    this.maxOccupancy = maxOccupancy;
    return this;
  }

   /**
   * Get maxOccupancy
   * @return maxOccupancy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxOccupancy() {
    return maxOccupancy;
  }


  public void setMaxOccupancy(Integer maxOccupancy) {
    this.maxOccupancy = maxOccupancy;
  }


  public PrebookResponseDataRoomTypesInnerRatesInner retailRate(PrebookResponseDataRoomTypesInnerRatesInnerRetailRate retailRate) {
    
    this.retailRate = retailRate;
    return this;
  }

   /**
   * Get retailRate
   * @return retailRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PrebookResponseDataRoomTypesInnerRatesInnerRetailRate getRetailRate() {
    return retailRate;
  }


  public void setRetailRate(PrebookResponseDataRoomTypesInnerRatesInnerRetailRate retailRate) {
    this.retailRate = retailRate;
  }


  public PrebookResponseDataRoomTypesInnerRatesInner cancellationPolicies(PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies cancellationPolicies) {
    
    this.cancellationPolicies = cancellationPolicies;
    return this;
  }

   /**
   * Get cancellationPolicies
   * @return cancellationPolicies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies getCancellationPolicies() {
    return cancellationPolicies;
  }


  public void setCancellationPolicies(PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies cancellationPolicies) {
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
   * @return the PrebookResponseDataRoomTypesInnerRatesInner instance itself
   */
  public PrebookResponseDataRoomTypesInnerRatesInner putAdditionalProperty(String key, Object value) {
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
    PrebookResponseDataRoomTypesInnerRatesInner prebookResponseDataRoomTypesInnerRatesInner = (PrebookResponseDataRoomTypesInnerRatesInner) o;
    return Objects.equals(this.rateId, prebookResponseDataRoomTypesInnerRatesInner.rateId) &&
        Objects.equals(this.name, prebookResponseDataRoomTypesInnerRatesInner.name) &&
        Objects.equals(this.maxOccupancy, prebookResponseDataRoomTypesInnerRatesInner.maxOccupancy) &&
        Objects.equals(this.retailRate, prebookResponseDataRoomTypesInnerRatesInner.retailRate) &&
        Objects.equals(this.cancellationPolicies, prebookResponseDataRoomTypesInnerRatesInner.cancellationPolicies)&&
        Objects.equals(this.additionalProperties, prebookResponseDataRoomTypesInnerRatesInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateId, name, maxOccupancy, retailRate, cancellationPolicies, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrebookResponseDataRoomTypesInnerRatesInner {\n");
    sb.append("    rateId: ").append(toIndentedString(rateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    maxOccupancy: ").append(toIndentedString(maxOccupancy)).append("\n");
    sb.append("    retailRate: ").append(toIndentedString(retailRate)).append("\n");
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
    openapiFields.add("rateId");
    openapiFields.add("name");
    openapiFields.add("maxOccupancy");
    openapiFields.add("retailRate");
    openapiFields.add("cancellationPolicies");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PrebookResponseDataRoomTypesInnerRatesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PrebookResponseDataRoomTypesInnerRatesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrebookResponseDataRoomTypesInnerRatesInner is not found in the empty JSON string", PrebookResponseDataRoomTypesInnerRatesInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("rateId") != null && !jsonObj.get("rateId").isJsonNull()) && !jsonObj.get("rateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rateId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `retailRate`
      if (jsonObj.get("retailRate") != null && !jsonObj.get("retailRate").isJsonNull()) {
        PrebookResponseDataRoomTypesInnerRatesInnerRetailRate.validateJsonObject(jsonObj.getAsJsonObject("retailRate"));
      }
      // validate the optional field `cancellationPolicies`
      if (jsonObj.get("cancellationPolicies") != null && !jsonObj.get("cancellationPolicies").isJsonNull()) {
        PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies.validateJsonObject(jsonObj.getAsJsonObject("cancellationPolicies"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrebookResponseDataRoomTypesInnerRatesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrebookResponseDataRoomTypesInnerRatesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrebookResponseDataRoomTypesInnerRatesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrebookResponseDataRoomTypesInnerRatesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PrebookResponseDataRoomTypesInnerRatesInner>() {
           @Override
           public void write(JsonWriter out, PrebookResponseDataRoomTypesInnerRatesInner value) throws IOException {
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
           public PrebookResponseDataRoomTypesInnerRatesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PrebookResponseDataRoomTypesInnerRatesInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PrebookResponseDataRoomTypesInnerRatesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PrebookResponseDataRoomTypesInnerRatesInner
  * @throws IOException if the JSON string is invalid with respect to PrebookResponseDataRoomTypesInnerRatesInner
  */
  public static PrebookResponseDataRoomTypesInnerRatesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrebookResponseDataRoomTypesInnerRatesInner.class);
  }

 /**
  * Convert an instance of PrebookResponseDataRoomTypesInnerRatesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

