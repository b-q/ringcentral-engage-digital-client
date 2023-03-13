# ReplyAssistantGroupsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReplyAssistantGroup**](ReplyAssistantGroupsApi.md#createReplyAssistantGroup) | **POST** /reply_assistant/groups | Creating a reply assistant group |
| [**deleteReplyAssistantGroup**](ReplyAssistantGroupsApi.md#deleteReplyAssistantGroup) | **DELETE** /reply_assistant/groups/{replyAssistantGroupId} | Deleting a reply assistant group |
| [**getAllReplyAssistantGroups**](ReplyAssistantGroupsApi.md#getAllReplyAssistantGroups) | **GET** /reply_assistant/groups | Getting​ a​ll​ reply assistant groups |
| [**getReplyAssistantGroup**](ReplyAssistantGroupsApi.md#getReplyAssistantGroup) | **GET** /reply_assistant/groups/{replyAssistantGroupId} | Getting a reply assistant group from its id |
| [**updateReplyAssistantGroup**](ReplyAssistantGroupsApi.md#updateReplyAssistantGroup) | **PUT** /reply_assistant/groups/{replyAssistantGroupId} | Updating a reply assistant group |



## createReplyAssistantGroup

> ReplyAssistantGroup createReplyAssistantGroup(name, entryIds, autocomplete, position)

Creating a reply assistant group

This method creates an entry group. In case of success it renders the group, otherwise, it renders an error (422 HTTP code).

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantGroupsApi apiInstance = new ReplyAssistantGroupsApi(defaultClient);
        String name = "name_example"; // String | The name of the group.
        List<String> entryIds = Arrays.asList(); // List<String> | List of the reply assistant entries in this group.
        Boolean autocomplete = true; // Boolean | Used for autocompletion in chat.
        Integer position = 56; // Integer | Used to determine the order of the groups in the interface, in ascending order.
        try {
            ReplyAssistantGroup result = apiInstance.createReplyAssistantGroup(name, entryIds, autocomplete, position);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantGroupsApi#createReplyAssistantGroup");
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
| **name** | **String**| The name of the group. | |
| **entryIds** | **List&lt;String&gt;**| List of the reply assistant entries in this group. | [optional] |
| **autocomplete** | **Boolean**| Used for autocompletion in chat. | [optional] |
| **position** | **Integer**| Used to determine the order of the groups in the interface, in ascending order. | [optional] |

### Return type

[**ReplyAssistantGroup**](ReplyAssistantGroup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteReplyAssistantGroup

> ReplyAssistantGroup deleteReplyAssistantGroup(replyAssistantGroupId)

Deleting a reply assistant group

This method destroys an existing group. It renders the group itself. It renders a 404 if id is invalid.

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantGroupsApi apiInstance = new ReplyAssistantGroupsApi(defaultClient);
        String replyAssistantGroupId = "replyAssistantGroupId_example"; // String | 
        try {
            ReplyAssistantGroup result = apiInstance.deleteReplyAssistantGroup(replyAssistantGroupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantGroupsApi#deleteReplyAssistantGroup");
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
| **replyAssistantGroupId** | **String**|  | |

### Return type

[**ReplyAssistantGroup**](ReplyAssistantGroup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllReplyAssistantGroups

> GetAllReplyAssistantGroupsResponse getAllReplyAssistantGroups(offset, limit)

Getting​ a​ll​ reply assistant groups

This method renders all groups ordered by creation date (ascending).

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantGroupsApi apiInstance = new ReplyAssistantGroupsApi(defaultClient);
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllReplyAssistantGroupsResponse result = apiInstance.getAllReplyAssistantGroups(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantGroupsApi#getAllReplyAssistantGroups");
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

[**GetAllReplyAssistantGroupsResponse**](GetAllReplyAssistantGroupsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getReplyAssistantGroup

> ReplyAssistantGroup getReplyAssistantGroup(replyAssistantGroupId)

Getting a reply assistant group from its id

This method renders an entry group from given id.

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantGroupsApi apiInstance = new ReplyAssistantGroupsApi(defaultClient);
        String replyAssistantGroupId = "replyAssistantGroupId_example"; // String | 
        try {
            ReplyAssistantGroup result = apiInstance.getReplyAssistantGroup(replyAssistantGroupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantGroupsApi#getReplyAssistantGroup");
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
| **replyAssistantGroupId** | **String**|  | |

### Return type

[**ReplyAssistantGroup**](ReplyAssistantGroup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateReplyAssistantGroup

> ReplyAssistantGroup updateReplyAssistantGroup(replyAssistantGroupId, name, entryIds, autocomplete, position)

Updating a reply assistant group

This method updates an existing group from given attributes and renders it in case of success.

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantGroupsApi apiInstance = new ReplyAssistantGroupsApi(defaultClient);
        String replyAssistantGroupId = "replyAssistantGroupId_example"; // String | 
        String name = "name_example"; // String | The name of the group.
        List<String> entryIds = Arrays.asList(); // List<String> | List of the reply assistant entries in this group.
        Boolean autocomplete = true; // Boolean | Used for autocompletion in chat.
        Integer position = 56; // Integer | Used to determine the order of the groups in the interface, in ascending order.
        try {
            ReplyAssistantGroup result = apiInstance.updateReplyAssistantGroup(replyAssistantGroupId, name, entryIds, autocomplete, position);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantGroupsApi#updateReplyAssistantGroup");
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
| **replyAssistantGroupId** | **String**|  | |
| **name** | **String**| The name of the group. | [optional] |
| **entryIds** | **List&lt;String&gt;**| List of the reply assistant entries in this group. | [optional] |
| **autocomplete** | **Boolean**| Used for autocompletion in chat. | [optional] |
| **position** | **Integer**| Used to determine the order of the groups in the interface, in ascending order. | [optional] |

### Return type

[**ReplyAssistantGroup**](ReplyAssistantGroup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

