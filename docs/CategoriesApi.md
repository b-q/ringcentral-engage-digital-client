# CategoriesApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCategory**](CategoriesApi.md#createCategory) | **POST** /categories | Creating a category |
| [**deleteCategory**](CategoriesApi.md#deleteCategory) | **DELETE** /categories/{categoryId} | Deleting a category |
| [**getAllCategories**](CategoriesApi.md#getAllCategories) | **GET** /categories | Getting all categories |
| [**getCategory**](CategoriesApi.md#getCategory) | **GET** /categories/{categoryId} | Getting a category from its id |
| [**updateCategory**](CategoriesApi.md#updateCategory) | **PUT** /categories/{categoryId} | Updating a category |



## createCategory

> Category createCategory(name, parentId, color, mandatory, multiple, postQualification, unselectable, sourceIds)

Creating a category

This method creates a new team. In case of success it renders the created tag, otherwise, it renders an error (422 HTTP code).

Note: The fields ​`mandatory`,​ `​multiple`,​ ​`post_qualification​`, `s​ource_ids`​ and `u​nselectable​` are accounted for only if the Category has no parent.

Authorization​: only users that can manage teams.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.CategoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        CategoriesApi apiInstance = new CategoriesApi(defaultClient);
        String name = "name_example"; // String | Category name.
        String parentId = "parentId_example"; // String | ID of parent category.
        Integer color = 0; // Integer | displayed color for the category, see Category colors. 
        Boolean mandatory = true; // Boolean | mandatory categorization (Boolean).
        Boolean multiple = true; // Boolean | allow to assign multiple child categories (Boolean).
        Boolean postQualification = true; // Boolean | post qualification (Boolean).
        Boolean unselectable = true; // Boolean | root category is unselectable (Boolean).
        List<String> sourceIds = Arrays.asList(); // List<String> | List of source id.
        try {
            Category result = apiInstance.createCategory(name, parentId, color, mandatory, multiple, postQualification, unselectable, sourceIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CategoriesApi#createCategory");
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
| **name** | **String**| Category name. | [optional] |
| **parentId** | **String**| ID of parent category. | [optional] |
| **color** | **Integer**| displayed color for the category, see Category colors.  | [optional] [enum: 0, 1, 2, 3, 4, 5, 6] |
| **mandatory** | **Boolean**| mandatory categorization (Boolean). | [optional] |
| **multiple** | **Boolean**| allow to assign multiple child categories (Boolean). | [optional] |
| **postQualification** | **Boolean**| post qualification (Boolean). | [optional] |
| **unselectable** | **Boolean**| root category is unselectable (Boolean). | [optional] |
| **sourceIds** | **List&lt;String&gt;**| List of source id. | [optional] |

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteCategory

> Category deleteCategory(categoryId, takeOverCategoryId)

Deleting a category

This method destroys an existing category. It renders the category itself. It renders a 404 if id is invalid.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.CategoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        CategoriesApi apiInstance = new CategoriesApi(defaultClient);
        String categoryId = "categoryId_example"; // String | 
        String takeOverCategoryId = "takeOverCategoryId_example"; // String | ID of a category to recategorize (optional).
        try {
            Category result = apiInstance.deleteCategory(categoryId, takeOverCategoryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CategoriesApi#deleteCategory");
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
| **categoryId** | **String**|  | |
| **takeOverCategoryId** | **String**| ID of a category to recategorize (optional). | [optional] |

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllCategories

> GetAllCategoriesResponse getAllCategories(parentId, offset, limit)

Getting all categories

This method renders categories ordered by creation date (ascending).

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.CategoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        CategoriesApi apiInstance = new CategoriesApi(defaultClient);
        String parentId = "parentId_example"; // String | To filter categories on given category parent id.
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllCategoriesResponse result = apiInstance.getAllCategories(parentId, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CategoriesApi#getAllCategories");
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
| **parentId** | **String**| To filter categories on given category parent id. | [optional] |
| **offset** | **Integer**| The record index to start. Default value is 0. | [optional] |
| **limit** | **Integer**| The max number of records to return. Default value is 30, max value is 150. | [optional] |

### Return type

[**GetAllCategoriesResponse**](GetAllCategoriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getCategory

> Category getCategory(categoryId)

Getting a category from its id

This method renders a category from given id.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.CategoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        CategoriesApi apiInstance = new CategoriesApi(defaultClient);
        String categoryId = "categoryId_example"; // String | 
        try {
            Category result = apiInstance.getCategory(categoryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CategoriesApi#getCategory");
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
| **categoryId** | **String**|  | |

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateCategory

> Category updateCategory(categoryId, name, parentId, color, mandatory, multiple, postQualification, unselectable, sourceIds)

Updating a category

This method creates a new team. In case of success it renders the created tag, otherwise, it renders an error (422 HTTP code).

Note: The fields ​`mandatory`,​ ​`multiple`,​ ​`post_qualification​`, `s​ource_ids​` and `u​nselectable​` are accounted for only if the Category has no parent.

Authorization​: only users that can manage teams.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.CategoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        CategoriesApi apiInstance = new CategoriesApi(defaultClient);
        String categoryId = "categoryId_example"; // String | 
        String name = "name_example"; // String | Category name.
        String parentId = "parentId_example"; // String | ID of parent category.
        Integer color = 56; // Integer | displayed color for the category, see Category colors. 
        Boolean mandatory = true; // Boolean | mandatory categorization (Boolean).
        Boolean multiple = true; // Boolean | allow to assign multiple child categories (Boolean).
        Boolean postQualification = true; // Boolean | post qualification (Boolean).
        Boolean unselectable = true; // Boolean | root category is unselectable (Boolean).
        List<String> sourceIds = Arrays.asList(); // List<String> | List of source id.
        try {
            Category result = apiInstance.updateCategory(categoryId, name, parentId, color, mandatory, multiple, postQualification, unselectable, sourceIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CategoriesApi#updateCategory");
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
| **categoryId** | **String**|  | |
| **name** | **String**| Category name. | [optional] |
| **parentId** | **String**| ID of parent category. | [optional] |
| **color** | **Integer**| displayed color for the category, see Category colors.  | [optional] |
| **mandatory** | **Boolean**| mandatory categorization (Boolean). | [optional] |
| **multiple** | **Boolean**| allow to assign multiple child categories (Boolean). | [optional] |
| **postQualification** | **Boolean**| post qualification (Boolean). | [optional] |
| **unselectable** | **Boolean**| root category is unselectable (Boolean). | [optional] |
| **sourceIds** | **List&lt;String&gt;**| List of source id. | [optional] |

### Return type

[**Category**](Category.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

