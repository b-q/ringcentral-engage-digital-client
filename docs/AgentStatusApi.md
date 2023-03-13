# AgentStatusApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeAgentStatus**](AgentStatusApi.md#changeAgentStatus) | **PUT** /status/{agentId} | Changing an agent&#39;s status |
| [**getAgentStatus**](AgentStatusApi.md#getAgentStatus) | **GET** /status/{agentId} | Get a connected agent status |
| [**getAllAgentStatus**](AgentStatusApi.md#getAllAgentStatus) | **GET** /status | Get all connected agents status |



## changeAgentStatus

> AgentStatus changeAgentStatus(agentId, status, customStatusId)

Changing an agent&#39;s status

This method updates an agent's availability. Can be used to set either channels statuses OR custom  status. If both parameters are provided, ignores custom status.The status parameter​ **MUST** b​e either “away” or “available”.

Authorization​: only users that have the right to monitor the task view.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.AgentStatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        AgentStatusApi apiInstance = new AgentStatusApi(defaultClient);
        String agentId = "agentId_example"; // String | 
        String status = "status_example"; // String | A hash of channel_id => availability (must contain all channels).
        String customStatusId = "customStatusId_example"; // String | id of presence status (optional)
        try {
            AgentStatus result = apiInstance.changeAgentStatus(agentId, status, customStatusId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentStatusApi#changeAgentStatus");
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
| **agentId** | **String**|  | |
| **status** | **String**| A hash of channel_id &#x3D;&gt; availability (must contain all channels). | [optional] |
| **customStatusId** | **String**| id of presence status (optional) | [optional] |

### Return type

[**AgentStatus**](AgentStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAgentStatus

> AgentStatus getAgentStatus(agentId)

Get a connected agent status

This method get the status of a connected agent. Returns a 404 if the user does not exist (not_found) or if he’s not connected (disconnected).

Authorization​: only users that have the right to monitor the task view.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.AgentStatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        AgentStatusApi apiInstance = new AgentStatusApi(defaultClient);
        String agentId = "agentId_example"; // String | 
        try {
            AgentStatus result = apiInstance.getAgentStatus(agentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentStatusApi#getAgentStatus");
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
| **agentId** | **String**|  | |

### Return type

[**AgentStatus**](AgentStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllAgentStatus

> List&lt;AgentStatus&gt; getAllAgentStatus(sourceIds, categoryIds, teamIds, spokenLanguages)

Get all connected agents status

This method get all currently connected agents & their status.

Authorization​: only users that have the right to monitor the task view.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.AgentStatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        AgentStatusApi apiInstance = new AgentStatusApi(defaultClient);
        List<String> sourceIds = Arrays.asList(); // List<String> | To filter users on given source ids (based on reply permission).
        List<String> categoryIds = Arrays.asList(); // List<String> | To filter users on given category ids.
        List<String> teamIds = Arrays.asList(); // List<String> | To filter users on given team ids.
        List<String> spokenLanguages = Arrays.asList(); // List<String> | To filter users on given locales.
        try {
            List<AgentStatus> result = apiInstance.getAllAgentStatus(sourceIds, categoryIds, teamIds, spokenLanguages);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgentStatusApi#getAllAgentStatus");
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
| **sourceIds** | **List&lt;String&gt;**| To filter users on given source ids (based on reply permission). | [optional] |
| **categoryIds** | **List&lt;String&gt;**| To filter users on given category ids. | [optional] |
| **teamIds** | **List&lt;String&gt;**| To filter users on given team ids. | [optional] |
| **spokenLanguages** | **List&lt;String&gt;**| To filter users on given locales. | [optional] |

### Return type

[**List&lt;AgentStatus&gt;**](AgentStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

