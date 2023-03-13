# InterventionsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelIntervention**](InterventionsApi.md#cancelIntervention) | **DELETE** /interventions/{interventionId}/cancel | Cancelling an intervention |
| [**categorizeIntervention**](InterventionsApi.md#categorizeIntervention) | **PUT** /interventions/{interventionId}/update_categories | Categorizing an intervention |
| [**closeIntervention**](InterventionsApi.md#closeIntervention) | **PUT** /interventions/{interventionId}/close | Closing an intervention |
| [**createIntervention**](InterventionsApi.md#createIntervention) | **POST** /interventions | Creating an intervention |
| [**getAllInterventions**](InterventionsApi.md#getAllInterventions) | **GET** /interventions | Getting all interventions |
| [**getIntervention**](InterventionsApi.md#getIntervention) | **GET** /interventions/{interventionId} | Getting an intervention from its id |
| [**reassignIntervention**](InterventionsApi.md#reassignIntervention) | **PUT** /interventions/{interventionId}/reassign | Reassigning an intervention |
| [**updateIntervention**](InterventionsApi.md#updateIntervention) | **PUT** /interventions/{interventionId} | Updating an intervention from its id |



## cancelIntervention

> Intervention cancelIntervention(interventionId)

Cancelling an intervention

This method cancels (destroys) an intervention. It renders intervention itself. If token’s user does not have “read” on intervention’s source a 404 HTTP response will be returned.

Caveats:

* If the intervention is already being canceled, it will return a 409 error.
* To be able to close an intervention, it must meet the following criteria otherwise a 403 will be raised:
  * Intervention MUST NOT already be closed
 * Intervention MUST NOT have agent replies
  * Access-Token agent MUST have read access on the source

Authorization​: no, but it renders an error if intervention can’t be destroyed (see caveats).

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.InterventionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        InterventionsApi apiInstance = new InterventionsApi(defaultClient);
        String interventionId = "interventionId_example"; // String | 
        try {
            Intervention result = apiInstance.cancelIntervention(interventionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterventionsApi#cancelIntervention");
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
| **interventionId** | **String**|  | |

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


## categorizeIntervention

> Intervention categorizeIntervention(interventionId, categoryIds)

Categorizing an intervention

This method updates the categories of an intervention. If token’s user does not have “read” on the intervention’s source a 404 HTTP response will be returned.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.InterventionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        InterventionsApi apiInstance = new InterventionsApi(defaultClient);
        String interventionId = "interventionId_example"; // String | 
        List<String> categoryIds = Arrays.asList(); // List<String> | 
        try {
            Intervention result = apiInstance.categorizeIntervention(interventionId, categoryIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterventionsApi#categorizeIntervention");
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
| **interventionId** | **String**|  | |
| **categoryIds** | **List&lt;String&gt;**|  | |

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


## closeIntervention

> Intervention closeIntervention(interventionId)

Closing an intervention

This method closes an intervention. Caveats:

* If the intervention is already being closed, it will return a 409 error.
* To be able to close an intervention, it must meet the following criteria otherwise a 403 will be raised:

  * Intervention MUST NOT already be closed

  * Intervention MUST have agent replies
  * Access-Token agent MUST be the owner of the intervention or have the permission to edit permissions

  * Access-Token agent MUST have read access on the source

Authorization​: no, but it renders an error if intervention can’t be closed (see caveats)

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.InterventionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        InterventionsApi apiInstance = new InterventionsApi(defaultClient);
        String interventionId = "interventionId_example"; // String | 
        try {
            Intervention result = apiInstance.closeIntervention(interventionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterventionsApi#closeIntervention");
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
| **interventionId** | **String**|  | |

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
| **409** | If the intervention is already being closed, it will return a 409 error. |  -  |


## createIntervention

> Intervention createIntervention(contentId)

Creating an intervention

This method creates a new intervention or reopen it. In case of success it renders the intervention, otherwise, it renders an error (422 HTTP code). This method opens intervention as access token’s user.

Authorization​: no, but it renders an error if intervention can’t be created or reopened (already opened, etc.).

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.InterventionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        InterventionsApi apiInstance = new InterventionsApi(defaultClient);
        String contentId = "contentId_example"; // String | The content to create intervention on (mandatory).
        try {
            Intervention result = apiInstance.createIntervention(contentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterventionsApi#createIntervention");
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
| **contentId** | **String**| The content to create intervention on (mandatory). | |

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


## getAllInterventions

> GetAllInterventionsResponse getAllInterventions(threadId, userId, identityGroupId, identityId, sort, offset, limit)

Getting all interventions

This method renders interventions ordered by creation date (descending). Only interventions in sources where token’s user has “read” permission are returned.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.InterventionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        InterventionsApi apiInstance = new InterventionsApi(defaultClient);
        String threadId = "threadId_example"; // String | To filter interventions on given thread id.
        String userId = "userId_example"; // String | To filter interventions on given user id.
        String identityGroupId = "identityGroupId_example"; // String | To filter interventions on given identity_group_id. This will return interventions associated to any identity in the indentity_group.
        String identityId = "identityId_example"; // String | To filter interventions on given identity_id(s). Can be a single value or an array of string.
        String sort = "created_at"; // String | To change the criteria chosen to sort the interventions. The value can be “created_at” or “updated_at”.
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllInterventionsResponse result = apiInstance.getAllInterventions(threadId, userId, identityGroupId, identityId, sort, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterventionsApi#getAllInterventions");
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
| **threadId** | **String**| To filter interventions on given thread id. | [optional] |
| **userId** | **String**| To filter interventions on given user id. | [optional] |
| **identityGroupId** | **String**| To filter interventions on given identity_group_id. This will return interventions associated to any identity in the indentity_group. | [optional] |
| **identityId** | **String**| To filter interventions on given identity_id(s). Can be a single value or an array of string. | [optional] |
| **sort** | **String**| To change the criteria chosen to sort the interventions. The value can be “created_at” or “updated_at”. | [optional] [enum: created_at, updated_at] |
| **offset** | **Integer**| The record index to start. Default value is 0. | [optional] |
| **limit** | **Integer**| The max number of records to return. Default value is 30, max value is 150. | [optional] |

### Return type

[**GetAllInterventionsResponse**](GetAllInterventionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getIntervention

> Intervention getIntervention(interventionId)

Getting an intervention from its id

This method renders an intervention from given id. If token’s user does not have “read” on intervention’s source a 404 HTTP response will be returned.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.InterventionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        InterventionsApi apiInstance = new InterventionsApi(defaultClient);
        String interventionId = "interventionId_example"; // String | 
        try {
            Intervention result = apiInstance.getIntervention(interventionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterventionsApi#getIntervention");
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
| **interventionId** | **String**|  | |

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


## reassignIntervention

> Intervention reassignIntervention(interventionId, userId)

Reassigning an intervention

This method updates the user in charge of the intervention

Authorization​: Only users who can update interventions.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.InterventionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        InterventionsApi apiInstance = new InterventionsApi(defaultClient);
        String interventionId = "interventionId_example"; // String | 
        String userId = "userId_example"; // String | 
        try {
            Intervention result = apiInstance.reassignIntervention(interventionId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterventionsApi#reassignIntervention");
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
| **interventionId** | **String**|  | |
| **userId** | **String**|  | |

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


## updateIntervention

> Intervention updateIntervention(interventionId, customFieldValuesCustomFieldKey)

Updating an intervention from its id

This method updates intervention from given attributes and renders it in case of success.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.InterventionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        InterventionsApi apiInstance = new InterventionsApi(defaultClient);
        String interventionId = "interventionId_example"; // String | 
        String customFieldValuesCustomFieldKey = "customFieldValuesCustomFieldKey_example"; // String | Intervention custom field with key \"custom_field_key\". It can be multiple if custom field is multiple or is has multiple_choice type.
        try {
            Intervention result = apiInstance.updateIntervention(interventionId, customFieldValuesCustomFieldKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterventionsApi#updateIntervention");
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
| **interventionId** | **String**|  | |
| **customFieldValuesCustomFieldKey** | **String**| Intervention custom field with key \&quot;custom_field_key\&quot;. It can be multiple if custom field is multiple or is has multiple_choice type. | [optional] |

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

