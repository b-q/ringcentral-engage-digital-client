# WebhooksApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWebhook**](WebhooksApi.md#createWebhook) | **POST** /webhooks | Creating a webhook |
| [**deleteWebhook**](WebhooksApi.md#deleteWebhook) | **DELETE** /webhooks/{webhookId} | Deleting a webhook |
| [**getAllWebhooks**](WebhooksApi.md#getAllWebhooks) | **GET** /webhooks | Getting all webhooks |
| [**getWebhook**](WebhooksApi.md#getWebhook) | **GET** /webhooks/{webhookId} | Getting a webhook from its id |
| [**updateWebhook**](WebhooksApi.md#updateWebhook) | **PUT** /webhooks/{webhookId} | Updating a webhook |



## createWebhook

> Webhook createWebhook(accessToken, url, registeredEvents, active, name, stagingUse, verifyToken, secret)

Creating a webhook

This method creates a webhook. In case of success it renders the webhook, otherwise, it renders an error (422 HTTP code).

Authorization​: All users having the manage_api_access_tokens permission or all users having an api access token.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String accessToken = "accessToken_example"; // String | Access token.
        String url = "url_example"; // String | The url of a webhook. This is used to determine the endpoint of your webhook, where
        List<String> registeredEvents = Arrays.asList(); // List<String> | An array containing all the events that your webhook wants to subscribe.
        Boolean active = true; // Boolean | true or false, this field is used to enable/disable a webhook.
        String name = "name_example"; // String | The name of the webhook.
        Boolean stagingUse = true; // Boolean | true or false, this field is used to determine if a webhook will be run in staging
        String verifyToken = "verifyToken_example"; // String | The token used in your webhook.
        String secret = "secret_example"; // String | The secret key that will be served as a ​`X-Dimelo-Secret​` header in every request.
        try {
            Webhook result = apiInstance.createWebhook(accessToken, url, registeredEvents, active, name, stagingUse, verifyToken, secret);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#createWebhook");
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
| **accessToken** | **String**| Access token. | |
| **url** | **String**| The url of a webhook. This is used to determine the endpoint of your webhook, where | |
| **registeredEvents** | **List&lt;String&gt;**| An array containing all the events that your webhook wants to subscribe. | [enum: content.approved, content.discussion_initiated, content.exported, content.imported, content.replied, content.update_exported, identity.merged, identity.unmerged, intervention.assigned, intervention.canceled, intervention.closed, intervention.custom_fields_updated, intervention.deferred, intervention.opened, intervention.reactivated, intervention.recategorized, intervention.reopened, intervention.user_updated, push_agent.accept_task, push_agent.availability_change, push_agent.busyness_change, push_agent.connected, push_agent.disconnected, push_agent.missed_task, push_agent.reconnected, push_agent.request_task, survey_response.imported, task.assigned, task.completed, task.created, task.destroyed, task.expired_from_step, task.expired_from_workbin, task.recategorized, task.resume, task.supervisor_assigned, task.taken, task.transferred, task.undelivered] |
| **active** | **Boolean**| true or false, this field is used to enable/disable a webhook. | [optional] |
| **name** | **String**| The name of the webhook. | [optional] |
| **stagingUse** | **Boolean**| true or false, this field is used to determine if a webhook will be run in staging | [optional] |
| **verifyToken** | **String**| The token used in your webhook. | [optional] |
| **secret** | **String**| The secret key that will be served as a ​&#x60;X-Dimelo-Secret​&#x60; header in every request. | [optional] |

### Return type

[**Webhook**](Webhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteWebhook

> Webhook deleteWebhook(webhookId, accessToken)

Deleting a webhook

This method destroys an existing webhook. It renders webhook itself. It renders a 404 if id is invalid.

Authorization​: All users having the manage_api_access_tokens permission or all users having an api access token belonging to the webhook you’re deleting.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String webhookId = "webhookId_example"; // String | 
        String accessToken = "accessToken_example"; // String | Access token.
        try {
            Webhook result = apiInstance.deleteWebhook(webhookId, accessToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#deleteWebhook");
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
| **webhookId** | **String**|  | |
| **accessToken** | **String**| Access token. | |

### Return type

[**Webhook**](Webhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllWebhooks

> GetAllWebhooksResponse getAllWebhooks(accessToken, offset, limit)

Getting all webhooks

This method renders webhooks ordered by active and staging_use (descending).

Authorization​: users having manage_api_access_tokens permission can see all webhooks / users don’t having the manage_api_access_tokens permission can see only the webhooks belonging to access token created by them.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String accessToken = "accessToken_example"; // String | Access token.
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllWebhooksResponse result = apiInstance.getAllWebhooks(accessToken, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getAllWebhooks");
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
| **accessToken** | **String**| Access token. | |
| **offset** | **Integer**| The record index to start. Default value is 0. | [optional] |
| **limit** | **Integer**| The max number of records to return. Default value is 30, max value is 150. | [optional] |

### Return type

[**GetAllWebhooksResponse**](GetAllWebhooksResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getWebhook

> Webhook getWebhook(webhookId, accessToken)

Getting a webhook from its id

This method renders a webhook from given id.

Authorization​: users having manage_api_access_tokens permission can see any webhook / users don’t having the `manage_api_access_tokens` permission can see only the webhook in case the webhook is associated to an access token created by them.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String webhookId = "webhookId_example"; // String | 
        String accessToken = "accessToken_example"; // String | Access token.
        try {
            Webhook result = apiInstance.getWebhook(webhookId, accessToken);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getWebhook");
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
| **webhookId** | **String**|  | |
| **accessToken** | **String**| Access token. | |

### Return type

[**Webhook**](Webhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateWebhook

> Webhook updateWebhook(webhookId, accessToken, active, name, stagingUse, url, verifyToken, secret, registeredEvents)

Updating a webhook

This method updates an existing webhook from given attributes and renders it in case of success.

Authorization​: All users having the manage_api_access_tokens permission or all users having an api access token belonging to the webhook you’re updating.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String webhookId = "webhookId_example"; // String | 
        String accessToken = "accessToken_example"; // String | Access token.
        Boolean active = true; // Boolean | true or false, this field is used to enable/disable a webhook.
        String name = "name_example"; // String | The name of the webhook.
        Boolean stagingUse = true; // Boolean | true or false, this field is used to determine if a webhook will be run in staging
        String url = "url_example"; // String | The url of a webhook. This is used to determine the endpoint of your webhook, where
        String verifyToken = "verifyToken_example"; // String | The token used in your webhook.
        String secret = "secret_example"; // String | The secret key that will be served as a ​`X-Dimelo-Secret​` header in every request.
        List<String> registeredEvents = Arrays.asList(); // List<String> | An array containing all the events that your webhook wants to subscribe.
        try {
            Webhook result = apiInstance.updateWebhook(webhookId, accessToken, active, name, stagingUse, url, verifyToken, secret, registeredEvents);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#updateWebhook");
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
| **webhookId** | **String**|  | |
| **accessToken** | **String**| Access token. | |
| **active** | **Boolean**| true or false, this field is used to enable/disable a webhook. | [optional] |
| **name** | **String**| The name of the webhook. | [optional] |
| **stagingUse** | **Boolean**| true or false, this field is used to determine if a webhook will be run in staging | [optional] |
| **url** | **String**| The url of a webhook. This is used to determine the endpoint of your webhook, where | [optional] |
| **verifyToken** | **String**| The token used in your webhook. | [optional] |
| **secret** | **String**| The secret key that will be served as a ​&#x60;X-Dimelo-Secret​&#x60; header in every request. | [optional] |
| **registeredEvents** | **List&lt;String&gt;**| An array containing all the events that your webhook wants to subscribe. | [optional] |

### Return type

[**Webhook**](Webhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

