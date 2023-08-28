package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllInterventionsResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Intervention;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class InterventionsApi {
  private ApiClient apiClient;

  public InterventionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InterventionsApi(ApiClient apiClient) {
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
   * Cancelling an intervention
   * This method cancels (destroys) an intervention. It renders intervention itself. If token’s user does not have “read” on intervention’s source a 404 HTTP response will be returned.  Caveats:  * If the intervention is already being canceled, it will return a 409 error. * To be able to close an intervention, it must meet the following criteria otherwise a 403 will be raised:   * Intervention MUST NOT already be closed  * Intervention MUST NOT have agent replies   * Access-Token agent MUST have read access on the source  Authorization​: no, but it renders an error if intervention can’t be destroyed (see caveats).
   * @param interventionId  (required)
   * @return Intervention
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Intervention cancelIntervention(String interventionId) throws ApiException {
    return cancelInterventionWithHttpInfo(interventionId).getData();
  }

  /**
   * Cancelling an intervention
   * This method cancels (destroys) an intervention. It renders intervention itself. If token’s user does not have “read” on intervention’s source a 404 HTTP response will be returned.  Caveats:  * If the intervention is already being canceled, it will return a 409 error. * To be able to close an intervention, it must meet the following criteria otherwise a 403 will be raised:   * Intervention MUST NOT already be closed  * Intervention MUST NOT have agent replies   * Access-Token agent MUST have read access on the source  Authorization​: no, but it renders an error if intervention can’t be destroyed (see caveats).
   * @param interventionId  (required)
   * @return ApiResponse&lt;Intervention&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Intervention> cancelInterventionWithHttpInfo(String interventionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'interventionId' is set
    if (interventionId == null) {
      throw new ApiException(400, "Missing the required parameter 'interventionId' when calling cancelIntervention");
    }
    
    // create path and map variables
    String localVarPath = "/interventions/{interventionId}/cancel"
      .replaceAll("\\{" + "interventionId" + "\\}", apiClient.escapeString(interventionId.toString()));

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

    GenericType<Intervention> localVarReturnType = new GenericType<Intervention>() {};

    return apiClient.invokeAPI("InterventionsApi.cancelIntervention", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Categorizing an intervention
   * This method updates the categories of an intervention. If token’s user does not have “read” on the intervention’s source a 404 HTTP response will be returned.  Authorization​: no.
   * @param interventionId  (required)
   * @param categoryIds  (required)
   * @return Intervention
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Intervention categorizeIntervention(String interventionId, List<String> categoryIds) throws ApiException {
    return categorizeInterventionWithHttpInfo(interventionId, categoryIds).getData();
  }

  /**
   * Categorizing an intervention
   * This method updates the categories of an intervention. If token’s user does not have “read” on the intervention’s source a 404 HTTP response will be returned.  Authorization​: no.
   * @param interventionId  (required)
   * @param categoryIds  (required)
   * @return ApiResponse&lt;Intervention&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Intervention> categorizeInterventionWithHttpInfo(String interventionId, List<String> categoryIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'interventionId' is set
    if (interventionId == null) {
      throw new ApiException(400, "Missing the required parameter 'interventionId' when calling categorizeIntervention");
    }
    
    // verify the required parameter 'categoryIds' is set
    if (categoryIds == null) {
      throw new ApiException(400, "Missing the required parameter 'categoryIds' when calling categorizeIntervention");
    }
    
    // create path and map variables
    String localVarPath = "/interventions/{interventionId}/update_categories"
      .replaceAll("\\{" + "interventionId" + "\\}", apiClient.escapeString(interventionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "category_ids[]", categoryIds));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Intervention> localVarReturnType = new GenericType<Intervention>() {};

    return apiClient.invokeAPI("InterventionsApi.categorizeIntervention", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Closing an intervention
   * This method closes an intervention. Caveats:  * If the intervention is already being closed, it will return a 409 error. * To be able to close an intervention, it must meet the following criteria otherwise a 403 will be raised:    * Intervention MUST NOT already be closed    * Intervention MUST have agent replies   * Access-Token agent MUST be the owner of the intervention or have the permission to edit permissions    * Access-Token agent MUST have read access on the source  Authorization​: no, but it renders an error if intervention can’t be closed (see caveats)
   * @param interventionId  (required)
   * @return Intervention
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> If the intervention is already being closed, it will return a 409 error. </td><td>  -  </td></tr>
     </table>
   */
  public Intervention closeIntervention(String interventionId) throws ApiException {
    return closeInterventionWithHttpInfo(interventionId).getData();
  }

  /**
   * Closing an intervention
   * This method closes an intervention. Caveats:  * If the intervention is already being closed, it will return a 409 error. * To be able to close an intervention, it must meet the following criteria otherwise a 403 will be raised:    * Intervention MUST NOT already be closed    * Intervention MUST have agent replies   * Access-Token agent MUST be the owner of the intervention or have the permission to edit permissions    * Access-Token agent MUST have read access on the source  Authorization​: no, but it renders an error if intervention can’t be closed (see caveats)
   * @param interventionId  (required)
   * @return ApiResponse&lt;Intervention&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> If the intervention is already being closed, it will return a 409 error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Intervention> closeInterventionWithHttpInfo(String interventionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'interventionId' is set
    if (interventionId == null) {
      throw new ApiException(400, "Missing the required parameter 'interventionId' when calling closeIntervention");
    }
    
    // create path and map variables
    String localVarPath = "/interventions/{interventionId}/close"
      .replaceAll("\\{" + "interventionId" + "\\}", apiClient.escapeString(interventionId.toString()));

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

    GenericType<Intervention> localVarReturnType = new GenericType<Intervention>() {};

    return apiClient.invokeAPI("InterventionsApi.closeIntervention", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Creating an intervention
   * This method creates a new intervention or reopen it. In case of success it renders the intervention, otherwise, it renders an error (422 HTTP code). This method opens intervention as access token’s user.  Authorization​: no, but it renders an error if intervention can’t be created or reopened (already opened, etc.).
   * @param contentId The content to create intervention on (mandatory). (required)
   * @return Intervention
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public Intervention createIntervention(String contentId) throws ApiException {
    return createInterventionWithHttpInfo(contentId).getData();
  }

  /**
   * Creating an intervention
   * This method creates a new intervention or reopen it. In case of success it renders the intervention, otherwise, it renders an error (422 HTTP code). This method opens intervention as access token’s user.  Authorization​: no, but it renders an error if intervention can’t be created or reopened (already opened, etc.).
   * @param contentId The content to create intervention on (mandatory). (required)
   * @return ApiResponse&lt;Intervention&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Intervention> createInterventionWithHttpInfo(String contentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contentId' is set
    if (contentId == null) {
      throw new ApiException(400, "Missing the required parameter 'contentId' when calling createIntervention");
    }
    
    // create path and map variables
    String localVarPath = "/interventions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "content_id", contentId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Intervention> localVarReturnType = new GenericType<Intervention>() {};

    return apiClient.invokeAPI("InterventionsApi.createIntervention", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all interventions
   * This method renders interventions ordered by creation date (descending). Only interventions in sources where token’s user has “read” permission are returned.  Authorization​: no.
   * @param threadId To filter interventions on given thread id. (optional)
   * @param userId To filter interventions on given user id. (optional)
   * @param identityGroupId To filter interventions on given identity_group_id. This will return interventions associated to any identity in the indentity_group. (optional)
   * @param identityId To filter interventions on given identity_id(s). Can be a single value or an array of string. (optional)
   * @param sort To change the criteria chosen to sort the interventions. The value can be “created_at” or “updated_at”. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllInterventionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllInterventionsResponse getAllInterventions(String threadId, String userId, String identityGroupId, String identityId, String sort, Integer offset, Integer limit) throws ApiException {
    return getAllInterventionsWithHttpInfo(threadId, userId, identityGroupId, identityId, sort, offset, limit).getData();
  }

  /**
   * Getting all interventions
   * This method renders interventions ordered by creation date (descending). Only interventions in sources where token’s user has “read” permission are returned.  Authorization​: no.
   * @param threadId To filter interventions on given thread id. (optional)
   * @param userId To filter interventions on given user id. (optional)
   * @param identityGroupId To filter interventions on given identity_group_id. This will return interventions associated to any identity in the indentity_group. (optional)
   * @param identityId To filter interventions on given identity_id(s). Can be a single value or an array of string. (optional)
   * @param sort To change the criteria chosen to sort the interventions. The value can be “created_at” or “updated_at”. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllInterventionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllInterventionsResponse> getAllInterventionsWithHttpInfo(String threadId, String userId, String identityGroupId, String identityId, String sort, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/interventions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "thread_id", threadId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identity_group_id", identityGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identity_id", identityId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
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

    GenericType<GetAllInterventionsResponse> localVarReturnType = new GenericType<GetAllInterventionsResponse>() {};

    return apiClient.invokeAPI("InterventionsApi.getAllInterventions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting an intervention from its id
   * This method renders an intervention from given id. If token’s user does not have “read” on intervention’s source a 404 HTTP response will be returned.  Authorization​: no.
   * @param interventionId  (required)
   * @return Intervention
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Intervention getIntervention(String interventionId) throws ApiException {
    return getInterventionWithHttpInfo(interventionId).getData();
  }

  /**
   * Getting an intervention from its id
   * This method renders an intervention from given id. If token’s user does not have “read” on intervention’s source a 404 HTTP response will be returned.  Authorization​: no.
   * @param interventionId  (required)
   * @return ApiResponse&lt;Intervention&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Intervention> getInterventionWithHttpInfo(String interventionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'interventionId' is set
    if (interventionId == null) {
      throw new ApiException(400, "Missing the required parameter 'interventionId' when calling getIntervention");
    }
    
    // create path and map variables
    String localVarPath = "/interventions/{interventionId}"
      .replaceAll("\\{" + "interventionId" + "\\}", apiClient.escapeString(interventionId.toString()));

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

    GenericType<Intervention> localVarReturnType = new GenericType<Intervention>() {};

    return apiClient.invokeAPI("InterventionsApi.getIntervention", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Reassigning an intervention
   * This method updates the user in charge of the intervention  Authorization​: Only users who can update interventions.
   * @param interventionId  (required)
   * @param userId  (required)
   * @return Intervention
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Intervention reassignIntervention(String interventionId, String userId) throws ApiException {
    return reassignInterventionWithHttpInfo(interventionId, userId).getData();
  }

  /**
   * Reassigning an intervention
   * This method updates the user in charge of the intervention  Authorization​: Only users who can update interventions.
   * @param interventionId  (required)
   * @param userId  (required)
   * @return ApiResponse&lt;Intervention&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Intervention> reassignInterventionWithHttpInfo(String interventionId, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'interventionId' is set
    if (interventionId == null) {
      throw new ApiException(400, "Missing the required parameter 'interventionId' when calling reassignIntervention");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling reassignIntervention");
    }
    
    // create path and map variables
    String localVarPath = "/interventions/{interventionId}/reassign"
      .replaceAll("\\{" + "interventionId" + "\\}", apiClient.escapeString(interventionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Intervention> localVarReturnType = new GenericType<Intervention>() {};

    return apiClient.invokeAPI("InterventionsApi.reassignIntervention", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating an intervention from its id
   * This method updates intervention from given attributes and renders it in case of success.  Authorization​: no.
   * @param interventionId  (required)
   * @param customFieldValuesCustomFieldKey Intervention custom field with key \&quot;custom_field_key\&quot;. It can be multiple if custom field is multiple or is has multiple_choice type. (optional)
   * @return Intervention
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Intervention updateIntervention(String interventionId, String customFieldValuesCustomFieldKey) throws ApiException {
    return updateInterventionWithHttpInfo(interventionId, customFieldValuesCustomFieldKey).getData();
  }

  /**
   * Updating an intervention from its id
   * This method updates intervention from given attributes and renders it in case of success.  Authorization​: no.
   * @param interventionId  (required)
   * @param customFieldValuesCustomFieldKey Intervention custom field with key \&quot;custom_field_key\&quot;. It can be multiple if custom field is multiple or is has multiple_choice type. (optional)
   * @return ApiResponse&lt;Intervention&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Intervention> updateInterventionWithHttpInfo(String interventionId, String customFieldValuesCustomFieldKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'interventionId' is set
    if (interventionId == null) {
      throw new ApiException(400, "Missing the required parameter 'interventionId' when calling updateIntervention");
    }
    
    // create path and map variables
    String localVarPath = "/interventions/{interventionId}"
      .replaceAll("\\{" + "interventionId" + "\\}", apiClient.escapeString(interventionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_field_values[custom_field_key]", customFieldValuesCustomFieldKey));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Intervention> localVarReturnType = new GenericType<Intervention>() {};

    return apiClient.invokeAPI("InterventionsApi.updateIntervention", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
