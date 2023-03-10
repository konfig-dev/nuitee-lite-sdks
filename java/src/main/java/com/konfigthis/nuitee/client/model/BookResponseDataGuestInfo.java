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
 * BookResponseDataGuestInfo
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BookResponseDataGuestInfo {
  public static final String SERIALIZED_NAME_GUEST_FIRST_NAME = "guestFirstName";
  @SerializedName(SERIALIZED_NAME_GUEST_FIRST_NAME)
  private String guestFirstName;

  public static final String SERIALIZED_NAME_GUEST_LAST_NAME = "guestLastName";
  @SerializedName(SERIALIZED_NAME_GUEST_LAST_NAME)
  private String guestLastName;

  public static final String SERIALIZED_NAME_GUEST_EMAIL = "guestEmail";
  @SerializedName(SERIALIZED_NAME_GUEST_EMAIL)
  private String guestEmail;

  public BookResponseDataGuestInfo() {
  }

  public BookResponseDataGuestInfo guestFirstName(String guestFirstName) {
    
    this.guestFirstName = guestFirstName;
    return this;
  }

   /**
   * Get guestFirstName
   * @return guestFirstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestFirstName() {
    return guestFirstName;
  }


  public void setGuestFirstName(String guestFirstName) {
    this.guestFirstName = guestFirstName;
  }


  public BookResponseDataGuestInfo guestLastName(String guestLastName) {
    
    this.guestLastName = guestLastName;
    return this;
  }

   /**
   * Get guestLastName
   * @return guestLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestLastName() {
    return guestLastName;
  }


  public void setGuestLastName(String guestLastName) {
    this.guestLastName = guestLastName;
  }


  public BookResponseDataGuestInfo guestEmail(String guestEmail) {
    
    this.guestEmail = guestEmail;
    return this;
  }

   /**
   * Get guestEmail
   * @return guestEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGuestEmail() {
    return guestEmail;
  }


  public void setGuestEmail(String guestEmail) {
    this.guestEmail = guestEmail;
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
   * @return the BookResponseDataGuestInfo instance itself
   */
  public BookResponseDataGuestInfo putAdditionalProperty(String key, Object value) {
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
    BookResponseDataGuestInfo bookResponseDataGuestInfo = (BookResponseDataGuestInfo) o;
    return Objects.equals(this.guestFirstName, bookResponseDataGuestInfo.guestFirstName) &&
        Objects.equals(this.guestLastName, bookResponseDataGuestInfo.guestLastName) &&
        Objects.equals(this.guestEmail, bookResponseDataGuestInfo.guestEmail)&&
        Objects.equals(this.additionalProperties, bookResponseDataGuestInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guestFirstName, guestLastName, guestEmail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookResponseDataGuestInfo {\n");
    sb.append("    guestFirstName: ").append(toIndentedString(guestFirstName)).append("\n");
    sb.append("    guestLastName: ").append(toIndentedString(guestLastName)).append("\n");
    sb.append("    guestEmail: ").append(toIndentedString(guestEmail)).append("\n");
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
    openapiFields.add("guestFirstName");
    openapiFields.add("guestLastName");
    openapiFields.add("guestEmail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BookResponseDataGuestInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BookResponseDataGuestInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BookResponseDataGuestInfo is not found in the empty JSON string", BookResponseDataGuestInfo.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("guestFirstName") != null && !jsonObj.get("guestFirstName").isJsonNull()) && !jsonObj.get("guestFirstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guestFirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guestFirstName").toString()));
      }
      if ((jsonObj.get("guestLastName") != null && !jsonObj.get("guestLastName").isJsonNull()) && !jsonObj.get("guestLastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guestLastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guestLastName").toString()));
      }
      if ((jsonObj.get("guestEmail") != null && !jsonObj.get("guestEmail").isJsonNull()) && !jsonObj.get("guestEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guestEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guestEmail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BookResponseDataGuestInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BookResponseDataGuestInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BookResponseDataGuestInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BookResponseDataGuestInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BookResponseDataGuestInfo>() {
           @Override
           public void write(JsonWriter out, BookResponseDataGuestInfo value) throws IOException {
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
           public BookResponseDataGuestInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BookResponseDataGuestInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BookResponseDataGuestInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BookResponseDataGuestInfo
  * @throws IOException if the JSON string is invalid with respect to BookResponseDataGuestInfo
  */
  public static BookResponseDataGuestInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BookResponseDataGuestInfo.class);
  }

 /**
  * Convert an instance of BookResponseDataGuestInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

