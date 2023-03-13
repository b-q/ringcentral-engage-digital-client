# TeamsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTeam**](TeamsApi.md#createTeam) | **POST** /teams | Creating a team |
| [**deleteTeam**](TeamsApi.md#deleteTeam) | **DELETE** /teams/{teamId} | Deleting a team |
| [**getAllTeams**](TeamsApi.md#getAllTeams) | **GET** /teams | Getting all teams |
| [**getTeam**](TeamsApi.md#getTeam) | **GET** /teams/{teamId} | Getting a team from its id |
| [**updateTeam**](TeamsApi.md#updateTeam) | **PUT** /teams/{teamId} | Updating a team |



## createTeam

> Team createTeam(name, leaderIds, userIds)

Creating a team

This method creates a new team. In case of success it renders the created tag, otherwise, it renders an error (422 HTTP code).

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String name = "name_example"; // String | Team name.
        List<String> leaderIds = Arrays.asList(); // List<String> | List of user id as leaders
        List<String> userIds = Arrays.asList(); // List<String> | List of user id as team members.
        try {
            Team result = apiInstance.createTeam(name, leaderIds, userIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#createTeam");
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
| **name** | **String**| Team name. | [optional] |
| **leaderIds** | **List&lt;String&gt;**| List of user id as leaders | [optional] |
| **userIds** | **List&lt;String&gt;**| List of user id as team members. | [optional] |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteTeam

> Team deleteTeam(teamId, takeOverCategoryId)

Deleting a team

This method destroys an existing team. It renders the team itself. It renders a 404 if id is invalid.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | 
        String takeOverCategoryId = "takeOverCategoryId_example"; // String | ID of a category to recategorize (optional).
        try {
            Team result = apiInstance.deleteTeam(teamId, takeOverCategoryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#deleteTeam");
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
| **teamId** | **String**|  | |
| **takeOverCategoryId** | **String**| ID of a category to recategorize (optional). | [optional] |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllTeams

> GetAllTeamsResponse getAllTeams(offset, limit)

Getting all teams

This method renders teams ordered by creation date (ascending).

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllTeamsResponse result = apiInstance.getAllTeams(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getAllTeams");
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

[**GetAllTeamsResponse**](GetAllTeamsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getTeam

> Team getTeam(teamId)

Getting a team from its id

This method renders a team from given id.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | 
        try {
            Team result = apiInstance.getTeam(teamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeam");
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
| **teamId** | **String**|  | |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateTeam

> Team updateTeam(teamId, name, leaderIds, userIds)

Updating a team

This method updates an existing team from given attributes and renders it in case of success.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | 
        String name = "name_example"; // String | Team name.
        List<String> leaderIds = Arrays.asList(); // List<String> | List of user id as leaders
        List<String> userIds = Arrays.asList(); // List<String> | List of user id as team members.
        try {
            Team result = apiInstance.updateTeam(teamId, name, leaderIds, userIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#updateTeam");
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
| **teamId** | **String**|  | |
| **name** | **String**| Team name. | [optional] |
| **leaderIds** | **List&lt;String&gt;**| List of user id as leaders | [optional] |
| **userIds** | **List&lt;String&gt;**| List of user id as team members. | [optional] |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

