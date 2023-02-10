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

import com.konfigthis.nuitee.client.model.PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies;
import com.konfigthis.nuitee.client.model.PrebookResponseDataRoomTypesInnerRatesInnerRetailRate;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PrebookResponseDataRoomTypesInnerRatesInner {
  
  @SerializedName("rateId")
  private String rateId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("maxOccupancy")
  private Integer maxOccupancy = null;
  @SerializedName("retailRate")
  private PrebookResponseDataRoomTypesInnerRatesInnerRetailRate retailRate = null;
  @SerializedName("cancellationPolicies")
  private PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies cancellationPolicies = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRateId() {
    return rateId;
  }
  public void setRateId(String rateId) {
    this.rateId = rateId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMaxOccupancy() {
    return maxOccupancy;
  }
  public void setMaxOccupancy(Integer maxOccupancy) {
    this.maxOccupancy = maxOccupancy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PrebookResponseDataRoomTypesInnerRatesInnerRetailRate getRetailRate() {
    return retailRate;
  }
  public void setRetailRate(PrebookResponseDataRoomTypesInnerRatesInnerRetailRate retailRate) {
    this.retailRate = retailRate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies getCancellationPolicies() {
    return cancellationPolicies;
  }
  public void setCancellationPolicies(PrebookResponseDataRoomTypesInnerRatesInnerCancellationPolicies cancellationPolicies) {
    this.cancellationPolicies = cancellationPolicies;
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
    return (this.rateId == null ? prebookResponseDataRoomTypesInnerRatesInner.rateId == null : this.rateId.equals(prebookResponseDataRoomTypesInnerRatesInner.rateId)) &&
        (this.name == null ? prebookResponseDataRoomTypesInnerRatesInner.name == null : this.name.equals(prebookResponseDataRoomTypesInnerRatesInner.name)) &&
        (this.maxOccupancy == null ? prebookResponseDataRoomTypesInnerRatesInner.maxOccupancy == null : this.maxOccupancy.equals(prebookResponseDataRoomTypesInnerRatesInner.maxOccupancy)) &&
        (this.retailRate == null ? prebookResponseDataRoomTypesInnerRatesInner.retailRate == null : this.retailRate.equals(prebookResponseDataRoomTypesInnerRatesInner.retailRate)) &&
        (this.cancellationPolicies == null ? prebookResponseDataRoomTypesInnerRatesInner.cancellationPolicies == null : this.cancellationPolicies.equals(prebookResponseDataRoomTypesInnerRatesInner.cancellationPolicies));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.rateId == null ? 0: this.rateId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.maxOccupancy == null ? 0: this.maxOccupancy.hashCode());
    result = 31 * result + (this.retailRate == null ? 0: this.retailRate.hashCode());
    result = 31 * result + (this.cancellationPolicies == null ? 0: this.cancellationPolicies.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrebookResponseDataRoomTypesInnerRatesInner {\n");
    
    sb.append("  rateId: ").append(rateId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  maxOccupancy: ").append(maxOccupancy).append("\n");
    sb.append("  retailRate: ").append(retailRate).append("\n");
    sb.append("  cancellationPolicies: ").append(cancellationPolicies).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
