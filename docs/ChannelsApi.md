# ChannelsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllChannels**](ChannelsApi.md#getAllChannels) | **GET** /channels | Getting all channels |
| [**getChannel**](ChannelsApi.md#getChannel) | **GET** /channels/{channelId} | Getting a channel from its id |
| [**updateChannel**](ChannelsApi.md#updateChannel) | **PUT** /channels/{channelId} | Updating a channel |



## getAllChannels

> GetAllChannelsResponse getAllChannels(offset, limit)

Getting all channels

This method renders all channels ordered by date of creation.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllChannelsResponse result = apiInstance.getAllChannels(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getAllChannels");
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

[**GetAllChannelsResponse**](GetAllChannelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getChannel

> Channel getChannel(channelId)

Getting a channel from its id

This method renders a channel from given id.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | 
        try {
            Channel result = apiInstance.getChannel(channelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getChannel");
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
| **channelId** | **String**|  | |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateChannel

> Channel updateChannel(channelId, name, sourceIds, softCapability, hardCapability, taskTimeoutSeconds, agentSla, agentSlaThreshold)

Updating a channel

This method updates an existing channel from given attributes and renders it in case of success.

Authorization​: only users that are able to update channels.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String channelId = "channelId_example"; // String | 
        String name = "name_example"; // String | The name of the channel.
        List<String> sourceIds = Arrays.asList(); // List<String> | An array containing id of each source assigned to a channel (multiple).
        Integer softCapability = 56; // Integer | Number of tasks that can be assigned to agent by the routing before they are considered \"occupied\".
        Integer hardCapability = 56; // Integer | M​aximum number of tasks that can be assigned to agents.
        Integer taskTimeoutSeconds = 56; // Integer | this field defines the time before a task expires (in seconds).
        Integer agentSla = 56; // Integer | Agent SLA in seconds.
        Integer agentSlaThreshold = 56; // Integer | Agent SLA warning threshold (must be greater than 0 and less than 100, default value is 0).
        try {
            Channel result = apiInstance.updateChannel(channelId, name, sourceIds, softCapability, hardCapability, taskTimeoutSeconds, agentSla, agentSlaThreshold);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#updateChannel");
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
| **channelId** | **String**|  | |
| **name** | **String**| The name of the channel. | [optional] |
| **sourceIds** | **List&lt;String&gt;**| An array containing id of each source assigned to a channel (multiple). | [optional] |
| **softCapability** | **Integer**| Number of tasks that can be assigned to agent by the routing before they are considered \&quot;occupied\&quot;. | [optional] |
| **hardCapability** | **Integer**| M​aximum number of tasks that can be assigned to agents. | [optional] |
| **taskTimeoutSeconds** | **Integer**| this field defines the time before a task expires (in seconds). | [optional] |
| **agentSla** | **Integer**| Agent SLA in seconds. | [optional] |
| **agentSlaThreshold** | **Integer**| Agent SLA warning threshold (must be greater than 0 and less than 100, default value is 0). | [optional] |

### Return type

[**Channel**](Channel.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

