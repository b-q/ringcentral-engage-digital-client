package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllReplyAssistantGroupsResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.ReplyAssistantGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class ReplyAssistantGroupsApi {
  private ApiClient apiClient;

  public ReplyAssistantGroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReplyAssistantGroupsApi(ApiClient apiClient) {
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
   * Creating a reply assistant group
   * This method creates an entry group. In case of success it renders the group, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that have the right to manage reply assistant.
   * @param name The name of the group. (required)
   * @param entryIds List of the reply assistant entries in this group. (optional)
   * @param autocomplete Used for autocompletion in chat. (optional)
   * @param position Used to determine the order of the groups in the interface, in ascending order. (optional)
   * @return ReplyAssistantGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ReplyAssistantGroup createReplyAssistantGroup(String name, List<String> entryIds, Boolean autocomplete, Integer position) throws ApiException {
    return createReplyAssistantGroupWithHttpInfo(name, entryIds, autocomplete, position).getData();
  }

  /**
   * Creating a reply assistant group
   * This method creates an entry group. In case of success it renders the group, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that have the right to manage reply assistant.
   * @param name The name of the group. (required)
   * @param entryIds List of the reply assistant entries in this group. (optional)
   * @param autocomplete Used for autocompletion in chat. (optional)
   * @param position Used to determine the order of the groups in the interface, in ascending order. (optional)
   * @return ApiResponse&lt;ReplyAssistantGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReplyAssistantGroup> createReplyAssistantGroupWithHttpInfo(String name, List<String> entryIds, Boolean autocomplete, Integer position) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling createReplyAssistantGroup");
    }
    
    // create path and map variables
    String localVarPath = "/reply_assistant/groups";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entry_ids[]", entryIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "autocomplete", autocomplete));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "position", position));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ReplyAssistantGroup> localVarReturnType = new GenericType<ReplyAssistantGroup>() {};

    return apiClient.invokeAPI("ReplyAssistantGroupsApi.createReplyAssistantGroup", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deleting a reply assistant group
   * This method destroys an existing group. It renders the group itself. It renders a 404 if id is invalid.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantGroupId  (required)
   * @return ReplyAssistantGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ReplyAssistantGroup deleteReplyAssistantGroup(String replyAssistantGroupId) throws ApiException {
    return deleteReplyAssistantGroupWithHttpInfo(replyAssistantGroupId).getData();
  }

  /**
   * Deleting a reply assistant group
   * This method destroys an existing group. It renders the group itself. It renders a 404 if id is invalid.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantGroupId  (required)
   * @return ApiResponse&lt;ReplyAssistantGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReplyAssistantGroup> deleteReplyAssistantGroupWithHttpInfo(String replyAssistantGroupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replyAssistantGroupId' is set
    if (replyAssistantGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'replyAssistantGroupId' when calling deleteReplyAssistantGroup");
    }
    
    // create path and map variables
    String localVarPath = "/reply_assistant/groups/{replyAssistantGroupId}"
      .replaceAll("\\{" + "replyAssistantGroupId" + "\\}", apiClient.escapeString(replyAssistantGroupId.toString()));

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

    GenericType<ReplyAssistantGroup> localVarReturnType = new GenericType<ReplyAssistantGroup>() {};

    return apiClient.invokeAPI("ReplyAssistantGroupsApi.deleteReplyAssistantGroup", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting​ a​ll​ reply assistant groups
   * This method renders all groups ordered by creation date (ascending).  Authorization​: only users that have the right to manage reply assistant.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllReplyAssistantGroupsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllReplyAssistantGroupsResponse getAllReplyAssistantGroups(Integer offset, Integer limit) throws ApiException {
    return getAllReplyAssistantGroupsWithHttpInfo(offset, limit).getData();
  }

  /**
   * Getting​ a​ll​ reply assistant groups
   * This method renders all groups ordered by creation date (ascending).  Authorization​: only users that have the right to manage reply assistant.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllReplyAssistantGroupsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllReplyAssistantGroupsResponse> getAllReplyAssistantGroupsWithHttpInfo(Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reply_assistant/groups";

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

    GenericType<GetAllReplyAssistantGroupsResponse> localVarReturnType = new GenericType<GetAllReplyAssistantGroupsResponse>() {};

    return apiClient.invokeAPI("ReplyAssistantGroupsApi.getAllReplyAssistantGroups", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a reply assistant group from its id
   * This method renders an entry group from given id.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantGroupId  (required)
   * @return ReplyAssistantGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ReplyAssistantGroup getReplyAssistantGroup(String replyAssistantGroupId) throws ApiException {
    return getReplyAssistantGroupWithHttpInfo(replyAssistantGroupId).getData();
  }

  /**
   * Getting a reply assistant group from its id
   * This method renders an entry group from given id.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantGroupId  (required)
   * @return ApiResponse&lt;ReplyAssistantGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReplyAssistantGroup> getReplyAssistantGroupWithHttpInfo(String replyAssistantGroupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replyAssistantGroupId' is set
    if (replyAssistantGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'replyAssistantGroupId' when calling getReplyAssistantGroup");
    }
    
    // create path and map variables
    String localVarPath = "/reply_assistant/groups/{replyAssistantGroupId}"
      .replaceAll("\\{" + "replyAssistantGroupId" + "\\}", apiClient.escapeString(replyAssistantGroupId.toString()));

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

    GenericType<ReplyAssistantGroup> localVarReturnType = new GenericType<ReplyAssistantGroup>() {};

    return apiClient.invokeAPI("ReplyAssistantGroupsApi.getReplyAssistantGroup", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a reply assistant group
   * This method updates an existing group from given attributes and renders it in case of success.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantGroupId  (required)
   * @param name The name of the group. (optional)
   * @param entryIds List of the reply assistant entries in this group. (optional)
   * @param autocomplete Used for autocompletion in chat. (optional)
   * @param position Used to determine the order of the groups in the interface, in ascending order. (optional)
   * @return ReplyAssistantGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ReplyAssistantGroup updateReplyAssistantGroup(String replyAssistantGroupId, String name, List<String> entryIds, Boolean autocomplete, Integer position) throws ApiException {
    return updateReplyAssistantGroupWithHttpInfo(replyAssistantGroupId, name, entryIds, autocomplete, position).getData();
  }

  /**
   * Updating a reply assistant group
   * This method updates an existing group from given attributes and renders it in case of success.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantGroupId  (required)
   * @param name The name of the group. (optional)
   * @param entryIds List of the reply assistant entries in this group. (optional)
   * @param autocomplete Used for autocompletion in chat. (optional)
   * @param position Used to determine the order of the groups in the interface, in ascending order. (optional)
   * @return ApiResponse&lt;ReplyAssistantGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReplyAssistantGroup> updateReplyAssistantGroupWithHttpInfo(String replyAssistantGroupId, String name, List<String> entryIds, Boolean autocomplete, Integer position) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replyAssistantGroupId' is set
    if (replyAssistantGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'replyAssistantGroupId' when calling updateReplyAssistantGroup");
    }
    
    // create path and map variables
    String localVarPath = "/reply_assistant/groups/{replyAssistantGroupId}"
      .replaceAll("\\{" + "replyAssistantGroupId" + "\\}", apiClient.escapeString(replyAssistantGroupId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "entry_ids[]", entryIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "autocomplete", autocomplete));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "position", position));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ReplyAssistantGroup> localVarReturnType = new GenericType<ReplyAssistantGroup>() {};

    return apiClient.invokeAPI("ReplyAssistantGroupsApi.updateReplyAssistantGroup", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
