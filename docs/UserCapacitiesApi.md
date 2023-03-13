# UserCapacitiesApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUserCapacity**](UserCapacitiesApi.md#createUserCapacity) | **POST** /user_capacities | Creating a user capacity |
| [**deleteUserCapacity**](UserCapacitiesApi.md#deleteUserCapacity) | **DELETE** /user_capacities/{userCapacityId} | Deleting a user capacity |
| [**getAllUserCapacities**](UserCapacitiesApi.md#getAllUserCapacities) | **GET** /user_capacities | Getting all User Capacities |
| [**getUserCapacity**](UserCapacitiesApi.md#getUserCapacity) | **GET** /user_capacities/{userCapacityId} | Getting a user capacity from its id |
| [**updateUserCapacity**](UserCapacitiesApi.md#updateUserCapacity) | **PUT** /user_capacities/{userCapacityId} | Updating a user capacity |



## createUserCapacity

> UserCapacity createUserCapacity(name, channelsChannelId, channelsDefaultCapacity, channelsMaxCapacity)

Creating a user capacity

This method creates a new user capacity. In case of success it renders the created record, otherwise, it renders an error (422 HTTP code).

Please note that the order of the parameters is important, as the `default_capacity` and `max_capacity` will apply to the immediately above `channel_id`.

Authorization​: only users who can manage topology.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UserCapacitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UserCapacitiesApi apiInstance = new UserCapacitiesApi(defaultClient);
        String name = "name_example"; // String | User Capacity name.
        String channelsChannelId = "channelsChannelId_example"; // String | The id of the channel on which the capacities apply.
        Integer channelsDefaultCapacity = 56; // Integer | The default capacity to apply to the related channel.
        Integer channelsMaxCapacity = 56; // Integer | The maximum capacity to apply to the related channel.
        try {
            UserCapacity result = apiInstance.createUserCapacity(name, channelsChannelId, channelsDefaultCapacity, channelsMaxCapacity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCapacitiesApi#createUserCapacity");
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
| **name** | **String**| User Capacity name. | |
| **channelsChannelId** | **String**| The id of the channel on which the capacities apply. | [optional] |
| **channelsDefaultCapacity** | **Integer**| The default capacity to apply to the related channel. | [optional] |
| **channelsMaxCapacity** | **Integer**| The maximum capacity to apply to the related channel. | [optional] |

### Return type

[**UserCapacity**](UserCapacity.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteUserCapacity

> UserCapacity deleteUserCapacity(userCapacityId)

Deleting a user capacity

This method destroys an existing user capacity. It renders the user capacity itself. It renders a 404 if id is invalid or already destroyed.

Authorization​: only users who can manage topology.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UserCapacitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UserCapacitiesApi apiInstance = new UserCapacitiesApi(defaultClient);
        String userCapacityId = "userCapacityId_example"; // String | 
        try {
            UserCapacity result = apiInstance.deleteUserCapacity(userCapacityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCapacitiesApi#deleteUserCapacity");
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
| **userCapacityId** | **String**|  | |

### Return type

[**UserCapacity**](UserCapacity.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllUserCapacities

> GetAllUserCapacitiesResponse getAllUserCapacities(offset, limit)

Getting all User Capacities

This method renders all user capacities ordered by creation date (ascending).

Authorization​: only users who can manage topology.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UserCapacitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UserCapacitiesApi apiInstance = new UserCapacitiesApi(defaultClient);
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllUserCapacitiesResponse result = apiInstance.getAllUserCapacities(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCapacitiesApi#getAllUserCapacities");
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

[**GetAllUserCapacitiesResponse**](GetAllUserCapacitiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getUserCapacity

> UserCapacity getUserCapacity(userCapacityId)

Getting a user capacity from its id

This method renders the user capacity corresponding to the id given in parameter. It renders a 404 if id is invalid.

Authorization​: only users who can manage topology.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UserCapacitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UserCapacitiesApi apiInstance = new UserCapacitiesApi(defaultClient);
        String userCapacityId = "userCapacityId_example"; // String | 
        try {
            UserCapacity result = apiInstance.getUserCapacity(userCapacityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCapacitiesApi#getUserCapacity");
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
| **userCapacityId** | **String**|  | |

### Return type

[**UserCapacity**](UserCapacity.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateUserCapacity

> UserCapacity updateUserCapacity(userCapacityId, name, channelsChannelId, channelsDefaultCapacity, channelsMaxCapacity)

Updating a user capacity

This method creates a new user capacity. In case of success it renders the created record, otherwise, it renders an error (422 HTTP code).

Please note that the order of the parameters is important, as the `default_capacity` and `max_capacity` will apply to the immediately above `channel_id`.

Authorization​: only users who can manage topology.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UserCapacitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UserCapacitiesApi apiInstance = new UserCapacitiesApi(defaultClient);
        String userCapacityId = "userCapacityId_example"; // String | 
        String name = "name_example"; // String | User Capacity name.
        String channelsChannelId = "channelsChannelId_example"; // String | The id of the channel on which the capacities apply.
        Integer channelsDefaultCapacity = 56; // Integer | The default capacity to apply to the related channel.
        Integer channelsMaxCapacity = 56; // Integer | The maximum capacity to apply to the related channel.
        try {
            UserCapacity result = apiInstance.updateUserCapacity(userCapacityId, name, channelsChannelId, channelsDefaultCapacity, channelsMaxCapacity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserCapacitiesApi#updateUserCapacity");
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
| **userCapacityId** | **String**|  | |
| **name** | **String**| User Capacity name. | [optional] |
| **channelsChannelId** | **String**| The id of the channel on which the capacities apply. | [optional] |
| **channelsDefaultCapacity** | **Integer**| The default capacity to apply to the related channel. | [optional] |
| **channelsMaxCapacity** | **Integer**| The maximum capacity to apply to the related channel. | [optional] |

### Return type

[**UserCapacity**](UserCapacity.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

