# UserSignaturesApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUserSignature**](UserSignaturesApi.md#createUserSignature) | **POST** /users/{userId}/signatures | Creating a user&#39;s signature |
| [**deleteUserSignature**](UserSignaturesApi.md#deleteUserSignature) | **DELETE** /users/{userId}/signatures/{signatureId} | Deleting a user&#39;s signature |
| [**getAllUserSignatures**](UserSignaturesApi.md#getAllUserSignatures) | **GET** /users/{userId}/signatures | Getting all user&#39;s signatures |
| [**getUserSignature**](UserSignaturesApi.md#getUserSignature) | **GET** /users/{userId}/signatures/{signatureId} | Getting a user&#39;s signature from its id |
| [**updateUserSignature**](UserSignaturesApi.md#updateUserSignature) | **PUT** /users/{userId}/signatures/{signatureId} | Updating a user&#39;s signature |



## createUserSignature

> UserSignature createUserSignature(userId, body, sourceIds, language, name)

Creating a user&#39;s signature

This method creates a new user’s signature. In case of success it renders the created signature, otherwise, it renders an error (422 HTTP code).

Authorization​: only users that can update users. If the user affiliated to the token has the manage_users_of_my_teams permission, the owner of the deleting signature will need to belong to at least one of the teams he’s the leader of.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UserSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UserSignaturesApi apiInstance = new UserSignaturesApi(defaultClient);
        String userId = "userId_example"; // String | 
        String body = "body_example"; // String | The signature text (mandatory).
        List<String> sourceIds = Arrays.asList(); // List<String> | The signature list of source ids (multiple). Keep it empty if you don’t need to associate the signature with any sources.
        String language = "language_example"; // String | The two-letter code of the signature language.
        String name = "name_example"; // String | The signature name.
        try {
            UserSignature result = apiInstance.createUserSignature(userId, body, sourceIds, language, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSignaturesApi#createUserSignature");
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
| **userId** | **String**|  | |
| **body** | **String**| The signature text (mandatory). | |
| **sourceIds** | **List&lt;String&gt;**| The signature list of source ids (multiple). Keep it empty if you don’t need to associate the signature with any sources. | [optional] |
| **language** | **String**| The two-letter code of the signature language. | [optional] |
| **name** | **String**| The signature name. | [optional] |

### Return type

[**UserSignature**](UserSignature.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteUserSignature

> UserSignature deleteUserSignature(userId, signatureId)

Deleting a user&#39;s signature

This method deletes the given signature. In case of success it renders the deleted signature, otherwise, it renders an error (422 HTTP code).

Authorization​: only users that can update users. If the user affiliated to the token has the manage_users_of_my_teams permission, the owner of the deleting signature will need to belong to at least one of the teams he’s the leader of.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UserSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UserSignaturesApi apiInstance = new UserSignaturesApi(defaultClient);
        String userId = "userId_example"; // String | 
        String signatureId = "signatureId_example"; // String | 
        try {
            UserSignature result = apiInstance.deleteUserSignature(userId, signatureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSignaturesApi#deleteUserSignature");
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
| **userId** | **String**|  | |
| **signatureId** | **String**|  | |

### Return type

[**UserSignature**](UserSignature.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllUserSignatures

> GetAllUserSignaturesResponse getAllUserSignatures(userId)

Getting all user&#39;s signatures

This method renders user’s signatures ordered by creation date (descending).

Authorization​: only users that can view users. If the user affiliated to the token has the manage_users_of_my_teams permission, only the signatures of the users belonging to at least one of the teams he’s the leader of will be available.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UserSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UserSignaturesApi apiInstance = new UserSignaturesApi(defaultClient);
        String userId = "userId_example"; // String | 
        try {
            GetAllUserSignaturesResponse result = apiInstance.getAllUserSignatures(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSignaturesApi#getAllUserSignatures");
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
| **userId** | **String**|  | |

### Return type

[**GetAllUserSignaturesResponse**](GetAllUserSignaturesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getUserSignature

> UserSignature getUserSignature(userId, signatureId)

Getting a user&#39;s signature from its id

This method renders a user’s signature from a given id.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UserSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UserSignaturesApi apiInstance = new UserSignaturesApi(defaultClient);
        String userId = "userId_example"; // String | 
        String signatureId = "signatureId_example"; // String | 
        try {
            UserSignature result = apiInstance.getUserSignature(userId, signatureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSignaturesApi#getUserSignature");
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
| **userId** | **String**|  | |
| **signatureId** | **String**|  | |

### Return type

[**UserSignature**](UserSignature.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateUserSignature

> UserSignature updateUserSignature(userId, signatureId, body, sourceIds, language, name)

Updating a user&#39;s signature

This method updates the user’s signature related to the provided id from given attributes. In case of success it renders the updated signature, otherwise, it renders an error (422 HTTP code).

Authorization​: only users that can update users. If the user affiliated to the token has the `manage_users_of_my_teams` permission, the updated user will need to belong to at least one of the teams he’s the leader of. The teams the user affiliated to the token is the leader of will be the only ones which can be added or removed.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UserSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UserSignaturesApi apiInstance = new UserSignaturesApi(defaultClient);
        String userId = "userId_example"; // String | 
        String signatureId = "signatureId_example"; // String | 
        String body = "body_example"; // String | The signature text (not empty).
        List<String> sourceIds = Arrays.asList(); // List<String> | The signature list of source ids (multiple). Keep it empty if you don’t need to associate the signature with any sources.
        String language = "language_example"; // String | The two-letter code of the signature language.
        String name = "name_example"; // String | The signature name.
        try {
            UserSignature result = apiInstance.updateUserSignature(userId, signatureId, body, sourceIds, language, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserSignaturesApi#updateUserSignature");
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
| **userId** | **String**|  | |
| **signatureId** | **String**|  | |
| **body** | **String**| The signature text (not empty). | [optional] |
| **sourceIds** | **List&lt;String&gt;**| The signature list of source ids (multiple). Keep it empty if you don’t need to associate the signature with any sources. | [optional] |
| **language** | **String**| The two-letter code of the signature language. | [optional] |
| **name** | **String**| The signature name. | [optional] |

### Return type

[**UserSignature**](UserSignature.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

