# AttachmentsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAttachment**](AttachmentsApi.md#createAttachment) | **POST** /attachments | Creating an attachment |
| [**getAllAttachments**](AttachmentsApi.md#getAllAttachments) | **GET** /attachments | Getting all attachments |
| [**getAttachment**](AttachmentsApi.md#getAttachment) | **GET** /attachments/{attachmentId} | Getting an attachment from its id |



## createAttachment

> Attachment createAttachment(_file, _private)

Creating an attachment

This method allows you to create an new attachment.

### Example

```java
import java.io.File;
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.AttachmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        File _file = new File("/path/to/file"); // File | 
        String _private = "true"; // String | 
        try {
            Attachment result = apiInstance.createAttachment(_file, _private);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#createAttachment");
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
| **_file** | **File**|  | [optional] |
| **_private** | **String**|  | [optional] [enum: true, =1] |

### Return type

[**Attachment**](Attachment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data:
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **422** | Compose is not supported on this source (compose_disabled_on_source) |  -  |


## getAllAttachments

> GetAllAttachmentsResponse getAllAttachments(offset, limit, extension, createdBefore, createdAfter)

Getting all attachments

This method renders attachments ordered by creation date (descending).

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.AttachmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        String extension = "extension_example"; // String | Search parameter for file extension (e.g. pdf, xlsx, jpg...)
        String createdBefore = "createdBefore_example"; // String | Search parameter to get attachments created before a ISO 8601 datetime (inclusive)
        String createdAfter = "createdAfter_example"; // String | Search parameter to get attachments created after a ISO 8601 datetime (inclusive)
        try {
            GetAllAttachmentsResponse result = apiInstance.getAllAttachments(offset, limit, extension, createdBefore, createdAfter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#getAllAttachments");
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
| **extension** | **String**| Search parameter for file extension (e.g. pdf, xlsx, jpg...) | [optional] |
| **createdBefore** | **String**| Search parameter to get attachments created before a ISO 8601 datetime (inclusive) | [optional] |
| **createdAfter** | **String**| Search parameter to get attachments created after a ISO 8601 datetime (inclusive) | [optional] |

### Return type

[**GetAllAttachmentsResponse**](GetAllAttachmentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAttachment

> Attachment getAttachment(attachmentId)

Getting an attachment from its id

This method renders an attachment from given id.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.AttachmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        String attachmentId = "attachmentId_example"; // String | 
        try {
            Attachment result = apiInstance.getAttachment(attachmentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#getAttachment");
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
| **attachmentId** | **String**|  | |

### Return type

[**Attachment**](Attachment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

