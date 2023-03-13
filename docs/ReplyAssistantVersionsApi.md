# ReplyAssistantVersionsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReplyAssistantVersion**](ReplyAssistantVersionsApi.md#createReplyAssistantVersion) | **POST** /reply_assistant/versions | Creating a reply assistant version |
| [**deleteReplyAssistantVersion**](ReplyAssistantVersionsApi.md#deleteReplyAssistantVersion) | **DELETE** /reply_assistant/versions/{replyAssistantVersionId} | Deleting a reply assistant version |
| [**getAllReplyAssistantVersions**](ReplyAssistantVersionsApi.md#getAllReplyAssistantVersions) | **GET** /reply_assistant/versions | Getting​ a​ll​ reply assistant versions |
| [**getReplyAssistantVersion**](ReplyAssistantVersionsApi.md#getReplyAssistantVersion) | **GET** /reply_assistant/versions/{replyAssistantVersionId} | Getting a reply assistant version from its id |
| [**updateReplyAssistantVersion**](ReplyAssistantVersionsApi.md#updateReplyAssistantVersion) | **PUT** /reply_assistant/versions/{replyAssistantVersionId} | Updating a reply assistant version |



## createReplyAssistantVersion

> ReplyAssistantVersion createReplyAssistantVersion(body, entryId, sourceIds, format, language)

Creating a reply assistant version

This method creates a reply assistant version. In case of success it renders the version, otherwise, it renders an error (422 HTTP code, 404 if the entry_id is invalid).

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantVersionsApi apiInstance = new ReplyAssistantVersionsApi(defaultClient);
        String body = "body_example"; // String | Body of the version
        String entryId = "entryId_example"; // String | Reply assistant entry id (mandatory)
        List<String> sourceIds = Arrays.asList(); // List<String> | Source ids (array)
        String format = "text"; // String | Either “text” or “html”
        String language = "language_example"; // String | Language (ex: “fr”)
        try {
            ReplyAssistantVersion result = apiInstance.createReplyAssistantVersion(body, entryId, sourceIds, format, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantVersionsApi#createReplyAssistantVersion");
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
| **body** | **String**| Body of the version | |
| **entryId** | **String**| Reply assistant entry id (mandatory) | |
| **sourceIds** | **List&lt;String&gt;**| Source ids (array) | [optional] |
| **format** | **String**| Either “text” or “html” | [optional] [enum: text, html] |
| **language** | **String**| Language (ex: “fr”) | [optional] |

### Return type

[**ReplyAssistantVersion**](ReplyAssistantVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteReplyAssistantVersion

> ReplyAssistantVersion deleteReplyAssistantVersion(replyAssistantVersionId)

Deleting a reply assistant version

This method destroys an existing version. It renders the version itself. It renders a 404 if id is invalid.

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantVersionsApi apiInstance = new ReplyAssistantVersionsApi(defaultClient);
        String replyAssistantVersionId = "replyAssistantVersionId_example"; // String | 
        try {
            ReplyAssistantVersion result = apiInstance.deleteReplyAssistantVersion(replyAssistantVersionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantVersionsApi#deleteReplyAssistantVersion");
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
| **replyAssistantVersionId** | **String**|  | |

### Return type

[**ReplyAssistantVersion**](ReplyAssistantVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllReplyAssistantVersions

> GetAllReplyAssistantVersionsResponse getAllReplyAssistantVersions(offset, limit)

Getting​ a​ll​ reply assistant versions

This method renders all reply assistant versions ordered by creation date (ascending).

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantVersionsApi apiInstance = new ReplyAssistantVersionsApi(defaultClient);
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllReplyAssistantVersionsResponse result = apiInstance.getAllReplyAssistantVersions(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantVersionsApi#getAllReplyAssistantVersions");
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

[**GetAllReplyAssistantVersionsResponse**](GetAllReplyAssistantVersionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getReplyAssistantVersion

> ReplyAssistantVersion getReplyAssistantVersion(replyAssistantVersionId)

Getting a reply assistant version from its id

This method renders a version from given id.

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantVersionsApi apiInstance = new ReplyAssistantVersionsApi(defaultClient);
        String replyAssistantVersionId = "replyAssistantVersionId_example"; // String | 
        try {
            ReplyAssistantVersion result = apiInstance.getReplyAssistantVersion(replyAssistantVersionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantVersionsApi#getReplyAssistantVersion");
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
| **replyAssistantVersionId** | **String**|  | |

### Return type

[**ReplyAssistantVersion**](ReplyAssistantVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateReplyAssistantVersion

> ReplyAssistantVersion updateReplyAssistantVersion(replyAssistantVersionId, body, entryId, sourceIds, format, language)

Updating a reply assistant version

This method updates an existing version from given attributes and renders it in case of success.

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantVersionsApi apiInstance = new ReplyAssistantVersionsApi(defaultClient);
        String replyAssistantVersionId = "replyAssistantVersionId_example"; // String | 
        String body = "body_example"; // String | Body of the version
        String entryId = "entryId_example"; // String | Reply assistant entry id.
        List<String> sourceIds = Arrays.asList(); // List<String> | Source ids (array)
        String format = "text"; // String | Either “text” or “html”
        String language = "language_example"; // String | Language (ex: “fr”)
        try {
            ReplyAssistantVersion result = apiInstance.updateReplyAssistantVersion(replyAssistantVersionId, body, entryId, sourceIds, format, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantVersionsApi#updateReplyAssistantVersion");
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
| **replyAssistantVersionId** | **String**|  | |
| **body** | **String**| Body of the version | [optional] |
| **entryId** | **String**| Reply assistant entry id. | [optional] |
| **sourceIds** | **List&lt;String&gt;**| Source ids (array) | [optional] |
| **format** | **String**| Either “text” or “html” | [optional] [enum: text, html] |
| **language** | **String**| Language (ex: “fr”) | [optional] |

### Return type

[**ReplyAssistantVersion**](ReplyAssistantVersion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

