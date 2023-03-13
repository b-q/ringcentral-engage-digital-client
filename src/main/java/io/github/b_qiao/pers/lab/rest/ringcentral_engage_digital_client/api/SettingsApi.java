package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Settings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class SettingsApi {
  private ApiClient apiClient;

  public SettingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SettingsApi(ApiClient apiClient) {
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
   * Getting all settings
   * This method renders all settings of your domain.
   * @return Settings
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Settings getAllSettings() throws ApiException {
    return getAllSettingsWithHttpInfo().getData();
  }

  /**
   * Getting all settings
   * This method renders all settings of your domain.
   * @return ApiResponse&lt;Settings&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Settings> getAllSettingsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/settings";

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

    GenericType<Settings> localVarReturnType = new GenericType<Settings>() {};

    return apiClient.invokeAPI("SettingsApi.getAllSettings", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating settings
   * This method updates the current domain settings.  Authorization​: only users that can update settings.
   * @param activityPresenceThreshold (in hours). (optional)
   * @param activityTracking ​Enable activity tracking (Boolean) (optional)
   * @param beginningOfWeek (Day of week) (optional)
   * @param categoryTagging A​ ctivate the forced categorization by source.​ (Boolean) (optional)
   * @param contentLanguages (See format) (optional)
   * @param dashboard Activate the dashboard (Boolean) (optional)
   * @param denyIframeIntegration Prevent the DD to be embed by other websites (Boolean) (optional)
   * @param disablePasswordAutocomplete (Boolean) (optional)
   * @param expirePasswordAfter password expiration delay (in seconds) (optional)
   * @param enableAutoScrollDown enable auto scroll down (Boolean) (optional)
   * @param expirePasswordEnabled enable password expiration (Boolean) (optional)
   * @param exportInSeconds provide durations in seconds in export (Boolean) (optional)
   * @param foldUselessContents fold archived contents (Boolean) (optional)
   * @param fteDuration FTE data period (in hours) (optional)
   * @param identityMerge enable identity merge (Boolean) (optional)
   * @param interventionDeferRates (Array of times in seconds) (optional)
   * @param interventionDeferThreshold (in seconds) (optional)
   * @param interventionRates (Array of times in seconds) (optional)
   * @param locale locale code (String) (optional)
   * @param multiLang activate multi language support for messages (Boolean) (optional)
   * @param name Name of the Dimelo Digital (String) (optional)
   * @param passwordArchivableEnabled prohibit reusing old passwords (Boolean) (optional)
   * @param passwordArchivableSize number of archived passwords (optional)
   * @param passwordMinLength minimum character length (optional)
   * @param passwordNonWord should contain at least 1 non alphanumeric char (Boolean) (optional)
   * @param passwordNumbers should contain at least 1 number (Boolean) (optional)
   * @param passwordRecoveryDisabled disable password recovery by email (Boolean) (optional)
   * @param pushEnabled Enable push mode (Boolean) (optional)
   * @param replyAsAnyIdentity Enable reply as any identity (Boolean) (optional)
   * @param rtlSupport Enable right to left support (Boolean) (optional)
   * @param selfApprovalRequired ​Allow authors to ask approval of their messages (Boolean) (optional)
   * @param sessionTimeout Session timeout (in minutes) (optional)
   * @param spellchecking Enable spellchecking (Boolean) (optional)
   * @param style Defines the DD’s design (String) (optional)
   * @param thirdPartyServicesDisabled Disable third-party services (tracking...) (Boolean) (optional)
   * @param timezone Use the timezone endpoint to get the timezone name (String) (optional)
   * @param trackJs Track JS errors (Boolean) (optional)
   * @param type Can be ‘demo’, ‘production’ or ‘archived’ (optional)
   * @param urgentTaskThreshold Chat max response time (in seconds) (optional)
   * @param useSystemFont Experimental (Boolean) (optional)
   * @return Settings
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Settings updateSettings(Integer activityPresenceThreshold, Boolean activityTracking, String beginningOfWeek, Boolean categoryTagging, String contentLanguages, Boolean dashboard, Boolean denyIframeIntegration, Boolean disablePasswordAutocomplete, Integer expirePasswordAfter, Boolean enableAutoScrollDown, Boolean expirePasswordEnabled, Boolean exportInSeconds, Boolean foldUselessContents, Integer fteDuration, Boolean identityMerge, List<Integer> interventionDeferRates, Integer interventionDeferThreshold, List<Integer> interventionRates, String locale, Boolean multiLang, String name, Boolean passwordArchivableEnabled, Integer passwordArchivableSize, Integer passwordMinLength, Boolean passwordNonWord, Boolean passwordNumbers, Boolean passwordRecoveryDisabled, Boolean pushEnabled, Boolean replyAsAnyIdentity, Boolean rtlSupport, Boolean selfApprovalRequired, Integer sessionTimeout, Boolean spellchecking, String style, Boolean thirdPartyServicesDisabled, String timezone, Boolean trackJs, String type, Integer urgentTaskThreshold, Boolean useSystemFont) throws ApiException {
    return updateSettingsWithHttpInfo(activityPresenceThreshold, activityTracking, beginningOfWeek, categoryTagging, contentLanguages, dashboard, denyIframeIntegration, disablePasswordAutocomplete, expirePasswordAfter, enableAutoScrollDown, expirePasswordEnabled, exportInSeconds, foldUselessContents, fteDuration, identityMerge, interventionDeferRates, interventionDeferThreshold, interventionRates, locale, multiLang, name, passwordArchivableEnabled, passwordArchivableSize, passwordMinLength, passwordNonWord, passwordNumbers, passwordRecoveryDisabled, pushEnabled, replyAsAnyIdentity, rtlSupport, selfApprovalRequired, sessionTimeout, spellchecking, style, thirdPartyServicesDisabled, timezone, trackJs, type, urgentTaskThreshold, useSystemFont).getData();
  }

  /**
   * Updating settings
   * This method updates the current domain settings.  Authorization​: only users that can update settings.
   * @param activityPresenceThreshold (in hours). (optional)
   * @param activityTracking ​Enable activity tracking (Boolean) (optional)
   * @param beginningOfWeek (Day of week) (optional)
   * @param categoryTagging A​ ctivate the forced categorization by source.​ (Boolean) (optional)
   * @param contentLanguages (See format) (optional)
   * @param dashboard Activate the dashboard (Boolean) (optional)
   * @param denyIframeIntegration Prevent the DD to be embed by other websites (Boolean) (optional)
   * @param disablePasswordAutocomplete (Boolean) (optional)
   * @param expirePasswordAfter password expiration delay (in seconds) (optional)
   * @param enableAutoScrollDown enable auto scroll down (Boolean) (optional)
   * @param expirePasswordEnabled enable password expiration (Boolean) (optional)
   * @param exportInSeconds provide durations in seconds in export (Boolean) (optional)
   * @param foldUselessContents fold archived contents (Boolean) (optional)
   * @param fteDuration FTE data period (in hours) (optional)
   * @param identityMerge enable identity merge (Boolean) (optional)
   * @param interventionDeferRates (Array of times in seconds) (optional)
   * @param interventionDeferThreshold (in seconds) (optional)
   * @param interventionRates (Array of times in seconds) (optional)
   * @param locale locale code (String) (optional)
   * @param multiLang activate multi language support for messages (Boolean) (optional)
   * @param name Name of the Dimelo Digital (String) (optional)
   * @param passwordArchivableEnabled prohibit reusing old passwords (Boolean) (optional)
   * @param passwordArchivableSize number of archived passwords (optional)
   * @param passwordMinLength minimum character length (optional)
   * @param passwordNonWord should contain at least 1 non alphanumeric char (Boolean) (optional)
   * @param passwordNumbers should contain at least 1 number (Boolean) (optional)
   * @param passwordRecoveryDisabled disable password recovery by email (Boolean) (optional)
   * @param pushEnabled Enable push mode (Boolean) (optional)
   * @param replyAsAnyIdentity Enable reply as any identity (Boolean) (optional)
   * @param rtlSupport Enable right to left support (Boolean) (optional)
   * @param selfApprovalRequired ​Allow authors to ask approval of their messages (Boolean) (optional)
   * @param sessionTimeout Session timeout (in minutes) (optional)
   * @param spellchecking Enable spellchecking (Boolean) (optional)
   * @param style Defines the DD’s design (String) (optional)
   * @param thirdPartyServicesDisabled Disable third-party services (tracking...) (Boolean) (optional)
   * @param timezone Use the timezone endpoint to get the timezone name (String) (optional)
   * @param trackJs Track JS errors (Boolean) (optional)
   * @param type Can be ‘demo’, ‘production’ or ‘archived’ (optional)
   * @param urgentTaskThreshold Chat max response time (in seconds) (optional)
   * @param useSystemFont Experimental (Boolean) (optional)
   * @return ApiResponse&lt;Settings&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Settings> updateSettingsWithHttpInfo(Integer activityPresenceThreshold, Boolean activityTracking, String beginningOfWeek, Boolean categoryTagging, String contentLanguages, Boolean dashboard, Boolean denyIframeIntegration, Boolean disablePasswordAutocomplete, Integer expirePasswordAfter, Boolean enableAutoScrollDown, Boolean expirePasswordEnabled, Boolean exportInSeconds, Boolean foldUselessContents, Integer fteDuration, Boolean identityMerge, List<Integer> interventionDeferRates, Integer interventionDeferThreshold, List<Integer> interventionRates, String locale, Boolean multiLang, String name, Boolean passwordArchivableEnabled, Integer passwordArchivableSize, Integer passwordMinLength, Boolean passwordNonWord, Boolean passwordNumbers, Boolean passwordRecoveryDisabled, Boolean pushEnabled, Boolean replyAsAnyIdentity, Boolean rtlSupport, Boolean selfApprovalRequired, Integer sessionTimeout, Boolean spellchecking, String style, Boolean thirdPartyServicesDisabled, String timezone, Boolean trackJs, String type, Integer urgentTaskThreshold, Boolean useSystemFont) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/settings";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "activity_presence_threshold", activityPresenceThreshold));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "activity_tracking", activityTracking));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginning_of_week", beginningOfWeek));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "category_tagging", categoryTagging));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "content_languages", contentLanguages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dashboard", dashboard));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deny_iframe_integration", denyIframeIntegration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "disable_password_autocomplete", disablePasswordAutocomplete));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expire_password_after", expirePasswordAfter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enable_auto_scroll_down", enableAutoScrollDown));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expire_password_enabled", expirePasswordEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "export_in_seconds", exportInSeconds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fold_useless_contents", foldUselessContents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fte_duration", fteDuration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identity_merge", identityMerge));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "intervention_defer_rates[]", interventionDeferRates));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "intervention_defer_threshold", interventionDeferThreshold));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "intervention_rates[]", interventionRates));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "multi_lang", multiLang));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "password_archivable_enabled", passwordArchivableEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "password_archivable_size", passwordArchivableSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "password_min_length", passwordMinLength));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "password_non_word", passwordNonWord));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "password_numbers", passwordNumbers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "password_recovery_disabled", passwordRecoveryDisabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "push_enabled", pushEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reply_as_any_identity", replyAsAnyIdentity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rtl_support", rtlSupport));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "self_approval_required", selfApprovalRequired));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "session_timeout", sessionTimeout));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "spellchecking", spellchecking));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "style", style));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "third_party_services_disabled", thirdPartyServicesDisabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timezone", timezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "track_js", trackJs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "urgent_task_threshold", urgentTaskThreshold));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "use_system_font", useSystemFont));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Settings> localVarReturnType = new GenericType<Settings>() {};

    return apiClient.invokeAPI("SettingsApi.updateSettings", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
