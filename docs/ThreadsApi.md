# ThreadsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archiveThread**](ThreadsApi.md#archiveThread) | **PUT** /content_threads/{threadId}/ignore | Archiving a thread |
| [**categorizeThread**](ThreadsApi.md#categorizeThread) | **PUT** /content_threads/{threadId}/update_categories | Categorizing a thread |
| [**closeThread**](ThreadsApi.md#closeThread) | **PUT** /content_threads/{threadId}/close | Close a thread |
| [**getAllThreads**](ThreadsApi.md#getAllThreads) | **GET** /content_threads | Getting all threads |
| [**getThread**](ThreadsApi.md#getThread) | **GET** /content_threads/{threadId} | Getting a thread from its id |
| [**openThread**](ThreadsApi.md#openThread) | **GET** /content_threads/{threadId}/open | Open a thread |



## archiveThread

> Thread archiveThread(threadId)

Archiving a thread

Archives the contents of a thread. If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned.

If the thread is already being archived, a 409 HTTP response will be returned.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String threadId = "threadId_example"; // String | 
        try {
            Thread result = apiInstance.archiveThread(threadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#archiveThread");
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
| **threadId** | **String**|  | |

### Return type

[**Thread**](Thread.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## categorizeThread

> Thread categorizeThread(threadId, threadCategoryIds)

Categorizing a thread

This method updates the categories of a thread. If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned.

If the thread is already being categorized, a 409 HTTP response will be returned.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String threadId = "threadId_example"; // String | 
        List<String> threadCategoryIds = Arrays.asList(); // List<String> | An array containing the new categories to set on the thread.
        try {
            Thread result = apiInstance.categorizeThread(threadId, threadCategoryIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#categorizeThread");
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
| **threadId** | **String**|  | |
| **threadCategoryIds** | **List&lt;String&gt;**| An array containing the new categories to set on the thread. | [optional] |

### Return type

[**Thread**](Thread.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## closeThread

> Thread closeThread(threadId)

Close a thread

Thread closure/opening is only available for the following sources:
* Emails
* Answers
* Ideas
* Facebook Messenger
* Google+
* Lithium
* Mobile Messaging

Starts a job to close a thread. It returns the thread but as the job is asynchronous, the state of the “close” attribute in the returned object do not is the one when the job started.

If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned. Returns a 403 if the thread cannot be closed or if the user does not have the permission to close a thread.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String threadId = "threadId_example"; // String | 
        try {
            Thread result = apiInstance.closeThread(threadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#closeThread");
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
| **threadId** | **String**|  | |

### Return type

[**Thread**](Thread.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllThreads

> GetAllThreadsResponse getAllThreads(q, offset, limit)

Getting all threads

This method renders threads ordered by last content date (descending). Only threads in sources where token’s user has “read” permission are returned.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String q = "q_example"; // String | A search query to filter threads. Please refer to ​Search & filtering parameters​ for more details.
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllThreadsResponse result = apiInstance.getAllThreads(q, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#getAllThreads");
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
| **q** | **String**| A search query to filter threads. Please refer to ​Search &amp; filtering parameters​ for more details. | [optional] |
| **offset** | **Integer**| The record index to start. Default value is 0. | [optional] |
| **limit** | **Integer**| The max number of records to return. Default value is 30, max value is 150. | [optional] |

### Return type

[**GetAllThreadsResponse**](GetAllThreadsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getThread

> Thread getThread(threadId)

Getting a thread from its id

This method renders a thread from given id. If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String threadId = "threadId_example"; // String | 
        try {
            Thread result = apiInstance.getThread(threadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#getThread");
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
| **threadId** | **String**|  | |

### Return type

[**Thread**](Thread.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## openThread

> Thread openThread(threadId)

Open a thread

Thread closure/opening is only available for the following sources:

* Emails
* Answers
* Ideas
* Facebook Messenger
* Google+
* Lithium
* Mobile Messaging

Starts a job to open a thread. It returns the thread but as the job is asynchronous, the state of the “close” attribute in the returned object is the one when the job started.

If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned. Returns a 403 if the thread cannot be opened or if the user does not have the permission to open a thread.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String threadId = "threadId_example"; // String | 
        try {
            Thread result = apiInstance.openThread(threadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#openThread");
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
| **threadId** | **String**|  | |

### Return type

[**Thread**](Thread.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

