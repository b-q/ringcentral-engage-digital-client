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
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.TimeSheetHoliday;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.JSON;


/**
 * TimeSheet
 */
@JsonPropertyOrder({
  TimeSheet.JSON_PROPERTY_ACTIVE,
  TimeSheet.JSON_PROPERTY_CREATED_AT,
  TimeSheet.JSON_PROPERTY_FRIDAY_HOURS,
  TimeSheet.JSON_PROPERTY_HOLIDAYS,
  TimeSheet.JSON_PROPERTY_ID,
  TimeSheet.JSON_PROPERTY_LABEL,
  TimeSheet.JSON_PROPERTY_MONDAY_HOURS,
  TimeSheet.JSON_PROPERTY_SATURDAY_HOURS,
  TimeSheet.JSON_PROPERTY_SOURCE_IDS,
  TimeSheet.JSON_PROPERTY_SUNDAY_HOURS,
  TimeSheet.JSON_PROPERTY_THURSDAY_HOURS,
  TimeSheet.JSON_PROPERTY_TIMEZONE,
  TimeSheet.JSON_PROPERTY_TUESDAY_HOURS,
  TimeSheet.JSON_PROPERTY_UPDATED_AT,
  TimeSheet.JSON_PROPERTY_WEDNESDAY_HOURS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class TimeSheet implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_FRIDAY_HOURS = "friday_hours";
  private String fridayHours;

  public static final String JSON_PROPERTY_HOLIDAYS = "holidays[]";
  private List<TimeSheetHoliday> holidays = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_MONDAY_HOURS = "monday_hours";
  private String mondayHours;

  public static final String JSON_PROPERTY_SATURDAY_HOURS = "saturday_hours";
  private String saturdayHours;

  public static final String JSON_PROPERTY_SOURCE_IDS = "source_ids";
  private List<String> sourceIds = null;

  public static final String JSON_PROPERTY_SUNDAY_HOURS = "sunday_hours";
  private String sundayHours;

  public static final String JSON_PROPERTY_THURSDAY_HOURS = "thursday_hours";
  private String thursdayHours;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_TUESDAY_HOURS = "tuesday_hours";
  private String tuesdayHours;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_WEDNESDAY_HOURS = "wednesday_hours";
  private String wednesdayHours;

  public TimeSheet() { 
  }

  public TimeSheet active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public TimeSheet createdAt(OffsetDateTime createdAt) {
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


  public TimeSheet fridayHours(String fridayHours) {
    this.fridayHours = fridayHours;
    return this;
  }

   /**
   * Get fridayHours
   * @return fridayHours
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRIDAY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFridayHours() {
    return fridayHours;
  }


  @JsonProperty(JSON_PROPERTY_FRIDAY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFridayHours(String fridayHours) {
    this.fridayHours = fridayHours;
  }


  public TimeSheet holidays(List<TimeSheetHoliday> holidays) {
    this.holidays = holidays;
    return this;
  }

  public TimeSheet addHolidaysItem(TimeSheetHoliday holidaysItem) {
    if (this.holidays == null) {
      this.holidays = new ArrayList<>();
    }
    this.holidays.add(holidaysItem);
    return this;
  }

   /**
   * Get holidays
   * @return holidays
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HOLIDAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TimeSheetHoliday> getHolidays() {
    return holidays;
  }


  @JsonProperty(JSON_PROPERTY_HOLIDAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHolidays(List<TimeSheetHoliday> holidays) {
    this.holidays = holidays;
  }


  public TimeSheet id(String id) {
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


  public TimeSheet label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public TimeSheet mondayHours(String mondayHours) {
    this.mondayHours = mondayHours;
    return this;
  }

   /**
   * Get mondayHours
   * @return mondayHours
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONDAY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMondayHours() {
    return mondayHours;
  }


  @JsonProperty(JSON_PROPERTY_MONDAY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMondayHours(String mondayHours) {
    this.mondayHours = mondayHours;
  }


  public TimeSheet saturdayHours(String saturdayHours) {
    this.saturdayHours = saturdayHours;
    return this;
  }

   /**
   * Get saturdayHours
   * @return saturdayHours
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SATURDAY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSaturdayHours() {
    return saturdayHours;
  }


  @JsonProperty(JSON_PROPERTY_SATURDAY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaturdayHours(String saturdayHours) {
    this.saturdayHours = saturdayHours;
  }


  public TimeSheet sourceIds(List<String> sourceIds) {
    this.sourceIds = sourceIds;
    return this;
  }

  public TimeSheet addSourceIdsItem(String sourceIdsItem) {
    if (this.sourceIds == null) {
      this.sourceIds = new ArrayList<>();
    }
    this.sourceIds.add(sourceIdsItem);
    return this;
  }

   /**
   * Get sourceIds
   * @return sourceIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSourceIds() {
    return sourceIds;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceIds(List<String> sourceIds) {
    this.sourceIds = sourceIds;
  }


  public TimeSheet sundayHours(String sundayHours) {
    this.sundayHours = sundayHours;
    return this;
  }

   /**
   * Get sundayHours
   * @return sundayHours
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUNDAY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSundayHours() {
    return sundayHours;
  }


  @JsonProperty(JSON_PROPERTY_SUNDAY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSundayHours(String sundayHours) {
    this.sundayHours = sundayHours;
  }


  public TimeSheet thursdayHours(String thursdayHours) {
    this.thursdayHours = thursdayHours;
    return this;
  }

   /**
   * Get thursdayHours
   * @return thursdayHours
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THURSDAY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThursdayHours() {
    return thursdayHours;
  }


  @JsonProperty(JSON_PROPERTY_THURSDAY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThursdayHours(String thursdayHours) {
    this.thursdayHours = thursdayHours;
  }


  public TimeSheet timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public TimeSheet tuesdayHours(String tuesdayHours) {
    this.tuesdayHours = tuesdayHours;
    return this;
  }

   /**
   * Get tuesdayHours
   * @return tuesdayHours
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUESDAY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTuesdayHours() {
    return tuesdayHours;
  }


  @JsonProperty(JSON_PROPERTY_TUESDAY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTuesdayHours(String tuesdayHours) {
    this.tuesdayHours = tuesdayHours;
  }


  public TimeSheet updatedAt(OffsetDateTime updatedAt) {
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


  public TimeSheet wednesdayHours(String wednesdayHours) {
    this.wednesdayHours = wednesdayHours;
    return this;
  }

   /**
   * Get wednesdayHours
   * @return wednesdayHours
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEDNESDAY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWednesdayHours() {
    return wednesdayHours;
  }


  @JsonProperty(JSON_PROPERTY_WEDNESDAY_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWednesdayHours(String wednesdayHours) {
    this.wednesdayHours = wednesdayHours;
  }


  /**
   * Return true if this TimeSheet object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSheet timeSheet = (TimeSheet) o;
    return Objects.equals(this.active, timeSheet.active) &&
        Objects.equals(this.createdAt, timeSheet.createdAt) &&
        Objects.equals(this.fridayHours, timeSheet.fridayHours) &&
        Objects.equals(this.holidays, timeSheet.holidays) &&
        Objects.equals(this.id, timeSheet.id) &&
        Objects.equals(this.label, timeSheet.label) &&
        Objects.equals(this.mondayHours, timeSheet.mondayHours) &&
        Objects.equals(this.saturdayHours, timeSheet.saturdayHours) &&
        Objects.equals(this.sourceIds, timeSheet.sourceIds) &&
        Objects.equals(this.sundayHours, timeSheet.sundayHours) &&
        Objects.equals(this.thursdayHours, timeSheet.thursdayHours) &&
        Objects.equals(this.timezone, timeSheet.timezone) &&
        Objects.equals(this.tuesdayHours, timeSheet.tuesdayHours) &&
        Objects.equals(this.updatedAt, timeSheet.updatedAt) &&
        Objects.equals(this.wednesdayHours, timeSheet.wednesdayHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, createdAt, fridayHours, holidays, id, label, mondayHours, saturdayHours, sourceIds, sundayHours, thursdayHours, timezone, tuesdayHours, updatedAt, wednesdayHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSheet {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    fridayHours: ").append(toIndentedString(fridayHours)).append("\n");
    sb.append("    holidays: ").append(toIndentedString(holidays)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    mondayHours: ").append(toIndentedString(mondayHours)).append("\n");
    sb.append("    saturdayHours: ").append(toIndentedString(saturdayHours)).append("\n");
    sb.append("    sourceIds: ").append(toIndentedString(sourceIds)).append("\n");
    sb.append("    sundayHours: ").append(toIndentedString(sundayHours)).append("\n");
    sb.append("    thursdayHours: ").append(toIndentedString(thursdayHours)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    tuesdayHours: ").append(toIndentedString(tuesdayHours)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    wednesdayHours: ").append(toIndentedString(wednesdayHours)).append("\n");
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

