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

import com.konfigthis.nuitee.client.model.BookResponseDataBookedRoomsInnerRate;
import com.konfigthis.nuitee.client.model.BookResponseDataBookedRoomsInnerRoomType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BookResponseDataBookedRoomsInner {
  
  @SerializedName("roomType")
  private BookResponseDataBookedRoomsInnerRoomType roomType = null;
  @SerializedName("adults")
  private Integer adults = null;
  @SerializedName("children")
  private Integer children = null;
  @SerializedName("rate")
  private BookResponseDataBookedRoomsInnerRate rate = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BookResponseDataBookedRoomsInnerRoomType getRoomType() {
    return roomType;
  }
  public void setRoomType(BookResponseDataBookedRoomsInnerRoomType roomType) {
    this.roomType = roomType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getAdults() {
    return adults;
  }
  public void setAdults(Integer adults) {
    this.adults = adults;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getChildren() {
    return children;
  }
  public void setChildren(Integer children) {
    this.children = children;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BookResponseDataBookedRoomsInnerRate getRate() {
    return rate;
  }
  public void setRate(BookResponseDataBookedRoomsInnerRate rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookResponseDataBookedRoomsInner bookResponseDataBookedRoomsInner = (BookResponseDataBookedRoomsInner) o;
    return (this.roomType == null ? bookResponseDataBookedRoomsInner.roomType == null : this.roomType.equals(bookResponseDataBookedRoomsInner.roomType)) &&
        (this.adults == null ? bookResponseDataBookedRoomsInner.adults == null : this.adults.equals(bookResponseDataBookedRoomsInner.adults)) &&
        (this.children == null ? bookResponseDataBookedRoomsInner.children == null : this.children.equals(bookResponseDataBookedRoomsInner.children)) &&
        (this.rate == null ? bookResponseDataBookedRoomsInner.rate == null : this.rate.equals(bookResponseDataBookedRoomsInner.rate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.roomType == null ? 0: this.roomType.hashCode());
    result = 31 * result + (this.adults == null ? 0: this.adults.hashCode());
    result = 31 * result + (this.children == null ? 0: this.children.hashCode());
    result = 31 * result + (this.rate == null ? 0: this.rate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookResponseDataBookedRoomsInner {\n");
    
    sb.append("  roomType: ").append(roomType).append("\n");
    sb.append("  adults: ").append(adults).append("\n");
    sb.append("  children: ").append(children).append("\n");
    sb.append("  rate: ").append(rate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
