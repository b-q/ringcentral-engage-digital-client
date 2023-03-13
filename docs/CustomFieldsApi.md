# CustomFieldsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCustomField**](CustomFieldsApi.md#createCustomField) | **POST** /custom_fields | Creating a custom field |
| [**deleteCustomField**](CustomFieldsApi.md#deleteCustomField) | **DELETE** /custom_fields/{customFieldId} | Deleting a custom field |
| [**getAllCustomFields**](CustomFieldsApi.md#getAllCustomFields) | **GET** /custom_fields | Getting all custom fields |
| [**getCustomField**](CustomFieldsApi.md#getCustomField) | **GET** /custom_fields/{customFieldId} | Getting a custom field from its id |
| [**updateCustomField**](CustomFieldsApi.md#updateCustomField) | **PUT** /custom_fields/{customFieldId} | Updating a custom field |



## createCustomField

> CustomField createCustomField(associatedTypeName, label, key, type, choices, multiple, position)

Creating a custom field

This method creates a custom field. In case of success it renders the custom field, otherwise, it renders an error (422 HTTP code).

Authorization​: only users that can create custom fields.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.CustomFieldsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
        String associatedTypeName = "IdentityGroup"; // String | The associated type of custom field. It can be IdentityGroup or Intervention.
        String label = "label_example"; // String | The label of the custom field.
        String key = "key_example"; // String | The key of the custom field (example: customer_id). This is used to determine how it is stored on identity groups.
        String type = "string"; // String | The type of the custom field. It can be string, boolean, text, integer, float, single_choice,
        List<String> choices = Arrays.asList(); // List<String> | A list of choices to be for single_choice, or multiple_choice types. This must be given
        Boolean multiple = true; // Boolean | true or false, this as no effect on single_choice, multiple_choice or boolean types
        Integer position = -1; // Integer | an integer that indicates custom field’s position between others (default: -1).
        try {
            CustomField result = apiInstance.createCustomField(associatedTypeName, label, key, type, choices, multiple, position);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomFieldsApi#createCustomField");
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
| **associatedTypeName** | **String**| The associated type of custom field. It can be IdentityGroup or Intervention. | [enum: IdentityGroup, Intervention] |
| **label** | **String**| The label of the custom field. | |
| **key** | **String**| The key of the custom field (example: customer_id). This is used to determine how it is stored on identity groups. | [optional] |
| **type** | **String**| The type of the custom field. It can be string, boolean, text, integer, float, single_choice, | [optional] [enum: string, boolean, text, integer, float, single_choice, multiple_choice] |
| **choices** | **List&lt;String&gt;**| A list of choices to be for single_choice, or multiple_choice types. This must be given | [optional] |
| **multiple** | **Boolean**| true or false, this as no effect on single_choice, multiple_choice or boolean types | [optional] |
| **position** | **Integer**| an integer that indicates custom field’s position between others (default: -1). | [optional] [default to -1] |

### Return type

[**CustomField**](CustomField.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteCustomField

> CustomField deleteCustomField(customFieldId)

Deleting a custom field

This method destroys an existing custom field. It renders custom field itself. It renders a 404 if id is invalid.

Authorization​: only users that are able to destroy custom fields..

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.CustomFieldsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
        String customFieldId = "customFieldId_example"; // String | 
        try {
            CustomField result = apiInstance.deleteCustomField(customFieldId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomFieldsApi#deleteCustomField");
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
| **customFieldId** | **String**|  | |

### Return type

[**CustomField**](CustomField.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllCustomFields

> GetAllCustomFieldsResponse getAllCustomFields(offset, limit)

Getting all custom fields

This method renders custom fields ordered by position (ascending).

Authorization​: only users that can see custom fields in administration section.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.CustomFieldsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllCustomFieldsResponse result = apiInstance.getAllCustomFields(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomFieldsApi#getAllCustomFields");
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

[**GetAllCustomFieldsResponse**](GetAllCustomFieldsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getCustomField

> CustomField getCustomField(customFieldId)

Getting a custom field from its id

This method renders a custom field from given id.

Authorization​: only users that can see custom fields in administration section.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.CustomFieldsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
        String customFieldId = "customFieldId_example"; // String | 
        try {
            CustomField result = apiInstance.getCustomField(customFieldId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomFieldsApi#getCustomField");
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
| **customFieldId** | **String**|  | |

### Return type

[**CustomField**](CustomField.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateCustomField

> CustomField updateCustomField(customFieldId, label, choices, position)

Updating a custom field

This method updates an existing custom field from given attributes and renders it in case of success.

Authorization​: only users that are able to update custom fields.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.CustomFieldsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        CustomFieldsApi apiInstance = new CustomFieldsApi(defaultClient);
        String customFieldId = "customFieldId_example"; // String | 
        String label = "label_example"; // String | Custom field’s label.
        List<String> choices = Arrays.asList(); // List<String> | 
        Integer position = 56; // Integer | Custom field’s position.
        try {
            CustomField result = apiInstance.updateCustomField(customFieldId, label, choices, position);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomFieldsApi#updateCustomField");
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
| **customFieldId** | **String**|  | |
| **label** | **String**| Custom field’s label. | [optional] |
| **choices** | **List&lt;String&gt;**|  | [optional] |
| **position** | **Integer**| Custom field’s position. | [optional] |

### Return type

[**CustomField**](CustomField.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

