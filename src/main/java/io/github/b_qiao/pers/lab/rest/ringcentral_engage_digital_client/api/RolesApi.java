package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllRolesResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Role;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class RolesApi {
  private ApiClient apiClient;

  public RolesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RolesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creating a role
   * This method creates a new role. In case of success it renders the created role, otherwise, it renders an error (422 HTTP code).
   * @param label  (required)
   * @param accessHelpCenter  (optional)
   * @param accessPreviousMessages  (optional)
   * @param accessPullMode  (optional)
   * @param adminStampAnswer  (optional)
   * @param approveContent  (optional)
   * @param askAnExpert permission only available with the corresponding configuration (optional)
   * @param assignIntervention  (optional)
   * @param authorBlockContent  (optional)
   * @param closeContentThread  (optional)
   * @param createAndDestroyExtension  (optional)
   * @param createCommunity  (optional)
   * @param createContentSource  (optional)
   * @param createUser  (optional)
   * @param delayExportContent  (optional)
   * @param deleteContentThread  (optional)
   * @param escalateToVideo permission only available with the corresponding configuration (optional)
   * @param impersonateUser  (optional)
   * @param inviteUser  (optional)
   * @param manageApiAccessTokens  (optional)
   * @param manageAppSdkApplications  (optional)
   * @param manageAutomaticExportsTasks permission only available with the corresponding extension enabled (optional)
   * @param manageCategories  (optional)
   * @param manageChat  (optional)
   * @param manageCustomFields  (optional)
   * @param manageCustomNotifications  (optional)
   * @param manageEmailsTemplates  (optional)
   * @param manageFolders  (optional)
   * @param manageIce  (optional)
   * @param manageIdentities  (optional)
   * @param manageOwnNotifications  (optional)
   * @param manageReplyAssistant permission only available with the corresponding extension enabled (optional)
   * @param manageRoles  (optional)
   * @param manageRulesEngineRules permission only available with the corresponding extension enabled (optional)
   * @param manageSurveys permission only available with the corresponding extension enabled (optional)
   * @param manageTags  (optional)
   * @param manageTeams  (optional)
   * @param manageTopologies  (optional)
   * @param manageUsersOfMyTeams  (optional)
   * @param monitorTasks  (optional)
   * @param monitorTeamTasks  (optional)
   * @param muteContent  (optional)
   * @param openContentThread  (optional)
   * @param publishContent  (optional)
   * @param readCommunity  (optional)
   * @param readContentSource  (optional)
   * @param readEvent  (optional)
   * @param readExport  (optional)
   * @param readIdentity  (optional)
   * @param readOwnStats  (optional)
   * @param readPresence  (optional)
   * @param readStats  (optional)
   * @param readSurveys permission only available with the corresponding extension enabled (optional)
   * @param readUser  (optional)
   * @param receiveTasks  (optional)
   * @param replyWithAssistant permission only available with the corresponding extension enabled (optional)
   * @param searchContents  (optional)
   * @param searchEvent  (optional)
   * @param updateCommunity  (optional)
   * @param updateContentSource  (optional)
   * @param updateExtension  (optional)
   * @param updateIdentity  (optional)
   * @param updateIntervention  (optional)
   * @param updateOwnIntervention  (optional)
   * @param updateSettings  (optional)
   * @param updateTimeSheet  (optional)
   * @param updateUser  (optional)
   * @param useEmoji  (optional)
   * @return Role
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Role createRole(String label, Boolean accessHelpCenter, Boolean accessPreviousMessages, Boolean accessPullMode, Boolean adminStampAnswer, Boolean approveContent, Boolean askAnExpert, Boolean assignIntervention, Boolean authorBlockContent, Boolean closeContentThread, Boolean createAndDestroyExtension, Boolean createCommunity, Boolean createContentSource, Boolean createUser, Boolean delayExportContent, Boolean deleteContentThread, Boolean escalateToVideo, Boolean impersonateUser, Boolean inviteUser, Boolean manageApiAccessTokens, Boolean manageAppSdkApplications, Boolean manageAutomaticExportsTasks, Boolean manageCategories, Boolean manageChat, Boolean manageCustomFields, Boolean manageCustomNotifications, Boolean manageEmailsTemplates, Boolean manageFolders, Boolean manageIce, Boolean manageIdentities, Boolean manageOwnNotifications, Boolean manageReplyAssistant, Boolean manageRoles, Boolean manageRulesEngineRules, Boolean manageSurveys, Boolean manageTags, Boolean manageTeams, Boolean manageTopologies, Boolean manageUsersOfMyTeams, Boolean monitorTasks, Boolean monitorTeamTasks, Boolean muteContent, Boolean openContentThread, Boolean publishContent, Boolean readCommunity, Boolean readContentSource, Boolean readEvent, Boolean readExport, Boolean readIdentity, Boolean readOwnStats, Boolean readPresence, Boolean readStats, Boolean readSurveys, Boolean readUser, Boolean receiveTasks, Boolean replyWithAssistant, Boolean searchContents, Boolean searchEvent, Boolean updateCommunity, Boolean updateContentSource, Boolean updateExtension, Boolean updateIdentity, Boolean updateIntervention, Boolean updateOwnIntervention, Boolean updateSettings, Boolean updateTimeSheet, Boolean updateUser, Boolean useEmoji) throws ApiException {
    return createRoleWithHttpInfo(label, accessHelpCenter, accessPreviousMessages, accessPullMode, adminStampAnswer, approveContent, askAnExpert, assignIntervention, authorBlockContent, closeContentThread, createAndDestroyExtension, createCommunity, createContentSource, createUser, delayExportContent, deleteContentThread, escalateToVideo, impersonateUser, inviteUser, manageApiAccessTokens, manageAppSdkApplications, manageAutomaticExportsTasks, manageCategories, manageChat, manageCustomFields, manageCustomNotifications, manageEmailsTemplates, manageFolders, manageIce, manageIdentities, manageOwnNotifications, manageReplyAssistant, manageRoles, manageRulesEngineRules, manageSurveys, manageTags, manageTeams, manageTopologies, manageUsersOfMyTeams, monitorTasks, monitorTeamTasks, muteContent, openContentThread, publishContent, readCommunity, readContentSource, readEvent, readExport, readIdentity, readOwnStats, readPresence, readStats, readSurveys, readUser, receiveTasks, replyWithAssistant, searchContents, searchEvent, updateCommunity, updateContentSource, updateExtension, updateIdentity, updateIntervention, updateOwnIntervention, updateSettings, updateTimeSheet, updateUser, useEmoji).getData();
  }

  /**
   * Creating a role
   * This method creates a new role. In case of success it renders the created role, otherwise, it renders an error (422 HTTP code).
   * @param label  (required)
   * @param accessHelpCenter  (optional)
   * @param accessPreviousMessages  (optional)
   * @param accessPullMode  (optional)
   * @param adminStampAnswer  (optional)
   * @param approveContent  (optional)
   * @param askAnExpert permission only available with the corresponding configuration (optional)
   * @param assignIntervention  (optional)
   * @param authorBlockContent  (optional)
   * @param closeContentThread  (optional)
   * @param createAndDestroyExtension  (optional)
   * @param createCommunity  (optional)
   * @param createContentSource  (optional)
   * @param createUser  (optional)
   * @param delayExportContent  (optional)
   * @param deleteContentThread  (optional)
   * @param escalateToVideo permission only available with the corresponding configuration (optional)
   * @param impersonateUser  (optional)
   * @param inviteUser  (optional)
   * @param manageApiAccessTokens  (optional)
   * @param manageAppSdkApplications  (optional)
   * @param manageAutomaticExportsTasks permission only available with the corresponding extension enabled (optional)
   * @param manageCategories  (optional)
   * @param manageChat  (optional)
   * @param manageCustomFields  (optional)
   * @param manageCustomNotifications  (optional)
   * @param manageEmailsTemplates  (optional)
   * @param manageFolders  (optional)
   * @param manageIce  (optional)
   * @param manageIdentities  (optional)
   * @param manageOwnNotifications  (optional)
   * @param manageReplyAssistant permission only available with the corresponding extension enabled (optional)
   * @param manageRoles  (optional)
   * @param manageRulesEngineRules permission only available with the corresponding extension enabled (optional)
   * @param manageSurveys permission only available with the corresponding extension enabled (optional)
   * @param manageTags  (optional)
   * @param manageTeams  (optional)
   * @param manageTopologies  (optional)
   * @param manageUsersOfMyTeams  (optional)
   * @param monitorTasks  (optional)
   * @param monitorTeamTasks  (optional)
   * @param muteContent  (optional)
   * @param openContentThread  (optional)
   * @param publishContent  (optional)
   * @param readCommunity  (optional)
   * @param readContentSource  (optional)
   * @param readEvent  (optional)
   * @param readExport  (optional)
   * @param readIdentity  (optional)
   * @param readOwnStats  (optional)
   * @param readPresence  (optional)
   * @param readStats  (optional)
   * @param readSurveys permission only available with the corresponding extension enabled (optional)
   * @param readUser  (optional)
   * @param receiveTasks  (optional)
   * @param replyWithAssistant permission only available with the corresponding extension enabled (optional)
   * @param searchContents  (optional)
   * @param searchEvent  (optional)
   * @param updateCommunity  (optional)
   * @param updateContentSource  (optional)
   * @param updateExtension  (optional)
   * @param updateIdentity  (optional)
   * @param updateIntervention  (optional)
   * @param updateOwnIntervention  (optional)
   * @param updateSettings  (optional)
   * @param updateTimeSheet  (optional)
   * @param updateUser  (optional)
   * @param useEmoji  (optional)
   * @return ApiResponse&lt;Role&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Role> createRoleWithHttpInfo(String label, Boolean accessHelpCenter, Boolean accessPreviousMessages, Boolean accessPullMode, Boolean adminStampAnswer, Boolean approveContent, Boolean askAnExpert, Boolean assignIntervention, Boolean authorBlockContent, Boolean closeContentThread, Boolean createAndDestroyExtension, Boolean createCommunity, Boolean createContentSource, Boolean createUser, Boolean delayExportContent, Boolean deleteContentThread, Boolean escalateToVideo, Boolean impersonateUser, Boolean inviteUser, Boolean manageApiAccessTokens, Boolean manageAppSdkApplications, Boolean manageAutomaticExportsTasks, Boolean manageCategories, Boolean manageChat, Boolean manageCustomFields, Boolean manageCustomNotifications, Boolean manageEmailsTemplates, Boolean manageFolders, Boolean manageIce, Boolean manageIdentities, Boolean manageOwnNotifications, Boolean manageReplyAssistant, Boolean manageRoles, Boolean manageRulesEngineRules, Boolean manageSurveys, Boolean manageTags, Boolean manageTeams, Boolean manageTopologies, Boolean manageUsersOfMyTeams, Boolean monitorTasks, Boolean monitorTeamTasks, Boolean muteContent, Boolean openContentThread, Boolean publishContent, Boolean readCommunity, Boolean readContentSource, Boolean readEvent, Boolean readExport, Boolean readIdentity, Boolean readOwnStats, Boolean readPresence, Boolean readStats, Boolean readSurveys, Boolean readUser, Boolean receiveTasks, Boolean replyWithAssistant, Boolean searchContents, Boolean searchEvent, Boolean updateCommunity, Boolean updateContentSource, Boolean updateExtension, Boolean updateIdentity, Boolean updateIntervention, Boolean updateOwnIntervention, Boolean updateSettings, Boolean updateTimeSheet, Boolean updateUser, Boolean useEmoji) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'label' is set
    if (label == null) {
      throw new ApiException(400, "Missing the required parameter 'label' when calling createRole");
    }
    
    // create path and map variables
    String localVarPath = "/roles";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "label", label));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_help_center", accessHelpCenter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_previous_messages", accessPreviousMessages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_pull_mode", accessPullMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "admin_stamp_answer", adminStampAnswer));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "approve_content", approveContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ask_an_expert", askAnExpert));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "assign_intervention", assignIntervention));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "author_block_content", authorBlockContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "close_content_thread", closeContentThread));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "create_and_destroy_extension", createAndDestroyExtension));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "create_community", createCommunity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "create_content_source", createContentSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "create_user", createUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "delay_export_content", delayExportContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "delete_content_thread", deleteContentThread));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "escalate_to_video", escalateToVideo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "impersonate_user", impersonateUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "invite_user", inviteUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_api_access_tokens", manageApiAccessTokens));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_app_sdk_applications", manageAppSdkApplications));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_automatic_exports_tasks", manageAutomaticExportsTasks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_categories", manageCategories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_chat", manageChat));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_custom_fields", manageCustomFields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_custom_notifications", manageCustomNotifications));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_emails_templates", manageEmailsTemplates));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_folders", manageFolders));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_ice", manageIce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_identities", manageIdentities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_own_notifications", manageOwnNotifications));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_reply_assistant", manageReplyAssistant));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_roles", manageRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_rules_engine_rules", manageRulesEngineRules));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_surveys", manageSurveys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_tags", manageTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_teams", manageTeams));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_topologies", manageTopologies));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_users_of_my_teams", manageUsersOfMyTeams));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "monitor_tasks", monitorTasks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "monitor_team_tasks", monitorTeamTasks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mute_content", muteContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "open_content_thread", openContentThread));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "publish_content", publishContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_community", readCommunity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_content_source", readContentSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_event", readEvent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_export", readExport));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_identity", readIdentity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_own_stats", readOwnStats));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_presence", readPresence));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_stats", readStats));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_surveys", readSurveys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_user", readUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "receive_tasks", receiveTasks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reply_with_assistant", replyWithAssistant));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search_contents", searchContents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search_event", searchEvent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_community", updateCommunity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_content_source", updateContentSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_extension", updateExtension));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_identity", updateIdentity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_intervention", updateIntervention));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_own_intervention", updateOwnIntervention));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_settings", updateSettings));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_time_sheet", updateTimeSheet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_user", updateUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "use_emoji", useEmoji));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Role> localVarReturnType = new GenericType<Role>() {};

    return apiClient.invokeAPI("RolesApi.createRole", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all roles
   * This method renders roles ordered by creation date (ascending).
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllRolesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllRolesResponse getAllRoles(Integer offset, Integer limit) throws ApiException {
    return getAllRolesWithHttpInfo(offset, limit).getData();
  }

  /**
   * Getting all roles
   * This method renders roles ordered by creation date (ascending).
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllRolesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllRolesResponse> getAllRolesWithHttpInfo(Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/roles";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<GetAllRolesResponse> localVarReturnType = new GenericType<GetAllRolesResponse>() {};

    return apiClient.invokeAPI("RolesApi.getAllRoles", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a role from its id
   * This method renders a role from given id.  Authorization​: only users that can manage roles.
   * @param roleId  (required)
   * @return Role
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Role getRole(String roleId) throws ApiException {
    return getRoleWithHttpInfo(roleId).getData();
  }

  /**
   * Getting a role from its id
   * This method renders a role from given id.  Authorization​: only users that can manage roles.
   * @param roleId  (required)
   * @return ApiResponse&lt;Role&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Role> getRoleWithHttpInfo(String roleId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling getRole");
    }
    
    // create path and map variables
    String localVarPath = "/roles/{roleId}"
      .replaceAll("\\{" + "roleId" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Role> localVarReturnType = new GenericType<Role>() {};

    return apiClient.invokeAPI("RolesApi.getRole", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a role
   * This method updates an existing role from given attributes and renders it in case of success.  Authorization​: A user can’t update roles with more permissions than himself and can’t give a role a permission he doesn’t have.  Any permission updated with a user that does not have this permission will be ignored (The update is done, just not the unallowed permission)
   * @param roleId  (required)
   * @param accessHelpCenter  (optional)
   * @param accessPreviousMessages  (optional)
   * @param accessPullMode  (optional)
   * @param adminStampAnswer  (optional)
   * @param approveContent  (optional)
   * @param askAnExpert permission only available with the corresponding configuration (optional)
   * @param assignIntervention  (optional)
   * @param authorBlockContent  (optional)
   * @param closeContentThread  (optional)
   * @param createAndDestroyExtension  (optional)
   * @param createCommunity  (optional)
   * @param createContentSource  (optional)
   * @param createUser  (optional)
   * @param delayExportContent  (optional)
   * @param deleteContentThread  (optional)
   * @param escalateToVideo permission only available with the corresponding configuration (optional)
   * @param impersonateUser  (optional)
   * @param inviteUser  (optional)
   * @param manageApiAccessTokens  (optional)
   * @param manageAppSdkApplications  (optional)
   * @param manageAutomaticExportsTasks permission only available with the corresponding extension enabled (optional)
   * @param manageCategories  (optional)
   * @param manageChat  (optional)
   * @param manageCustomFields  (optional)
   * @param manageCustomNotifications  (optional)
   * @param manageEmailsTemplates  (optional)
   * @param manageFolders  (optional)
   * @param manageIce  (optional)
   * @param manageIdentities  (optional)
   * @param manageOwnNotifications  (optional)
   * @param manageReplyAssistant permission only available with the corresponding extension enabled (optional)
   * @param manageRoles  (optional)
   * @param manageRulesEngineRules permission only available with the corresponding extension enabled (optional)
   * @param manageSurveys permission only available with the corresponding extension enabled (optional)
   * @param manageTags  (optional)
   * @param manageTeams  (optional)
   * @param manageTopologies  (optional)
   * @param manageUsersOfMyTeams  (optional)
   * @param monitorTasks  (optional)
   * @param monitorTeamTasks  (optional)
   * @param muteContent  (optional)
   * @param openContentThread  (optional)
   * @param publishContent  (optional)
   * @param readCommunity  (optional)
   * @param readContentSource  (optional)
   * @param readEvent  (optional)
   * @param readExport  (optional)
   * @param readIdentity  (optional)
   * @param readOwnStats  (optional)
   * @param readPresence  (optional)
   * @param readStats  (optional)
   * @param readSurveys permission only available with the corresponding extension enabled (optional)
   * @param readUser  (optional)
   * @param receiveTasks  (optional)
   * @param replyWithAssistant permission only available with the corresponding extension enabled (optional)
   * @param searchContents  (optional)
   * @param searchEvent  (optional)
   * @param updateCommunity  (optional)
   * @param updateContentSource  (optional)
   * @param updateExtension  (optional)
   * @param updateIdentity  (optional)
   * @param updateIntervention  (optional)
   * @param updateOwnIntervention  (optional)
   * @param updateSettings  (optional)
   * @param updateTimeSheet  (optional)
   * @param updateUser  (optional)
   * @param useEmoji  (optional)
   * @return Role
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Role updateRole(String roleId, Boolean accessHelpCenter, Boolean accessPreviousMessages, Boolean accessPullMode, Boolean adminStampAnswer, Boolean approveContent, Boolean askAnExpert, Boolean assignIntervention, Boolean authorBlockContent, Boolean closeContentThread, Boolean createAndDestroyExtension, Boolean createCommunity, Boolean createContentSource, Boolean createUser, Boolean delayExportContent, Boolean deleteContentThread, Boolean escalateToVideo, Boolean impersonateUser, Boolean inviteUser, Boolean manageApiAccessTokens, Boolean manageAppSdkApplications, Boolean manageAutomaticExportsTasks, Boolean manageCategories, Boolean manageChat, Boolean manageCustomFields, Boolean manageCustomNotifications, Boolean manageEmailsTemplates, Boolean manageFolders, Boolean manageIce, Boolean manageIdentities, Boolean manageOwnNotifications, Boolean manageReplyAssistant, Boolean manageRoles, Boolean manageRulesEngineRules, Boolean manageSurveys, Boolean manageTags, Boolean manageTeams, Boolean manageTopologies, Boolean manageUsersOfMyTeams, Boolean monitorTasks, Boolean monitorTeamTasks, Boolean muteContent, Boolean openContentThread, Boolean publishContent, Boolean readCommunity, Boolean readContentSource, Boolean readEvent, Boolean readExport, Boolean readIdentity, Boolean readOwnStats, Boolean readPresence, Boolean readStats, Boolean readSurveys, Boolean readUser, Boolean receiveTasks, Boolean replyWithAssistant, Boolean searchContents, Boolean searchEvent, Boolean updateCommunity, Boolean updateContentSource, Boolean updateExtension, Boolean updateIdentity, Boolean updateIntervention, Boolean updateOwnIntervention, Boolean updateSettings, Boolean updateTimeSheet, Boolean updateUser, Boolean useEmoji) throws ApiException {
    return updateRoleWithHttpInfo(roleId, accessHelpCenter, accessPreviousMessages, accessPullMode, adminStampAnswer, approveContent, askAnExpert, assignIntervention, authorBlockContent, closeContentThread, createAndDestroyExtension, createCommunity, createContentSource, createUser, delayExportContent, deleteContentThread, escalateToVideo, impersonateUser, inviteUser, manageApiAccessTokens, manageAppSdkApplications, manageAutomaticExportsTasks, manageCategories, manageChat, manageCustomFields, manageCustomNotifications, manageEmailsTemplates, manageFolders, manageIce, manageIdentities, manageOwnNotifications, manageReplyAssistant, manageRoles, manageRulesEngineRules, manageSurveys, manageTags, manageTeams, manageTopologies, manageUsersOfMyTeams, monitorTasks, monitorTeamTasks, muteContent, openContentThread, publishContent, readCommunity, readContentSource, readEvent, readExport, readIdentity, readOwnStats, readPresence, readStats, readSurveys, readUser, receiveTasks, replyWithAssistant, searchContents, searchEvent, updateCommunity, updateContentSource, updateExtension, updateIdentity, updateIntervention, updateOwnIntervention, updateSettings, updateTimeSheet, updateUser, useEmoji).getData();
  }

  /**
   * Updating a role
   * This method updates an existing role from given attributes and renders it in case of success.  Authorization​: A user can’t update roles with more permissions than himself and can’t give a role a permission he doesn’t have.  Any permission updated with a user that does not have this permission will be ignored (The update is done, just not the unallowed permission)
   * @param roleId  (required)
   * @param accessHelpCenter  (optional)
   * @param accessPreviousMessages  (optional)
   * @param accessPullMode  (optional)
   * @param adminStampAnswer  (optional)
   * @param approveContent  (optional)
   * @param askAnExpert permission only available with the corresponding configuration (optional)
   * @param assignIntervention  (optional)
   * @param authorBlockContent  (optional)
   * @param closeContentThread  (optional)
   * @param createAndDestroyExtension  (optional)
   * @param createCommunity  (optional)
   * @param createContentSource  (optional)
   * @param createUser  (optional)
   * @param delayExportContent  (optional)
   * @param deleteContentThread  (optional)
   * @param escalateToVideo permission only available with the corresponding configuration (optional)
   * @param impersonateUser  (optional)
   * @param inviteUser  (optional)
   * @param manageApiAccessTokens  (optional)
   * @param manageAppSdkApplications  (optional)
   * @param manageAutomaticExportsTasks permission only available with the corresponding extension enabled (optional)
   * @param manageCategories  (optional)
   * @param manageChat  (optional)
   * @param manageCustomFields  (optional)
   * @param manageCustomNotifications  (optional)
   * @param manageEmailsTemplates  (optional)
   * @param manageFolders  (optional)
   * @param manageIce  (optional)
   * @param manageIdentities  (optional)
   * @param manageOwnNotifications  (optional)
   * @param manageReplyAssistant permission only available with the corresponding extension enabled (optional)
   * @param manageRoles  (optional)
   * @param manageRulesEngineRules permission only available with the corresponding extension enabled (optional)
   * @param manageSurveys permission only available with the corresponding extension enabled (optional)
   * @param manageTags  (optional)
   * @param manageTeams  (optional)
   * @param manageTopologies  (optional)
   * @param manageUsersOfMyTeams  (optional)
   * @param monitorTasks  (optional)
   * @param monitorTeamTasks  (optional)
   * @param muteContent  (optional)
   * @param openContentThread  (optional)
   * @param publishContent  (optional)
   * @param readCommunity  (optional)
   * @param readContentSource  (optional)
   * @param readEvent  (optional)
   * @param readExport  (optional)
   * @param readIdentity  (optional)
   * @param readOwnStats  (optional)
   * @param readPresence  (optional)
   * @param readStats  (optional)
   * @param readSurveys permission only available with the corresponding extension enabled (optional)
   * @param readUser  (optional)
   * @param receiveTasks  (optional)
   * @param replyWithAssistant permission only available with the corresponding extension enabled (optional)
   * @param searchContents  (optional)
   * @param searchEvent  (optional)
   * @param updateCommunity  (optional)
   * @param updateContentSource  (optional)
   * @param updateExtension  (optional)
   * @param updateIdentity  (optional)
   * @param updateIntervention  (optional)
   * @param updateOwnIntervention  (optional)
   * @param updateSettings  (optional)
   * @param updateTimeSheet  (optional)
   * @param updateUser  (optional)
   * @param useEmoji  (optional)
   * @return ApiResponse&lt;Role&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Role> updateRoleWithHttpInfo(String roleId, Boolean accessHelpCenter, Boolean accessPreviousMessages, Boolean accessPullMode, Boolean adminStampAnswer, Boolean approveContent, Boolean askAnExpert, Boolean assignIntervention, Boolean authorBlockContent, Boolean closeContentThread, Boolean createAndDestroyExtension, Boolean createCommunity, Boolean createContentSource, Boolean createUser, Boolean delayExportContent, Boolean deleteContentThread, Boolean escalateToVideo, Boolean impersonateUser, Boolean inviteUser, Boolean manageApiAccessTokens, Boolean manageAppSdkApplications, Boolean manageAutomaticExportsTasks, Boolean manageCategories, Boolean manageChat, Boolean manageCustomFields, Boolean manageCustomNotifications, Boolean manageEmailsTemplates, Boolean manageFolders, Boolean manageIce, Boolean manageIdentities, Boolean manageOwnNotifications, Boolean manageReplyAssistant, Boolean manageRoles, Boolean manageRulesEngineRules, Boolean manageSurveys, Boolean manageTags, Boolean manageTeams, Boolean manageTopologies, Boolean manageUsersOfMyTeams, Boolean monitorTasks, Boolean monitorTeamTasks, Boolean muteContent, Boolean openContentThread, Boolean publishContent, Boolean readCommunity, Boolean readContentSource, Boolean readEvent, Boolean readExport, Boolean readIdentity, Boolean readOwnStats, Boolean readPresence, Boolean readStats, Boolean readSurveys, Boolean readUser, Boolean receiveTasks, Boolean replyWithAssistant, Boolean searchContents, Boolean searchEvent, Boolean updateCommunity, Boolean updateContentSource, Boolean updateExtension, Boolean updateIdentity, Boolean updateIntervention, Boolean updateOwnIntervention, Boolean updateSettings, Boolean updateTimeSheet, Boolean updateUser, Boolean useEmoji) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling updateRole");
    }
    
    // create path and map variables
    String localVarPath = "/roles/{roleId}"
      .replaceAll("\\{" + "roleId" + "\\}", apiClient.escapeString(roleId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_help_center", accessHelpCenter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_previous_messages", accessPreviousMessages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_pull_mode", accessPullMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "admin_stamp_answer", adminStampAnswer));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "approve_content", approveContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ask_an_expert", askAnExpert));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "assign_intervention", assignIntervention));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "author_block_content", authorBlockContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "close_content_thread", closeContentThread));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "create_and_destroy_extension", createAndDestroyExtension));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "create_community", createCommunity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "create_content_source", createContentSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "create_user", createUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "delay_export_content", delayExportContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "delete_content_thread", deleteContentThread));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "escalate_to_video", escalateToVideo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "impersonate_user", impersonateUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "invite_user", inviteUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_api_access_tokens", manageApiAccessTokens));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_app_sdk_applications", manageAppSdkApplications));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_automatic_exports_tasks", manageAutomaticExportsTasks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_categories", manageCategories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_chat", manageChat));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_custom_fields", manageCustomFields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_custom_notifications", manageCustomNotifications));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_emails_templates", manageEmailsTemplates));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_folders", manageFolders));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_ice", manageIce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_identities", manageIdentities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_own_notifications", manageOwnNotifications));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_reply_assistant", manageReplyAssistant));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_roles", manageRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_rules_engine_rules", manageRulesEngineRules));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_surveys", manageSurveys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_tags", manageTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_teams", manageTeams));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_topologies", manageTopologies));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "manage_users_of_my_teams", manageUsersOfMyTeams));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "monitor_tasks", monitorTasks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "monitor_team_tasks", monitorTeamTasks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mute_content", muteContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "open_content_thread", openContentThread));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "publish_content", publishContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_community", readCommunity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_content_source", readContentSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_event", readEvent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_export", readExport));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_identity", readIdentity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_own_stats", readOwnStats));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_presence", readPresence));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_stats", readStats));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_surveys", readSurveys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "read_user", readUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "receive_tasks", receiveTasks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reply_with_assistant", replyWithAssistant));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search_contents", searchContents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "search_event", searchEvent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_community", updateCommunity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_content_source", updateContentSource));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_extension", updateExtension));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_identity", updateIdentity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_intervention", updateIntervention));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_own_intervention", updateOwnIntervention));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_settings", updateSettings));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_time_sheet", updateTimeSheet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "update_user", updateUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "use_emoji", useEmoji));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Role> localVarReturnType = new GenericType<Role>() {};

    return apiClient.invokeAPI("RolesApi.updateRole", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
