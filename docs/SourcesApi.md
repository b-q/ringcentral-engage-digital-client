# SourcesApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllSources**](SourcesApi.md#getAllSources) | **GET** /content_sources | Getting all sources |
| [**getSource**](SourcesApi.md#getSource) | **GET** /content_sources/{sourceId} | Getting a source from its id |
| [**updateSource**](SourcesApi.md#updateSource) | **PUT** /content_sources/{sourceId} | Updating a source |
| [**updateSourceEmailCredentials**](SourcesApi.md#updateSourceEmailCredentials) | **PUT** /content_sources/{sourceId}/email_credentials | Updating source credentials |



## getAllSources

> GetAllSourcesResponse getAllSources(offset, limit)

Getting all sources

This method renders sources ordered by creation date (ascending).

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllSourcesResponse result = apiInstance.getAllSources(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#getAllSources");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **offset** | **Integer**| The record index to start. Default value is 0. | [optional] |
| **limit** | **Integer**| The max number of records to return. Default value is 30, max value is 150. | [optional] |

### Return type

[**GetAllSourcesResponse**](GetAllSourcesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getSource

> Source getSource(sourceId)

Getting a source from its id

This method renders a source from given id.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        String sourceId = "sourceId_example"; // String | 
        try {
            Source result = apiInstance.getSource(sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#getSource");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**|  | |

### Return type

[**Source**](Source.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateSource

> Source updateSource(sourceId, name, active, channelId, color, timeSheetIds, slaResponse, slaThreshold, slaFilteringCategoriesStrategy, slaFilteringCategoryIds, slaExpiredStrategy, attachmentsSecurityLevel, interventionMessagesBoost, transferredTasksBoost, hiddenFromStats, defaultCategoryIds, userThreadDefaultCategoryIds, signatures, autoResponseTriggers, autoResponseTriggerEnabledFirstMessageFromUser, autoResponseTriggerEnabledOutOfOfficeHoursMessage, autoResponseTriggerGracePeriodsFirstMessageFromUser, autoResponseTriggerGracePeriodsOutOfOfficeHoursMessage, defaultContentLanguage, autoDetectContentLanguage, contentLanguages, contentArchiving, contentArchivingPeriod, fromName, defaultTaskPriority, enableAndroid, enableIos, enableWeb, imapSmtpEmail, imapMailboxesToImport, imapMailboxUsedForSentMail, imapAddress, imapPort, imapUsername, imapPassword, imapOauthRefreshToken, imapUseSslTls, imapUseStartTls, imapAuthenticationType, imapSslVerifyMode, smtpAddress, smtpPort, smtpUsername, smtpPassword, smtpOauthRefreshToken, smtpUseSslTls, smtpUseStartTls, smtpAuthenticationType, smtpSslVerifyMode, smtpHeloDomain, threadingHeuristics, spamAssassinLevel, whitelistedEmails, ccBlacklist, emailParser, timeForThreadInclusion, timeForThreadInclusionEnabled)

Updating a source

This method updates an existing source from given attributes and renders it in case of success.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        String sourceId = "sourceId_example"; // String | 
        String name = "name_example"; // String | Source name
        Boolean active = true; // Boolean | Activate/deactivate the source (Boolean)
        String channelId = "channelId_example"; // String | Channel
        Integer color = 56; // Integer | Color of the icon (see S​ ource colors​) (Integer)
        List<String> timeSheetIds = Arrays.asList(); // List<String> | Business Hours (Limited to 1)
        Integer slaResponse = 56; // Integer | Response time (seconds)
        Integer slaThreshold = 56; // Integer | Customer SLA warning threshold (must be greater than 0 and less than 100, default value is 0).
        String slaFilteringCategoriesStrategy = "ignored_categories"; // String | Categories filtering strategy for Customer SLA indicator
        List<String> slaFilteringCategoryIds = Arrays.asList(); // List<String> | Filtering categories for Customer SLA indicator
        String slaExpiredStrategy = "max"; // String | SLA expired strategy (\"max\", \"half\" or \"base\")
        String attachmentsSecurityLevel = "strict"; // String | Attachments security level. (\"strict\", \"relaxed\", or \"permissive\"). Strict allows images and medias. Relaxed allows images, media and documents. Permissive allows all kind of attachments
        Integer interventionMessagesBoost = 56; // Integer | Priority boost of messages with intervention (Integer)
        Integer transferredTasksBoost = 56; // Integer | Priority boost of transferred tasks (Integer)
        Boolean hiddenFromStats = true; // Boolean | Hide from statistics (Boolean)
        List<String> defaultCategoryIds = Arrays.asList(); // List<String> | Default categories
        List<String> userThreadDefaultCategoryIds = Arrays.asList(); // List<String> | Default categories (agent messages)
        List<Object> signatures = Arrays.asList(); // List<Object> | Signatures
        List<Object> autoResponseTriggers = Arrays.asList(); // List<Object> | Automatic messages
        Boolean autoResponseTriggerEnabledFirstMessageFromUser = true; // Boolean | Enable answers to first messages
        Boolean autoResponseTriggerEnabledOutOfOfficeHoursMessage = true; // Boolean | Enable answers to messages outside business hours
        Integer autoResponseTriggerGracePeriodsFirstMessageFromUser = 56; // Integer | Time between two messages (First message)
        Integer autoResponseTriggerGracePeriodsOutOfOfficeHoursMessage = 56; // Integer | Time between two messages (Message outside business hours)
        String defaultContentLanguage = "defaultContentLanguage_example"; // String | Default content language
        Boolean autoDetectContentLanguage = true; // Boolean | Auto-detect content language (Boolean)
        List<String> contentLanguages = Arrays.asList(); // List<String> | Languages to detect
        Boolean contentArchiving = true; // Boolean | Automatic archiving of old contents (Boolean)
        Integer contentArchivingPeriod = 56; // Integer | Archive contents older than (seconds)
        String fromName = "fromName_example"; // String | Custom sender name. Only on sources which supports a custom sender name.
        Integer defaultTaskPriority = 56; // Integer | Default priority for interactions.
        Boolean enableAndroid = true; // Boolean | Only on Engage Messaging sources that are not on livechat mode. Enable or disable the source on Android.
        Boolean enableIos = true; // Boolean | Only on Engage Messaging sources that are not on livechat mode. Enable or disable the source on iOS.
        Boolean enableWeb = true; // Boolean | Only on Engage Messaging sources that are not on livechat mode. Enable or disable the source on the web.
        String imapSmtpEmail = "imapSmtpEmail_example"; // String | Email address to synchronize. Only on Email sources
        List<String> imapMailboxesToImport = Arrays.asList(); // List<String> | Folders to synchronize. Does not accept empty array or blank values. Only on Email sources.
        String imapMailboxUsedForSentMail = "imapMailboxUsedForSentMail_example"; // String | Folder for 'Sent Mail'. Only on Email sources.
        String imapAddress = "imapAddress_example"; // String | IMAP server address. Only on Email sources
        Integer imapPort = 56; // Integer | IMAP server port. Only on Email sources
        String imapUsername = "imapUsername_example"; // String | IMAP username. Only on Email sources
        String imapPassword = "imapPassword_example"; // String | IMAP password. Used when IMAP authentication type is `basic`. Only on Email sources
        String imapOauthRefreshToken = "imapOauthRefreshToken_example"; // String | IMAP OAuth 2.0 refresh token. Used when IMAP authentication type is `microsoft_identity_platform`. Only on Email sources
        Boolean imapUseSslTls = true; // Boolean | Use SSL/TLS protocol to establish secure IMAP connection. Only on Email sources
        Boolean imapUseStartTls = true; // Boolean | Use STARTTLS protocol to establish secure IMAP connection. Only on Email sources
        String imapAuthenticationType = "basic"; // String | IMAP Authentication type (\"basic\" or \"microsoft_identity_platform\"). Only on Email sources
        String imapSslVerifyMode = "NONE"; // String | IMAP SSL verification mode. (\"NONE\", \"PEER\", \"CLIENT_ONCE\" or \"FAIL_IF_NO_PEER_CERT\"). Only on Email sources
        String smtpAddress = "smtpAddress_example"; // String | SMTP server address. Only on Email sources
        Integer smtpPort = 56; // Integer | SMTP server port. Only on Email sources
        String smtpUsername = "smtpUsername_example"; // String | SMTP username. Only on Email sources
        String smtpPassword = "smtpPassword_example"; // String | SMTP password. Used when SMTP authentication type is `basic`. Only on Email sources
        String smtpOauthRefreshToken = "smtpOauthRefreshToken_example"; // String | SMTP OAuth 2.0 refresh token. Used when SMTP authentication type is `microsoft_identity_platform`. Only on Email sources
        Boolean smtpUseSslTls = true; // Boolean | Use SSL/TLS protocol to establish secure SMTP connection. Only on Email sources
        Boolean smtpUseStartTls = true; // Boolean | Use STARTTLS protocol to establish secure IMAP connection. Only on Email sources
        String smtpAuthenticationType = "basic"; // String | SMTP Authentication type (\"basic\" or \"microsoft_identity_platform\"). Only on Email sources
        String smtpSslVerifyMode = "NONE"; // String | SMTP SSL verification mode. (\"NONE\", \"PEER\", \"CLIENT_ONCE\" or \"FAIL_IF_NO_PEER_CERT\"). Only on Email sources
        String smtpHeloDomain = "smtpHeloDomain_example"; // String | Used to identify HELO/EHLO when connecting to the SMTP server. Only on Email sources
        Boolean threadingHeuristics = true; // Boolean | Threading heuristics. Only on Email sources
        String spamAssassinLevel = "disabled"; // String | Spam threshold (\"disabled\", \"relaxed\", or \"strict\"). Only on Email sources
        String whitelistedEmails = "whitelistedEmails_example"; // String | Whitelisted emails. All emails received from this address won't be threaded and can be associated with an anonymous identity or the Reply-To, if there is one. To be filled when implementing a form. Only on Email sources
        List<String> ccBlacklist = Arrays.asList(); // List<String> | Exclude from TO/CC. Only on Email sources
        Boolean emailParser = true; // Boolean | Email parser (BBCode). Only on Email sources
        Integer timeForThreadInclusion = 56; // Integer | Time for thread inclusion.
        Boolean timeForThreadInclusionEnabled = true; // Boolean | Enable time for thread inclusion. Only on Email sources
        try {
            Source result = apiInstance.updateSource(sourceId, name, active, channelId, color, timeSheetIds, slaResponse, slaThreshold, slaFilteringCategoriesStrategy, slaFilteringCategoryIds, slaExpiredStrategy, attachmentsSecurityLevel, interventionMessagesBoost, transferredTasksBoost, hiddenFromStats, defaultCategoryIds, userThreadDefaultCategoryIds, signatures, autoResponseTriggers, autoResponseTriggerEnabledFirstMessageFromUser, autoResponseTriggerEnabledOutOfOfficeHoursMessage, autoResponseTriggerGracePeriodsFirstMessageFromUser, autoResponseTriggerGracePeriodsOutOfOfficeHoursMessage, defaultContentLanguage, autoDetectContentLanguage, contentLanguages, contentArchiving, contentArchivingPeriod, fromName, defaultTaskPriority, enableAndroid, enableIos, enableWeb, imapSmtpEmail, imapMailboxesToImport, imapMailboxUsedForSentMail, imapAddress, imapPort, imapUsername, imapPassword, imapOauthRefreshToken, imapUseSslTls, imapUseStartTls, imapAuthenticationType, imapSslVerifyMode, smtpAddress, smtpPort, smtpUsername, smtpPassword, smtpOauthRefreshToken, smtpUseSslTls, smtpUseStartTls, smtpAuthenticationType, smtpSslVerifyMode, smtpHeloDomain, threadingHeuristics, spamAssassinLevel, whitelistedEmails, ccBlacklist, emailParser, timeForThreadInclusion, timeForThreadInclusionEnabled);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#updateSource");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**|  | |
| **name** | **String**| Source name | [optional] |
| **active** | **Boolean**| Activate/deactivate the source (Boolean) | [optional] |
| **channelId** | **String**| Channel | [optional] |
| **color** | **Integer**| Color of the icon (see S​ ource colors​) (Integer) | [optional] |
| **timeSheetIds** | **List&lt;String&gt;**| Business Hours (Limited to 1) | [optional] |
| **slaResponse** | **Integer**| Response time (seconds) | [optional] |
| **slaThreshold** | **Integer**| Customer SLA warning threshold (must be greater than 0 and less than 100, default value is 0). | [optional] |
| **slaFilteringCategoriesStrategy** | **String**| Categories filtering strategy for Customer SLA indicator | [optional] [enum: ignored_categories, selected_categories] |
| **slaFilteringCategoryIds** | **List&lt;String&gt;**| Filtering categories for Customer SLA indicator | [optional] |
| **slaExpiredStrategy** | **String**| SLA expired strategy (\&quot;max\&quot;, \&quot;half\&quot; or \&quot;base\&quot;) | [optional] [enum: max, half, base] |
| **attachmentsSecurityLevel** | **String**| Attachments security level. (\&quot;strict\&quot;, \&quot;relaxed\&quot;, or \&quot;permissive\&quot;). Strict allows images and medias. Relaxed allows images, media and documents. Permissive allows all kind of attachments | [optional] [enum: strict, relaxed, permissive] |
| **interventionMessagesBoost** | **Integer**| Priority boost of messages with intervention (Integer) | [optional] |
| **transferredTasksBoost** | **Integer**| Priority boost of transferred tasks (Integer) | [optional] |
| **hiddenFromStats** | **Boolean**| Hide from statistics (Boolean) | [optional] |
| **defaultCategoryIds** | **List&lt;String&gt;**| Default categories | [optional] |
| **userThreadDefaultCategoryIds** | **List&lt;String&gt;**| Default categories (agent messages) | [optional] |
| **signatures** | **List&lt;Object&gt;**| Signatures | [optional] |
| **autoResponseTriggers** | **List&lt;Object&gt;**| Automatic messages | [optional] |
| **autoResponseTriggerEnabledFirstMessageFromUser** | **Boolean**| Enable answers to first messages | [optional] |
| **autoResponseTriggerEnabledOutOfOfficeHoursMessage** | **Boolean**| Enable answers to messages outside business hours | [optional] |
| **autoResponseTriggerGracePeriodsFirstMessageFromUser** | **Integer**| Time between two messages (First message) | [optional] |
| **autoResponseTriggerGracePeriodsOutOfOfficeHoursMessage** | **Integer**| Time between two messages (Message outside business hours) | [optional] |
| **defaultContentLanguage** | **String**| Default content language | [optional] |
| **autoDetectContentLanguage** | **Boolean**| Auto-detect content language (Boolean) | [optional] |
| **contentLanguages** | **List&lt;String&gt;**| Languages to detect | [optional] |
| **contentArchiving** | **Boolean**| Automatic archiving of old contents (Boolean) | [optional] |
| **contentArchivingPeriod** | **Integer**| Archive contents older than (seconds) | [optional] |
| **fromName** | **String**| Custom sender name. Only on sources which supports a custom sender name. | [optional] |
| **defaultTaskPriority** | **Integer**| Default priority for interactions. | [optional] |
| **enableAndroid** | **Boolean**| Only on Engage Messaging sources that are not on livechat mode. Enable or disable the source on Android. | [optional] |
| **enableIos** | **Boolean**| Only on Engage Messaging sources that are not on livechat mode. Enable or disable the source on iOS. | [optional] |
| **enableWeb** | **Boolean**| Only on Engage Messaging sources that are not on livechat mode. Enable or disable the source on the web. | [optional] |
| **imapSmtpEmail** | **String**| Email address to synchronize. Only on Email sources | [optional] |
| **imapMailboxesToImport** | **List&lt;String&gt;**| Folders to synchronize. Does not accept empty array or blank values. Only on Email sources. | [optional] |
| **imapMailboxUsedForSentMail** | **String**| Folder for &#39;Sent Mail&#39;. Only on Email sources. | [optional] |
| **imapAddress** | **String**| IMAP server address. Only on Email sources | [optional] |
| **imapPort** | **Integer**| IMAP server port. Only on Email sources | [optional] |
| **imapUsername** | **String**| IMAP username. Only on Email sources | [optional] |
| **imapPassword** | **String**| IMAP password. Used when IMAP authentication type is &#x60;basic&#x60;. Only on Email sources | [optional] |
| **imapOauthRefreshToken** | **String**| IMAP OAuth 2.0 refresh token. Used when IMAP authentication type is &#x60;microsoft_identity_platform&#x60;. Only on Email sources | [optional] |
| **imapUseSslTls** | **Boolean**| Use SSL/TLS protocol to establish secure IMAP connection. Only on Email sources | [optional] |
| **imapUseStartTls** | **Boolean**| Use STARTTLS protocol to establish secure IMAP connection. Only on Email sources | [optional] |
| **imapAuthenticationType** | **String**| IMAP Authentication type (\&quot;basic\&quot; or \&quot;microsoft_identity_platform\&quot;). Only on Email sources | [optional] [enum: basic, microsoft_identity_platform] |
| **imapSslVerifyMode** | **String**| IMAP SSL verification mode. (\&quot;NONE\&quot;, \&quot;PEER\&quot;, \&quot;CLIENT_ONCE\&quot; or \&quot;FAIL_IF_NO_PEER_CERT\&quot;). Only on Email sources | [optional] [enum: NONE, PEER, CLIENT_ONCE, FAIL_IF_NO_PEER_CERT] |
| **smtpAddress** | **String**| SMTP server address. Only on Email sources | [optional] |
| **smtpPort** | **Integer**| SMTP server port. Only on Email sources | [optional] |
| **smtpUsername** | **String**| SMTP username. Only on Email sources | [optional] |
| **smtpPassword** | **String**| SMTP password. Used when SMTP authentication type is &#x60;basic&#x60;. Only on Email sources | [optional] |
| **smtpOauthRefreshToken** | **String**| SMTP OAuth 2.0 refresh token. Used when SMTP authentication type is &#x60;microsoft_identity_platform&#x60;. Only on Email sources | [optional] |
| **smtpUseSslTls** | **Boolean**| Use SSL/TLS protocol to establish secure SMTP connection. Only on Email sources | [optional] |
| **smtpUseStartTls** | **Boolean**| Use STARTTLS protocol to establish secure IMAP connection. Only on Email sources | [optional] |
| **smtpAuthenticationType** | **String**| SMTP Authentication type (\&quot;basic\&quot; or \&quot;microsoft_identity_platform\&quot;). Only on Email sources | [optional] [enum: basic, microsoft_identity_platform] |
| **smtpSslVerifyMode** | **String**| SMTP SSL verification mode. (\&quot;NONE\&quot;, \&quot;PEER\&quot;, \&quot;CLIENT_ONCE\&quot; or \&quot;FAIL_IF_NO_PEER_CERT\&quot;). Only on Email sources | [optional] [enum: NONE, PEER, CLIENT_ONCE, FAIL_IF_NO_PEER_CERT] |
| **smtpHeloDomain** | **String**| Used to identify HELO/EHLO when connecting to the SMTP server. Only on Email sources | [optional] |
| **threadingHeuristics** | **Boolean**| Threading heuristics. Only on Email sources | [optional] |
| **spamAssassinLevel** | **String**| Spam threshold (\&quot;disabled\&quot;, \&quot;relaxed\&quot;, or \&quot;strict\&quot;). Only on Email sources | [optional] [enum: disabled, relaxed, strict] |
| **whitelistedEmails** | **String**| Whitelisted emails. All emails received from this address won&#39;t be threaded and can be associated with an anonymous identity or the Reply-To, if there is one. To be filled when implementing a form. Only on Email sources | [optional] |
| **ccBlacklist** | **List&lt;String&gt;**| Exclude from TO/CC. Only on Email sources | [optional] |
| **emailParser** | **Boolean**| Email parser (BBCode). Only on Email sources | [optional] |
| **timeForThreadInclusion** | **Integer**| Time for thread inclusion. | [optional] |
| **timeForThreadInclusionEnabled** | **Boolean**| Enable time for thread inclusion. Only on Email sources | [optional] |

### Return type

[**Source**](Source.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateSourceEmailCredentials

> Source updateSourceEmailCredentials(sourceId, imapUsername, imapPassword, smtpUsername, smtpPassword)

Updating source credentials

This method updates credentials for IMAP and SMTP adapters of email sources. In case of success it renders the content source, otherwise, it renders an error (422 HTTP code).

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        String sourceId = "sourceId_example"; // String | 
        String imapUsername = "imapUsername_example"; // String | IMAP username
        String imapPassword = "imapPassword_example"; // String | IMAP password
        String smtpUsername = "smtpUsername_example"; // String | SMTP username
        String smtpPassword = "smtpPassword_example"; // String | SMTP password
        try {
            Source result = apiInstance.updateSourceEmailCredentials(sourceId, imapUsername, imapPassword, smtpUsername, smtpPassword);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#updateSourceEmailCredentials");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**|  | |
| **imapUsername** | **String**| IMAP username | [optional] |
| **imapPassword** | **String**| IMAP password | [optional] |
| **smtpUsername** | **String**| SMTP username | [optional] |
| **smtpPassword** | **String**| SMTP password | [optional] |

### Return type

[**Source**](Source.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **422** | Unprocessable Entity |  -  |

