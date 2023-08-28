package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.AgentStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class AgentStatusApi {
  private ApiClient apiClient;

  public AgentStatusApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AgentStatusApi(ApiClient apiClient) {
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
   * Changing an agent&#39;s status
   * This method updates an agent&#39;s availability. Can be used to set either channels statuses OR custom  status. If both parameters are provided, ignores custom status.The status parameter​ **MUST** b​e either “away” or “available”.  Authorization​: only users that have the right to monitor the task view.
   * @param agentId  (required)
   * @param status A hash of channel_id &#x3D;&gt; availability (must contain all channels). (optional)
   * @param customStatusId id of presence status (optional) (optional)
   * @return AgentStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public AgentStatus changeAgentStatus(String agentId, String status, String customStatusId) throws ApiException {
    return changeAgentStatusWithHttpInfo(agentId, status, customStatusId).getData();
  }

  /**
   * Changing an agent&#39;s status
   * This method updates an agent&#39;s availability. Can be used to set either channels statuses OR custom  status. If both parameters are provided, ignores custom status.The status parameter​ **MUST** b​e either “away” or “available”.  Authorization​: only users that have the right to monitor the task view.
   * @param agentId  (required)
   * @param status A hash of channel_id &#x3D;&gt; availability (must contain all channels). (optional)
   * @param customStatusId id of presence status (optional) (optional)
   * @return ApiResponse&lt;AgentStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AgentStatus> changeAgentStatusWithHttpInfo(String agentId, String status, String customStatusId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'agentId' is set
    if (agentId == null) {
      throw new ApiException(400, "Missing the required parameter 'agentId' when calling changeAgentStatus");
    }
    
    // create path and map variables
    String localVarPath = "/status/{agentId}"
      .replaceAll("\\{" + "agentId" + "\\}", apiClient.escapeString(agentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_status_id", customStatusId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<AgentStatus> localVarReturnType = new GenericType<AgentStatus>() {};

    return apiClient.invokeAPI("AgentStatusApi.changeAgentStatus", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get a connected agent status
   * This method get the status of a connected agent. Returns a 404 if the user does not exist (not_found) or if he’s not connected (disconnected).  Authorization​: only users that have the right to monitor the task view.
   * @param agentId  (required)
   * @return AgentStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public AgentStatus getAgentStatus(String agentId) throws ApiException {
    return getAgentStatusWithHttpInfo(agentId).getData();
  }

  /**
   * Get a connected agent status
   * This method get the status of a connected agent. Returns a 404 if the user does not exist (not_found) or if he’s not connected (disconnected).  Authorization​: only users that have the right to monitor the task view.
   * @param agentId  (required)
   * @return ApiResponse&lt;AgentStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AgentStatus> getAgentStatusWithHttpInfo(String agentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'agentId' is set
    if (agentId == null) {
      throw new ApiException(400, "Missing the required parameter 'agentId' when calling getAgentStatus");
    }
    
    // create path and map variables
    String localVarPath = "/status/{agentId}"
      .replaceAll("\\{" + "agentId" + "\\}", apiClient.escapeString(agentId.toString()));

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

    GenericType<AgentStatus> localVarReturnType = new GenericType<AgentStatus>() {};

    return apiClient.invokeAPI("AgentStatusApi.getAgentStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get all connected agents status
   * This method get all currently connected agents &amp; their status.  Authorization​: only users that have the right to monitor the task view.
   * @param sourceIds To filter users on given source ids (based on reply permission). (optional)
   * @param categoryIds To filter users on given category ids. (optional)
   * @param teamIds To filter users on given team ids. (optional)
   * @param spokenLanguages To filter users on given locales. (optional)
   * @return List&lt;AgentStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public List<AgentStatus> getAllAgentStatus(List<String> sourceIds, List<String> categoryIds, List<String> teamIds, List<String> spokenLanguages) throws ApiException {
    return getAllAgentStatusWithHttpInfo(sourceIds, categoryIds, teamIds, spokenLanguages).getData();
  }

  /**
   * Get all connected agents status
   * This method get all currently connected agents &amp; their status.  Authorization​: only users that have the right to monitor the task view.
   * @param sourceIds To filter users on given source ids (based on reply permission). (optional)
   * @param categoryIds To filter users on given category ids. (optional)
   * @param teamIds To filter users on given team ids. (optional)
   * @param spokenLanguages To filter users on given locales. (optional)
   * @return ApiResponse&lt;List&lt;AgentStatus&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<AgentStatus>> getAllAgentStatusWithHttpInfo(List<String> sourceIds, List<String> categoryIds, List<String> teamIds, List<String> spokenLanguages) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/status";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source_ids[]", sourceIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "category_ids[]", categoryIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "team_ids[]", teamIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "spoken_languages[]", spokenLanguages));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<AgentStatus>> localVarReturnType = new GenericType<List<AgentStatus>>() {};

    return apiClient.invokeAPI("AgentStatusApi.getAllAgentStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
