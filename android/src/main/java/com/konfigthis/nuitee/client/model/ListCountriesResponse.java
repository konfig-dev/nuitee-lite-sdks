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

import com.konfigthis.nuitee.client.model.ListCountriesResponseDataInner;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ListCountriesResponse {
  
  @SerializedName("data")
  private List<ListCountriesResponseDataInner> data = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ListCountriesResponseDataInner> getData() {
    return data;
  }
  public void setData(List<ListCountriesResponseDataInner> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCountriesResponse listCountriesResponse = (ListCountriesResponse) o;
    return (this.data == null ? listCountriesResponse.data == null : this.data.equals(listCountriesResponse.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCountriesResponse {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
