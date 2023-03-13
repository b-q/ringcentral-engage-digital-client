# SettingsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllSettings**](SettingsApi.md#getAllSettings) | **GET** /settings | Getting all settings |
| [**updateSettings**](SettingsApi.md#updateSettings) | **PUT** /settings | Updating settings |



## getAllSettings

> Settings getAllSettings()

Getting all settings

This method renders all settings of your domain.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        try {
            Settings result = apiInstance.getAllSettings();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#getAllSettings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Settings**](Settings.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateSettings

> Settings updateSettings(activityPresenceThreshold, activityTracking, beginningOfWeek, categoryTagging, contentLanguages, dashboard, denyIframeIntegration, disablePasswordAutocomplete, expirePasswordAfter, enableAutoScrollDown, expirePasswordEnabled, exportInSeconds, foldUselessContents, fteDuration, identityMerge, interventionDeferRates, interventionDeferThreshold, interventionRates, locale, multiLang, name, passwordArchivableEnabled, passwordArchivableSize, passwordMinLength, passwordNonWord, passwordNumbers, passwordRecoveryDisabled, pushEnabled, replyAsAnyIdentity, rtlSupport, selfApprovalRequired, sessionTimeout, spellchecking, style, thirdPartyServicesDisabled, timezone, trackJs, type, urgentTaskThreshold, useSystemFont)

Updating settings

This method updates the current domain settings.

Authorization​: only users that can update settings.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.SettingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        SettingsApi apiInstance = new SettingsApi(defaultClient);
        Integer activityPresenceThreshold = 56; // Integer | (in hours).
        Boolean activityTracking = true; // Boolean | ​Enable activity tracking (Boolean)
        String beginningOfWeek = "beginningOfWeek_example"; // String | (Day of week)
        Boolean categoryTagging = true; // Boolean | A​ ctivate the forced categorization by source.​ (Boolean)
        String contentLanguages = "contentLanguages_example"; // String | (See format)
        Boolean dashboard = true; // Boolean | Activate the dashboard (Boolean)
        Boolean denyIframeIntegration = true; // Boolean | Prevent the DD to be embed by other websites (Boolean)
        Boolean disablePasswordAutocomplete = true; // Boolean | (Boolean)
        Integer expirePasswordAfter = 56; // Integer | password expiration delay (in seconds)
        Boolean enableAutoScrollDown = true; // Boolean | enable auto scroll down (Boolean)
        Boolean expirePasswordEnabled = true; // Boolean | enable password expiration (Boolean)
        Boolean exportInSeconds = true; // Boolean | provide durations in seconds in export (Boolean)
        Boolean foldUselessContents = true; // Boolean | fold archived contents (Boolean)
        Integer fteDuration = 56; // Integer | FTE data period (in hours)
        Boolean identityMerge = true; // Boolean | enable identity merge (Boolean)
        List<Integer> interventionDeferRates = Arrays.asList(); // List<Integer> | (Array of times in seconds)
        Integer interventionDeferThreshold = 56; // Integer | (in seconds)
        List<Integer> interventionRates = Arrays.asList(); // List<Integer> | (Array of times in seconds)
        String locale = "locale_example"; // String | locale code (String)
        Boolean multiLang = true; // Boolean | activate multi language support for messages (Boolean)
        String name = "name_example"; // String | Name of the Dimelo Digital (String)
        Boolean passwordArchivableEnabled = true; // Boolean | prohibit reusing old passwords (Boolean)
        Integer passwordArchivableSize = 56; // Integer | number of archived passwords
        Integer passwordMinLength = 56; // Integer | minimum character length
        Boolean passwordNonWord = true; // Boolean | should contain at least 1 non alphanumeric char (Boolean)
        Boolean passwordNumbers = true; // Boolean | should contain at least 1 number (Boolean)
        Boolean passwordRecoveryDisabled = true; // Boolean | disable password recovery by email (Boolean)
        Boolean pushEnabled = true; // Boolean | Enable push mode (Boolean)
        Boolean replyAsAnyIdentity = true; // Boolean | Enable reply as any identity (Boolean)
        Boolean rtlSupport = true; // Boolean | Enable right to left support (Boolean)
        Boolean selfApprovalRequired = true; // Boolean | ​Allow authors to ask approval of their messages (Boolean)
        Integer sessionTimeout = 56; // Integer | Session timeout (in minutes)
        Boolean spellchecking = true; // Boolean | Enable spellchecking (Boolean)
        String style = "style_example"; // String | Defines the DD’s design (String)
        Boolean thirdPartyServicesDisabled = true; // Boolean | Disable third-party services (tracking...) (Boolean)
        String timezone = "timezone_example"; // String | Use the timezone endpoint to get the timezone name (String)
        Boolean trackJs = true; // Boolean | Track JS errors (Boolean)
        String type = "demo"; // String | Can be ‘demo’, ‘production’ or ‘archived’
        Integer urgentTaskThreshold = 56; // Integer | Chat max response time (in seconds)
        Boolean useSystemFont = true; // Boolean | Experimental (Boolean)
        try {
            Settings result = apiInstance.updateSettings(activityPresenceThreshold, activityTracking, beginningOfWeek, categoryTagging, contentLanguages, dashboard, denyIframeIntegration, disablePasswordAutocomplete, expirePasswordAfter, enableAutoScrollDown, expirePasswordEnabled, exportInSeconds, foldUselessContents, fteDuration, identityMerge, interventionDeferRates, interventionDeferThreshold, interventionRates, locale, multiLang, name, passwordArchivableEnabled, passwordArchivableSize, passwordMinLength, passwordNonWord, passwordNumbers, passwordRecoveryDisabled, pushEnabled, replyAsAnyIdentity, rtlSupport, selfApprovalRequired, sessionTimeout, spellchecking, style, thirdPartyServicesDisabled, timezone, trackJs, type, urgentTaskThreshold, useSystemFont);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SettingsApi#updateSettings");
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
| **activityPresenceThreshold** | **Integer**| (in hours). | [optional] |
| **activityTracking** | **Boolean**| ​Enable activity tracking (Boolean) | [optional] |
| **beginningOfWeek** | **String**| (Day of week) | [optional] |
| **categoryTagging** | **Boolean**| A​ ctivate the forced categorization by source.​ (Boolean) | [optional] |
| **contentLanguages** | **String**| (See format) | [optional] |
| **dashboard** | **Boolean**| Activate the dashboard (Boolean) | [optional] |
| **denyIframeIntegration** | **Boolean**| Prevent the DD to be embed by other websites (Boolean) | [optional] |
| **disablePasswordAutocomplete** | **Boolean**| (Boolean) | [optional] |
| **expirePasswordAfter** | **Integer**| password expiration delay (in seconds) | [optional] |
| **enableAutoScrollDown** | **Boolean**| enable auto scroll down (Boolean) | [optional] |
| **expirePasswordEnabled** | **Boolean**| enable password expiration (Boolean) | [optional] |
| **exportInSeconds** | **Boolean**| provide durations in seconds in export (Boolean) | [optional] |
| **foldUselessContents** | **Boolean**| fold archived contents (Boolean) | [optional] |
| **fteDuration** | **Integer**| FTE data period (in hours) | [optional] |
| **identityMerge** | **Boolean**| enable identity merge (Boolean) | [optional] |
| **interventionDeferRates** | **List&lt;Integer&gt;**| (Array of times in seconds) | [optional] |
| **interventionDeferThreshold** | **Integer**| (in seconds) | [optional] |
| **interventionRates** | **List&lt;Integer&gt;**| (Array of times in seconds) | [optional] |
| **locale** | **String**| locale code (String) | [optional] |
| **multiLang** | **Boolean**| activate multi language support for messages (Boolean) | [optional] |
| **name** | **String**| Name of the Dimelo Digital (String) | [optional] |
| **passwordArchivableEnabled** | **Boolean**| prohibit reusing old passwords (Boolean) | [optional] |
| **passwordArchivableSize** | **Integer**| number of archived passwords | [optional] |
| **passwordMinLength** | **Integer**| minimum character length | [optional] |
| **passwordNonWord** | **Boolean**| should contain at least 1 non alphanumeric char (Boolean) | [optional] |
| **passwordNumbers** | **Boolean**| should contain at least 1 number (Boolean) | [optional] |
| **passwordRecoveryDisabled** | **Boolean**| disable password recovery by email (Boolean) | [optional] |
| **pushEnabled** | **Boolean**| Enable push mode (Boolean) | [optional] |
| **replyAsAnyIdentity** | **Boolean**| Enable reply as any identity (Boolean) | [optional] |
| **rtlSupport** | **Boolean**| Enable right to left support (Boolean) | [optional] |
| **selfApprovalRequired** | **Boolean**| ​Allow authors to ask approval of their messages (Boolean) | [optional] |
| **sessionTimeout** | **Integer**| Session timeout (in minutes) | [optional] |
| **spellchecking** | **Boolean**| Enable spellchecking (Boolean) | [optional] |
| **style** | **String**| Defines the DD’s design (String) | [optional] |
| **thirdPartyServicesDisabled** | **Boolean**| Disable third-party services (tracking...) (Boolean) | [optional] |
| **timezone** | **String**| Use the timezone endpoint to get the timezone name (String) | [optional] |
| **trackJs** | **Boolean**| Track JS errors (Boolean) | [optional] |
| **type** | **String**| Can be ‘demo’, ‘production’ or ‘archived’ | [optional] [enum: demo, production, archived] |
| **urgentTaskThreshold** | **Integer**| Chat max response time (in seconds) | [optional] |
| **useSystemFont** | **Boolean**| Experimental (Boolean) | [optional] |

### Return type

[**Settings**](Settings.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

