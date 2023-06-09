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
 * Team
 */
@JsonPropertyOrder({
  Team.JSON_PROPERTY_CREATED_AT,
  Team.JSON_PROPERTY_ID,
  Team.JSON_PROPERTY_LEADER_IDS,
  Team.JSON_PROPERTY_NAME,
  Team.JSON_PROPERTY_UPDATED_AT,
  Team.JSON_PROPERTY_USER_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class Team implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LEADER_IDS = "leader_ids";
  private List<String> leaderIds = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_USER_IDS = "user_ids";
  private List<String> userIds = null;

  public Team() { 
  }

  public Team createdAt(OffsetDateTime createdAt) {
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


  public Team id(String id) {
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


  public Team leaderIds(List<String> leaderIds) {
    this.leaderIds = leaderIds;
    return this;
  }

  public Team addLeaderIdsItem(String leaderIdsItem) {
    if (this.leaderIds == null) {
      this.leaderIds = new ArrayList<>();
    }
    this.leaderIds.add(leaderIdsItem);
    return this;
  }

   /**
   * Get leaderIds
   * @return leaderIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEADER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLeaderIds() {
    return leaderIds;
  }


  @JsonProperty(JSON_PROPERTY_LEADER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeaderIds(List<String> leaderIds) {
    this.leaderIds = leaderIds;
  }


  public Team name(String name) {
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


  public Team updatedAt(OffsetDateTime updatedAt) {
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


  public Team userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public Team addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUserIds() {
    return userIds;
  }


  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  /**
   * Return true if this Team object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Team team = (Team) o;
    return Objects.equals(this.createdAt, team.createdAt) &&
        Objects.equals(this.id, team.id) &&
        Objects.equals(this.leaderIds, team.leaderIds) &&
        Objects.equals(this.name, team.name) &&
        Objects.equals(this.updatedAt, team.updatedAt) &&
        Objects.equals(this.userIds, team.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, leaderIds, name, updatedAt, userIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Team {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leaderIds: ").append(toIndentedString(leaderIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

