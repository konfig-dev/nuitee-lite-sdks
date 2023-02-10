/**
 * Lite API
 * lite api hotel booking api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * https://konfigthis.com
 * Do not edit the class manually.
 */

package com.konfigthis.nuitee.client.model;

import com.konfigthis.nuitee.client.model.GetHotels400ResponseError;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetHotelRates400Response {
  
  @SerializedName("error")
  private GetHotels400ResponseError error = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public GetHotels400ResponseError getError() {
    return error;
  }
  public void setError(GetHotels400ResponseError error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetHotelRates400Response getHotelRates400Response = (GetHotelRates400Response) o;
    return (this.error == null ? getHotelRates400Response.error == null : this.error.equals(getHotelRates400Response.error));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.error == null ? 0: this.error.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHotelRates400Response {\n");
    
    sb.append("  error: ").append(error).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
