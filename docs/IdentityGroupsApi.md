# IdentityGroupsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllIdentityGroups**](IdentityGroupsApi.md#getAllIdentityGroups) | **GET** /identity_groups | Getting all identity groups |
| [**getIdentityGroup**](IdentityGroupsApi.md#getIdentityGroup) | **GET** /identity_groups/{identityGroupId} | Getting an identity group from its id |
| [**updateIdentityGroup**](IdentityGroupsApi.md#updateIdentityGroup) | **PUT** /identity_groups/{identityGroupId} | Updating an identity group |



## getAllIdentityGroups

> GetAllIdentityGroupsResponse getAllIdentityGroups(firstname, lastname, email, uuid, sort, offset, limit)

Getting all identity groups

This method renders identity groups ordered by creation date (descending). Note that identity_group are created in a lazily only when data are manually added to an identity OR a two identity are merged altogether. That means that some identity DON’T have identity_group, and identity_group do not cover all identities.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.IdentityGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        IdentityGroupsApi apiInstance = new IdentityGroupsApi(defaultClient);
        String firstname = "firstname_example"; // String | To filter groups on given firstname.
        String lastname = "lastname_example"; // String | To filter groups on given lastname.
        String email = "email_example"; // String | To filter groups that have given email.
        String uuid = "uuid_example"; // String | To filter groups that have given uuid.
        String sort = "created_at"; // String | To change the criteria chosen to sort the identities. The value can be “created_at” or “updated_at”.
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllIdentityGroupsResponse result = apiInstance.getAllIdentityGroups(firstname, lastname, email, uuid, sort, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityGroupsApi#getAllIdentityGroups");
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
| **firstname** | **String**| To filter groups on given firstname. | [optional] |
| **lastname** | **String**| To filter groups on given lastname. | [optional] |
| **email** | **String**| To filter groups that have given email. | [optional] |
| **uuid** | **String**| To filter groups that have given uuid. | [optional] |
| **sort** | **String**| To change the criteria chosen to sort the identities. The value can be “created_at” or “updated_at”. | [optional] [enum: created_at, updated_at] |
| **offset** | **Integer**| The record index to start. Default value is 0. | [optional] |
| **limit** | **Integer**| The max number of records to return. Default value is 30, max value is 150. | [optional] |

### Return type

[**GetAllIdentityGroupsResponse**](GetAllIdentityGroupsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getIdentityGroup

> IdentityGroup getIdentityGroup(identityGroupId)

Getting an identity group from its id

This method renders an identity group from given id.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.IdentityGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        IdentityGroupsApi apiInstance = new IdentityGroupsApi(defaultClient);
        String identityGroupId = "identityGroupId_example"; // String | 
        try {
            IdentityGroup result = apiInstance.getIdentityGroup(identityGroupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityGroupsApi#getIdentityGroup");
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
| **identityGroupId** | **String**|  | |

### Return type

[**IdentityGroup**](IdentityGroup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateIdentityGroup

> IdentityGroup updateIdentityGroup(identityGroupId, company, customFieldValuesCustomFieldKey, emails, firstname, gender, homePhones, lastname, mobilePhones, notes, tagIds)

Updating an identity group

This method updates an identity group from given attributes and renders it in case of success.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.IdentityGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        IdentityGroupsApi apiInstance = new IdentityGroupsApi(defaultClient);
        String identityGroupId = "identityGroupId_example"; // String | 
        String company = "company_example"; // String | Identity company.
        String customFieldValuesCustomFieldKey = "customFieldValuesCustomFieldKey_example"; // String | Identity custom field with key « custom_field_key ». It
        List<String> emails = Arrays.asList(); // List<String> | Identity emails (multiple).
        String firstname = "firstname_example"; // String | Identity firstname.
        String gender = "man"; // String | Identity’s gender. It can be \"man\", \"woman\" or empty.
        List<String> homePhones = Arrays.asList(); // List<String> | Identity home phones (mutiple).
        String lastname = "lastname_example"; // String | Identity lastname.
        List<String> mobilePhones = Arrays.asList(); // List<String> | Identity mobile phones (multiple).
        String notes = "notes_example"; // String | Identity notes.
        List<String> tagIds = Arrays.asList(); // List<String> | Identity tag ids (multiple).
        try {
            IdentityGroup result = apiInstance.updateIdentityGroup(identityGroupId, company, customFieldValuesCustomFieldKey, emails, firstname, gender, homePhones, lastname, mobilePhones, notes, tagIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityGroupsApi#updateIdentityGroup");
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
| **identityGroupId** | **String**|  | |
| **company** | **String**| Identity company. | [optional] |
| **customFieldValuesCustomFieldKey** | **String**| Identity custom field with key « custom_field_key ». It | [optional] |
| **emails** | **List&lt;String&gt;**| Identity emails (multiple). | [optional] |
| **firstname** | **String**| Identity firstname. | [optional] |
| **gender** | **String**| Identity’s gender. It can be \&quot;man\&quot;, \&quot;woman\&quot; or empty. | [optional] [enum: man, woman] |
| **homePhones** | **List&lt;String&gt;**| Identity home phones (mutiple). | [optional] |
| **lastname** | **String**| Identity lastname. | [optional] |
| **mobilePhones** | **List&lt;String&gt;**| Identity mobile phones (multiple). | [optional] |
| **notes** | **String**| Identity notes. | [optional] |
| **tagIds** | **List&lt;String&gt;**| Identity tag ids (multiple). | [optional] |

### Return type

[**IdentityGroup**](IdentityGroup.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

