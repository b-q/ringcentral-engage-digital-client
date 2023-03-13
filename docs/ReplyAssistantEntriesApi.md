# ReplyAssistantEntriesApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReplyAssistantEntry**](ReplyAssistantEntriesApi.md#createReplyAssistantEntry) | **POST** /reply_assistant/entries | Creating an entry |
| [**deleteReplyAssistantEntry**](ReplyAssistantEntriesApi.md#deleteReplyAssistantEntry) | **DELETE** /reply_assistant/entries/{replyAssistantEntryId} | Deleting a reply assistant entry |
| [**getAllReplyAssistantEntries**](ReplyAssistantEntriesApi.md#getAllReplyAssistantEntries) | **GET** /reply_assistant/entries | Getting​ a​ll​ reply assistant e​ntries |
| [**getReplyAssistantEntry**](ReplyAssistantEntriesApi.md#getReplyAssistantEntry) | **GET** /reply_assistant/entries/{replyAssistantEntryId} | Getting a reply assistant entry from its id |
| [**updateReplyAssistantEntry**](ReplyAssistantEntriesApi.md#updateReplyAssistantEntry) | **PUT** /reply_assistant/entries/{replyAssistantEntryId} | Updating a reply assistant entry |



## createReplyAssistantEntry

> ReplyAssistantEntry createReplyAssistantEntry(label)

Creating an entry

This method creates a reply assistant entry. In case of success it renders the entry, otherwise, it renders an error (422 HTTP code).

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantEntriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantEntriesApi apiInstance = new ReplyAssistantEntriesApi(defaultClient);
        String label = "label_example"; // String | The name of the entry.
        try {
            ReplyAssistantEntry result = apiInstance.createReplyAssistantEntry(label);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantEntriesApi#createReplyAssistantEntry");
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
| **label** | **String**| The name of the entry. | |

### Return type

[**ReplyAssistantEntry**](ReplyAssistantEntry.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteReplyAssistantEntry

> ReplyAssistantEntry deleteReplyAssistantEntry(replyAssistantEntryId)

Deleting a reply assistant entry

This method destroys an existing entry. It renders the entry itself. It renders a 404 if id is invalid.

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantEntriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantEntriesApi apiInstance = new ReplyAssistantEntriesApi(defaultClient);
        String replyAssistantEntryId = "replyAssistantEntryId_example"; // String | 
        try {
            ReplyAssistantEntry result = apiInstance.deleteReplyAssistantEntry(replyAssistantEntryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantEntriesApi#deleteReplyAssistantEntry");
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
| **replyAssistantEntryId** | **String**|  | |

### Return type

[**ReplyAssistantEntry**](ReplyAssistantEntry.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllReplyAssistantEntries

> GetAllReplyAssistantEntriesResponse getAllReplyAssistantEntries(offset, limit)

Getting​ a​ll​ reply assistant e​ntries

This method renders all entries ordered by creation date (ascending).

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantEntriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantEntriesApi apiInstance = new ReplyAssistantEntriesApi(defaultClient);
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllReplyAssistantEntriesResponse result = apiInstance.getAllReplyAssistantEntries(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantEntriesApi#getAllReplyAssistantEntries");
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

[**GetAllReplyAssistantEntriesResponse**](GetAllReplyAssistantEntriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getReplyAssistantEntry

> ReplyAssistantEntry getReplyAssistantEntry(replyAssistantEntryId)

Getting a reply assistant entry from its id

This method renders an entry from given id.

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantEntriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantEntriesApi apiInstance = new ReplyAssistantEntriesApi(defaultClient);
        String replyAssistantEntryId = "replyAssistantEntryId_example"; // String | 
        try {
            ReplyAssistantEntry result = apiInstance.getReplyAssistantEntry(replyAssistantEntryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantEntriesApi#getReplyAssistantEntry");
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
| **replyAssistantEntryId** | **String**|  | |

### Return type

[**ReplyAssistantEntry**](ReplyAssistantEntry.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateReplyAssistantEntry

> ReplyAssistantEntry updateReplyAssistantEntry(replyAssistantEntryId, label, foreignId, categoryIds, shortcuts, entryGroupId, sourceIds)

Updating a reply assistant entry

This method updates an existing entry from given attributes and renders it in case of success.

Authorization​: only users that have the right to manage reply assistant.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ReplyAssistantEntriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ReplyAssistantEntriesApi apiInstance = new ReplyAssistantEntriesApi(defaultClient);
        String replyAssistantEntryId = "replyAssistantEntryId_example"; // String | 
        String label = "label_example"; // String | The name of the entry.
        String foreignId = "foreignId_example"; // String | The internal/company id of the entry. This is used to match Engage Digital entry’s id with the company one. Example: KB042.
        List<String> categoryIds = Arrays.asList(); // List<String> | To restrict the entry to a set of Engage Digital categories. Then, KB entries that do not match message’s categories to which you are replying will not be suggested.
        List<String> shortcuts = Arrays.asList(); // List<String> | entry shortcuts
        String entryGroupId = "entryGroupId_example"; // String | Entry group id.
        List<String> sourceIds = Arrays.asList(); // List<String> | Source ids (array)
        try {
            ReplyAssistantEntry result = apiInstance.updateReplyAssistantEntry(replyAssistantEntryId, label, foreignId, categoryIds, shortcuts, entryGroupId, sourceIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReplyAssistantEntriesApi#updateReplyAssistantEntry");
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
| **replyAssistantEntryId** | **String**|  | |
| **label** | **String**| The name of the entry. | [optional] |
| **foreignId** | **String**| The internal/company id of the entry. This is used to match Engage Digital entry’s id with the company one. Example: KB042. | [optional] |
| **categoryIds** | **List&lt;String&gt;**| To restrict the entry to a set of Engage Digital categories. Then, KB entries that do not match message’s categories to which you are replying will not be suggested. | [optional] |
| **shortcuts** | **List&lt;String&gt;**| entry shortcuts | [optional] |
| **entryGroupId** | **String**| Entry group id. | [optional] |
| **sourceIds** | **List&lt;String&gt;**| Source ids (array) | [optional] |

### Return type

[**ReplyAssistantEntry**](ReplyAssistantEntry.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

