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
 * Task
 */
@JsonPropertyOrder({
  Task.JSON_PROPERTY_ACCEPTED_AT,
  Task.JSON_PROPERTY_AGENT_IDS,
  Task.JSON_PROPERTY_CHANNEL_ID,
  Task.JSON_PROPERTY_COMPLETED_AT,
  Task.JSON_PROPERTY_CONTENT_ID,
  Task.JSON_PROPERTY_CREATED_AT,
  Task.JSON_PROPERTY_EXPIRE_AT,
  Task.JSON_PROPERTY_ID,
  Task.JSON_PROPERTY_INTERVENTION_ID,
  Task.JSON_PROPERTY_LOCKED_AT,
  Task.JSON_PROPERTY_PRIORITY,
  Task.JSON_PROPERTY_STEP,
  Task.JSON_PROPERTY_THREAD_ID,
  Task.JSON_PROPERTY_TRANSFERED_AT,
  Task.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class Task implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ACCEPTED_AT = "accepted_at";
  private OffsetDateTime acceptedAt;

  public static final String JSON_PROPERTY_AGENT_IDS = "agent_ids";
  private List<String> agentIds = null;

  public static final String JSON_PROPERTY_CHANNEL_ID = "channel_id";
  private String channelId;

  public static final String JSON_PROPERTY_COMPLETED_AT = "completed_at";
  private OffsetDateTime completedAt;

  public static final String JSON_PROPERTY_CONTENT_ID = "content_id";
  private String contentId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EXPIRE_AT = "expire_at";
  private OffsetDateTime expireAt;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INTERVENTION_ID = "intervention_id";
  private String interventionId;

  public static final String JSON_PROPERTY_LOCKED_AT = "locked_at";
  private OffsetDateTime lockedAt;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public static final String JSON_PROPERTY_STEP = "step";
  private String step;

  public static final String JSON_PROPERTY_THREAD_ID = "thread_id";
  private String threadId;

  public static final String JSON_PROPERTY_TRANSFERED_AT = "transfered_at";
  private OffsetDateTime transferedAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public Task() { 
  }

  public Task acceptedAt(OffsetDateTime acceptedAt) {
    this.acceptedAt = acceptedAt;
    return this;
  }

   /**
   * Get acceptedAt
   * @return acceptedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCEPTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAcceptedAt() {
    return acceptedAt;
  }


  @JsonProperty(JSON_PROPERTY_ACCEPTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcceptedAt(OffsetDateTime acceptedAt) {
    this.acceptedAt = acceptedAt;
  }


  public Task agentIds(List<String> agentIds) {
    this.agentIds = agentIds;
    return this;
  }

  public Task addAgentIdsItem(String agentIdsItem) {
    if (this.agentIds == null) {
      this.agentIds = new ArrayList<>();
    }
    this.agentIds.add(agentIdsItem);
    return this;
  }

   /**
   * Get agentIds
   * @return agentIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAgentIds() {
    return agentIds;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentIds(List<String> agentIds) {
    this.agentIds = agentIds;
  }


  public Task channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelId() {
    return channelId;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }


  public Task completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * Get completedAt
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }


  public Task contentId(String contentId) {
    this.contentId = contentId;
    return this;
  }

   /**
   * Get contentId
   * @return contentId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentId() {
    return contentId;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentId(String contentId) {
    this.contentId = contentId;
  }


  public Task createdAt(OffsetDateTime createdAt) {
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


  public Task expireAt(OffsetDateTime expireAt) {
    this.expireAt = expireAt;
    return this;
  }

   /**
   * Get expireAt
   * @return expireAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpireAt() {
    return expireAt;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpireAt(OffsetDateTime expireAt) {
    this.expireAt = expireAt;
  }


  public Task id(String id) {
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


  public Task interventionId(String interventionId) {
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


  public Task lockedAt(OffsetDateTime lockedAt) {
    this.lockedAt = lockedAt;
    return this;
  }

   /**
   * Get lockedAt
   * @return lockedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCKED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLockedAt() {
    return lockedAt;
  }


  @JsonProperty(JSON_PROPERTY_LOCKED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLockedAt(OffsetDateTime lockedAt) {
    this.lockedAt = lockedAt;
  }


  public Task priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public Task step(String step) {
    this.step = step;
    return this;
  }

   /**
   * Get step
   * @return step
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStep() {
    return step;
  }


  @JsonProperty(JSON_PROPERTY_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStep(String step) {
    this.step = step;
  }


  public Task threadId(String threadId) {
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


  public Task transferedAt(OffsetDateTime transferedAt) {
    this.transferedAt = transferedAt;
    return this;
  }

   /**
   * Get transferedAt
   * @return transferedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSFERED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTransferedAt() {
    return transferedAt;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFERED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransferedAt(OffsetDateTime transferedAt) {
    this.transferedAt = transferedAt;
  }


  public Task updatedAt(OffsetDateTime updatedAt) {
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
   * Return true if this Task object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.acceptedAt, task.acceptedAt) &&
        Objects.equals(this.agentIds, task.agentIds) &&
        Objects.equals(this.channelId, task.channelId) &&
        Objects.equals(this.completedAt, task.completedAt) &&
        Objects.equals(this.contentId, task.contentId) &&
        Objects.equals(this.createdAt, task.createdAt) &&
        Objects.equals(this.expireAt, task.expireAt) &&
        Objects.equals(this.id, task.id) &&
        Objects.equals(this.interventionId, task.interventionId) &&
        Objects.equals(this.lockedAt, task.lockedAt) &&
        Objects.equals(this.priority, task.priority) &&
        Objects.equals(this.step, task.step) &&
        Objects.equals(this.threadId, task.threadId) &&
        Objects.equals(this.transferedAt, task.transferedAt) &&
        Objects.equals(this.updatedAt, task.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedAt, agentIds, channelId, completedAt, contentId, createdAt, expireAt, id, interventionId, lockedAt, priority, step, threadId, transferedAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    sb.append("    acceptedAt: ").append(toIndentedString(acceptedAt)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interventionId: ").append(toIndentedString(interventionId)).append("\n");
    sb.append("    lockedAt: ").append(toIndentedString(lockedAt)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    transferedAt: ").append(toIndentedString(transferedAt)).append("\n");
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

