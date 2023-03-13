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
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.JSON;


/**
 * attributes in extra_infos are optional and unspecified/not guaranteed, don’t rely on it for critical tasks, this is provided as information only
 */
@JsonPropertyOrder({
  EventExtraInfo.JSON_PROPERTY_AUTHENTICATION_STRATEGY,
  EventExtraInfo.JSON_PROPERTY_BUSINESS_TIME_SHEET_ID,
  EventExtraInfo.JSON_PROPERTY_CATEGORY_IDS,
  EventExtraInfo.JSON_PROPERTY_CLOSED_AUTOMATICALLY,
  EventExtraInfo.JSON_PROPERTY_CONTENT_ID,
  EventExtraInfo.JSON_PROPERTY_CONTENT_SOURCE_ID,
  EventExtraInfo.JSON_PROPERTY_CONTENT_THREAD_ID,
  EventExtraInfo.JSON_PROPERTY_DEFERRED_DURATION,
  EventExtraInfo.JSON_PROPERTY_DELETIONS,
  EventExtraInfo.JSON_PROPERTY_FOREIGN_ID,
  EventExtraInfo.JSON_PROPERTY_INTERVENTION_ID,
  EventExtraInfo.JSON_PROPERTY_REQUEST_IP,
  EventExtraInfo.JSON_PROPERTY_TASK_ID,
  EventExtraInfo.JSON_PROPERTY_USER_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class EventExtraInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AUTHENTICATION_STRATEGY = "authentication_strategy";
  private String authenticationStrategy;

  public static final String JSON_PROPERTY_BUSINESS_TIME_SHEET_ID = "business/time_sheet_id";
  private String businessTimeSheetId;

  public static final String JSON_PROPERTY_CATEGORY_IDS = "category_ids";
  private List<String> categoryIds = null;

  public static final String JSON_PROPERTY_CLOSED_AUTOMATICALLY = "closed_automatically";
  private String closedAutomatically;

  public static final String JSON_PROPERTY_CONTENT_ID = "content_id";
  private String contentId;

  public static final String JSON_PROPERTY_CONTENT_SOURCE_ID = "content_source_id";
  private String contentSourceId;

  public static final String JSON_PROPERTY_CONTENT_THREAD_ID = "content_thread_id";
  private String contentThreadId;

  public static final String JSON_PROPERTY_DEFERRED_DURATION = "deferred_duration";
  private String deferredDuration;

  public static final String JSON_PROPERTY_DELETIONS = "deletions";
  private Object deletions;

  public static final String JSON_PROPERTY_FOREIGN_ID = "foreign_id";
  private String foreignId;

  public static final String JSON_PROPERTY_INTERVENTION_ID = "intervention_id";
  private String interventionId;

  public static final String JSON_PROPERTY_REQUEST_IP = "request_ip";
  private String requestIp;

  public static final String JSON_PROPERTY_TASK_ID = "task_id";
  private String taskId;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public EventExtraInfo() { 
  }

  public EventExtraInfo authenticationStrategy(String authenticationStrategy) {
    this.authenticationStrategy = authenticationStrategy;
    return this;
  }

   /**
   * Get authenticationStrategy
   * @return authenticationStrategy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthenticationStrategy() {
    return authenticationStrategy;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationStrategy(String authenticationStrategy) {
    this.authenticationStrategy = authenticationStrategy;
  }


  public EventExtraInfo businessTimeSheetId(String businessTimeSheetId) {
    this.businessTimeSheetId = businessTimeSheetId;
    return this;
  }

   /**
   * Get businessTimeSheetId
   * @return businessTimeSheetId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUSINESS_TIME_SHEET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessTimeSheetId() {
    return businessTimeSheetId;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_TIME_SHEET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessTimeSheetId(String businessTimeSheetId) {
    this.businessTimeSheetId = businessTimeSheetId;
  }


  public EventExtraInfo categoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public EventExtraInfo addCategoryIdsItem(String categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * Get categoryIds
   * @return categoryIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCategoryIds() {
    return categoryIds;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
  }


  public EventExtraInfo closedAutomatically(String closedAutomatically) {
    this.closedAutomatically = closedAutomatically;
    return this;
  }

   /**
   * Get closedAutomatically
   * @return closedAutomatically
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOSED_AUTOMATICALLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClosedAutomatically() {
    return closedAutomatically;
  }


  @JsonProperty(JSON_PROPERTY_CLOSED_AUTOMATICALLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClosedAutomatically(String closedAutomatically) {
    this.closedAutomatically = closedAutomatically;
  }


  public EventExtraInfo contentId(String contentId) {
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


  public EventExtraInfo contentSourceId(String contentSourceId) {
    this.contentSourceId = contentSourceId;
    return this;
  }

   /**
   * Get contentSourceId
   * @return contentSourceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentSourceId() {
    return contentSourceId;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentSourceId(String contentSourceId) {
    this.contentSourceId = contentSourceId;
  }


  public EventExtraInfo contentThreadId(String contentThreadId) {
    this.contentThreadId = contentThreadId;
    return this;
  }

   /**
   * Get contentThreadId
   * @return contentThreadId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentThreadId() {
    return contentThreadId;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentThreadId(String contentThreadId) {
    this.contentThreadId = contentThreadId;
  }


  public EventExtraInfo deferredDuration(String deferredDuration) {
    this.deferredDuration = deferredDuration;
    return this;
  }

   /**
   * Get deferredDuration
   * @return deferredDuration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFERRED_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeferredDuration() {
    return deferredDuration;
  }


  @JsonProperty(JSON_PROPERTY_DEFERRED_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeferredDuration(String deferredDuration) {
    this.deferredDuration = deferredDuration;
  }


  public EventExtraInfo deletions(Object deletions) {
    this.deletions = deletions;
    return this;
  }

   /**
   * Get deletions
   * @return deletions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getDeletions() {
    return deletions;
  }


  @JsonProperty(JSON_PROPERTY_DELETIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeletions(Object deletions) {
    this.deletions = deletions;
  }


  public EventExtraInfo foreignId(String foreignId) {
    this.foreignId = foreignId;
    return this;
  }

   /**
   * can be null
   * @return foreignId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOREIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getForeignId() {
    return foreignId;
  }


  @JsonProperty(JSON_PROPERTY_FOREIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForeignId(String foreignId) {
    this.foreignId = foreignId;
  }


  public EventExtraInfo interventionId(String interventionId) {
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


  public EventExtraInfo requestIp(String requestIp) {
    this.requestIp = requestIp;
    return this;
  }

   /**
   * Get requestIp
   * @return requestIp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestIp() {
    return requestIp;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestIp(String requestIp) {
    this.requestIp = requestIp;
  }


  public EventExtraInfo taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaskId() {
    return taskId;
  }


  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  public EventExtraInfo userId(String userId) {
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


  /**
   * Return true if this EventExtraInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventExtraInfo eventExtraInfo = (EventExtraInfo) o;
    return Objects.equals(this.authenticationStrategy, eventExtraInfo.authenticationStrategy) &&
        Objects.equals(this.businessTimeSheetId, eventExtraInfo.businessTimeSheetId) &&
        Objects.equals(this.categoryIds, eventExtraInfo.categoryIds) &&
        Objects.equals(this.closedAutomatically, eventExtraInfo.closedAutomatically) &&
        Objects.equals(this.contentId, eventExtraInfo.contentId) &&
        Objects.equals(this.contentSourceId, eventExtraInfo.contentSourceId) &&
        Objects.equals(this.contentThreadId, eventExtraInfo.contentThreadId) &&
        Objects.equals(this.deferredDuration, eventExtraInfo.deferredDuration) &&
        Objects.equals(this.deletions, eventExtraInfo.deletions) &&
        Objects.equals(this.foreignId, eventExtraInfo.foreignId) &&
        Objects.equals(this.interventionId, eventExtraInfo.interventionId) &&
        Objects.equals(this.requestIp, eventExtraInfo.requestIp) &&
        Objects.equals(this.taskId, eventExtraInfo.taskId) &&
        Objects.equals(this.userId, eventExtraInfo.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationStrategy, businessTimeSheetId, categoryIds, closedAutomatically, contentId, contentSourceId, contentThreadId, deferredDuration, deletions, foreignId, interventionId, requestIp, taskId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventExtraInfo {\n");
    sb.append("    authenticationStrategy: ").append(toIndentedString(authenticationStrategy)).append("\n");
    sb.append("    businessTimeSheetId: ").append(toIndentedString(businessTimeSheetId)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    closedAutomatically: ").append(toIndentedString(closedAutomatically)).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    contentSourceId: ").append(toIndentedString(contentSourceId)).append("\n");
    sb.append("    contentThreadId: ").append(toIndentedString(contentThreadId)).append("\n");
    sb.append("    deferredDuration: ").append(toIndentedString(deferredDuration)).append("\n");
    sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
    sb.append("    foreignId: ").append(toIndentedString(foreignId)).append("\n");
    sb.append("    interventionId: ").append(toIndentedString(interventionId)).append("\n");
    sb.append("    requestIp: ").append(toIndentedString(requestIp)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
