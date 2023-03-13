package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllIdentitiesResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Identity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class IdentitiesApi {
  private ApiClient apiClient;

  public IdentitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IdentitiesApi(ApiClient apiClient) {
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
   * Getting all identities
   * This method renders identities ordered by creation date (descending). Only identities in sources where token’s user has “read” permission are returned.
   * @param communityId To filter identities on given community id. (optional)
   * @param identityGroupId To filter on given group id. (optional)
   * @param userId To filter identities on given user id. (optional)
   * @param sort To change the criteria chosen to sort the identities. The value can be “created_at” or (optional)
   * @param foreignId To filter identities on given user id (optional)
   * @param uuid To filter identities on given uuid (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllIdentitiesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllIdentitiesResponse getAllIdentities(String communityId, String identityGroupId, String userId, String sort, String foreignId, String uuid, Integer offset, Integer limit) throws ApiException {
    return getAllIdentitiesWithHttpInfo(communityId, identityGroupId, userId, sort, foreignId, uuid, offset, limit).getData();
  }

  /**
   * Getting all identities
   * This method renders identities ordered by creation date (descending). Only identities in sources where token’s user has “read” permission are returned.
   * @param communityId To filter identities on given community id. (optional)
   * @param identityGroupId To filter on given group id. (optional)
   * @param userId To filter identities on given user id. (optional)
   * @param sort To change the criteria chosen to sort the identities. The value can be “created_at” or (optional)
   * @param foreignId To filter identities on given user id (optional)
   * @param uuid To filter identities on given uuid (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllIdentitiesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllIdentitiesResponse> getAllIdentitiesWithHttpInfo(String communityId, String identityGroupId, String userId, String sort, String foreignId, String uuid, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/identities";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "community_id", communityId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identity_group_id", identityGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "foreign_id", foreignId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "uuid", uuid));
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

    GenericType<GetAllIdentitiesResponse> localVarReturnType = new GenericType<GetAllIdentitiesResponse>() {};

    return apiClient.invokeAPI("IdentitiesApi.getAllIdentities", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting an identity from its id
   * This method renders an identity from given id. If token’s user does not have “read” on identity’s source community a 404 HTTP response will be returned.
   * @param identityId  (required)
   * @return Identity
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Identity getIdentity(String identityId) throws ApiException {
    return getIdentityWithHttpInfo(identityId).getData();
  }

  /**
   * Getting an identity from its id
   * This method renders an identity from given id. If token’s user does not have “read” on identity’s source community a 404 HTTP response will be returned.
   * @param identityId  (required)
   * @return ApiResponse&lt;Identity&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Identity> getIdentityWithHttpInfo(String identityId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identityId' is set
    if (identityId == null) {
      throw new ApiException(400, "Missing the required parameter 'identityId' when calling getIdentity");
    }
    
    // create path and map variables
    String localVarPath = "/identities/{identityId}"
      .replaceAll("\\{" + "identityId" + "\\}", apiClient.escapeString(identityId.toString()));

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

    GenericType<Identity> localVarReturnType = new GenericType<Identity>() {};

    return apiClient.invokeAPI("IdentitiesApi.getIdentity", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
