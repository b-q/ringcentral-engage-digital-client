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
 * User
 */
@JsonPropertyOrder({
  User.JSON_PROPERTY_CATEGORY_IDS,
  User.JSON_PROPERTY_CREATED_AT,
  User.JSON_PROPERTY_EMAIL,
  User.JSON_PROPERTY_ENABLED,
  User.JSON_PROPERTY_EXTERNAL_ID,
  User.JSON_PROPERTY_FIRSTNAME,
  User.JSON_PROPERTY_GENDER,
  User.JSON_PROPERTY_ID,
  User.JSON_PROPERTY_IDENTITY_IDS,
  User.JSON_PROPERTY_INVITATION_PENDING,
  User.JSON_PROPERTY_LASTNAME,
  User.JSON_PROPERTY_LOCALE,
  User.JSON_PROPERTY_NICKNAME,
  User.JSON_PROPERTY_RC_USER_ID,
  User.JSON_PROPERTY_ROLE_ID,
  User.JSON_PROPERTY_SPOKEN_LANGUAGES,
  User.JSON_PROPERTY_TEAM_IDS,
  User.JSON_PROPERTY_TIMEZONE,
  User.JSON_PROPERTY_UPDATED_AT,
  User.JSON_PROPERTY_USER_CAPACITY_ID,
  User.JSON_PROPERTY_NO_PASSWORD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class User implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CATEGORY_IDS = "category_ids";
  private List<String> categoryIds = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private String externalId;

  public static final String JSON_PROPERTY_FIRSTNAME = "firstname";
  private String firstname;

  public static final String JSON_PROPERTY_GENDER = "gender";
  private String gender;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IDENTITY_IDS = "identity_ids";
  private List<String> identityIds = null;

  public static final String JSON_PROPERTY_INVITATION_PENDING = "invitation_pending";
  private Boolean invitationPending;

  public static final String JSON_PROPERTY_LASTNAME = "lastname";
  private String lastname;

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public static final String JSON_PROPERTY_NICKNAME = "nickname";
  private String nickname;

  public static final String JSON_PROPERTY_RC_USER_ID = "rc_user_id";
  private String rcUserId;

  public static final String JSON_PROPERTY_ROLE_ID = "role_id";
  private String roleId;

  public static final String JSON_PROPERTY_SPOKEN_LANGUAGES = "spoken_languages";
  private List<String> spokenLanguages = null;

  public static final String JSON_PROPERTY_TEAM_IDS = "team_ids";
  private List<String> teamIds = null;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_USER_CAPACITY_ID = "user_capacity_id";
  private String userCapacityId;

  public static final String JSON_PROPERTY_NO_PASSWORD = "no_password";
  private Boolean noPassword;

  public User() { 
  }

  public User categoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public User addCategoryIdsItem(String categoryIdsItem) {
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


  public User createdAt(OffsetDateTime createdAt) {
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


  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public User enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public User externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public User firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstname() {
    return firstname;
  }


  @JsonProperty(JSON_PROPERTY_FIRSTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public User gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGender() {
    return gender;
  }


  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGender(String gender) {
    this.gender = gender;
  }


  public User id(String id) {
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


  public User identityIds(List<String> identityIds) {
    this.identityIds = identityIds;
    return this;
  }

  public User addIdentityIdsItem(String identityIdsItem) {
    if (this.identityIds == null) {
      this.identityIds = new ArrayList<>();
    }
    this.identityIds.add(identityIdsItem);
    return this;
  }

   /**
   * Get identityIds
   * @return identityIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTITY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIdentityIds() {
    return identityIds;
  }


  @JsonProperty(JSON_PROPERTY_IDENTITY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentityIds(List<String> identityIds) {
    this.identityIds = identityIds;
  }


  public User invitationPending(Boolean invitationPending) {
    this.invitationPending = invitationPending;
    return this;
  }

   /**
   * Get invitationPending
   * @return invitationPending
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVITATION_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInvitationPending() {
    return invitationPending;
  }


  @JsonProperty(JSON_PROPERTY_INVITATION_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvitationPending(Boolean invitationPending) {
    this.invitationPending = invitationPending;
  }


  public User lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LASTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastname() {
    return lastname;
  }


  @JsonProperty(JSON_PROPERTY_LASTNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public User locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocale() {
    return locale;
  }


  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocale(String locale) {
    this.locale = locale;
  }


  public User nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNickname() {
    return nickname;
  }


  @JsonProperty(JSON_PROPERTY_NICKNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public User rcUserId(String rcUserId) {
    this.rcUserId = rcUserId;
    return this;
  }

   /**
   * Get rcUserId
   * @return rcUserId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RC_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRcUserId() {
    return rcUserId;
  }


  @JsonProperty(JSON_PROPERTY_RC_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRcUserId(String rcUserId) {
    this.rcUserId = rcUserId;
  }


  public User roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoleId() {
    return roleId;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public User spokenLanguages(List<String> spokenLanguages) {
    this.spokenLanguages = spokenLanguages;
    return this;
  }

  public User addSpokenLanguagesItem(String spokenLanguagesItem) {
    if (this.spokenLanguages == null) {
      this.spokenLanguages = new ArrayList<>();
    }
    this.spokenLanguages.add(spokenLanguagesItem);
    return this;
  }

   /**
   * Get spokenLanguages
   * @return spokenLanguages
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPOKEN_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSpokenLanguages() {
    return spokenLanguages;
  }


  @JsonProperty(JSON_PROPERTY_SPOKEN_LANGUAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpokenLanguages(List<String> spokenLanguages) {
    this.spokenLanguages = spokenLanguages;
  }


  public User teamIds(List<String> teamIds) {
    this.teamIds = teamIds;
    return this;
  }

  public User addTeamIdsItem(String teamIdsItem) {
    if (this.teamIds == null) {
      this.teamIds = new ArrayList<>();
    }
    this.teamIds.add(teamIdsItem);
    return this;
  }

   /**
   * Get teamIds
   * @return teamIds
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTeamIds() {
    return teamIds;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamIds(List<String> teamIds) {
    this.teamIds = teamIds;
  }


  public User timezone(String timezone) {
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


  public User updatedAt(OffsetDateTime updatedAt) {
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


  public User userCapacityId(String userCapacityId) {
    this.userCapacityId = userCapacityId;
    return this;
  }

   /**
   * Get userCapacityId
   * @return userCapacityId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_CAPACITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserCapacityId() {
    return userCapacityId;
  }


  @JsonProperty(JSON_PROPERTY_USER_CAPACITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserCapacityId(String userCapacityId) {
    this.userCapacityId = userCapacityId;
  }


  public User noPassword(Boolean noPassword) {
    this.noPassword = noPassword;
    return this;
  }

   /**
   * Get noPassword
   * @return noPassword
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NO_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNoPassword() {
    return noPassword;
  }


  @JsonProperty(JSON_PROPERTY_NO_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoPassword(Boolean noPassword) {
    this.noPassword = noPassword;
  }


  /**
   * Return true if this User object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.categoryIds, user.categoryIds) &&
        Objects.equals(this.createdAt, user.createdAt) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.enabled, user.enabled) &&
        Objects.equals(this.externalId, user.externalId) &&
        Objects.equals(this.firstname, user.firstname) &&
        Objects.equals(this.gender, user.gender) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.identityIds, user.identityIds) &&
        Objects.equals(this.invitationPending, user.invitationPending) &&
        Objects.equals(this.lastname, user.lastname) &&
        Objects.equals(this.locale, user.locale) &&
        Objects.equals(this.nickname, user.nickname) &&
        Objects.equals(this.rcUserId, user.rcUserId) &&
        Objects.equals(this.roleId, user.roleId) &&
        Objects.equals(this.spokenLanguages, user.spokenLanguages) &&
        Objects.equals(this.teamIds, user.teamIds) &&
        Objects.equals(this.timezone, user.timezone) &&
        Objects.equals(this.updatedAt, user.updatedAt) &&
        Objects.equals(this.userCapacityId, user.userCapacityId) &&
        Objects.equals(this.noPassword, user.noPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryIds, createdAt, email, enabled, externalId, firstname, gender, id, identityIds, invitationPending, lastname, locale, nickname, rcUserId, roleId, spokenLanguages, teamIds, timezone, updatedAt, userCapacityId, noPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identityIds: ").append(toIndentedString(identityIds)).append("\n");
    sb.append("    invitationPending: ").append(toIndentedString(invitationPending)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    rcUserId: ").append(toIndentedString(rcUserId)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    spokenLanguages: ").append(toIndentedString(spokenLanguages)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userCapacityId: ").append(toIndentedString(userCapacityId)).append("\n");
    sb.append("    noPassword: ").append(toIndentedString(noPassword)).append("\n");
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

