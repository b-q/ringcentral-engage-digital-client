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
 * AgentStatusChannel
 */
@JsonPropertyOrder({
  AgentStatusChannel.JSON_PROPERTY_BUSYNESS,
  AgentStatusChannel.JSON_PROPERTY_ID,
  AgentStatusChannel.JSON_PROPERTY_NAME,
  AgentStatusChannel.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class AgentStatusChannel implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets busyness
   */
  public enum BusynessEnum {
    UNOCCUPIED("unoccupied"),
    
    OK("ok"),
    
    BUSY("busy"),
    
    FULL("full");

    private String value;

    BusynessEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BusynessEnum fromValue(String value) {
      for (BusynessEnum b : BusynessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BUSYNESS = "busyness";
  private BusynessEnum busyness;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public AgentStatusChannel() { 
  }

  public AgentStatusChannel busyness(BusynessEnum busyness) {
    this.busyness = busyness;
    return this;
  }

   /**
   * Get busyness
   * @return busyness
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSYNESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BusynessEnum getBusyness() {
    return busyness;
  }


  @JsonProperty(JSON_PROPERTY_BUSYNESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusyness(BusynessEnum busyness) {
    this.busyness = busyness;
  }


  public AgentStatusChannel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public AgentStatusChannel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public AgentStatusChannel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * Return true if this AgentStatusChannel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentStatusChannel agentStatusChannel = (AgentStatusChannel) o;
    return Objects.equals(this.busyness, agentStatusChannel.busyness) &&
        Objects.equals(this.id, agentStatusChannel.id) &&
        Objects.equals(this.name, agentStatusChannel.name) &&
        Objects.equals(this.status, agentStatusChannel.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(busyness, id, name, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentStatusChannel {\n");
    sb.append("    busyness: ").append(toIndentedString(busyness)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
