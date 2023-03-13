# TasksApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**completeTask**](TasksApi.md#completeTask) | **POST** /tasks/{taskId}/complete | Complete a task |
| [**getAllTasks**](TasksApi.md#getAllTasks) | **GET** /tasks | Getting all tasks |
| [**getTask**](TasksApi.md#getTask) | **GET** /tasks/{taskId} | Getting a task from its id |
| [**moveTask**](TasksApi.md#moveTask) | **POST** /tasks/{taskId}/move | Move a task to another queue |
| [**transferTask**](TasksApi.md#transferTask) | **POST** /tasks/{taskId}/transfer | Transferring a task |



## completeTask

> Task completeTask(taskId, queue)

Complete a task

This method completes a task.

Authorization​: for that call to succeed several conditions are required:
  - the task must be in an agent’s workbin.
  - the access token user must either own the task or be able to monitor all tasks or be able to monitor his team’s tasks if the task is owned by one of his team member.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | 
        String queue = "queue_example"; // String | Name of the queue task has to be moved in.
        try {
            Task result = apiInstance.completeTask(taskId, queue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#completeTask");
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
| **taskId** | **String**|  | |
| **queue** | **String**| Name of the queue task has to be moved in. | |

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllTasks

> GetAllTasksResponse getAllTasks(queue, channelId, step, offset, limit)

Getting all tasks

This method renders tasks ordered by priority (highest first) and then by creation date (latest first).

Authorization​: only users that can read tasks.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TasksApi apiInstance = new TasksApi(defaultClient);
        String queue = "queue_example"; // String | To filter tasks on given queue name (filters on the “global” queue by default).The most commonly used queues are: “global” (contains every task pending assignation), “workbin_{agent_id}” (contains every tasks assigned to the {agent_id} agent, “history” (contains every processed tasks), and “undelivered” (contains every undelivered tasks). If queue is set to “workbins” all the tasks currently in a workbin will be returned.
        String channelId = "channelId_example"; // String | To filter tasks on given channel id.
        String step = "step_example"; // String | To filter tasks on the step they’re currently in.
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllTasksResponse result = apiInstance.getAllTasks(queue, channelId, step, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#getAllTasks");
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
| **queue** | **String**| To filter tasks on given queue name (filters on the “global” queue by default).The most commonly used queues are: “global” (contains every task pending assignation), “workbin_{agent_id}” (contains every tasks assigned to the {agent_id} agent, “history” (contains every processed tasks), and “undelivered” (contains every undelivered tasks). If queue is set to “workbins” all the tasks currently in a workbin will be returned. | [optional] |
| **channelId** | **String**| To filter tasks on given channel id. | [optional] |
| **step** | **String**| To filter tasks on the step they’re currently in. | [optional] |
| **offset** | **Integer**| The record index to start. Default value is 0. | [optional] |
| **limit** | **Integer**| The max number of records to return. Default value is 30, max value is 150. | [optional] |

### Return type

[**GetAllTasksResponse**](GetAllTasksResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getTask

> Task getTask(taskId)

Getting a task from its id

This method renders a task from given id.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | 
        try {
            Task result = apiInstance.getTask(taskId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#getTask");
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
| **taskId** | **String**|  | |

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## moveTask

> Task moveTask(taskId, queue)

Move a task to another queue

This method changes a task queue and renders it in case of success. Only accepts “undelivered” and special queue defined in topology (e.g. triage).

Authorization​: only users that have the right to monitor the task view.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | 
        String queue = "queue_example"; // String | Name of the queue task has to be moved in.
        try {
            Task result = apiInstance.moveTask(taskId, queue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#moveTask");
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
| **taskId** | **String**|  | |
| **queue** | **String**| Name of the queue task has to be moved in. | |

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## transferTask

> Task transferTask(taskId, agentIds, bypass, categoryIds, language, teamIds, comment)

Transferring a task

This method transfers an existing task and renders it in case of success.

Authorization​: only users that have the right to monitor the task view.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TasksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | 
        List<String> agentIds = Arrays.asList(); // List<String> | List of agents to transfer the task to (multiple).
        String bypass = "bypass_example"; // String | Force the transfer to the first agent in agent_ids if set. When bypass is used,
        List<String> categoryIds = Arrays.asList(); // List<String> | Filter agents receiving the task depending on their categories.
        String language = "language_example"; // String | Filter agents receiving the task depending on their spoken languages.
        List<String> teamIds = Arrays.asList(); // List<String> | Filter agents receiving the task depending on their teams.
        String comment = "comment_example"; // String | Add a comment to the task.
        try {
            Task result = apiInstance.transferTask(taskId, agentIds, bypass, categoryIds, language, teamIds, comment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#transferTask");
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
| **taskId** | **String**|  | |
| **agentIds** | **List&lt;String&gt;**| List of agents to transfer the task to (multiple). | [optional] |
| **bypass** | **String**| Force the transfer to the first agent in agent_ids if set. When bypass is used, | [optional] |
| **categoryIds** | **List&lt;String&gt;**| Filter agents receiving the task depending on their categories. | [optional] |
| **language** | **String**| Filter agents receiving the task depending on their spoken languages. | [optional] |
| **teamIds** | **List&lt;String&gt;**| Filter agents receiving the task depending on their teams. | [optional] |
| **comment** | **String**| Add a comment to the task. | [optional] |

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

