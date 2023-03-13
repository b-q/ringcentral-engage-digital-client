# InterventionCommentsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInterventionComment**](InterventionCommentsApi.md#createInterventionComment) | **POST** /intervention_comments | Creating an intervention comment |
| [**deleteInterventionComment**](InterventionCommentsApi.md#deleteInterventionComment) | **DELETE** /intervention_comments/{interventionCommentId} | Deleting an intervention comment |
| [**getAllInterventionComments**](InterventionCommentsApi.md#getAllInterventionComments) | **GET** /intervention_comments | Getting all intervention comments |
| [**getInterventionComment**](InterventionCommentsApi.md#getInterventionComment) | **GET** /intervention_comments/{interventionCommentId} | Getting an intervention comment from its id |



## createInterventionComment

> InterventionComment createInterventionComment(body, interventionId, userId)

Creating an intervention comment

This method creates a new intervention comment. In case of success it renders the created comment, otherwise, it renders an error (422 HTTP code). It creates comment as token’s user. If token’s user does not have “read” on given intervention’s source a 404 HTTP response will be returned.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.InterventionCommentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        InterventionCommentsApi apiInstance = new InterventionCommentsApi(defaultClient);
        String body = "body_example"; // String | The comment body (mandatory).
        String interventionId = "interventionId_example"; // String | The comment intervention id (mandatory).
        String userId = "userId_example"; // String | The comment user id (mandatory).
        try {
            InterventionComment result = apiInstance.createInterventionComment(body, interventionId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterventionCommentsApi#createInterventionComment");
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
| **body** | **String**| The comment body (mandatory). | |
| **interventionId** | **String**| The comment intervention id (mandatory). | |
| **userId** | **String**| The comment user id (mandatory). | |

### Return type

[**InterventionComment**](InterventionComment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteInterventionComment

> InterventionComment deleteInterventionComment(interventionCommentId)

Deleting an intervention comment

This method destroys an intervention comment. It renders comment itself. If token’s user does not have “read” on comment’s source a 404 HTTP response will be returned.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.InterventionCommentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        InterventionCommentsApi apiInstance = new InterventionCommentsApi(defaultClient);
        String interventionCommentId = "interventionCommentId_example"; // String | 
        try {
            InterventionComment result = apiInstance.deleteInterventionComment(interventionCommentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterventionCommentsApi#deleteInterventionComment");
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
| **interventionCommentId** | **String**|  | |

### Return type

[**InterventionComment**](InterventionComment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllInterventionComments

> GetAllInterventionCommentsResponse getAllInterventionComments(interventionId, threadId, userId, identityId, offset, limit)

Getting all intervention comments

This method renders interventions comments ordered by creation date (descending). Only comments in sources where token’s user has “read” permission are returned.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.InterventionCommentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        InterventionCommentsApi apiInstance = new InterventionCommentsApi(defaultClient);
        String interventionId = "interventionId_example"; // String | To filter comments on given intervention id.
        String threadId = "threadId_example"; // String | To filter comments on given thread id.
        String userId = "userId_example"; // String | To filter comments on given user id.
        String identityId = "identityId_example"; // String | To filter comments on given identity id.
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllInterventionCommentsResponse result = apiInstance.getAllInterventionComments(interventionId, threadId, userId, identityId, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterventionCommentsApi#getAllInterventionComments");
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
| **interventionId** | **String**| To filter comments on given intervention id. | [optional] |
| **threadId** | **String**| To filter comments on given thread id. | [optional] |
| **userId** | **String**| To filter comments on given user id. | [optional] |
| **identityId** | **String**| To filter comments on given identity id. | [optional] |
| **offset** | **Integer**| The record index to start. Default value is 0. | [optional] |
| **limit** | **Integer**| The max number of records to return. Default value is 30, max value is 150. | [optional] |

### Return type

[**GetAllInterventionCommentsResponse**](GetAllInterventionCommentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getInterventionComment

> InterventionComment getInterventionComment(interventionCommentId)

Getting an intervention comment from its id

This method renders an intervention comment from given id. If token’s user does not have “read” on comment’s source a 404 HTTP response will be returned.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.InterventionCommentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        InterventionCommentsApi apiInstance = new InterventionCommentsApi(defaultClient);
        String interventionCommentId = "interventionCommentId_example"; // String | 
        try {
            InterventionComment result = apiInstance.getInterventionComment(interventionCommentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterventionCommentsApi#getInterventionComment");
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
| **interventionCommentId** | **String**|  | |

### Return type

[**InterventionComment**](InterventionComment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

