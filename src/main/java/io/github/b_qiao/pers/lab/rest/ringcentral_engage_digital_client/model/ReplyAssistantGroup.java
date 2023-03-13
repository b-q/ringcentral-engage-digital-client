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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.JSON;


/**
 * ReplyAssistantGroup
 */
@JsonPropertyOrder({
  ReplyAssistantGroup.JSON_PROPERTY_AUTOCOMPLETE,
  ReplyAssistantGroup.JSON_PROPERTY_CREATED_AT,
  ReplyAssistantGroup.JSON_PROPERTY_ENTRY_IDS,
  ReplyAssistantGroup.JSON_PROPERTY_ID,
  ReplyAssistantGroup.JSON_PROPERTY_NAME,
  ReplyAssistantGroup.JSON_PROPERTY_POSITION,
  ReplyAssistantGroup.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class ReplyAssistantGroup implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AUTOCOMPLETE = "autocomplete";
  private Boolean autocomplete;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ENTRY_IDS = "entry_ids";
  private List<String> entryIds = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_POSITION = "position";
  private Integer position;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public ReplyAssistantGroup() { 
  }

  public ReplyAssistantGroup autocomplete(Boolean autocomplete) {
    this.autocomplete = autocomplete;
    return this;
  }

   /**
   * Get autocomplete
   * @return autocomplete
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOCOMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutocomplete() {
    return autocomplete;
  }


  @JsonProperty(JSON_PROPERTY_AUTOCOMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutocomplete(Boolean autocomplete) {
    this.autocomplete = autocomplete;
  }


  public ReplyAssistantGroup createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ReplyAssistantGroup entryIds(List<String> entryIds) {
    this.entryIds = entryIds;
    return this;
  }

  public ReplyAssistantGroup addEntryIdsItem(String entryIdsItem) {
    if (this.entryIds == null) {
      this.entryIds = new ArrayList<>();
    }
    this.entryIds.add(entryIdsItem);
    return this;
  }

   /**
   * Get entryIds
   * @return entryIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTRY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEntryIds() {
    return entryIds;
  }


  @JsonProperty(JSON_PROPERTY_ENTRY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntryIds(List<String> entryIds) {
    this.entryIds = entryIds;
  }


  public ReplyAssistantGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public ReplyAssistantGroup name(String name) {
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


  public ReplyAssistantGroup position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPosition() {
    return position;
  }


  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosition(Integer position) {
    this.position = position;
  }


  public ReplyAssistantGroup updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this ReplyAssistantGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplyAssistantGroup replyAssistantGroup = (ReplyAssistantGroup) o;
    return Objects.equals(this.autocomplete, replyAssistantGroup.autocomplete) &&
        Objects.equals(this.createdAt, replyAssistantGroup.createdAt) &&
        Objects.equals(this.entryIds, replyAssistantGroup.entryIds) &&
        Objects.equals(this.id, replyAssistantGroup.id) &&
        Objects.equals(this.name, replyAssistantGroup.name) &&
        Objects.equals(this.position, replyAssistantGroup.position) &&
        Objects.equals(this.updatedAt, replyAssistantGroup.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autocomplete, createdAt, entryIds, id, name, position, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplyAssistantGroup {\n");
    sb.append("    autocomplete: ").append(toIndentedString(autocomplete)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    entryIds: ").append(toIndentedString(entryIds)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

