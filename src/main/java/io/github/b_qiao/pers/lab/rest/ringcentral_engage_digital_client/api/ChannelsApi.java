package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Channel;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllChannelsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class ChannelsApi {
  private ApiClient apiClient;

  public ChannelsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ChannelsApi(ApiClient apiClient) {
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
   * Getting all channels
   * This method renders all channels ordered by date of creation.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllChannelsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllChannelsResponse getAllChannels(Integer offset, Integer limit) throws ApiException {
    return getAllChannelsWithHttpInfo(offset, limit).getData();
  }

  /**
   * Getting all channels
   * This method renders all channels ordered by date of creation.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllChannelsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllChannelsResponse> getAllChannelsWithHttpInfo(Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/channels";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<GetAllChannelsResponse> localVarReturnType = new GenericType<GetAllChannelsResponse>() {};

    return apiClient.invokeAPI("ChannelsApi.getAllChannels", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a channel from its id
   * This method renders a channel from given id.
   * @param channelId  (required)
   * @return Channel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Channel getChannel(String channelId) throws ApiException {
    return getChannelWithHttpInfo(channelId).getData();
  }

  /**
   * Getting a channel from its id
   * This method renders a channel from given id.
   * @param channelId  (required)
   * @return ApiResponse&lt;Channel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Channel> getChannelWithHttpInfo(String channelId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelId' is set
    if (channelId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelId' when calling getChannel");
    }
    
    // create path and map variables
    String localVarPath = "/channels/{channelId}"
      .replaceAll("\\{" + "channelId" + "\\}", apiClient.escapeString(channelId.toString()));

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

    GenericType<Channel> localVarReturnType = new GenericType<Channel>() {};

    return apiClient.invokeAPI("ChannelsApi.getChannel", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a channel
   * This method updates an existing channel from given attributes and renders it in case of success.  Authorization​: only users that are able to update channels.
   * @param channelId  (required)
   * @param name The name of the channel. (optional)
   * @param sourceIds An array containing id of each source assigned to a channel (multiple). (optional)
   * @param softCapability Number of tasks that can be assigned to agent by the routing before they are considered \&quot;occupied\&quot;. (optional)
   * @param hardCapability M​aximum number of tasks that can be assigned to agents. (optional)
   * @param taskTimeoutSeconds this field defines the time before a task expires (in seconds). (optional)
   * @param agentSla Agent SLA in seconds. (optional)
   * @param agentSlaThreshold Agent SLA warning threshold (must be greater than 0 and less than 100, default value is 0). (optional)
   * @return Channel
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Channel updateChannel(String channelId, String name, List<String> sourceIds, Integer softCapability, Integer hardCapability, Integer taskTimeoutSeconds, Integer agentSla, Integer agentSlaThreshold) throws ApiException {
    return updateChannelWithHttpInfo(channelId, name, sourceIds, softCapability, hardCapability, taskTimeoutSeconds, agentSla, agentSlaThreshold).getData();
  }

  /**
   * Updating a channel
   * This method updates an existing channel from given attributes and renders it in case of success.  Authorization​: only users that are able to update channels.
   * @param channelId  (required)
   * @param name The name of the channel. (optional)
   * @param sourceIds An array containing id of each source assigned to a channel (multiple). (optional)
   * @param softCapability Number of tasks that can be assigned to agent by the routing before they are considered \&quot;occupied\&quot;. (optional)
   * @param hardCapability M​aximum number of tasks that can be assigned to agents. (optional)
   * @param taskTimeoutSeconds this field defines the time before a task expires (in seconds). (optional)
   * @param agentSla Agent SLA in seconds. (optional)
   * @param agentSlaThreshold Agent SLA warning threshold (must be greater than 0 and less than 100, default value is 0). (optional)
   * @return ApiResponse&lt;Channel&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Channel> updateChannelWithHttpInfo(String channelId, String name, List<String> sourceIds, Integer softCapability, Integer hardCapability, Integer taskTimeoutSeconds, Integer agentSla, Integer agentSlaThreshold) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'channelId' is set
    if (channelId == null) {
      throw new ApiException(400, "Missing the required parameter 'channelId' when calling updateChannel");
    }
    
    // create path and map variables
    String localVarPath = "/channels/{channelId}"
      .replaceAll("\\{" + "channelId" + "\\}", apiClient.escapeString(channelId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source_ids[]", sourceIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "soft_capability", softCapability));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hard_capability", hardCapability));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "task_timeout_seconds", taskTimeoutSeconds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "agent_sla", agentSla));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "agent_sla_threshold", agentSlaThreshold));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Channel> localVarReturnType = new GenericType<Channel>() {};

    return apiClient.invokeAPI("ChannelsApi.updateChannel", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
