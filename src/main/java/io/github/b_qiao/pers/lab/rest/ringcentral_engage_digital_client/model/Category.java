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
 * Category
 */
@JsonPropertyOrder({
  Category.JSON_PROPERTY_COLOR,
  Category.JSON_PROPERTY_CREATED_AT,
  Category.JSON_PROPERTY_ID,
  Category.JSON_PROPERTY_MANDATORY,
  Category.JSON_PROPERTY_MULTIPLE,
  Category.JSON_PROPERTY_NAME,
  Category.JSON_PROPERTY_PARENT_ID,
  Category.JSON_PROPERTY_POST_QUALIFICATION,
  Category.JSON_PROPERTY_SOURCE_IDS,
  Category.JSON_PROPERTY_UNSELECTABLE,
  Category.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class Category implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COLOR = "color";
  private Integer color;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MANDATORY = "mandatory";
  private Boolean mandatory;

  public static final String JSON_PROPERTY_MULTIPLE = "multiple";
  private Boolean multiple;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  private String parentId;

  public static final String JSON_PROPERTY_POST_QUALIFICATION = "post_qualification";
  private Boolean postQualification;

  public static final String JSON_PROPERTY_SOURCE_IDS = "source_ids";
  private List<String> sourceIds = null;

  public static final String JSON_PROPERTY_UNSELECTABLE = "unselectable";
  private Boolean unselectable;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public Category() { 
  }

  public Category color(Integer color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(Integer color) {
    this.color = color;
  }


  public Category createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
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


  public Category id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
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


  public Category mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

   /**
   * Get mandatory
   * @return mandatory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANDATORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMandatory() {
    return mandatory;
  }


  @JsonProperty(JSON_PROPERTY_MANDATORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }


  public Category multiple(Boolean multiple) {
    this.multiple = multiple;
    return this;
  }

   /**
   * Get multiple
   * @return multiple
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTIPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultiple() {
    return multiple;
  }


  @JsonProperty(JSON_PROPERTY_MULTIPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiple(Boolean multiple) {
    this.multiple = multiple;
  }


  public Category name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
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


  public Category parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public Category postQualification(Boolean postQualification) {
    this.postQualification = postQualification;
    return this;
  }

   /**
   * Get postQualification
   * @return postQualification
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POST_QUALIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPostQualification() {
    return postQualification;
  }


  @JsonProperty(JSON_PROPERTY_POST_QUALIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostQualification(Boolean postQualification) {
    this.postQualification = postQualification;
  }


  public Category sourceIds(List<String> sourceIds) {
    this.sourceIds = sourceIds;
    return this;
  }

  public Category addSourceIdsItem(String sourceIdsItem) {
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
  @jakarta.annotation.Nullable
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


  public Category unselectable(Boolean unselectable) {
    this.unselectable = unselectable;
    return this;
  }

   /**
   * Get unselectable
   * @return unselectable
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSELECTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUnselectable() {
    return unselectable;
  }


  @JsonProperty(JSON_PROPERTY_UNSELECTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnselectable(Boolean unselectable) {
    this.unselectable = unselectable;
  }


  public Category updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
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
   * Return true if this Category object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.color, category.color) &&
        Objects.equals(this.createdAt, category.createdAt) &&
        Objects.equals(this.id, category.id) &&
        Objects.equals(this.mandatory, category.mandatory) &&
        Objects.equals(this.multiple, category.multiple) &&
        Objects.equals(this.name, category.name) &&
        Objects.equals(this.parentId, category.parentId) &&
        Objects.equals(this.postQualification, category.postQualification) &&
        Objects.equals(this.sourceIds, category.sourceIds) &&
        Objects.equals(this.unselectable, category.unselectable) &&
        Objects.equals(this.updatedAt, category.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, createdAt, id, mandatory, multiple, name, parentId, postQualification, sourceIds, unselectable, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    multiple: ").append(toIndentedString(multiple)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    postQualification: ").append(toIndentedString(postQualification)).append("\n");
    sb.append("    sourceIds: ").append(toIndentedString(sourceIds)).append("\n");
    sb.append("    unselectable: ").append(toIndentedString(unselectable)).append("\n");
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

