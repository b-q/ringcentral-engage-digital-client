package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllPresenceStatusResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.PresenceStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class PresenceStatusApi {
  private ApiClient apiClient;

  public PresenceStatusApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PresenceStatusApi(ApiClient apiClient) {
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
   * Creating a presence status
   * This method creates a presence status. In case of success it renders the presence status, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that have the right to monitor the task view.
   * @param name The name of the presence status. (required)
   * @return PresenceStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public PresenceStatus createPresenceStatus(String name) throws ApiException {
    return createPresenceStatusWithHttpInfo(name).getData();
  }

  /**
   * Creating a presence status
   * This method creates a presence status. In case of success it renders the presence status, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that have the right to monitor the task view.
   * @param name The name of the presence status. (required)
   * @return ApiResponse&lt;PresenceStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PresenceStatus> createPresenceStatusWithHttpInfo(String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling createPresenceStatus");
    }
    
    // create path and map variables
    String localVarPath = "/presence_status";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PresenceStatus> localVarReturnType = new GenericType<PresenceStatus>() {};

    return apiClient.invokeAPI("PresenceStatusApi.createPresenceStatus", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deleting a presence status
   * This method destroys an existing presence status. It renders presence status itself. It renders a 404 if id is invalid.  Authorization​: only users that have the right to monitor the task view.
   * @param presenceStatusId  (required)
   * @return PresenceStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public PresenceStatus deletePresenceStatus(String presenceStatusId) throws ApiException {
    return deletePresenceStatusWithHttpInfo(presenceStatusId).getData();
  }

  /**
   * Deleting a presence status
   * This method destroys an existing presence status. It renders presence status itself. It renders a 404 if id is invalid.  Authorization​: only users that have the right to monitor the task view.
   * @param presenceStatusId  (required)
   * @return ApiResponse&lt;PresenceStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PresenceStatus> deletePresenceStatusWithHttpInfo(String presenceStatusId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'presenceStatusId' is set
    if (presenceStatusId == null) {
      throw new ApiException(400, "Missing the required parameter 'presenceStatusId' when calling deletePresenceStatus");
    }
    
    // create path and map variables
    String localVarPath = "/presence_status/{presenceStatusId}"
      .replaceAll("\\{" + "presenceStatusId" + "\\}", apiClient.escapeString(presenceStatusId.toString()));

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

    GenericType<PresenceStatus> localVarReturnType = new GenericType<PresenceStatus>() {};

    return apiClient.invokeAPI("PresenceStatusApi.deletePresenceStatus", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all presence statuses
   * This method renders all presence statuses ordered by name (in alphabetical order).
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllPresenceStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllPresenceStatusResponse getAllPresenceStatus(Integer offset, Integer limit) throws ApiException {
    return getAllPresenceStatusWithHttpInfo(offset, limit).getData();
  }

  /**
   * Getting all presence statuses
   * This method renders all presence statuses ordered by name (in alphabetical order).
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllPresenceStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllPresenceStatusResponse> getAllPresenceStatusWithHttpInfo(Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/presence_status";

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

    GenericType<GetAllPresenceStatusResponse> localVarReturnType = new GenericType<GetAllPresenceStatusResponse>() {};

    return apiClient.invokeAPI("PresenceStatusApi.getAllPresenceStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a presence status from its id
   * This method renders a presence status from given id.  Authorization​: only users that have the right to monitor the task view.
   * @param presenceStatusId  (required)
   * @return PresenceStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public PresenceStatus getPresenceStatus(String presenceStatusId) throws ApiException {
    return getPresenceStatusWithHttpInfo(presenceStatusId).getData();
  }

  /**
   * Getting a presence status from its id
   * This method renders a presence status from given id.  Authorization​: only users that have the right to monitor the task view.
   * @param presenceStatusId  (required)
   * @return ApiResponse&lt;PresenceStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PresenceStatus> getPresenceStatusWithHttpInfo(String presenceStatusId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'presenceStatusId' is set
    if (presenceStatusId == null) {
      throw new ApiException(400, "Missing the required parameter 'presenceStatusId' when calling getPresenceStatus");
    }
    
    // create path and map variables
    String localVarPath = "/presence_status/{presenceStatusId}"
      .replaceAll("\\{" + "presenceStatusId" + "\\}", apiClient.escapeString(presenceStatusId.toString()));

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

    GenericType<PresenceStatus> localVarReturnType = new GenericType<PresenceStatus>() {};

    return apiClient.invokeAPI("PresenceStatusApi.getPresenceStatus", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a presence status
   * This method updates an existing presence status from given attributes and renders it in case of success.  Authorization​: only users that have the right to monitor the task view.
   * @param presenceStatusId  (required)
   * @param name The name of the presence status. (required)
   * @return PresenceStatus
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public PresenceStatus updatePresenceStatus(String presenceStatusId, String name) throws ApiException {
    return updatePresenceStatusWithHttpInfo(presenceStatusId, name).getData();
  }

  /**
   * Updating a presence status
   * This method updates an existing presence status from given attributes and renders it in case of success.  Authorization​: only users that have the right to monitor the task view.
   * @param presenceStatusId  (required)
   * @param name The name of the presence status. (required)
   * @return ApiResponse&lt;PresenceStatus&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PresenceStatus> updatePresenceStatusWithHttpInfo(String presenceStatusId, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'presenceStatusId' is set
    if (presenceStatusId == null) {
      throw new ApiException(400, "Missing the required parameter 'presenceStatusId' when calling updatePresenceStatus");
    }
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling updatePresenceStatus");
    }
    
    // create path and map variables
    String localVarPath = "/presence_status/{presenceStatusId}"
      .replaceAll("\\{" + "presenceStatusId" + "\\}", apiClient.escapeString(presenceStatusId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PresenceStatus> localVarReturnType = new GenericType<PresenceStatus>() {};

    return apiClient.invokeAPI("PresenceStatusApi.updatePresenceStatus", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
