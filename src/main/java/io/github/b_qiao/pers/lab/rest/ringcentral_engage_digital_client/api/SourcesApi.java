package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllSourcesResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Source;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class SourcesApi {
  private ApiClient apiClient;

  public SourcesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SourcesApi(ApiClient apiClient) {
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
   * Getting all sources
   * This method renders sources ordered by creation date (ascending).
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllSourcesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllSourcesResponse getAllSources(Integer offset, Integer limit) throws ApiException {
    return getAllSourcesWithHttpInfo(offset, limit).getData();
  }

  /**
   * Getting all sources
   * This method renders sources ordered by creation date (ascending).
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllSourcesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllSourcesResponse> getAllSourcesWithHttpInfo(Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/content_sources";

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

    GenericType<GetAllSourcesResponse> localVarReturnType = new GenericType<GetAllSourcesResponse>() {};

    return apiClient.invokeAPI("SourcesApi.getAllSources", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a source from its id
   * This method renders a source from given id.
   * @param sourceId  (required)
   * @return Source
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Source getSource(String sourceId) throws ApiException {
    return getSourceWithHttpInfo(sourceId).getData();
  }

  /**
   * Getting a source from its id
   * This method renders a source from given id.
   * @param sourceId  (required)
   * @return ApiResponse&lt;Source&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Source> getSourceWithHttpInfo(String sourceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sourceId' is set
    if (sourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceId' when calling getSource");
    }
    
    // create path and map variables
    String localVarPath = "/content_sources/{sourceId}"
      .replaceAll("\\{" + "sourceId" + "\\}", apiClient.escapeString(sourceId.toString()));

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

    GenericType<Source> localVarReturnType = new GenericType<Source>() {};

    return apiClient.invokeAPI("SourcesApi.getSource", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a source
   * This method updates an existing source from given attributes and renders it in case of success.
   * @param sourceId  (required)
   * @param name Source name (optional)
   * @param active Activate/deactivate the source (Boolean) (optional)
   * @param channelId Channel (optional)
   * @param color Color of the icon (see S​ ource colors​) (Integer) (optional)
   * @param timeSheetIds Business Hours (Limited to 1) (optional)
   * @param slaResponse Response time (seconds) (optional)
   * @param slaThreshold Customer SLA warning threshold (must be greater than 0 and less than 100, default value is 0). (optional)
   * @param slaFilteringCategoriesStrategy Categories filtering strategy for Customer SLA indicator (optional)
   * @param slaFilteringCategoryIds Filtering categories for Customer SLA indicator (optional)
   * @param slaExpiredStrategy SLA expired strategy (\&quot;max\&quot;, \&quot;half\&quot; or \&quot;base\&quot;) (optional)
   * @param attachmentsSecurityLevel Attachments security level. (\&quot;strict\&quot;, \&quot;relaxed\&quot;, or \&quot;permissive\&quot;). Strict allows images and medias. Relaxed allows images, media and documents. Permissive allows all kind of attachments (optional)
   * @param interventionMessagesBoost Priority boost of messages with intervention (Integer) (optional)
   * @param transferredTasksBoost Priority boost of transferred tasks (Integer) (optional)
   * @param hiddenFromStats Hide from statistics (Boolean) (optional)
   * @param defaultCategoryIds Default categories (optional)
   * @param userThreadDefaultCategoryIds Default categories (agent messages) (optional)
   * @param signatures Signatures (optional)
   * @param autoResponseTriggers Automatic messages (optional)
   * @param autoResponseTriggerEnabledFirstMessageFromUser Enable answers to first messages (optional)
   * @param autoResponseTriggerEnabledOutOfOfficeHoursMessage Enable answers to messages outside business hours (optional)
   * @param autoResponseTriggerGracePeriodsFirstMessageFromUser Time between two messages (First message) (optional)
   * @param autoResponseTriggerGracePeriodsOutOfOfficeHoursMessage Time between two messages (Message outside business hours) (optional)
   * @param defaultContentLanguage Default content language (optional)
   * @param autoDetectContentLanguage Auto-detect content language (Boolean) (optional)
   * @param contentLanguages Languages to detect (optional)
   * @param contentArchiving Automatic archiving of old contents (Boolean) (optional)
   * @param contentArchivingPeriod Archive contents older than (seconds) (optional)
   * @param fromName Custom sender name. Only on sources which supports a custom sender name. (optional)
   * @param defaultTaskPriority Default priority for interactions. (optional)
   * @param enableAndroid Only on Engage Messaging sources that are not on livechat mode. Enable or disable the source on Android. (optional)
   * @param enableIos Only on Engage Messaging sources that are not on livechat mode. Enable or disable the source on iOS. (optional)
   * @param enableWeb Only on Engage Messaging sources that are not on livechat mode. Enable or disable the source on the web. (optional)
   * @param imapSmtpEmail Email address to synchronize. Only on Email sources (optional)
   * @param imapMailboxesToImport Folders to synchronize. Does not accept empty array or blank values. Only on Email sources. (optional)
   * @param imapMailboxUsedForSentMail Folder for &#39;Sent Mail&#39;. Only on Email sources. (optional)
   * @param imapAddress IMAP server address. Only on Email sources (optional)
   * @param imapPort IMAP server port. Only on Email sources (optional)
   * @param imapUsername IMAP username. Only on Email sources (optional)
   * @param imapPassword IMAP password. Used when IMAP authentication type is &#x60;basic&#x60;. Only on Email sources (optional)
   * @param imapOauthRefreshToken IMAP OAuth 2.0 refresh token. Used when IMAP authentication type is &#x60;microsoft_identity_platform&#x60;. Only on Email sources (optional)
   * @param imapUseSslTls Use SSL/TLS protocol to establish secure IMAP connection. Only on Email sources (optional)
   * @param imapUseStartTls Use STARTTLS protocol to establish secure IMAP connection. Only on Email sources (optional)
   * @param imapAuthenticationType IMAP Authentication type (\&quot;basic\&quot; or \&quot;microsoft_identity_platform\&quot;). Only on Email sources (optional)
   * @param imapSslVerifyMode IMAP SSL verification mode. (\&quot;NONE\&quot;, \&quot;PEER\&quot;, \&quot;CLIENT_ONCE\&quot; or \&quot;FAIL_IF_NO_PEER_CERT\&quot;). Only on Email sources (optional)
   * @param smtpAddress SMTP server address. Only on Email sources (optional)
   * @param smtpPort SMTP server port. Only on Email sources (optional)
   * @param smtpUsername SMTP username. Only on Email sources (optional)
   * @param smtpPassword SMTP password. Used when SMTP authentication type is &#x60;basic&#x60;. Only on Email sources (optional)
   * @param smtpOauthRefreshToken SMTP OAuth 2.0 refresh token. Used when SMTP authentication type is &#x60;microsoft_identity_platform&#x60;. Only on Email sources (optional)
   * @param smtpUseSslTls Use SSL/TLS protocol to establish secure SMTP connection. Only on Email sources (optional)
   * @param smtpUseStartTls Use STARTTLS protocol to establish secure IMAP connection. Only on Email sources (optional)
   * @param smtpAuthenticationType SMTP Authentication type (\&quot;basic\&quot; or \&quot;microsoft_identity_platform\&quot;). Only on Email sources (optional)
   * @param smtpSslVerifyMode SMTP SSL verification mode. (\&quot;NONE\&quot;, \&quot;PEER\&quot;, \&quot;CLIENT_ONCE\&quot; or \&quot;FAIL_IF_NO_PEER_CERT\&quot;). Only on Email sources (optional)
   * @param smtpHeloDomain Used to identify HELO/EHLO when connecting to the SMTP server. Only on Email sources (optional)
   * @param threadingHeuristics Threading heuristics. Only on Email sources (optional)
   * @param spamAssassinLevel Spam threshold (\&quot;disabled\&quot;, \&quot;relaxed\&quot;, or \&quot;strict\&quot;). Only on Email sources (optional)
   * @param whitelistedEmails Whitelisted emails. All emails received from this address won&#39;t be threaded and can be associated with an anonymous identity or the Reply-To, if there is one. To be filled when implementing a form. Only on Email sources (optional)
   * @param ccBlacklist Exclude from TO/CC. Only on Email sources (optional)
   * @param emailParser Email parser (BBCode). Only on Email sources (optional)
   * @param timeForThreadInclusion Time for thread inclusion. (optional)
   * @param timeForThreadInclusionEnabled Enable time for thread inclusion. Only on Email sources (optional)
   * @return Source
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Source updateSource(String sourceId, String name, Boolean active, String channelId, Integer color, List<String> timeSheetIds, Integer slaResponse, Integer slaThreshold, String slaFilteringCategoriesStrategy, List<String> slaFilteringCategoryIds, String slaExpiredStrategy, String attachmentsSecurityLevel, Integer interventionMessagesBoost, Integer transferredTasksBoost, Boolean hiddenFromStats, List<String> defaultCategoryIds, List<String> userThreadDefaultCategoryIds, List<Object> signatures, List<Object> autoResponseTriggers, Boolean autoResponseTriggerEnabledFirstMessageFromUser, Boolean autoResponseTriggerEnabledOutOfOfficeHoursMessage, Integer autoResponseTriggerGracePeriodsFirstMessageFromUser, Integer autoResponseTriggerGracePeriodsOutOfOfficeHoursMessage, String defaultContentLanguage, Boolean autoDetectContentLanguage, List<String> contentLanguages, Boolean contentArchiving, Integer contentArchivingPeriod, String fromName, Integer defaultTaskPriority, Boolean enableAndroid, Boolean enableIos, Boolean enableWeb, String imapSmtpEmail, List<String> imapMailboxesToImport, String imapMailboxUsedForSentMail, String imapAddress, Integer imapPort, String imapUsername, String imapPassword, String imapOauthRefreshToken, Boolean imapUseSslTls, Boolean imapUseStartTls, String imapAuthenticationType, String imapSslVerifyMode, String smtpAddress, Integer smtpPort, String smtpUsername, String smtpPassword, String smtpOauthRefreshToken, Boolean smtpUseSslTls, Boolean smtpUseStartTls, String smtpAuthenticationType, String smtpSslVerifyMode, String smtpHeloDomain, Boolean threadingHeuristics, String spamAssassinLevel, String whitelistedEmails, List<String> ccBlacklist, Boolean emailParser, Integer timeForThreadInclusion, Boolean timeForThreadInclusionEnabled) throws ApiException {
    return updateSourceWithHttpInfo(sourceId, name, active, channelId, color, timeSheetIds, slaResponse, slaThreshold, slaFilteringCategoriesStrategy, slaFilteringCategoryIds, slaExpiredStrategy, attachmentsSecurityLevel, interventionMessagesBoost, transferredTasksBoost, hiddenFromStats, defaultCategoryIds, userThreadDefaultCategoryIds, signatures, autoResponseTriggers, autoResponseTriggerEnabledFirstMessageFromUser, autoResponseTriggerEnabledOutOfOfficeHoursMessage, autoResponseTriggerGracePeriodsFirstMessageFromUser, autoResponseTriggerGracePeriodsOutOfOfficeHoursMessage, defaultContentLanguage, autoDetectContentLanguage, contentLanguages, contentArchiving, contentArchivingPeriod, fromName, defaultTaskPriority, enableAndroid, enableIos, enableWeb, imapSmtpEmail, imapMailboxesToImport, imapMailboxUsedForSentMail, imapAddress, imapPort, imapUsername, imapPassword, imapOauthRefreshToken, imapUseSslTls, imapUseStartTls, imapAuthenticationType, imapSslVerifyMode, smtpAddress, smtpPort, smtpUsername, smtpPassword, smtpOauthRefreshToken, smtpUseSslTls, smtpUseStartTls, smtpAuthenticationType, smtpSslVerifyMode, smtpHeloDomain, threadingHeuristics, spamAssassinLevel, whitelistedEmails, ccBlacklist, emailParser, timeForThreadInclusion, timeForThreadInclusionEnabled).getData();
  }

  /**
   * Updating a source
   * This method updates an existing source from given attributes and renders it in case of success.
   * @param sourceId  (required)
   * @param name Source name (optional)
   * @param active Activate/deactivate the source (Boolean) (optional)
   * @param channelId Channel (optional)
   * @param color Color of the icon (see S​ ource colors​) (Integer) (optional)
   * @param timeSheetIds Business Hours (Limited to 1) (optional)
   * @param slaResponse Response time (seconds) (optional)
   * @param slaThreshold Customer SLA warning threshold (must be greater than 0 and less than 100, default value is 0). (optional)
   * @param slaFilteringCategoriesStrategy Categories filtering strategy for Customer SLA indicator (optional)
   * @param slaFilteringCategoryIds Filtering categories for Customer SLA indicator (optional)
   * @param slaExpiredStrategy SLA expired strategy (\&quot;max\&quot;, \&quot;half\&quot; or \&quot;base\&quot;) (optional)
   * @param attachmentsSecurityLevel Attachments security level. (\&quot;strict\&quot;, \&quot;relaxed\&quot;, or \&quot;permissive\&quot;). Strict allows images and medias. Relaxed allows images, media and documents. Permissive allows all kind of attachments (optional)
   * @param interventionMessagesBoost Priority boost of messages with intervention (Integer) (optional)
   * @param transferredTasksBoost Priority boost of transferred tasks (Integer) (optional)
   * @param hiddenFromStats Hide from statistics (Boolean) (optional)
   * @param defaultCategoryIds Default categories (optional)
   * @param userThreadDefaultCategoryIds Default categories (agent messages) (optional)
   * @param signatures Signatures (optional)
   * @param autoResponseTriggers Automatic messages (optional)
   * @param autoResponseTriggerEnabledFirstMessageFromUser Enable answers to first messages (optional)
   * @param autoResponseTriggerEnabledOutOfOfficeHoursMessage Enable answers to messages outside business hours (optional)
   * @param autoResponseTriggerGracePeriodsFirstMessageFromUser Time between two messages (First message) (optional)
   * @param autoResponseTriggerGracePeriodsOutOfOfficeHoursMessage Time between two messages (Message outside business hours) (optional)
   * @param defaultContentLanguage Default content language (optional)
   * @param autoDetectContentLanguage Auto-detect content language (Boolean) (optional)
   * @param contentLanguages Languages to detect (optional)
   * @param contentArchiving Automatic archiving of old contents (Boolean) (optional)
   * @param contentArchivingPeriod Archive contents older than (seconds) (optional)
   * @param fromName Custom sender name. Only on sources which supports a custom sender name. (optional)
   * @param defaultTaskPriority Default priority for interactions. (optional)
   * @param enableAndroid Only on Engage Messaging sources that are not on livechat mode. Enable or disable the source on Android. (optional)
   * @param enableIos Only on Engage Messaging sources that are not on livechat mode. Enable or disable the source on iOS. (optional)
   * @param enableWeb Only on Engage Messaging sources that are not on livechat mode. Enable or disable the source on the web. (optional)
   * @param imapSmtpEmail Email address to synchronize. Only on Email sources (optional)
   * @param imapMailboxesToImport Folders to synchronize. Does not accept empty array or blank values. Only on Email sources. (optional)
   * @param imapMailboxUsedForSentMail Folder for &#39;Sent Mail&#39;. Only on Email sources. (optional)
   * @param imapAddress IMAP server address. Only on Email sources (optional)
   * @param imapPort IMAP server port. Only on Email sources (optional)
   * @param imapUsername IMAP username. Only on Email sources (optional)
   * @param imapPassword IMAP password. Used when IMAP authentication type is &#x60;basic&#x60;. Only on Email sources (optional)
   * @param imapOauthRefreshToken IMAP OAuth 2.0 refresh token. Used when IMAP authentication type is &#x60;microsoft_identity_platform&#x60;. Only on Email sources (optional)
   * @param imapUseSslTls Use SSL/TLS protocol to establish secure IMAP connection. Only on Email sources (optional)
   * @param imapUseStartTls Use STARTTLS protocol to establish secure IMAP connection. Only on Email sources (optional)
   * @param imapAuthenticationType IMAP Authentication type (\&quot;basic\&quot; or \&quot;microsoft_identity_platform\&quot;). Only on Email sources (optional)
   * @param imapSslVerifyMode IMAP SSL verification mode. (\&quot;NONE\&quot;, \&quot;PEER\&quot;, \&quot;CLIENT_ONCE\&quot; or \&quot;FAIL_IF_NO_PEER_CERT\&quot;). Only on Email sources (optional)
   * @param smtpAddress SMTP server address. Only on Email sources (optional)
   * @param smtpPort SMTP server port. Only on Email sources (optional)
   * @param smtpUsername SMTP username. Only on Email sources (optional)
   * @param smtpPassword SMTP password. Used when SMTP authentication type is &#x60;basic&#x60;. Only on Email sources (optional)
   * @param smtpOauthRefreshToken SMTP OAuth 2.0 refresh token. Used when SMTP authentication type is &#x60;microsoft_identity_platform&#x60;. Only on Email sources (optional)
   * @param smtpUseSslTls Use SSL/TLS protocol to establish secure SMTP connection. Only on Email sources (optional)
   * @param smtpUseStartTls Use STARTTLS protocol to establish secure IMAP connection. Only on Email sources (optional)
   * @param smtpAuthenticationType SMTP Authentication type (\&quot;basic\&quot; or \&quot;microsoft_identity_platform\&quot;). Only on Email sources (optional)
   * @param smtpSslVerifyMode SMTP SSL verification mode. (\&quot;NONE\&quot;, \&quot;PEER\&quot;, \&quot;CLIENT_ONCE\&quot; or \&quot;FAIL_IF_NO_PEER_CERT\&quot;). Only on Email sources (optional)
   * @param smtpHeloDomain Used to identify HELO/EHLO when connecting to the SMTP server. Only on Email sources (optional)
   * @param threadingHeuristics Threading heuristics. Only on Email sources (optional)
   * @param spamAssassinLevel Spam threshold (\&quot;disabled\&quot;, \&quot;relaxed\&quot;, or \&quot;strict\&quot;). Only on Email sources (optional)
   * @param whitelistedEmails Whitelisted emails. All emails received from this address won&#39;t be threaded and can be associated with an anonymous identity or the Reply-To, if there is one. To be filled when implementing a form. Only on Email sources (optional)
   * @param ccBlacklist Exclude from TO/CC. Only on Email sources (optional)
   * @param emailParser Email parser (BBCode). Only on Email sources (optional)
   * @param timeForThreadInclusion Time for thread inclusion. (optional)
   * @param timeForThreadInclusionEnabled Enable time for thread inclusion. Only on Email sources (optional)
   * @return ApiResponse&lt;Source&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Source> updateSourceWithHttpInfo(String sourceId, String name, Boolean active, String channelId, Integer color, List<String> timeSheetIds, Integer slaResponse, Integer slaThreshold, String slaFilteringCategoriesStrategy, List<String> slaFilteringCategoryIds, String slaExpiredStrategy, String attachmentsSecurityLevel, Integer interventionMessagesBoost, Integer transferredTasksBoost, Boolean hiddenFromStats, List<String> defaultCategoryIds, List<String> userThreadDefaultCategoryIds, List<Object> signatures, List<Object> autoResponseTriggers, Boolean autoResponseTriggerEnabledFirstMessageFromUser, Boolean autoResponseTriggerEnabledOutOfOfficeHoursMessage, Integer autoResponseTriggerGracePeriodsFirstMessageFromUser, Integer autoResponseTriggerGracePeriodsOutOfOfficeHoursMessage, String defaultContentLanguage, Boolean autoDetectContentLanguage, List<String> contentLanguages, Boolean contentArchiving, Integer contentArchivingPeriod, String fromName, Integer defaultTaskPriority, Boolean enableAndroid, Boolean enableIos, Boolean enableWeb, String imapSmtpEmail, List<String> imapMailboxesToImport, String imapMailboxUsedForSentMail, String imapAddress, Integer imapPort, String imapUsername, String imapPassword, String imapOauthRefreshToken, Boolean imapUseSslTls, Boolean imapUseStartTls, String imapAuthenticationType, String imapSslVerifyMode, String smtpAddress, Integer smtpPort, String smtpUsername, String smtpPassword, String smtpOauthRefreshToken, Boolean smtpUseSslTls, Boolean smtpUseStartTls, String smtpAuthenticationType, String smtpSslVerifyMode, String smtpHeloDomain, Boolean threadingHeuristics, String spamAssassinLevel, String whitelistedEmails, List<String> ccBlacklist, Boolean emailParser, Integer timeForThreadInclusion, Boolean timeForThreadInclusionEnabled) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sourceId' is set
    if (sourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceId' when calling updateSource");
    }
    
    // create path and map variables
    String localVarPath = "/content_sources/{sourceId}"
      .replaceAll("\\{" + "sourceId" + "\\}", apiClient.escapeString(sourceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "active", active));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "channel_id", channelId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "color", color));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "time_sheet_ids[]", timeSheetIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sla_response", slaResponse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sla_threshold", slaThreshold));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sla_filtering_categories_strategy", slaFilteringCategoriesStrategy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "sla_filtering_category_ids[]", slaFilteringCategoryIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sla_expired_strategy", slaExpiredStrategy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attachments_security_level", attachmentsSecurityLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "intervention_messages_boost", interventionMessagesBoost));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferred_tasks_boost", transferredTasksBoost));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hidden_from_stats", hiddenFromStats));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "default_category_ids[]", defaultCategoryIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "user_thread_default_category_ids[]", userThreadDefaultCategoryIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "signatures", signatures));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "auto_response_triggers", autoResponseTriggers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "auto_response_trigger_enabled[first_message_from_user]", autoResponseTriggerEnabledFirstMessageFromUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "auto_response_trigger_enabled[out_of_office_hours_message]", autoResponseTriggerEnabledOutOfOfficeHoursMessage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "auto_response_trigger_grace_periods[first_message_from_user]", autoResponseTriggerGracePeriodsFirstMessageFromUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "auto_response_trigger_grace_periods[out_of_office_hours_message]", autoResponseTriggerGracePeriodsOutOfOfficeHoursMessage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "default_content_language", defaultContentLanguage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "auto_detect_content_language", autoDetectContentLanguage));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "content_languages", contentLanguages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "content_archiving", contentArchiving));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "content_archiving_period", contentArchivingPeriod));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_name", fromName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "default_task_priority", defaultTaskPriority));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enable_android", enableAndroid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enable_ios", enableIos));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enable_web", enableWeb));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imap_smtp_email", imapSmtpEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "imap_mailboxes_to_import", imapMailboxesToImport));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imap_mailbox_used_for_sent_mail", imapMailboxUsedForSentMail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imap_address", imapAddress));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imap_port", imapPort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imap_username", imapUsername));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imap_password", imapPassword));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imap_oauth_refresh_token", imapOauthRefreshToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imap_use_ssl_tls", imapUseSslTls));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imap_use_start_tls", imapUseStartTls));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imap_authentication_type", imapAuthenticationType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imap_ssl_verify_mode", imapSslVerifyMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "smtp_address", smtpAddress));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "smtp_port", smtpPort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "smtp_username", smtpUsername));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "smtp_password", smtpPassword));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "smtp_oauth_refresh_token", smtpOauthRefreshToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "smtp_use_ssl_tls", smtpUseSslTls));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "smtp_use_start_tls", smtpUseStartTls));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "smtp_authentication_type", smtpAuthenticationType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "smtp_ssl_verify_mode", smtpSslVerifyMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "smtp_helo_domain", smtpHeloDomain));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "threading_heuristics", threadingHeuristics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "spam_assassin_level", spamAssassinLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "whitelisted_emails", whitelistedEmails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "cc_blacklist", ccBlacklist));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email_parser", emailParser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "time_for_thread_inclusion", timeForThreadInclusion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "time_for_thread_inclusion_enabled", timeForThreadInclusionEnabled));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Source> localVarReturnType = new GenericType<Source>() {};

    return apiClient.invokeAPI("SourcesApi.updateSource", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating source credentials
   * This method updates credentials for IMAP and SMTP adapters of email sources. In case of success it renders the content source, otherwise, it renders an error (422 HTTP code).
   * @param sourceId  (required)
   * @param imapUsername IMAP username (optional)
   * @param imapPassword IMAP password (optional)
   * @param smtpUsername SMTP username (optional)
   * @param smtpPassword SMTP password (optional)
   * @return Source
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public Source updateSourceEmailCredentials(String sourceId, String imapUsername, String imapPassword, String smtpUsername, String smtpPassword) throws ApiException {
    return updateSourceEmailCredentialsWithHttpInfo(sourceId, imapUsername, imapPassword, smtpUsername, smtpPassword).getData();
  }

  /**
   * Updating source credentials
   * This method updates credentials for IMAP and SMTP adapters of email sources. In case of success it renders the content source, otherwise, it renders an error (422 HTTP code).
   * @param sourceId  (required)
   * @param imapUsername IMAP username (optional)
   * @param imapPassword IMAP password (optional)
   * @param smtpUsername SMTP username (optional)
   * @param smtpPassword SMTP password (optional)
   * @return ApiResponse&lt;Source&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Source> updateSourceEmailCredentialsWithHttpInfo(String sourceId, String imapUsername, String imapPassword, String smtpUsername, String smtpPassword) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sourceId' is set
    if (sourceId == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceId' when calling updateSourceEmailCredentials");
    }
    
    // create path and map variables
    String localVarPath = "/content_sources/{sourceId}/email_credentials"
      .replaceAll("\\{" + "sourceId" + "\\}", apiClient.escapeString(sourceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imap[username]", imapUsername));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "imap[password]", imapPassword));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "smtp[username]", smtpUsername));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "smtp[password]", smtpPassword));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Source> localVarReturnType = new GenericType<Source>() {};

    return apiClient.invokeAPI("SourcesApi.updateSourceEmailCredentials", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
