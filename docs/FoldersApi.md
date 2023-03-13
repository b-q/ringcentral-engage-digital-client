# FoldersApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFolder**](FoldersApi.md#createFolder) | **POST** /folders | Creating a folder |
| [**deleteFolder**](FoldersApi.md#deleteFolder) | **DELETE** /folders/{folderId} | Deleting a folder |
| [**getAllFolders**](FoldersApi.md#getAllFolders) | **GET** /folders | Getting all folders |
| [**getFolder**](FoldersApi.md#getFolder) | **GET** /folders/{folderId} | Getting a folder from its id |
| [**updateFolder**](FoldersApi.md#updateFolder) | **PUT** /folders/{folderId} | Updating a folder |



## createFolder

> Folder createFolder(label, parentId, position, query, renderThreadsCount, roleRestrictionOnly, teamRestrictionOnly)

Creating a folder

This method creates a new folder. In case of success it renders the created folder, otherwise an error (422 HTTP code).

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        String label = "label_example"; // String | Folder’s label (mandatory).
        String parentId = "parentId_example"; // String | ID of the parent folder.
        Integer position = 56; // Integer | position of the folder. 
        String query = "query_example"; // String | query of the folder as described in ​Search API documentation.​\\n\\nExample: “​active_and_assigned_to_me:true”
        Boolean renderThreadsCount = true; // Boolean | boolean describing display of the number of threads. 
        List<String> roleRestrictionOnly = Arrays.asList(); // List<String> | list of roles allowed to see this folder. This parameter has to be a hash otherwise it will raise a 400 error. The key should be \"only\". For example: `&role_restriction[only][]=4e5596cdae70f677b5000002`
        List<String> teamRestrictionOnly = Arrays.asList(); // List<String> | list of teams allowed to see this folder. Same thing as role_restriction: team_restriction parameter has to be a hash with the key \"only\".
        try {
            Folder result = apiInstance.createFolder(label, parentId, position, query, renderThreadsCount, roleRestrictionOnly, teamRestrictionOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#createFolder");
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
| **label** | **String**| Folder’s label (mandatory). | [optional] |
| **parentId** | **String**| ID of the parent folder. | [optional] |
| **position** | **Integer**| position of the folder.  | [optional] |
| **query** | **String**| query of the folder as described in ​Search API documentation.​\\n\\nExample: “​active_and_assigned_to_me:true” | [optional] |
| **renderThreadsCount** | **Boolean**| boolean describing display of the number of threads.  | [optional] |
| **roleRestrictionOnly** | **List&lt;String&gt;**| list of roles allowed to see this folder. This parameter has to be a hash otherwise it will raise a 400 error. The key should be \&quot;only\&quot;. For example: &#x60;&amp;role_restriction[only][]&#x3D;4e5596cdae70f677b5000002&#x60; | [optional] |
| **teamRestrictionOnly** | **List&lt;String&gt;**| list of teams allowed to see this folder. Same thing as role_restriction: team_restriction parameter has to be a hash with the key \&quot;only\&quot;. | [optional] |

### Return type

[**Folder**](Folder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteFolder

> Folder deleteFolder(folderId)

Deleting a folder

This method destroys an existing folder. It renders the folder itself. It renders a 404 if id is invalid.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        String folderId = "folderId_example"; // String | 
        try {
            Folder result = apiInstance.deleteFolder(folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#deleteFolder");
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
| **folderId** | **String**|  | |

### Return type

[**Folder**](Folder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllFolders

> GetAllFoldersResponse getAllFolders(offset, limit)

Getting all folders

This method renders folders.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllFoldersResponse result = apiInstance.getAllFolders(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getAllFolders");
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

[**GetAllFoldersResponse**](GetAllFoldersResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getFolder

> Folder getFolder(folderId)

Getting a folder from its id

This method renders a folder from given id.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        String folderId = "folderId_example"; // String | 
        try {
            Folder result = apiInstance.getFolder(folderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getFolder");
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
| **folderId** | **String**|  | |

### Return type

[**Folder**](Folder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateFolder

> Folder updateFolder(folderId, label, parentId, position, query, renderThreadsCount, roleRestrictionOnly, teamRestrictionOnly)

Updating a folder

This method updates an existing folder from given attributes and renders it in case of success.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.FoldersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        FoldersApi apiInstance = new FoldersApi(defaultClient);
        String folderId = "folderId_example"; // String | 
        String label = "label_example"; // String | Folder’s label (mandatory).
        String parentId = "parentId_example"; // String | ID of the parent folder.
        Integer position = 56; // Integer | position of the folder. 
        String query = "query_example"; // String | query of the folder as described in ​Search API documentation.​\\n\\nExample: “​active_and_assigned_to_me:true”
        Boolean renderThreadsCount = true; // Boolean | boolean describing display of the number of threads. 
        List<String> roleRestrictionOnly = Arrays.asList(); // List<String> | list of roles allowed to see this folder. This parameter has to be a hash otherwise it will raise a 400 error. The key should be \"only\". For example: `&role_restriction[only][]=4e5596cdae70f677b5000002`
        List<String> teamRestrictionOnly = Arrays.asList(); // List<String> | list of teams allowed to see this folder. Same thing as role_restriction: team_restriction parameter has to be a hash with the key \"only\".
        try {
            Folder result = apiInstance.updateFolder(folderId, label, parentId, position, query, renderThreadsCount, roleRestrictionOnly, teamRestrictionOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#updateFolder");
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
| **folderId** | **String**|  | |
| **label** | **String**| Folder’s label (mandatory). | [optional] |
| **parentId** | **String**| ID of the parent folder. | [optional] |
| **position** | **Integer**| position of the folder.  | [optional] |
| **query** | **String**| query of the folder as described in ​Search API documentation.​\\n\\nExample: “​active_and_assigned_to_me:true” | [optional] |
| **renderThreadsCount** | **Boolean**| boolean describing display of the number of threads.  | [optional] |
| **roleRestrictionOnly** | **List&lt;String&gt;**| list of roles allowed to see this folder. This parameter has to be a hash otherwise it will raise a 400 error. The key should be \&quot;only\&quot;. For example: &#x60;&amp;role_restriction[only][]&#x3D;4e5596cdae70f677b5000002&#x60; | [optional] |
| **teamRestrictionOnly** | **List&lt;String&gt;**| list of teams allowed to see this folder. Same thing as role_restriction: team_restriction parameter has to be a hash with the key \&quot;only\&quot;. | [optional] |

### Return type

[**Folder**](Folder.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

