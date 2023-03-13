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
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.AgentCustomStatus;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.AgentStatusChannel;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.JSON;


/**
 * AgentStatus
 */
@JsonPropertyOrder({
  AgentStatus.JSON_PROPERTY_AGENT_ID,
  AgentStatus.JSON_PROPERTY_CHANNELS,
  AgentStatus.JSON_PROPERTY_CUSTOM_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class AgentStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AGENT_ID = "agent_id";
  private String agentId;

  public static final String JSON_PROPERTY_CHANNELS = "channels";
  private List<AgentStatusChannel> channels = null;

  public static final String JSON_PROPERTY_CUSTOM_STATUS = "custom_status";
  private AgentCustomStatus customStatus;

  public AgentStatus() { 
  }

  public AgentStatus agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * Get agentId
   * @return agentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentId() {
    return agentId;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  public AgentStatus channels(List<AgentStatusChannel> channels) {
    this.channels = channels;
    return this;
  }

  public AgentStatus addChannelsItem(AgentStatusChannel channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AgentStatusChannel> getChannels() {
    return channels;
  }


  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannels(List<AgentStatusChannel> channels) {
    this.channels = channels;
  }


  public AgentStatus customStatus(AgentCustomStatus customStatus) {
    this.customStatus = customStatus;
    return this;
  }

   /**
   * Get customStatus
   * @return customStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AgentCustomStatus getCustomStatus() {
    return customStatus;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomStatus(AgentCustomStatus customStatus) {
    this.customStatus = customStatus;
  }


  /**
   * Return true if this AgentStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentStatus agentStatus = (AgentStatus) o;
    return Objects.equals(this.agentId, agentStatus.agentId) &&
        Objects.equals(this.channels, agentStatus.channels) &&
        Objects.equals(this.customStatus, agentStatus.customStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, channels, customStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentStatus {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    customStatus: ").append(toIndentedString(customStatus)).append("\n");
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

