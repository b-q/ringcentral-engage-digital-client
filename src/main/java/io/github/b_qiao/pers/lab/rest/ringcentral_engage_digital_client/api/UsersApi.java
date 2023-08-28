package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllUsersResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
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
   * Creating a user
   * This method creates a new user. In case of success it renders the created user, otherwise, it renders an error (422 HTTP code).
   * @param email User email (mandatory). (required)
   * @param firstname User firstname (mandatory). (required)
   * @param lastname User lastname (mandatory). (required)
   * @param password User plain password (mandatory). (required)
   * @param roleId User role id (mandatory). (required)
   * @param categoryIds User list of category ids (multiple). (optional)
   * @param enabled Whether the user is enabled or not (boolean). (optional)
   * @param externalId User external id, used for SSO. (optional)
   * @param gender User gender (\&quot;man\&quot; or \&quot;woman\&quot;). (optional)
   * @param identityIds User list of identity ids (multiple). (optional)
   * @param locale Language for the user interface. (optional)
   * @param nickname User nickname. (optional)
   * @param teamIds User list of team ids (multiple). (optional)
   * @param timezone Use the timezone endpoint to get the timezone name (String), default is empty for domain timezone. (optional)
   * @param spokenLanguages List of locales corresponding to the languages spoken by the user (multiple). (optional)
   * @param noPassword Whether the user is passwordless or not (boolean). Must be used with the corresponding SSO configuration. (optional)
   * @return User
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public User createUser(String email, String firstname, String lastname, String password, String roleId, List<String> categoryIds, Boolean enabled, String externalId, String gender, List<String> identityIds, String locale, String nickname, List<String> teamIds, String timezone, List<String> spokenLanguages, Boolean noPassword) throws ApiException {
    return createUserWithHttpInfo(email, firstname, lastname, password, roleId, categoryIds, enabled, externalId, gender, identityIds, locale, nickname, teamIds, timezone, spokenLanguages, noPassword).getData();
  }

  /**
   * Creating a user
   * This method creates a new user. In case of success it renders the created user, otherwise, it renders an error (422 HTTP code).
   * @param email User email (mandatory). (required)
   * @param firstname User firstname (mandatory). (required)
   * @param lastname User lastname (mandatory). (required)
   * @param password User plain password (mandatory). (required)
   * @param roleId User role id (mandatory). (required)
   * @param categoryIds User list of category ids (multiple). (optional)
   * @param enabled Whether the user is enabled or not (boolean). (optional)
   * @param externalId User external id, used for SSO. (optional)
   * @param gender User gender (\&quot;man\&quot; or \&quot;woman\&quot;). (optional)
   * @param identityIds User list of identity ids (multiple). (optional)
   * @param locale Language for the user interface. (optional)
   * @param nickname User nickname. (optional)
   * @param teamIds User list of team ids (multiple). (optional)
   * @param timezone Use the timezone endpoint to get the timezone name (String), default is empty for domain timezone. (optional)
   * @param spokenLanguages List of locales corresponding to the languages spoken by the user (multiple). (optional)
   * @param noPassword Whether the user is passwordless or not (boolean). Must be used with the corresponding SSO configuration. (optional)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<User> createUserWithHttpInfo(String email, String firstname, String lastname, String password, String roleId, List<String> categoryIds, Boolean enabled, String externalId, String gender, List<String> identityIds, String locale, String nickname, List<String> teamIds, String timezone, List<String> spokenLanguages, Boolean noPassword) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling createUser");
    }
    
    // verify the required parameter 'firstname' is set
    if (firstname == null) {
      throw new ApiException(400, "Missing the required parameter 'firstname' when calling createUser");
    }
    
    // verify the required parameter 'lastname' is set
    if (lastname == null) {
      throw new ApiException(400, "Missing the required parameter 'lastname' when calling createUser");
    }
    
    // verify the required parameter 'password' is set
    if (password == null) {
      throw new ApiException(400, "Missing the required parameter 'password' when calling createUser");
    }
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling createUser");
    }
    
    // create path and map variables
    String localVarPath = "/users";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "category_ids[]", categoryIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enabled", enabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "external_id", externalId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstname", firstname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gender", gender));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "identity_ids[]", identityIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastname", lastname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nickname", nickname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role_id", roleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "team_ids[]", teamIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timezone", timezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "spoken_languages[]", spokenLanguages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "no_password", noPassword));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};

    return apiClient.invokeAPI("UsersApi.createUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deleting a user
   * This method deletes the given user. In case of success it renders the deleted user, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can update users. The user affiliated to the token must have at least all the permissions of the other user. If the user affiliated to the token has the manage_users_of_my_teams permission, the deleted user will need to belong to at least one of the teams he’s the leader of.
   * @param userId  (required)
   * @return User
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public User deleteUser(String userId) throws ApiException {
    return deleteUserWithHttpInfo(userId).getData();
  }

  /**
   * Deleting a user
   * This method deletes the given user. In case of success it renders the deleted user, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can update users. The user affiliated to the token must have at least all the permissions of the other user. If the user affiliated to the token has the manage_users_of_my_teams permission, the deleted user will need to belong to at least one of the teams he’s the leader of.
   * @param userId  (required)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<User> deleteUserWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deleteUser");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userId}"
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

    GenericType<User> localVarReturnType = new GenericType<User>() {};

    return apiClient.invokeAPI("UsersApi.deleteUser", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all users
   * This method renders users ordered by creation date (descending).  Authorization​: only users that can view users. If the user affiliated to the token has the manage_users_of_my_teams permission, only the users belonging to at least one of the teams he’s the leader of will be returned.
   * @param email To filter users on given email. (optional)
   * @param categoryId To filter users on given category id. (optional)
   * @param identityId To filter users on given identity id. (optional)
   * @param externalId To filter users on given external id. (optional)
   * @param roleId To filter users on given role id. (optional)
   * @param teamId To filter users on given team id. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllUsersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllUsersResponse getAllUsers(String email, String categoryId, String identityId, String externalId, String roleId, String teamId, Integer offset, Integer limit) throws ApiException {
    return getAllUsersWithHttpInfo(email, categoryId, identityId, externalId, roleId, teamId, offset, limit).getData();
  }

  /**
   * Getting all users
   * This method renders users ordered by creation date (descending).  Authorization​: only users that can view users. If the user affiliated to the token has the manage_users_of_my_teams permission, only the users belonging to at least one of the teams he’s the leader of will be returned.
   * @param email To filter users on given email. (optional)
   * @param categoryId To filter users on given category id. (optional)
   * @param identityId To filter users on given identity id. (optional)
   * @param externalId To filter users on given external id. (optional)
   * @param roleId To filter users on given role id. (optional)
   * @param teamId To filter users on given team id. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllUsersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllUsersResponse> getAllUsersWithHttpInfo(String email, String categoryId, String identityId, String externalId, String roleId, String teamId, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/users";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "category_id", categoryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identity_id", identityId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "external_id", externalId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role_id", roleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "team_id", teamId));
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

    GenericType<GetAllUsersResponse> localVarReturnType = new GenericType<GetAllUsersResponse>() {};

    return apiClient.invokeAPI("UsersApi.getAllUsers", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a user from its id
   * This method renders a user from given id.
   * @param userId  (required)
   * @return User
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public User getUser(String userId) throws ApiException {
    return getUserWithHttpInfo(userId).getData();
  }

  /**
   * Getting a user from its id
   * This method renders a user from given id.
   * @param userId  (required)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<User> getUserWithHttpInfo(String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getUser");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userId}"
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

    GenericType<User> localVarReturnType = new GenericType<User>() {};

    return apiClient.invokeAPI("UsersApi.getUser", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Inviting a user
   * This method invites a new user. In case of success it renders the created user, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can invite other users. If the user affiliated to the token has the manage_users_of_my_teams permission, the invited user will need to belong to at least one of the teams he’s the leader of. It will not be possible to assign the user to other teams.
   * @param email User email (mandatory). (required)
   * @param firstname User firstname (mandatory). (required)
   * @param lastname User lastname (mandatory). (required)
   * @param roleId User role id (mandatory). (required)
   * @param categoryIds User list of category ids (multiple). (optional)
   * @param enabled Whether the user is enabled or not (boolean). (optional)
   * @param externalId User external id. (optional)
   * @param gender User gender (\&quot;man\&quot; or \&quot;woman\&quot;). (optional)
   * @param identityIds User list of identity ids (multiple). (optional)
   * @param locale Language for the user interface. (optional)
   * @param nickname User nickname. (optional)
   * @param teamIds User list of team ids (multiple). (optional)
   * @param timezone Use the timezone endpoint to get the timezone name (String), default is empty for (optional)
   * @param spokenLanguages List of locales corresponding to the languages spoken by the user (multiple). (optional)
   * @return User
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public User inviteUser(String email, String firstname, String lastname, String roleId, List<String> categoryIds, Boolean enabled, String externalId, String gender, List<String> identityIds, String locale, String nickname, List<String> teamIds, String timezone, List<String> spokenLanguages) throws ApiException {
    return inviteUserWithHttpInfo(email, firstname, lastname, roleId, categoryIds, enabled, externalId, gender, identityIds, locale, nickname, teamIds, timezone, spokenLanguages).getData();
  }

  /**
   * Inviting a user
   * This method invites a new user. In case of success it renders the created user, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can invite other users. If the user affiliated to the token has the manage_users_of_my_teams permission, the invited user will need to belong to at least one of the teams he’s the leader of. It will not be possible to assign the user to other teams.
   * @param email User email (mandatory). (required)
   * @param firstname User firstname (mandatory). (required)
   * @param lastname User lastname (mandatory). (required)
   * @param roleId User role id (mandatory). (required)
   * @param categoryIds User list of category ids (multiple). (optional)
   * @param enabled Whether the user is enabled or not (boolean). (optional)
   * @param externalId User external id. (optional)
   * @param gender User gender (\&quot;man\&quot; or \&quot;woman\&quot;). (optional)
   * @param identityIds User list of identity ids (multiple). (optional)
   * @param locale Language for the user interface. (optional)
   * @param nickname User nickname. (optional)
   * @param teamIds User list of team ids (multiple). (optional)
   * @param timezone Use the timezone endpoint to get the timezone name (String), default is empty for (optional)
   * @param spokenLanguages List of locales corresponding to the languages spoken by the user (multiple). (optional)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<User> inviteUserWithHttpInfo(String email, String firstname, String lastname, String roleId, List<String> categoryIds, Boolean enabled, String externalId, String gender, List<String> identityIds, String locale, String nickname, List<String> teamIds, String timezone, List<String> spokenLanguages) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling inviteUser");
    }
    
    // verify the required parameter 'firstname' is set
    if (firstname == null) {
      throw new ApiException(400, "Missing the required parameter 'firstname' when calling inviteUser");
    }
    
    // verify the required parameter 'lastname' is set
    if (lastname == null) {
      throw new ApiException(400, "Missing the required parameter 'lastname' when calling inviteUser");
    }
    
    // verify the required parameter 'roleId' is set
    if (roleId == null) {
      throw new ApiException(400, "Missing the required parameter 'roleId' when calling inviteUser");
    }
    
    // create path and map variables
    String localVarPath = "/users/invite";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "category_ids[]", categoryIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enabled", enabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "external_id", externalId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstname", firstname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gender", gender));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "identity_ids[]", identityIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastname", lastname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nickname", nickname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role_id", roleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "team_ids[]", teamIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timezone", timezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "spoken_languages[]", spokenLanguages));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};

    return apiClient.invokeAPI("UsersApi.inviteUser", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a user
   * This method updates users from given attributes and renders it in case of success.  Authorization​: only users that can update users. If the user affiliated to the token has the &#x60;manage_users_of_my_teams&#x60; permission, the updated user will need to belong to at least one of the teams he’s the leader of. The teams the user affiliated to the token is the leader of will be the only ones which can be added or removed.
   * @param userId  (required)
   * @param categoryIds User list of category ids (multiple). (optional)
   * @param email User email. (optional)
   * @param enabled Whether the user is enabled or not (boolean). (optional)
   * @param externalId User external id, used for SSO. (optional)
   * @param firstname User firstname. (optional)
   * @param gender User gender (\&quot;man\&quot; or \&quot;woman\&quot;). (optional)
   * @param identityIds User list of identity ids (multiple). (optional)
   * @param lastname User lastname. (optional)
   * @param locale Language for the user interface. (optional)
   * @param nickname User nickname. (optional)
   * @param password User plain password. (optional)
   * @param roleId User role id. (optional)
   * @param teamIds User list of team ids (multiple). (optional)
   * @param timezone Use the timezone endpoint to get the timezone name (String), default is empty for domain timezone. (optional)
   * @param spokenLanguages List of locales corresponding to the languages spoken by the user (multiple). (optional)
   * @param noPassword Whether the user is passwordless or not (boolean). Must be used with the corresponding SSO configuration. (optional)
   * @return User
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public User updateUser(String userId, List<String> categoryIds, String email, Boolean enabled, String externalId, String firstname, String gender, List<String> identityIds, String lastname, String locale, String nickname, String password, String roleId, List<String> teamIds, String timezone, List<String> spokenLanguages, Boolean noPassword) throws ApiException {
    return updateUserWithHttpInfo(userId, categoryIds, email, enabled, externalId, firstname, gender, identityIds, lastname, locale, nickname, password, roleId, teamIds, timezone, spokenLanguages, noPassword).getData();
  }

  /**
   * Updating a user
   * This method updates users from given attributes and renders it in case of success.  Authorization​: only users that can update users. If the user affiliated to the token has the &#x60;manage_users_of_my_teams&#x60; permission, the updated user will need to belong to at least one of the teams he’s the leader of. The teams the user affiliated to the token is the leader of will be the only ones which can be added or removed.
   * @param userId  (required)
   * @param categoryIds User list of category ids (multiple). (optional)
   * @param email User email. (optional)
   * @param enabled Whether the user is enabled or not (boolean). (optional)
   * @param externalId User external id, used for SSO. (optional)
   * @param firstname User firstname. (optional)
   * @param gender User gender (\&quot;man\&quot; or \&quot;woman\&quot;). (optional)
   * @param identityIds User list of identity ids (multiple). (optional)
   * @param lastname User lastname. (optional)
   * @param locale Language for the user interface. (optional)
   * @param nickname User nickname. (optional)
   * @param password User plain password. (optional)
   * @param roleId User role id. (optional)
   * @param teamIds User list of team ids (multiple). (optional)
   * @param timezone Use the timezone endpoint to get the timezone name (String), default is empty for domain timezone. (optional)
   * @param spokenLanguages List of locales corresponding to the languages spoken by the user (multiple). (optional)
   * @param noPassword Whether the user is passwordless or not (boolean). Must be used with the corresponding SSO configuration. (optional)
   * @return ApiResponse&lt;User&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<User> updateUserWithHttpInfo(String userId, List<String> categoryIds, String email, Boolean enabled, String externalId, String firstname, String gender, List<String> identityIds, String lastname, String locale, String nickname, String password, String roleId, List<String> teamIds, String timezone, List<String> spokenLanguages, Boolean noPassword) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/users/{userId}"
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "category_ids[]", categoryIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enabled", enabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "external_id", externalId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstname", firstname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gender", gender));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "identity_ids[]", identityIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastname", lastname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locale", locale));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nickname", nickname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", password));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role_id", roleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "team_ids[]", teamIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timezone", timezone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "spoken_languages[]", spokenLanguages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "no_password", noPassword));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};

    return apiClient.invokeAPI("UsersApi.updateUser", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
