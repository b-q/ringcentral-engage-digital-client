# IdentitiesApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllIdentities**](IdentitiesApi.md#getAllIdentities) | **GET** /identities | Getting all identities |
| [**getIdentity**](IdentitiesApi.md#getIdentity) | **GET** /identities/{identityId} | Getting an identity from its id |



## getAllIdentities

> GetAllIdentitiesResponse getAllIdentities(communityId, identityGroupId, userId, sort, foreignId, uuid, offset, limit)

Getting all identities

This method renders identities ordered by creation date (descending). Only identities in sources where token’s user has “read” permission are returned.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.IdentitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        IdentitiesApi apiInstance = new IdentitiesApi(defaultClient);
        String communityId = "communityId_example"; // String | To filter identities on given community id.
        String identityGroupId = "identityGroupId_example"; // String | To filter on given group id.
        String userId = "userId_example"; // String | To filter identities on given user id.
        String sort = "created_at"; // String | To change the criteria chosen to sort the identities. The value can be “created_at” or
        String foreignId = "foreignId_example"; // String | To filter identities on given user id
        String uuid = "uuid_example"; // String | To filter identities on given uuid
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllIdentitiesResponse result = apiInstance.getAllIdentities(communityId, identityGroupId, userId, sort, foreignId, uuid, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesApi#getAllIdentities");
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
| **communityId** | **String**| To filter identities on given community id. | [optional] |
| **identityGroupId** | **String**| To filter on given group id. | [optional] |
| **userId** | **String**| To filter identities on given user id. | [optional] |
| **sort** | **String**| To change the criteria chosen to sort the identities. The value can be “created_at” or | [optional] [enum: created_at, updated_at] |
| **foreignId** | **String**| To filter identities on given user id | [optional] |
| **uuid** | **String**| To filter identities on given uuid | [optional] |
| **offset** | **Integer**| The record index to start. Default value is 0. | [optional] |
| **limit** | **Integer**| The max number of records to return. Default value is 30, max value is 150. | [optional] |

### Return type

[**GetAllIdentitiesResponse**](GetAllIdentitiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getIdentity

> Identity getIdentity(identityId)

Getting an identity from its id

This method renders an identity from given id. If token’s user does not have “read” on identity’s source community a 404 HTTP response will be returned.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.IdentitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        IdentitiesApi apiInstance = new IdentitiesApi(defaultClient);
        String identityId = "identityId_example"; // String | 
        try {
            Identity result = apiInstance.getIdentity(identityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentitiesApi#getIdentity");
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
| **identityId** | **String**|  | |

### Return type

[**Identity**](Identity.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

