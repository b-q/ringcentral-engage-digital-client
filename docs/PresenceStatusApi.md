# PresenceStatusApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPresenceStatus**](PresenceStatusApi.md#createPresenceStatus) | **POST** /presence_status | Creating a presence status |
| [**deletePresenceStatus**](PresenceStatusApi.md#deletePresenceStatus) | **DELETE** /presence_status/{presenceStatusId} | Deleting a presence status |
| [**getAllPresenceStatus**](PresenceStatusApi.md#getAllPresenceStatus) | **GET** /presence_status | Getting all presence statuses |
| [**getPresenceStatus**](PresenceStatusApi.md#getPresenceStatus) | **GET** /presence_status/{presenceStatusId} | Getting a presence status from its id |
| [**updatePresenceStatus**](PresenceStatusApi.md#updatePresenceStatus) | **PUT** /presence_status/{presenceStatusId} | Updating a presence status |



## createPresenceStatus

> PresenceStatus createPresenceStatus(name)

Creating a presence status

This method creates a presence status. In case of success it renders the presence status, otherwise, it renders an error (422 HTTP code).

Authorization​: only users that have the right to monitor the task view.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.PresenceStatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        PresenceStatusApi apiInstance = new PresenceStatusApi(defaultClient);
        String name = "name_example"; // String | The name of the presence status.
        try {
            PresenceStatus result = apiInstance.createPresenceStatus(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresenceStatusApi#createPresenceStatus");
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
| **name** | **String**| The name of the presence status. | |

### Return type

[**PresenceStatus**](PresenceStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deletePresenceStatus

> PresenceStatus deletePresenceStatus(presenceStatusId)

Deleting a presence status

This method destroys an existing presence status. It renders presence status itself. It renders a 404 if id is invalid.

Authorization​: only users that have the right to monitor the task view.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.PresenceStatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        PresenceStatusApi apiInstance = new PresenceStatusApi(defaultClient);
        String presenceStatusId = "presenceStatusId_example"; // String | 
        try {
            PresenceStatus result = apiInstance.deletePresenceStatus(presenceStatusId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresenceStatusApi#deletePresenceStatus");
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
| **presenceStatusId** | **String**|  | |

### Return type

[**PresenceStatus**](PresenceStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllPresenceStatus

> GetAllPresenceStatusResponse getAllPresenceStatus(offset, limit)

Getting all presence statuses

This method renders all presence statuses ordered by name (in alphabetical order).

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.PresenceStatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        PresenceStatusApi apiInstance = new PresenceStatusApi(defaultClient);
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllPresenceStatusResponse result = apiInstance.getAllPresenceStatus(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresenceStatusApi#getAllPresenceStatus");
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

[**GetAllPresenceStatusResponse**](GetAllPresenceStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getPresenceStatus

> PresenceStatus getPresenceStatus(presenceStatusId)

Getting a presence status from its id

This method renders a presence status from given id.

Authorization​: only users that have the right to monitor the task view.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.PresenceStatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        PresenceStatusApi apiInstance = new PresenceStatusApi(defaultClient);
        String presenceStatusId = "presenceStatusId_example"; // String | 
        try {
            PresenceStatus result = apiInstance.getPresenceStatus(presenceStatusId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresenceStatusApi#getPresenceStatus");
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
| **presenceStatusId** | **String**|  | |

### Return type

[**PresenceStatus**](PresenceStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updatePresenceStatus

> PresenceStatus updatePresenceStatus(presenceStatusId, name)

Updating a presence status

This method updates an existing presence status from given attributes and renders it in case of success.

Authorization​: only users that have the right to monitor the task view.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.PresenceStatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        PresenceStatusApi apiInstance = new PresenceStatusApi(defaultClient);
        String presenceStatusId = "presenceStatusId_example"; // String | 
        String name = "name_example"; // String | The name of the presence status.
        try {
            PresenceStatus result = apiInstance.updatePresenceStatus(presenceStatusId, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PresenceStatusApi#updatePresenceStatus");
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
| **presenceStatusId** | **String**|  | |
| **name** | **String**| The name of the presence status. | |

### Return type

[**PresenceStatus**](PresenceStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

