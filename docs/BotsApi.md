# BotsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**botComplete**](BotsApi.md#botComplete) | **POST** /bots/complete | Bot complete |
| [**botEngage**](BotsApi.md#botEngage) | **POST** /bots/engage | Bot engage |
| [**handoverFromBotToAgent**](BotsApi.md#handoverFromBotToAgent) | **POST** /bots/handover | Bot handover |



## botComplete

> BotCompleteResponse botComplete(interventionId, closeThread)

Bot complete

This method is used to complete an intervention from a bot (closing the intervention and completing the task). In case of success it renders 200, otherwise, it renders an error (422 HTTP code).

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.BotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        BotsApi apiInstance = new BotsApi(defaultClient);
        String interventionId = "interventionId_example"; // String | The intervention_id of the intervention that you want to complete.
        Boolean closeThread = true; // Boolean | Wether if the thread should be closed at the same time.
        try {
            BotCompleteResponse result = apiInstance.botComplete(interventionId, closeThread);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotsApi#botComplete");
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
| **interventionId** | **String**| The intervention_id of the intervention that you want to complete. | |
| **closeThread** | **Boolean**| Wether if the thread should be closed at the same time. | [optional] |

### Return type

[**BotCompleteResponse**](BotCompleteResponse.md)

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


## botEngage

> Intervention botEngage(contentId)

Bot engage

This method is used to engage a thread from a bot. In case of success it renders the intervention, otherwise, it renders an error (422 HTTP code). This method opens intervention as the virtual agent user.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.BotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        BotsApi apiInstance = new BotsApi(defaultClient);
        String contentId = "contentId_example"; // String | The content_id of the content for which you want to engage the bot.
        try {
            Intervention result = apiInstance.botEngage(contentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotsApi#botEngage");
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
| **contentId** | **String**| The content_id of the content for which you want to engage the bot. | |

### Return type

[**Intervention**](Intervention.md)

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


## handoverFromBotToAgent

> HandoverFromBotToAgentResponse handoverFromBotToAgent(from, to, type, identityForeignId, appId, interventionId)

Bot handover

This method is used to handover a conversation between a bot and an agent. It handles 2 different cases, specific sources handover (Messenger for example, see Bots API doc) and handover between Engage Virtual Agents and human agents

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.BotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        BotsApi apiInstance = new BotsApi(defaultClient);
        String from = "from_example"; // String | Who we are taking the conversation control from (either bot or agent).
        String to = "to_example"; // String | Who we are giving the convesation control to (either bot or agent).
        String type = "type_example"; // String | The type of handover (either type of channel or engage_virtual_agent).
        String identityForeignId = "identityForeignId_example"; // String | The foreign_id of the identity for which you want to do the handover (only for source specific handover).
        String appId = "appId_example"; // String | The id of the Facebook's app that controls the Bot (only for source specific handover).
        String interventionId = "interventionId_example"; // String | The id of the intervention that we want to handover (only for Engage Virtual Agent handover).
        try {
            HandoverFromBotToAgentResponse result = apiInstance.handoverFromBotToAgent(from, to, type, identityForeignId, appId, interventionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BotsApi#handoverFromBotToAgent");
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
| **from** | **String**| Who we are taking the conversation control from (either bot or agent). | |
| **to** | **String**| Who we are giving the convesation control to (either bot or agent). | |
| **type** | **String**| The type of handover (either type of channel or engage_virtual_agent). | |
| **identityForeignId** | **String**| The foreign_id of the identity for which you want to do the handover (only for source specific handover). | |
| **appId** | **String**| The id of the Facebook&#39;s app that controls the Bot (only for source specific handover). | [optional] |
| **interventionId** | **String**| The id of the intervention that we want to handover (only for Engage Virtual Agent handover). | [optional] |

### Return type

[**HandoverFromBotToAgentResponse**](HandoverFromBotToAgentResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

