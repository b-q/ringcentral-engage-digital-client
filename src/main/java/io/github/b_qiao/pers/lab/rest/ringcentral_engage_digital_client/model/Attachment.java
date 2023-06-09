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
 * Attachment
 */
@JsonPropertyOrder({
  Attachment.JSON_PROPERTY_CONTENT_TYPE,
  Attachment.JSON_PROPERTY_CREATED_AT,
  Attachment.JSON_PROPERTY_EMBED,
  Attachment.JSON_PROPERTY_FILENAME,
  Attachment.JSON_PROPERTY_FOREIGN_ID,
  Attachment.JSON_PROPERTY_ID,
  Attachment.JSON_PROPERTY_PUBLIC_QUESTION_MARK,
  Attachment.JSON_PROPERTY_SIZE,
  Attachment.JSON_PROPERTY_UPDATED_AT,
  Attachment.JSON_PROPERTY_URL,
  Attachment.JSON_PROPERTY_VIDEO_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class Attachment implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "content_type";
  private String contentType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EMBED = "embed";
  private Boolean embed;

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public static final String JSON_PROPERTY_FOREIGN_ID = "foreign_id";
  private String foreignId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PUBLIC_QUESTION_MARK = "public?";
  private Boolean publicQuestionMark;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_VIDEO_METADATA = "video_metadata";
  private List<String> videoMetadata = null;

  public Attachment() { 
  }

  public Attachment contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public Attachment createdAt(OffsetDateTime createdAt) {
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


  public Attachment embed(Boolean embed) {
    this.embed = embed;
    return this;
  }

   /**
   * Get embed
   * @return embed
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMBED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmbed() {
    return embed;
  }


  @JsonProperty(JSON_PROPERTY_EMBED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmbed(Boolean embed) {
    this.embed = embed;
  }


  public Attachment filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFilename() {
    return filename;
  }


  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilename(String filename) {
    this.filename = filename;
  }


  public Attachment foreignId(String foreignId) {
    this.foreignId = foreignId;
    return this;
  }

   /**
   * Get foreignId
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


  public Attachment id(String id) {
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


  public Attachment publicQuestionMark(Boolean publicQuestionMark) {
    this.publicQuestionMark = publicQuestionMark;
    return this;
  }

   /**
   * Get publicQuestionMark
   * @return publicQuestionMark
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_QUESTION_MARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPublicQuestionMark() {
    return publicQuestionMark;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_QUESTION_MARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicQuestionMark(Boolean publicQuestionMark) {
    this.publicQuestionMark = publicQuestionMark;
  }


  public Attachment size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Integer size) {
    this.size = size;
  }


  public Attachment updatedAt(OffsetDateTime updatedAt) {
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


  public Attachment url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public Attachment videoMetadata(List<String> videoMetadata) {
    this.videoMetadata = videoMetadata;
    return this;
  }

  public Attachment addVideoMetadataItem(String videoMetadataItem) {
    if (this.videoMetadata == null) {
      this.videoMetadata = new ArrayList<>();
    }
    this.videoMetadata.add(videoMetadataItem);
    return this;
  }

   /**
   * Get videoMetadata
   * @return videoMetadata
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVideoMetadata() {
    return videoMetadata;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoMetadata(List<String> videoMetadata) {
    this.videoMetadata = videoMetadata;
  }


  /**
   * Return true if this Attachment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.contentType, attachment.contentType) &&
        Objects.equals(this.createdAt, attachment.createdAt) &&
        Objects.equals(this.embed, attachment.embed) &&
        Objects.equals(this.filename, attachment.filename) &&
        Objects.equals(this.foreignId, attachment.foreignId) &&
        Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.publicQuestionMark, attachment.publicQuestionMark) &&
        Objects.equals(this.size, attachment.size) &&
        Objects.equals(this.updatedAt, attachment.updatedAt) &&
        Objects.equals(this.url, attachment.url) &&
        Objects.equals(this.videoMetadata, attachment.videoMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, createdAt, embed, filename, foreignId, id, publicQuestionMark, size, updatedAt, url, videoMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    embed: ").append(toIndentedString(embed)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    foreignId: ").append(toIndentedString(foreignId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    publicQuestionMark: ").append(toIndentedString(publicQuestionMark)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    videoMetadata: ").append(toIndentedString(videoMetadata)).append("\n");
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

