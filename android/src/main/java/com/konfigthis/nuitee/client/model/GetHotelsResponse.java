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

import com.konfigthis.nuitee.client.model.GetHotelsResponseDataInner;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GetHotelsResponse {
  
  @SerializedName("data")
  private List<GetHotelsResponseDataInner> data = null;
  @SerializedName("guestLevel")
  private Integer guestLevel = null;
  @SerializedName("sandbox")
  private Boolean sandbox = null;
  @SerializedName("sessionId")
  private String sessionId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<GetHotelsResponseDataInner> getData() {
    return data;
  }
  public void setData(List<GetHotelsResponseDataInner> data) {
    this.data = data;
  }

  /**
   * guests loyalty level granting them discounts and benefits 
   **/
  @ApiModelProperty(value = "guests loyalty level granting them discounts and benefits ")
  public Integer getGuestLevel() {
    return guestLevel;
  }
  public void setGuestLevel(Integer guestLevel) {
    this.guestLevel = guestLevel;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSandbox() {
    return sandbox;
  }
  public void setSandbox(Boolean sandbox) {
    this.sandbox = sandbox;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetHotelsResponse getHotelsResponse = (GetHotelsResponse) o;
    return (this.data == null ? getHotelsResponse.data == null : this.data.equals(getHotelsResponse.data)) &&
        (this.guestLevel == null ? getHotelsResponse.guestLevel == null : this.guestLevel.equals(getHotelsResponse.guestLevel)) &&
        (this.sandbox == null ? getHotelsResponse.sandbox == null : this.sandbox.equals(getHotelsResponse.sandbox)) &&
        (this.sessionId == null ? getHotelsResponse.sessionId == null : this.sessionId.equals(getHotelsResponse.sessionId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.guestLevel == null ? 0: this.guestLevel.hashCode());
    result = 31 * result + (this.sandbox == null ? 0: this.sandbox.hashCode());
    result = 31 * result + (this.sessionId == null ? 0: this.sessionId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetHotelsResponse {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("  guestLevel: ").append(guestLevel).append("\n");
    sb.append("  sandbox: ").append(sandbox).append("\n");
    sb.append("  sessionId: ").append(sessionId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
