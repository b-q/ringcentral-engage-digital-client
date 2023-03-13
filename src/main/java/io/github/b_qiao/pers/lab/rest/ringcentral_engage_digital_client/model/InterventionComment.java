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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.JSON;


/**
 * InterventionComment
 */
@JsonPropertyOrder({
  InterventionComment.JSON_PROPERTY_BODY,
  InterventionComment.JSON_PROPERTY_CREATED_AT,
  InterventionComment.JSON_PROPERTY_ID,
  InterventionComment.JSON_PROPERTY_INTERVENTION_ID,
  InterventionComment.JSON_PROPERTY_THREAD_ID,
  InterventionComment.JSON_PROPERTY_UPDATED_AT,
  InterventionComment.JSON_PROPERTY_USER_ID,
  InterventionComment.JSON_PROPERTY_VIDENTITY_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class InterventionComment implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INTERVENTION_ID = "intervention_id";
  private String interventionId;

  public static final String JSON_PROPERTY_THREAD_ID = "thread_id";
  private String threadId;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_VIDENTITY_ID = "videntity_id";
  private String videntityId;

  public InterventionComment() { 
  }

  public InterventionComment body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(String body) {
    this.body = body;
  }


  public InterventionComment createdAt(OffsetDateTime createdAt) {
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


  public InterventionComment id(String id) {
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


  public InterventionComment interventionId(String interventionId) {
    this.interventionId = interventionId;
    return this;
  }

   /**
   * Get interventionId
   * @return interventionId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVENTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInterventionId() {
    return interventionId;
  }


  @JsonProperty(JSON_PROPERTY_INTERVENTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterventionId(String interventionId) {
    this.interventionId = interventionId;
  }


  public InterventionComment threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

   /**
   * Get threadId
   * @return threadId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreadId() {
    return threadId;
  }


  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }


  public InterventionComment updatedAt(OffsetDateTime updatedAt) {
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


  public InterventionComment userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public InterventionComment videntityId(String videntityId) {
    this.videntityId = videntityId;
    return this;
  }

   /**
   * Get videntityId
   * @return videntityId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVidentityId() {
    return videntityId;
  }


  @JsonProperty(JSON_PROPERTY_VIDENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVidentityId(String videntityId) {
    this.videntityId = videntityId;
  }


  /**
   * Return true if this InterventionComment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterventionComment interventionComment = (InterventionComment) o;
    return Objects.equals(this.body, interventionComment.body) &&
        Objects.equals(this.createdAt, interventionComment.createdAt) &&
        Objects.equals(this.id, interventionComment.id) &&
        Objects.equals(this.interventionId, interventionComment.interventionId) &&
        Objects.equals(this.threadId, interventionComment.threadId) &&
        Objects.equals(this.updatedAt, interventionComment.updatedAt) &&
        Objects.equals(this.userId, interventionComment.userId) &&
        Objects.equals(this.videntityId, interventionComment.videntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, createdAt, id, interventionId, threadId, updatedAt, userId, videntityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterventionComment {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interventionId: ").append(toIndentedString(interventionId)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    videntityId: ").append(toIndentedString(videntityId)).append("\n");
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
