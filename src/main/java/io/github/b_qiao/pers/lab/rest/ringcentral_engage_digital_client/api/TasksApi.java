package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllTasksResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class TasksApi {
  private ApiClient apiClient;

  public TasksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TasksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Complete a task
   * This method completes a task.  Authorization​: for that call to succeed several conditions are required:   - the task must be in an agent’s workbin.   - the access token user must either own the task or be able to monitor all tasks or be able to monitor his team’s tasks if the task is owned by one of his team member.
   * @param taskId  (required)
   * @param queue Name of the queue task has to be moved in. (required)
   * @return Task
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Task completeTask(String taskId, String queue) throws ApiException {
    return completeTaskWithHttpInfo(taskId, queue).getData();
  }

  /**
   * Complete a task
   * This method completes a task.  Authorization​: for that call to succeed several conditions are required:   - the task must be in an agent’s workbin.   - the access token user must either own the task or be able to monitor all tasks or be able to monitor his team’s tasks if the task is owned by one of his team member.
   * @param taskId  (required)
   * @param queue Name of the queue task has to be moved in. (required)
   * @return ApiResponse&lt;Task&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Task> completeTaskWithHttpInfo(String taskId, String queue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling completeTask");
    }
    
    // verify the required parameter 'queue' is set
    if (queue == null) {
      throw new ApiException(400, "Missing the required parameter 'queue' when calling completeTask");
    }
    
    // create path and map variables
    String localVarPath = "/tasks/{taskId}/complete"
      .replaceAll("\\{" + "taskId" + "\\}", apiClient.escapeString(taskId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "queue", queue));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Task> localVarReturnType = new GenericType<Task>() {};

    return apiClient.invokeAPI("TasksApi.completeTask", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all tasks
   * This method renders tasks ordered by priority (highest first) and then by creation date (latest first).  Authorization​: only users that can read tasks.
   * @param queue To filter tasks on given queue name (filters on the “global” queue by default).The most commonly used queues are: “global” (contains every task pending assignation), “workbin_{agent_id}” (contains every tasks assigned to the {agent_id} agent, “history” (contains every processed tasks), and “undelivered” (contains every undelivered tasks). If queue is set to “workbins” all the tasks currently in a workbin will be returned. (optional)
   * @param channelId To filter tasks on given channel id. (optional)
   * @param step To filter tasks on the step they’re currently in. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllTasksResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllTasksResponse getAllTasks(String queue, String channelId, String step, Integer offset, Integer limit) throws ApiException {
    return getAllTasksWithHttpInfo(queue, channelId, step, offset, limit).getData();
  }

  /**
   * Getting all tasks
   * This method renders tasks ordered by priority (highest first) and then by creation date (latest first).  Authorization​: only users that can read tasks.
   * @param queue To filter tasks on given queue name (filters on the “global” queue by default).The most commonly used queues are: “global” (contains every task pending assignation), “workbin_{agent_id}” (contains every tasks assigned to the {agent_id} agent, “history” (contains every processed tasks), and “undelivered” (contains every undelivered tasks). If queue is set to “workbins” all the tasks currently in a workbin will be returned. (optional)
   * @param channelId To filter tasks on given channel id. (optional)
   * @param step To filter tasks on the step they’re currently in. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllTasksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllTasksResponse> getAllTasksWithHttpInfo(String queue, String channelId, String step, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/tasks";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "queue", queue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "channel_id", channelId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "step", step));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<GetAllTasksResponse> localVarReturnType = new GenericType<GetAllTasksResponse>() {};

    return apiClient.invokeAPI("TasksApi.getAllTasks", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a task from its id
   * This method renders a task from given id.
   * @param taskId  (required)
   * @return Task
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Task getTask(String taskId) throws ApiException {
    return getTaskWithHttpInfo(taskId).getData();
  }

  /**
   * Getting a task from its id
   * This method renders a task from given id.
   * @param taskId  (required)
   * @return ApiResponse&lt;Task&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Task> getTaskWithHttpInfo(String taskId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getTask");
    }
    
    // create path and map variables
    String localVarPath = "/tasks/{taskId}"
      .replaceAll("\\{" + "taskId" + "\\}", apiClient.escapeString(taskId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Task> localVarReturnType = new GenericType<Task>() {};

    return apiClient.invokeAPI("TasksApi.getTask", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Move a task to another queue
   * This method changes a task queue and renders it in case of success. Only accepts “undelivered” and special queue defined in topology (e.g. triage).  Authorization​: only users that have the right to monitor the task view.
   * @param taskId  (required)
   * @param queue Name of the queue task has to be moved in. (required)
   * @return Task
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Task moveTask(String taskId, String queue) throws ApiException {
    return moveTaskWithHttpInfo(taskId, queue).getData();
  }

  /**
   * Move a task to another queue
   * This method changes a task queue and renders it in case of success. Only accepts “undelivered” and special queue defined in topology (e.g. triage).  Authorization​: only users that have the right to monitor the task view.
   * @param taskId  (required)
   * @param queue Name of the queue task has to be moved in. (required)
   * @return ApiResponse&lt;Task&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Task> moveTaskWithHttpInfo(String taskId, String queue) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling moveTask");
    }
    
    // verify the required parameter 'queue' is set
    if (queue == null) {
      throw new ApiException(400, "Missing the required parameter 'queue' when calling moveTask");
    }
    
    // create path and map variables
    String localVarPath = "/tasks/{taskId}/move"
      .replaceAll("\\{" + "taskId" + "\\}", apiClient.escapeString(taskId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "queue", queue));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Task> localVarReturnType = new GenericType<Task>() {};

    return apiClient.invokeAPI("TasksApi.moveTask", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Transferring a task
   * This method transfers an existing task and renders it in case of success.  Authorization​: only users that have the right to monitor the task view.
   * @param taskId  (required)
   * @param agentIds List of agents to transfer the task to (multiple). (optional)
   * @param bypass Force the transfer to the first agent in agent_ids if set. When bypass is used, (optional)
   * @param categoryIds Filter agents receiving the task depending on their categories. (optional)
   * @param language Filter agents receiving the task depending on their spoken languages. (optional)
   * @param teamIds Filter agents receiving the task depending on their teams. (optional)
   * @param comment Add a comment to the task. (optional)
   * @return Task
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Task transferTask(String taskId, List<String> agentIds, String bypass, List<String> categoryIds, String language, List<String> teamIds, String comment) throws ApiException {
    return transferTaskWithHttpInfo(taskId, agentIds, bypass, categoryIds, language, teamIds, comment).getData();
  }

  /**
   * Transferring a task
   * This method transfers an existing task and renders it in case of success.  Authorization​: only users that have the right to monitor the task view.
   * @param taskId  (required)
   * @param agentIds List of agents to transfer the task to (multiple). (optional)
   * @param bypass Force the transfer to the first agent in agent_ids if set. When bypass is used, (optional)
   * @param categoryIds Filter agents receiving the task depending on their categories. (optional)
   * @param language Filter agents receiving the task depending on their spoken languages. (optional)
   * @param teamIds Filter agents receiving the task depending on their teams. (optional)
   * @param comment Add a comment to the task. (optional)
   * @return ApiResponse&lt;Task&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Task> transferTaskWithHttpInfo(String taskId, List<String> agentIds, String bypass, List<String> categoryIds, String language, List<String> teamIds, String comment) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling transferTask");
    }
    
    // create path and map variables
    String localVarPath = "/tasks/{taskId}/transfer"
      .replaceAll("\\{" + "taskId" + "\\}", apiClient.escapeString(taskId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "agent_ids[]", agentIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bypass", bypass));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "category_ids[]", categoryIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "team_ids[]", teamIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "comment", comment));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Task> localVarReturnType = new GenericType<Task>() {};

    return apiClient.invokeAPI("TasksApi.transferTask", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
