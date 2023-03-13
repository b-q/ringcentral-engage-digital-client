# RolesApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRole**](RolesApi.md#createRole) | **POST** /roles | Creating a role |
| [**getAllRoles**](RolesApi.md#getAllRoles) | **GET** /roles | Getting all roles |
| [**getRole**](RolesApi.md#getRole) | **GET** /roles/{roleId} | Getting a role from its id |
| [**updateRole**](RolesApi.md#updateRole) | **PUT** /roles/{roleId} | Updating a role |



## createRole

> Role createRole(label, accessHelpCenter, accessPreviousMessages, accessPullMode, adminStampAnswer, approveContent, askAnExpert, assignIntervention, authorBlockContent, closeContentThread, createAndDestroyExtension, createCommunity, createContentSource, createUser, delayExportContent, deleteContentThread, escalateToVideo, impersonateUser, inviteUser, manageApiAccessTokens, manageAppSdkApplications, manageAutomaticExportsTasks, manageCategories, manageChat, manageCustomFields, manageCustomNotifications, manageEmailsTemplates, manageFolders, manageIce, manageIdentities, manageOwnNotifications, manageReplyAssistant, manageRoles, manageRulesEngineRules, manageSurveys, manageTags, manageTeams, manageTopologies, manageUsersOfMyTeams, monitorTasks, monitorTeamTasks, muteContent, openContentThread, publishContent, readCommunity, readContentSource, readEvent, readExport, readIdentity, readOwnStats, readPresence, readStats, readSurveys, readUser, receiveTasks, replyWithAssistant, searchContents, searchEvent, updateCommunity, updateContentSource, updateExtension, updateIdentity, updateIntervention, updateOwnIntervention, updateSettings, updateTimeSheet, updateUser, useEmoji)

Creating a role

This method creates a new role. In case of success it renders the created role, otherwise, it renders an error (422 HTTP code).

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String label = "label_example"; // String | 
        Boolean accessHelpCenter = true; // Boolean | 
        Boolean accessPreviousMessages = true; // Boolean | 
        Boolean accessPullMode = true; // Boolean | 
        Boolean adminStampAnswer = true; // Boolean | 
        Boolean approveContent = true; // Boolean | 
        Boolean askAnExpert = true; // Boolean | permission only available with the corresponding configuration
        Boolean assignIntervention = true; // Boolean | 
        Boolean authorBlockContent = true; // Boolean | 
        Boolean closeContentThread = true; // Boolean | 
        Boolean createAndDestroyExtension = true; // Boolean | 
        Boolean createCommunity = true; // Boolean | 
        Boolean createContentSource = true; // Boolean | 
        Boolean createUser = true; // Boolean | 
        Boolean delayExportContent = true; // Boolean | 
        Boolean deleteContentThread = true; // Boolean | 
        Boolean escalateToVideo = true; // Boolean | permission only available with the corresponding configuration
        Boolean impersonateUser = true; // Boolean | 
        Boolean inviteUser = true; // Boolean | 
        Boolean manageApiAccessTokens = true; // Boolean | 
        Boolean manageAppSdkApplications = true; // Boolean | 
        Boolean manageAutomaticExportsTasks = true; // Boolean | permission only available with the corresponding extension enabled
        Boolean manageCategories = true; // Boolean | 
        Boolean manageChat = true; // Boolean | 
        Boolean manageCustomFields = true; // Boolean | 
        Boolean manageCustomNotifications = true; // Boolean | 
        Boolean manageEmailsTemplates = true; // Boolean | 
        Boolean manageFolders = true; // Boolean | 
        Boolean manageIce = true; // Boolean | 
        Boolean manageIdentities = true; // Boolean | 
        Boolean manageOwnNotifications = true; // Boolean | 
        Boolean manageReplyAssistant = true; // Boolean | permission only available with the corresponding extension enabled
        Boolean manageRoles = true; // Boolean | 
        Boolean manageRulesEngineRules = true; // Boolean | permission only available with the corresponding extension enabled
        Boolean manageSurveys = true; // Boolean | permission only available with the corresponding extension enabled
        Boolean manageTags = true; // Boolean | 
        Boolean manageTeams = true; // Boolean | 
        Boolean manageTopologies = true; // Boolean | 
        Boolean manageUsersOfMyTeams = true; // Boolean | 
        Boolean monitorTasks = true; // Boolean | 
        Boolean monitorTeamTasks = true; // Boolean | 
        Boolean muteContent = true; // Boolean | 
        Boolean openContentThread = true; // Boolean | 
        Boolean publishContent = true; // Boolean | 
        Boolean readCommunity = true; // Boolean | 
        Boolean readContentSource = true; // Boolean | 
        Boolean readEvent = true; // Boolean | 
        Boolean readExport = true; // Boolean | 
        Boolean readIdentity = true; // Boolean | 
        Boolean readOwnStats = true; // Boolean | 
        Boolean readPresence = true; // Boolean | 
        Boolean readStats = true; // Boolean | 
        Boolean readSurveys = true; // Boolean | permission only available with the corresponding extension enabled
        Boolean readUser = true; // Boolean | 
        Boolean receiveTasks = true; // Boolean | 
        Boolean replyWithAssistant = true; // Boolean | permission only available with the corresponding extension enabled
        Boolean searchContents = true; // Boolean | 
        Boolean searchEvent = true; // Boolean | 
        Boolean updateCommunity = true; // Boolean | 
        Boolean updateContentSource = true; // Boolean | 
        Boolean updateExtension = true; // Boolean | 
        Boolean updateIdentity = true; // Boolean | 
        Boolean updateIntervention = true; // Boolean | 
        Boolean updateOwnIntervention = true; // Boolean | 
        Boolean updateSettings = true; // Boolean | 
        Boolean updateTimeSheet = true; // Boolean | 
        Boolean updateUser = true; // Boolean | 
        Boolean useEmoji = true; // Boolean | 
        try {
            Role result = apiInstance.createRole(label, accessHelpCenter, accessPreviousMessages, accessPullMode, adminStampAnswer, approveContent, askAnExpert, assignIntervention, authorBlockContent, closeContentThread, createAndDestroyExtension, createCommunity, createContentSource, createUser, delayExportContent, deleteContentThread, escalateToVideo, impersonateUser, inviteUser, manageApiAccessTokens, manageAppSdkApplications, manageAutomaticExportsTasks, manageCategories, manageChat, manageCustomFields, manageCustomNotifications, manageEmailsTemplates, manageFolders, manageIce, manageIdentities, manageOwnNotifications, manageReplyAssistant, manageRoles, manageRulesEngineRules, manageSurveys, manageTags, manageTeams, manageTopologies, manageUsersOfMyTeams, monitorTasks, monitorTeamTasks, muteContent, openContentThread, publishContent, readCommunity, readContentSource, readEvent, readExport, readIdentity, readOwnStats, readPresence, readStats, readSurveys, readUser, receiveTasks, replyWithAssistant, searchContents, searchEvent, updateCommunity, updateContentSource, updateExtension, updateIdentity, updateIntervention, updateOwnIntervention, updateSettings, updateTimeSheet, updateUser, useEmoji);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#createRole");
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
| **label** | **String**|  | |
| **accessHelpCenter** | **Boolean**|  | [optional] |
| **accessPreviousMessages** | **Boolean**|  | [optional] |
| **accessPullMode** | **Boolean**|  | [optional] |
| **adminStampAnswer** | **Boolean**|  | [optional] |
| **approveContent** | **Boolean**|  | [optional] |
| **askAnExpert** | **Boolean**| permission only available with the corresponding configuration | [optional] |
| **assignIntervention** | **Boolean**|  | [optional] |
| **authorBlockContent** | **Boolean**|  | [optional] |
| **closeContentThread** | **Boolean**|  | [optional] |
| **createAndDestroyExtension** | **Boolean**|  | [optional] |
| **createCommunity** | **Boolean**|  | [optional] |
| **createContentSource** | **Boolean**|  | [optional] |
| **createUser** | **Boolean**|  | [optional] |
| **delayExportContent** | **Boolean**|  | [optional] |
| **deleteContentThread** | **Boolean**|  | [optional] |
| **escalateToVideo** | **Boolean**| permission only available with the corresponding configuration | [optional] |
| **impersonateUser** | **Boolean**|  | [optional] |
| **inviteUser** | **Boolean**|  | [optional] |
| **manageApiAccessTokens** | **Boolean**|  | [optional] |
| **manageAppSdkApplications** | **Boolean**|  | [optional] |
| **manageAutomaticExportsTasks** | **Boolean**| permission only available with the corresponding extension enabled | [optional] |
| **manageCategories** | **Boolean**|  | [optional] |
| **manageChat** | **Boolean**|  | [optional] |
| **manageCustomFields** | **Boolean**|  | [optional] |
| **manageCustomNotifications** | **Boolean**|  | [optional] |
| **manageEmailsTemplates** | **Boolean**|  | [optional] |
| **manageFolders** | **Boolean**|  | [optional] |
| **manageIce** | **Boolean**|  | [optional] |
| **manageIdentities** | **Boolean**|  | [optional] |
| **manageOwnNotifications** | **Boolean**|  | [optional] |
| **manageReplyAssistant** | **Boolean**| permission only available with the corresponding extension enabled | [optional] |
| **manageRoles** | **Boolean**|  | [optional] |
| **manageRulesEngineRules** | **Boolean**| permission only available with the corresponding extension enabled | [optional] |
| **manageSurveys** | **Boolean**| permission only available with the corresponding extension enabled | [optional] |
| **manageTags** | **Boolean**|  | [optional] |
| **manageTeams** | **Boolean**|  | [optional] |
| **manageTopologies** | **Boolean**|  | [optional] |
| **manageUsersOfMyTeams** | **Boolean**|  | [optional] |
| **monitorTasks** | **Boolean**|  | [optional] |
| **monitorTeamTasks** | **Boolean**|  | [optional] |
| **muteContent** | **Boolean**|  | [optional] |
| **openContentThread** | **Boolean**|  | [optional] |
| **publishContent** | **Boolean**|  | [optional] |
| **readCommunity** | **Boolean**|  | [optional] |
| **readContentSource** | **Boolean**|  | [optional] |
| **readEvent** | **Boolean**|  | [optional] |
| **readExport** | **Boolean**|  | [optional] |
| **readIdentity** | **Boolean**|  | [optional] |
| **readOwnStats** | **Boolean**|  | [optional] |
| **readPresence** | **Boolean**|  | [optional] |
| **readStats** | **Boolean**|  | [optional] |
| **readSurveys** | **Boolean**| permission only available with the corresponding extension enabled | [optional] |
| **readUser** | **Boolean**|  | [optional] |
| **receiveTasks** | **Boolean**|  | [optional] |
| **replyWithAssistant** | **Boolean**| permission only available with the corresponding extension enabled | [optional] |
| **searchContents** | **Boolean**|  | [optional] |
| **searchEvent** | **Boolean**|  | [optional] |
| **updateCommunity** | **Boolean**|  | [optional] |
| **updateContentSource** | **Boolean**|  | [optional] |
| **updateExtension** | **Boolean**|  | [optional] |
| **updateIdentity** | **Boolean**|  | [optional] |
| **updateIntervention** | **Boolean**|  | [optional] |
| **updateOwnIntervention** | **Boolean**|  | [optional] |
| **updateSettings** | **Boolean**|  | [optional] |
| **updateTimeSheet** | **Boolean**|  | [optional] |
| **updateUser** | **Boolean**|  | [optional] |
| **useEmoji** | **Boolean**|  | [optional] |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllRoles

> GetAllRolesResponse getAllRoles(offset, limit)

Getting all roles

This method renders roles ordered by creation date (ascending).

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        RolesApi apiInstance = new RolesApi(defaultClient);
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllRolesResponse result = apiInstance.getAllRoles(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#getAllRoles");
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

[**GetAllRolesResponse**](GetAllRolesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getRole

> Role getRole(roleId)

Getting a role from its id

This method renders a role from given id.

Authorization​: only users that can manage roles.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String roleId = "roleId_example"; // String | 
        try {
            Role result = apiInstance.getRole(roleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#getRole");
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
| **roleId** | **String**|  | |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateRole

> Role updateRole(roleId, accessHelpCenter, accessPreviousMessages, accessPullMode, adminStampAnswer, approveContent, askAnExpert, assignIntervention, authorBlockContent, closeContentThread, createAndDestroyExtension, createCommunity, createContentSource, createUser, delayExportContent, deleteContentThread, escalateToVideo, impersonateUser, inviteUser, manageApiAccessTokens, manageAppSdkApplications, manageAutomaticExportsTasks, manageCategories, manageChat, manageCustomFields, manageCustomNotifications, manageEmailsTemplates, manageFolders, manageIce, manageIdentities, manageOwnNotifications, manageReplyAssistant, manageRoles, manageRulesEngineRules, manageSurveys, manageTags, manageTeams, manageTopologies, manageUsersOfMyTeams, monitorTasks, monitorTeamTasks, muteContent, openContentThread, publishContent, readCommunity, readContentSource, readEvent, readExport, readIdentity, readOwnStats, readPresence, readStats, readSurveys, readUser, receiveTasks, replyWithAssistant, searchContents, searchEvent, updateCommunity, updateContentSource, updateExtension, updateIdentity, updateIntervention, updateOwnIntervention, updateSettings, updateTimeSheet, updateUser, useEmoji)

Updating a role

This method updates an existing role from given attributes and renders it in case of success.

Authorization​: A user can’t update roles with more permissions than himself and can’t give a role a permission he doesn’t have.

Any permission updated with a user that does not have this permission will be ignored (The update is done, just not the unallowed permission)

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String roleId = "roleId_example"; // String | 
        Boolean accessHelpCenter = true; // Boolean | 
        Boolean accessPreviousMessages = true; // Boolean | 
        Boolean accessPullMode = true; // Boolean | 
        Boolean adminStampAnswer = true; // Boolean | 
        Boolean approveContent = true; // Boolean | 
        Boolean askAnExpert = true; // Boolean | permission only available with the corresponding configuration
        Boolean assignIntervention = true; // Boolean | 
        Boolean authorBlockContent = true; // Boolean | 
        Boolean closeContentThread = true; // Boolean | 
        Boolean createAndDestroyExtension = true; // Boolean | 
        Boolean createCommunity = true; // Boolean | 
        Boolean createContentSource = true; // Boolean | 
        Boolean createUser = true; // Boolean | 
        Boolean delayExportContent = true; // Boolean | 
        Boolean deleteContentThread = true; // Boolean | 
        Boolean escalateToVideo = true; // Boolean | permission only available with the corresponding configuration
        Boolean impersonateUser = true; // Boolean | 
        Boolean inviteUser = true; // Boolean | 
        Boolean manageApiAccessTokens = true; // Boolean | 
        Boolean manageAppSdkApplications = true; // Boolean | 
        Boolean manageAutomaticExportsTasks = true; // Boolean | permission only available with the corresponding extension enabled
        Boolean manageCategories = true; // Boolean | 
        Boolean manageChat = true; // Boolean | 
        Boolean manageCustomFields = true; // Boolean | 
        Boolean manageCustomNotifications = true; // Boolean | 
        Boolean manageEmailsTemplates = true; // Boolean | 
        Boolean manageFolders = true; // Boolean | 
        Boolean manageIce = true; // Boolean | 
        Boolean manageIdentities = true; // Boolean | 
        Boolean manageOwnNotifications = true; // Boolean | 
        Boolean manageReplyAssistant = true; // Boolean | permission only available with the corresponding extension enabled
        Boolean manageRoles = true; // Boolean | 
        Boolean manageRulesEngineRules = true; // Boolean | permission only available with the corresponding extension enabled
        Boolean manageSurveys = true; // Boolean | permission only available with the corresponding extension enabled
        Boolean manageTags = true; // Boolean | 
        Boolean manageTeams = true; // Boolean | 
        Boolean manageTopologies = true; // Boolean | 
        Boolean manageUsersOfMyTeams = true; // Boolean | 
        Boolean monitorTasks = true; // Boolean | 
        Boolean monitorTeamTasks = true; // Boolean | 
        Boolean muteContent = true; // Boolean | 
        Boolean openContentThread = true; // Boolean | 
        Boolean publishContent = true; // Boolean | 
        Boolean readCommunity = true; // Boolean | 
        Boolean readContentSource = true; // Boolean | 
        Boolean readEvent = true; // Boolean | 
        Boolean readExport = true; // Boolean | 
        Boolean readIdentity = true; // Boolean | 
        Boolean readOwnStats = true; // Boolean | 
        Boolean readPresence = true; // Boolean | 
        Boolean readStats = true; // Boolean | 
        Boolean readSurveys = true; // Boolean | permission only available with the corresponding extension enabled
        Boolean readUser = true; // Boolean | 
        Boolean receiveTasks = true; // Boolean | 
        Boolean replyWithAssistant = true; // Boolean | permission only available with the corresponding extension enabled
        Boolean searchContents = true; // Boolean | 
        Boolean searchEvent = true; // Boolean | 
        Boolean updateCommunity = true; // Boolean | 
        Boolean updateContentSource = true; // Boolean | 
        Boolean updateExtension = true; // Boolean | 
        Boolean updateIdentity = true; // Boolean | 
        Boolean updateIntervention = true; // Boolean | 
        Boolean updateOwnIntervention = true; // Boolean | 
        Boolean updateSettings = true; // Boolean | 
        Boolean updateTimeSheet = true; // Boolean | 
        Boolean updateUser = true; // Boolean | 
        Boolean useEmoji = true; // Boolean | 
        try {
            Role result = apiInstance.updateRole(roleId, accessHelpCenter, accessPreviousMessages, accessPullMode, adminStampAnswer, approveContent, askAnExpert, assignIntervention, authorBlockContent, closeContentThread, createAndDestroyExtension, createCommunity, createContentSource, createUser, delayExportContent, deleteContentThread, escalateToVideo, impersonateUser, inviteUser, manageApiAccessTokens, manageAppSdkApplications, manageAutomaticExportsTasks, manageCategories, manageChat, manageCustomFields, manageCustomNotifications, manageEmailsTemplates, manageFolders, manageIce, manageIdentities, manageOwnNotifications, manageReplyAssistant, manageRoles, manageRulesEngineRules, manageSurveys, manageTags, manageTeams, manageTopologies, manageUsersOfMyTeams, monitorTasks, monitorTeamTasks, muteContent, openContentThread, publishContent, readCommunity, readContentSource, readEvent, readExport, readIdentity, readOwnStats, readPresence, readStats, readSurveys, readUser, receiveTasks, replyWithAssistant, searchContents, searchEvent, updateCommunity, updateContentSource, updateExtension, updateIdentity, updateIntervention, updateOwnIntervention, updateSettings, updateTimeSheet, updateUser, useEmoji);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#updateRole");
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
| **roleId** | **String**|  | |
| **accessHelpCenter** | **Boolean**|  | [optional] |
| **accessPreviousMessages** | **Boolean**|  | [optional] |
| **accessPullMode** | **Boolean**|  | [optional] |
| **adminStampAnswer** | **Boolean**|  | [optional] |
| **approveContent** | **Boolean**|  | [optional] |
| **askAnExpert** | **Boolean**| permission only available with the corresponding configuration | [optional] |
| **assignIntervention** | **Boolean**|  | [optional] |
| **authorBlockContent** | **Boolean**|  | [optional] |
| **closeContentThread** | **Boolean**|  | [optional] |
| **createAndDestroyExtension** | **Boolean**|  | [optional] |
| **createCommunity** | **Boolean**|  | [optional] |
| **createContentSource** | **Boolean**|  | [optional] |
| **createUser** | **Boolean**|  | [optional] |
| **delayExportContent** | **Boolean**|  | [optional] |
| **deleteContentThread** | **Boolean**|  | [optional] |
| **escalateToVideo** | **Boolean**| permission only available with the corresponding configuration | [optional] |
| **impersonateUser** | **Boolean**|  | [optional] |
| **inviteUser** | **Boolean**|  | [optional] |
| **manageApiAccessTokens** | **Boolean**|  | [optional] |
| **manageAppSdkApplications** | **Boolean**|  | [optional] |
| **manageAutomaticExportsTasks** | **Boolean**| permission only available with the corresponding extension enabled | [optional] |
| **manageCategories** | **Boolean**|  | [optional] |
| **manageChat** | **Boolean**|  | [optional] |
| **manageCustomFields** | **Boolean**|  | [optional] |
| **manageCustomNotifications** | **Boolean**|  | [optional] |
| **manageEmailsTemplates** | **Boolean**|  | [optional] |
| **manageFolders** | **Boolean**|  | [optional] |
| **manageIce** | **Boolean**|  | [optional] |
| **manageIdentities** | **Boolean**|  | [optional] |
| **manageOwnNotifications** | **Boolean**|  | [optional] |
| **manageReplyAssistant** | **Boolean**| permission only available with the corresponding extension enabled | [optional] |
| **manageRoles** | **Boolean**|  | [optional] |
| **manageRulesEngineRules** | **Boolean**| permission only available with the corresponding extension enabled | [optional] |
| **manageSurveys** | **Boolean**| permission only available with the corresponding extension enabled | [optional] |
| **manageTags** | **Boolean**|  | [optional] |
| **manageTeams** | **Boolean**|  | [optional] |
| **manageTopologies** | **Boolean**|  | [optional] |
| **manageUsersOfMyTeams** | **Boolean**|  | [optional] |
| **monitorTasks** | **Boolean**|  | [optional] |
| **monitorTeamTasks** | **Boolean**|  | [optional] |
| **muteContent** | **Boolean**|  | [optional] |
| **openContentThread** | **Boolean**|  | [optional] |
| **publishContent** | **Boolean**|  | [optional] |
| **readCommunity** | **Boolean**|  | [optional] |
| **readContentSource** | **Boolean**|  | [optional] |
| **readEvent** | **Boolean**|  | [optional] |
| **readExport** | **Boolean**|  | [optional] |
| **readIdentity** | **Boolean**|  | [optional] |
| **readOwnStats** | **Boolean**|  | [optional] |
| **readPresence** | **Boolean**|  | [optional] |
| **readStats** | **Boolean**|  | [optional] |
| **readSurveys** | **Boolean**| permission only available with the corresponding extension enabled | [optional] |
| **readUser** | **Boolean**|  | [optional] |
| **receiveTasks** | **Boolean**|  | [optional] |
| **replyWithAssistant** | **Boolean**| permission only available with the corresponding extension enabled | [optional] |
| **searchContents** | **Boolean**|  | [optional] |
| **searchEvent** | **Boolean**|  | [optional] |
| **updateCommunity** | **Boolean**|  | [optional] |
| **updateContentSource** | **Boolean**|  | [optional] |
| **updateExtension** | **Boolean**|  | [optional] |
| **updateIdentity** | **Boolean**|  | [optional] |
| **updateIntervention** | **Boolean**|  | [optional] |
| **updateOwnIntervention** | **Boolean**|  | [optional] |
| **updateSettings** | **Boolean**|  | [optional] |
| **updateTimeSheet** | **Boolean**|  | [optional] |
| **updateUser** | **Boolean**|  | [optional] |
| **useEmoji** | **Boolean**|  | [optional] |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

