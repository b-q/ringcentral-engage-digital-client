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
import java.io.File;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.JSON;


/**
 * CreateAttachmentRequest
 */
@JsonPropertyOrder({
  CreateAttachmentRequest.JSON_PROPERTY_FILE,
  CreateAttachmentRequest.JSON_PROPERTY_PRIVATE
})
@JsonTypeName("createAttachment_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class CreateAttachmentRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FILE = "file";
  private File _file;

  /**
   * Gets or Sets _private
   */
  public enum PrivateEnum {
    TRUE("true"),
    
    _1("=1");

    private String value;

    PrivateEnum(String value) {
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
    public static PrivateEnum fromValue(String value) {
      for (PrivateEnum b : PrivateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRIVATE = "private";
  private PrivateEnum _private;

  public CreateAttachmentRequest() { 
  }

  public CreateAttachmentRequest _file(File _file) {
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public File getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFile(File _file) {
    this._file = _file;
  }


  public CreateAttachmentRequest _private(PrivateEnum _private) {
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIVATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrivateEnum getPrivate() {
    return _private;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivate(PrivateEnum _private) {
    this._private = _private;
  }


  /**
   * Return true if this createAttachment_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAttachmentRequest createAttachmentRequest = (CreateAttachmentRequest) o;
    return Objects.equals(this._file, createAttachmentRequest._file) &&
        Objects.equals(this._private, createAttachmentRequest._private);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_file, _private);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAttachmentRequest {\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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
