package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllUserSignaturesResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.UserSignature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class UserSignaturesApi {
  private ApiClient apiClient;

  public UserSignaturesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserSignaturesApi(ApiClient apiClient) {
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
   * Creating a user&#39;s signature
   * This method creates a new user’s signature. In case of success it renders the created signature, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can update users. If the user affiliated to the token has the manage_users_of_my_teams permission, the owner of the deleting signature will need to belong to at least one of the teams he’s the leader of.
   * @param userId  (required)
   * @param body The signature text (mandatory). (required)
   * @param sourceIds The signature list of source ids (multiple). Keep it empty if you don’t need to associate the signature with any sources. (optional)
   * @param language The two-letter code of the signature language. (optional)
   * @param name The signature name. (optional)
   * @return UserSignature
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public UserSignature createUserSignature(String userId, String body, List<String> sourceIds, String language, String name) throws ApiException {
    return createUserSignatureWithHttpInfo(userId, body, sourceIds, language, name).getData();
  }

  /**
   * Creating a user&#39;s signature
   * This method creates a new user’s signature. In case of success it renders the created signature, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can update users. If the user affiliated to the token has the manage_users_of_my_teams permission, the owner of the deleting signature will need to belong to at least one of the teams he’s the leader of.
   * @param userId  (required)
   * @param body The signature text (mandatory). (required)
   * @param sourceIds The signature list of source ids (multiple). Keep it empty if you don’t need to associate the signature with any sources. (optional)
   * @param language The two-letter code of the signature language. (optional)
   * @param name The signature name. (optional)
   * @return ApiResponse&lt;UserSignature&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserSignature> createUserSignatureWithHttpInfo(String userId, String body, List<String> sourceIds, String language, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling createUserSignature");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createUserSignature");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userId}/signatures"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source_ids[]", sourceIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UserSignature> localVarReturnType = new GenericType<UserSignature>() {};

    return apiClient.invokeAPI("UserSignaturesApi.createUserSignature", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deleting a user&#39;s signature
   * This method deletes the given signature. In case of success it renders the deleted signature, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can update users. If the user affiliated to the token has the manage_users_of_my_teams permission, the owner of the deleting signature will need to belong to at least one of the teams he’s the leader of.
   * @param userId  (required)
   * @param signatureId  (required)
   * @return UserSignature
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public UserSignature deleteUserSignature(String userId, String signatureId) throws ApiException {
    return deleteUserSignatureWithHttpInfo(userId, signatureId).getData();
  }

  /**
   * Deleting a user&#39;s signature
   * This method deletes the given signature. In case of success it renders the deleted signature, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can update users. If the user affiliated to the token has the manage_users_of_my_teams permission, the owner of the deleting signature will need to belong to at least one of the teams he’s the leader of.
   * @param userId  (required)
   * @param signatureId  (required)
   * @return ApiResponse&lt;UserSignature&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserSignature> deleteUserSignatureWithHttpInfo(String userId, String signatureId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUserSignature");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling deleteUserSignature");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userId}/signatures/{signatureId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

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

    GenericType<UserSignature> localVarReturnType = new GenericType<UserSignature>() {};

    return apiClient.invokeAPI("UserSignaturesApi.deleteUserSignature", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all user&#39;s signatures
   * This method renders user’s signatures ordered by creation date (descending).  Authorization​: only users that can view users. If the user affiliated to the token has the manage_users_of_my_teams permission, only the signatures of the users belonging to at least one of the teams he’s the leader of will be available.
   * @param userId  (required)
   * @return GetAllUserSignaturesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllUserSignaturesResponse getAllUserSignatures(String userId) throws ApiException {
    return getAllUserSignaturesWithHttpInfo(userId).getData();
  }

  /**
   * Getting all user&#39;s signatures
   * This method renders user’s signatures ordered by creation date (descending).  Authorization​: only users that can view users. If the user affiliated to the token has the manage_users_of_my_teams permission, only the signatures of the users belonging to at least one of the teams he’s the leader of will be available.
   * @param userId  (required)
   * @return ApiResponse&lt;GetAllUserSignaturesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllUserSignaturesResponse> getAllUserSignaturesWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getAllUserSignatures");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userId}/signatures"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<GetAllUserSignaturesResponse> localVarReturnType = new GenericType<GetAllUserSignaturesResponse>() {};

    return apiClient.invokeAPI("UserSignaturesApi.getAllUserSignatures", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a user&#39;s signature from its id
   * This method renders a user’s signature from a given id.
   * @param userId  (required)
   * @param signatureId  (required)
   * @return UserSignature
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public UserSignature getUserSignature(String userId, String signatureId) throws ApiException {
    return getUserSignatureWithHttpInfo(userId, signatureId).getData();
  }

  /**
   * Getting a user&#39;s signature from its id
   * This method renders a user’s signature from a given id.
   * @param userId  (required)
   * @param signatureId  (required)
   * @return ApiResponse&lt;UserSignature&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserSignature> getUserSignatureWithHttpInfo(String userId, String signatureId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUserSignature");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling getUserSignature");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userId}/signatures/{signatureId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

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

    GenericType<UserSignature> localVarReturnType = new GenericType<UserSignature>() {};

    return apiClient.invokeAPI("UserSignaturesApi.getUserSignature", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a user&#39;s signature
   * This method updates the user’s signature related to the provided id from given attributes. In case of success it renders the updated signature, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can update users. If the user affiliated to the token has the &#x60;manage_users_of_my_teams&#x60; permission, the updated user will need to belong to at least one of the teams he’s the leader of. The teams the user affiliated to the token is the leader of will be the only ones which can be added or removed.
   * @param userId  (required)
   * @param signatureId  (required)
   * @param body The signature text (not empty). (optional)
   * @param sourceIds The signature list of source ids (multiple). Keep it empty if you don’t need to associate the signature with any sources. (optional)
   * @param language The two-letter code of the signature language. (optional)
   * @param name The signature name. (optional)
   * @return UserSignature
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public UserSignature updateUserSignature(String userId, String signatureId, String body, List<String> sourceIds, String language, String name) throws ApiException {
    return updateUserSignatureWithHttpInfo(userId, signatureId, body, sourceIds, language, name).getData();
  }

  /**
   * Updating a user&#39;s signature
   * This method updates the user’s signature related to the provided id from given attributes. In case of success it renders the updated signature, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can update users. If the user affiliated to the token has the &#x60;manage_users_of_my_teams&#x60; permission, the updated user will need to belong to at least one of the teams he’s the leader of. The teams the user affiliated to the token is the leader of will be the only ones which can be added or removed.
   * @param userId  (required)
   * @param signatureId  (required)
   * @param body The signature text (not empty). (optional)
   * @param sourceIds The signature list of source ids (multiple). Keep it empty if you don’t need to associate the signature with any sources. (optional)
   * @param language The two-letter code of the signature language. (optional)
   * @param name The signature name. (optional)
   * @return ApiResponse&lt;UserSignature&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserSignature> updateUserSignatureWithHttpInfo(String userId, String signatureId, String body, List<String> sourceIds, String language, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUserSignature");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling updateUserSignature");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userId}/signatures/{signatureId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source_ids[]", sourceIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UserSignature> localVarReturnType = new GenericType<UserSignature>() {};

    return apiClient.invokeAPI("UserSignaturesApi.updateUserSignature", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
