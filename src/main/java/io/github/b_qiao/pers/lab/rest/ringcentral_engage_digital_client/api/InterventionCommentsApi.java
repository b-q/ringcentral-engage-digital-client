package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllInterventionCommentsResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.InterventionComment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class InterventionCommentsApi {
  private ApiClient apiClient;

  public InterventionCommentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InterventionCommentsApi(ApiClient apiClient) {
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
   * Creating an intervention comment
   * This method creates a new intervention comment. In case of success it renders the created comment, otherwise, it renders an error (422 HTTP code). It creates comment as token’s user. If token’s user does not have “read” on given intervention’s source a 404 HTTP response will be returned.
   * @param body The comment body (mandatory). (required)
   * @param interventionId The comment intervention id (mandatory). (required)
   * @param userId The comment user id (mandatory). (required)
   * @return InterventionComment
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public InterventionComment createInterventionComment(String body, String interventionId, String userId) throws ApiException {
    return createInterventionCommentWithHttpInfo(body, interventionId, userId).getData();
  }

  /**
   * Creating an intervention comment
   * This method creates a new intervention comment. In case of success it renders the created comment, otherwise, it renders an error (422 HTTP code). It creates comment as token’s user. If token’s user does not have “read” on given intervention’s source a 404 HTTP response will be returned.
   * @param body The comment body (mandatory). (required)
   * @param interventionId The comment intervention id (mandatory). (required)
   * @param userId The comment user id (mandatory). (required)
   * @return ApiResponse&lt;InterventionComment&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InterventionComment> createInterventionCommentWithHttpInfo(String body, String interventionId, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createInterventionComment");
    }
    
    // verify the required parameter 'interventionId' is set
    if (interventionId == null) {
      throw new ApiException(400, "Missing the required parameter 'interventionId' when calling createInterventionComment");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling createInterventionComment");
    }
    
    // create path and map variables
    String localVarPath = "/intervention_comments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "intervention_id", interventionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InterventionComment> localVarReturnType = new GenericType<InterventionComment>() {};

    return apiClient.invokeAPI("InterventionCommentsApi.createInterventionComment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deleting an intervention comment
   * This method destroys an intervention comment. It renders comment itself. If token’s user does not have “read” on comment’s source a 404 HTTP response will be returned.  Authorization​: no.
   * @param interventionCommentId  (required)
   * @return InterventionComment
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public InterventionComment deleteInterventionComment(String interventionCommentId) throws ApiException {
    return deleteInterventionCommentWithHttpInfo(interventionCommentId).getData();
  }

  /**
   * Deleting an intervention comment
   * This method destroys an intervention comment. It renders comment itself. If token’s user does not have “read” on comment’s source a 404 HTTP response will be returned.  Authorization​: no.
   * @param interventionCommentId  (required)
   * @return ApiResponse&lt;InterventionComment&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InterventionComment> deleteInterventionCommentWithHttpInfo(String interventionCommentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'interventionCommentId' is set
    if (interventionCommentId == null) {
      throw new ApiException(400, "Missing the required parameter 'interventionCommentId' when calling deleteInterventionComment");
    }
    
    // create path and map variables
    String localVarPath = "/intervention_comments/{interventionCommentId}"
      .replaceAll("\\{" + "interventionCommentId" + "\\}", apiClient.escapeString(interventionCommentId.toString()));

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

    GenericType<InterventionComment> localVarReturnType = new GenericType<InterventionComment>() {};

    return apiClient.invokeAPI("InterventionCommentsApi.deleteInterventionComment", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all intervention comments
   * This method renders interventions comments ordered by creation date (descending). Only comments in sources where token’s user has “read” permission are returned.  Authorization​: no.
   * @param interventionId To filter comments on given intervention id. (optional)
   * @param threadId To filter comments on given thread id. (optional)
   * @param userId To filter comments on given user id. (optional)
   * @param identityId To filter comments on given identity id. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllInterventionCommentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllInterventionCommentsResponse getAllInterventionComments(String interventionId, String threadId, String userId, String identityId, Integer offset, Integer limit) throws ApiException {
    return getAllInterventionCommentsWithHttpInfo(interventionId, threadId, userId, identityId, offset, limit).getData();
  }

  /**
   * Getting all intervention comments
   * This method renders interventions comments ordered by creation date (descending). Only comments in sources where token’s user has “read” permission are returned.  Authorization​: no.
   * @param interventionId To filter comments on given intervention id. (optional)
   * @param threadId To filter comments on given thread id. (optional)
   * @param userId To filter comments on given user id. (optional)
   * @param identityId To filter comments on given identity id. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllInterventionCommentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllInterventionCommentsResponse> getAllInterventionCommentsWithHttpInfo(String interventionId, String threadId, String userId, String identityId, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/intervention_comments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "intervention_id", interventionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "thread_id", threadId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identity_id", identityId));
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

    GenericType<GetAllInterventionCommentsResponse> localVarReturnType = new GenericType<GetAllInterventionCommentsResponse>() {};

    return apiClient.invokeAPI("InterventionCommentsApi.getAllInterventionComments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting an intervention comment from its id
   * This method renders an intervention comment from given id. If token’s user does not have “read” on comment’s source a 404 HTTP response will be returned.
   * @param interventionCommentId  (required)
   * @return InterventionComment
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public InterventionComment getInterventionComment(String interventionCommentId) throws ApiException {
    return getInterventionCommentWithHttpInfo(interventionCommentId).getData();
  }

  /**
   * Getting an intervention comment from its id
   * This method renders an intervention comment from given id. If token’s user does not have “read” on comment’s source a 404 HTTP response will be returned.
   * @param interventionCommentId  (required)
   * @return ApiResponse&lt;InterventionComment&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InterventionComment> getInterventionCommentWithHttpInfo(String interventionCommentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'interventionCommentId' is set
    if (interventionCommentId == null) {
      throw new ApiException(400, "Missing the required parameter 'interventionCommentId' when calling getInterventionComment");
    }
    
    // create path and map variables
    String localVarPath = "/intervention_comments/{interventionCommentId}"
      .replaceAll("\\{" + "interventionCommentId" + "\\}", apiClient.escapeString(interventionCommentId.toString()));

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

    GenericType<InterventionComment> localVarReturnType = new GenericType<InterventionComment>() {};

    return apiClient.invokeAPI("InterventionCommentsApi.getInterventionComment", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
