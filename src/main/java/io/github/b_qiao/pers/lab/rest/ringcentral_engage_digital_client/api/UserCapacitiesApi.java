package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllUserCapacitiesResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.UserCapacity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class UserCapacitiesApi {
  private ApiClient apiClient;

  public UserCapacitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserCapacitiesApi(ApiClient apiClient) {
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
   * Creating a user capacity
   * This method creates a new user capacity. In case of success it renders the created record, otherwise, it renders an error (422 HTTP code).  Please note that the order of the parameters is important, as the &#x60;default_capacity&#x60; and &#x60;max_capacity&#x60; will apply to the immediately above &#x60;channel_id&#x60;.  Authorization​: only users who can manage topology.
   * @param name User Capacity name. (required)
   * @param channelsChannelId The id of the channel on which the capacities apply. (optional)
   * @param channelsDefaultCapacity The default capacity to apply to the related channel. (optional)
   * @param channelsMaxCapacity The maximum capacity to apply to the related channel. (optional)
   * @return UserCapacity
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public UserCapacity createUserCapacity(String name, String channelsChannelId, Integer channelsDefaultCapacity, Integer channelsMaxCapacity) throws ApiException {
    return createUserCapacityWithHttpInfo(name, channelsChannelId, channelsDefaultCapacity, channelsMaxCapacity).getData();
  }

  /**
   * Creating a user capacity
   * This method creates a new user capacity. In case of success it renders the created record, otherwise, it renders an error (422 HTTP code).  Please note that the order of the parameters is important, as the &#x60;default_capacity&#x60; and &#x60;max_capacity&#x60; will apply to the immediately above &#x60;channel_id&#x60;.  Authorization​: only users who can manage topology.
   * @param name User Capacity name. (required)
   * @param channelsChannelId The id of the channel on which the capacities apply. (optional)
   * @param channelsDefaultCapacity The default capacity to apply to the related channel. (optional)
   * @param channelsMaxCapacity The maximum capacity to apply to the related channel. (optional)
   * @return ApiResponse&lt;UserCapacity&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserCapacity> createUserCapacityWithHttpInfo(String name, String channelsChannelId, Integer channelsDefaultCapacity, Integer channelsMaxCapacity) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling createUserCapacity");
    }
    
    // create path and map variables
    String localVarPath = "/user_capacities";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "channels[][channel_id]", channelsChannelId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "channels[][default_capacity]", channelsDefaultCapacity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "channels[][max_capacity]", channelsMaxCapacity));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UserCapacity> localVarReturnType = new GenericType<UserCapacity>() {};

    return apiClient.invokeAPI("UserCapacitiesApi.createUserCapacity", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deleting a user capacity
   * This method destroys an existing user capacity. It renders the user capacity itself. It renders a 404 if id is invalid or already destroyed.  Authorization​: only users who can manage topology.
   * @param userCapacityId  (required)
   * @return UserCapacity
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public UserCapacity deleteUserCapacity(String userCapacityId) throws ApiException {
    return deleteUserCapacityWithHttpInfo(userCapacityId).getData();
  }

  /**
   * Deleting a user capacity
   * This method destroys an existing user capacity. It renders the user capacity itself. It renders a 404 if id is invalid or already destroyed.  Authorization​: only users who can manage topology.
   * @param userCapacityId  (required)
   * @return ApiResponse&lt;UserCapacity&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserCapacity> deleteUserCapacityWithHttpInfo(String userCapacityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userCapacityId' is set
    if (userCapacityId == null) {
      throw new ApiException(400, "Missing the required parameter 'userCapacityId' when calling deleteUserCapacity");
    }
    
    // create path and map variables
    String localVarPath = "/user_capacities/{userCapacityId}"
      .replaceAll("\\{" + "userCapacityId" + "\\}", apiClient.escapeString(userCapacityId.toString()));

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

    GenericType<UserCapacity> localVarReturnType = new GenericType<UserCapacity>() {};

    return apiClient.invokeAPI("UserCapacitiesApi.deleteUserCapacity", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all User Capacities
   * This method renders all user capacities ordered by creation date (ascending).  Authorization​: only users who can manage topology.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllUserCapacitiesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllUserCapacitiesResponse getAllUserCapacities(Integer offset, Integer limit) throws ApiException {
    return getAllUserCapacitiesWithHttpInfo(offset, limit).getData();
  }

  /**
   * Getting all User Capacities
   * This method renders all user capacities ordered by creation date (ascending).  Authorization​: only users who can manage topology.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllUserCapacitiesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllUserCapacitiesResponse> getAllUserCapacitiesWithHttpInfo(Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/user_capacities";

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

    GenericType<GetAllUserCapacitiesResponse> localVarReturnType = new GenericType<GetAllUserCapacitiesResponse>() {};

    return apiClient.invokeAPI("UserCapacitiesApi.getAllUserCapacities", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a user capacity from its id
   * This method renders the user capacity corresponding to the id given in parameter. It renders a 404 if id is invalid.  Authorization​: only users who can manage topology.
   * @param userCapacityId  (required)
   * @return UserCapacity
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public UserCapacity getUserCapacity(String userCapacityId) throws ApiException {
    return getUserCapacityWithHttpInfo(userCapacityId).getData();
  }

  /**
   * Getting a user capacity from its id
   * This method renders the user capacity corresponding to the id given in parameter. It renders a 404 if id is invalid.  Authorization​: only users who can manage topology.
   * @param userCapacityId  (required)
   * @return ApiResponse&lt;UserCapacity&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserCapacity> getUserCapacityWithHttpInfo(String userCapacityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userCapacityId' is set
    if (userCapacityId == null) {
      throw new ApiException(400, "Missing the required parameter 'userCapacityId' when calling getUserCapacity");
    }
    
    // create path and map variables
    String localVarPath = "/user_capacities/{userCapacityId}"
      .replaceAll("\\{" + "userCapacityId" + "\\}", apiClient.escapeString(userCapacityId.toString()));

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

    GenericType<UserCapacity> localVarReturnType = new GenericType<UserCapacity>() {};

    return apiClient.invokeAPI("UserCapacitiesApi.getUserCapacity", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a user capacity
   * This method creates a new user capacity. In case of success it renders the created record, otherwise, it renders an error (422 HTTP code).  Please note that the order of the parameters is important, as the &#x60;default_capacity&#x60; and &#x60;max_capacity&#x60; will apply to the immediately above &#x60;channel_id&#x60;.  Authorization​: only users who can manage topology.
   * @param userCapacityId  (required)
   * @param name User Capacity name. (optional)
   * @param channelsChannelId The id of the channel on which the capacities apply. (optional)
   * @param channelsDefaultCapacity The default capacity to apply to the related channel. (optional)
   * @param channelsMaxCapacity The maximum capacity to apply to the related channel. (optional)
   * @return UserCapacity
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public UserCapacity updateUserCapacity(String userCapacityId, String name, String channelsChannelId, Integer channelsDefaultCapacity, Integer channelsMaxCapacity) throws ApiException {
    return updateUserCapacityWithHttpInfo(userCapacityId, name, channelsChannelId, channelsDefaultCapacity, channelsMaxCapacity).getData();
  }

  /**
   * Updating a user capacity
   * This method creates a new user capacity. In case of success it renders the created record, otherwise, it renders an error (422 HTTP code).  Please note that the order of the parameters is important, as the &#x60;default_capacity&#x60; and &#x60;max_capacity&#x60; will apply to the immediately above &#x60;channel_id&#x60;.  Authorization​: only users who can manage topology.
   * @param userCapacityId  (required)
   * @param name User Capacity name. (optional)
   * @param channelsChannelId The id of the channel on which the capacities apply. (optional)
   * @param channelsDefaultCapacity The default capacity to apply to the related channel. (optional)
   * @param channelsMaxCapacity The maximum capacity to apply to the related channel. (optional)
   * @return ApiResponse&lt;UserCapacity&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserCapacity> updateUserCapacityWithHttpInfo(String userCapacityId, String name, String channelsChannelId, Integer channelsDefaultCapacity, Integer channelsMaxCapacity) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userCapacityId' is set
    if (userCapacityId == null) {
      throw new ApiException(400, "Missing the required parameter 'userCapacityId' when calling updateUserCapacity");
    }
    
    // create path and map variables
    String localVarPath = "/user_capacities/{userCapacityId}"
      .replaceAll("\\{" + "userCapacityId" + "\\}", apiClient.escapeString(userCapacityId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "channels[][channel_id]", channelsChannelId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "channels[][default_capacity]", channelsDefaultCapacity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "channels[][max_capacity]", channelsMaxCapacity));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UserCapacity> localVarReturnType = new GenericType<UserCapacity>() {};

    return apiClient.invokeAPI("UserCapacitiesApi.updateUserCapacity", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
