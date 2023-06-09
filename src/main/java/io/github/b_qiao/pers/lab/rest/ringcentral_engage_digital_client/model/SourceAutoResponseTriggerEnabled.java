/*
 * RingCentral Engage Digital API
 * REST API for RingCentral Engage Digital
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.JSON;


/**
 * Boolean describing if answers are enabled to first messages and/or to messages outside business hours. Only on sources which supports Automatic Messages.
 */
@JsonPropertyOrder({
  SourceAutoResponseTriggerEnabled.JSON_PROPERTY_FIRST_MESSAGE_FROM_USER,
  SourceAutoResponseTriggerEnabled.JSON_PROPERTY_OUT_OF_OFFICE_HOURS_MESSAGE
})
@JsonTypeName("Source_auto_response_trigger_enabled")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class SourceAutoResponseTriggerEnabled implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FIRST_MESSAGE_FROM_USER = "first_message_from_user";
  private Boolean firstMessageFromUser;

  public static final String JSON_PROPERTY_OUT_OF_OFFICE_HOURS_MESSAGE = "out_of_office_hours_message";
  private Boolean outOfOfficeHoursMessage;

  public SourceAutoResponseTriggerEnabled() { 
  }

  public SourceAutoResponseTriggerEnabled firstMessageFromUser(Boolean firstMessageFromUser) {
    this.firstMessageFromUser = firstMessageFromUser;
    return this;
  }

   /**
   * Get firstMessageFromUser
   * @return firstMessageFromUser
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_MESSAGE_FROM_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFirstMessageFromUser() {
    return firstMessageFromUser;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_MESSAGE_FROM_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstMessageFromUser(Boolean firstMessageFromUser) {
    this.firstMessageFromUser = firstMessageFromUser;
  }


  public SourceAutoResponseTriggerEnabled outOfOfficeHoursMessage(Boolean outOfOfficeHoursMessage) {
    this.outOfOfficeHoursMessage = outOfOfficeHoursMessage;
    return this;
  }

   /**
   * Get outOfOfficeHoursMessage
   * @return outOfOfficeHoursMessage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OUT_OF_OFFICE_HOURS_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOutOfOfficeHoursMessage() {
    return outOfOfficeHoursMessage;
  }


  @JsonProperty(JSON_PROPERTY_OUT_OF_OFFICE_HOURS_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutOfOfficeHoursMessage(Boolean outOfOfficeHoursMessage) {
    this.outOfOfficeHoursMessage = outOfOfficeHoursMessage;
  }


  /**
   * Return true if this Source_auto_response_trigger_enabled object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceAutoResponseTriggerEnabled sourceAutoResponseTriggerEnabled = (SourceAutoResponseTriggerEnabled) o;
    return Objects.equals(this.firstMessageFromUser, sourceAutoResponseTriggerEnabled.firstMessageFromUser) &&
        Objects.equals(this.outOfOfficeHoursMessage, sourceAutoResponseTriggerEnabled.outOfOfficeHoursMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstMessageFromUser, outOfOfficeHoursMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceAutoResponseTriggerEnabled {\n");
    sb.append("    firstMessageFromUser: ").append(toIndentedString(firstMessageFromUser)).append("\n");
    sb.append("    outOfOfficeHoursMessage: ").append(toIndentedString(outOfOfficeHoursMessage)).append("\n");
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

}

