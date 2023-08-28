package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllIdentityGroupsResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.IdentityGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class IdentityGroupsApi {
  private ApiClient apiClient;

  public IdentityGroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IdentityGroupsApi(ApiClient apiClient) {
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
   * Getting all identity groups
   * This method renders identity groups ordered by creation date (descending). Note that identity_group are created in a lazily only when data are manually added to an identity OR a two identity are merged altogether. That means that some identity DON’T have identity_group, and identity_group do not cover all identities.  Authorization​: no.
   * @param firstname To filter groups on given firstname. (optional)
   * @param lastname To filter groups on given lastname. (optional)
   * @param email To filter groups that have given email. (optional)
   * @param uuid To filter groups that have given uuid. (optional)
   * @param sort To change the criteria chosen to sort the identities. The value can be “created_at” or “updated_at”. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllIdentityGroupsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllIdentityGroupsResponse getAllIdentityGroups(String firstname, String lastname, String email, String uuid, String sort, Integer offset, Integer limit) throws ApiException {
    return getAllIdentityGroupsWithHttpInfo(firstname, lastname, email, uuid, sort, offset, limit).getData();
  }

  /**
   * Getting all identity groups
   * This method renders identity groups ordered by creation date (descending). Note that identity_group are created in a lazily only when data are manually added to an identity OR a two identity are merged altogether. That means that some identity DON’T have identity_group, and identity_group do not cover all identities.  Authorization​: no.
   * @param firstname To filter groups on given firstname. (optional)
   * @param lastname To filter groups on given lastname. (optional)
   * @param email To filter groups that have given email. (optional)
   * @param uuid To filter groups that have given uuid. (optional)
   * @param sort To change the criteria chosen to sort the identities. The value can be “created_at” or “updated_at”. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllIdentityGroupsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllIdentityGroupsResponse> getAllIdentityGroupsWithHttpInfo(String firstname, String lastname, String email, String uuid, String sort, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/identity_groups";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstname", firstname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastname", lastname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "uuid", uuid));
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

    GenericType<GetAllIdentityGroupsResponse> localVarReturnType = new GenericType<GetAllIdentityGroupsResponse>() {};

    return apiClient.invokeAPI("IdentityGroupsApi.getAllIdentityGroups", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting an identity group from its id
   * This method renders an identity group from given id.
   * @param identityGroupId  (required)
   * @return IdentityGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public IdentityGroup getIdentityGroup(String identityGroupId) throws ApiException {
    return getIdentityGroupWithHttpInfo(identityGroupId).getData();
  }

  /**
   * Getting an identity group from its id
   * This method renders an identity group from given id.
   * @param identityGroupId  (required)
   * @return ApiResponse&lt;IdentityGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IdentityGroup> getIdentityGroupWithHttpInfo(String identityGroupId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identityGroupId' is set
    if (identityGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'identityGroupId' when calling getIdentityGroup");
    }
    
    // create path and map variables
    String localVarPath = "/identity_groups/{identityGroupId}"
      .replaceAll("\\{" + "identityGroupId" + "\\}", apiClient.escapeString(identityGroupId.toString()));

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

    GenericType<IdentityGroup> localVarReturnType = new GenericType<IdentityGroup>() {};

    return apiClient.invokeAPI("IdentityGroupsApi.getIdentityGroup", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating an identity group
   * This method updates an identity group from given attributes and renders it in case of success.  Authorization​: no.
   * @param identityGroupId  (required)
   * @param company Identity company. (optional)
   * @param customFieldValuesCustomFieldKey Identity custom field with key « custom_field_key ». It (optional)
   * @param emails Identity emails (multiple). (optional)
   * @param firstname Identity firstname. (optional)
   * @param gender Identity’s gender. It can be \&quot;man\&quot;, \&quot;woman\&quot; or empty. (optional)
   * @param homePhones Identity home phones (mutiple). (optional)
   * @param lastname Identity lastname. (optional)
   * @param mobilePhones Identity mobile phones (multiple). (optional)
   * @param notes Identity notes. (optional)
   * @param tagIds Identity tag ids (multiple). (optional)
   * @return IdentityGroup
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public IdentityGroup updateIdentityGroup(String identityGroupId, String company, String customFieldValuesCustomFieldKey, List<String> emails, String firstname, String gender, List<String> homePhones, String lastname, List<String> mobilePhones, String notes, List<String> tagIds) throws ApiException {
    return updateIdentityGroupWithHttpInfo(identityGroupId, company, customFieldValuesCustomFieldKey, emails, firstname, gender, homePhones, lastname, mobilePhones, notes, tagIds).getData();
  }

  /**
   * Updating an identity group
   * This method updates an identity group from given attributes and renders it in case of success.  Authorization​: no.
   * @param identityGroupId  (required)
   * @param company Identity company. (optional)
   * @param customFieldValuesCustomFieldKey Identity custom field with key « custom_field_key ». It (optional)
   * @param emails Identity emails (multiple). (optional)
   * @param firstname Identity firstname. (optional)
   * @param gender Identity’s gender. It can be \&quot;man\&quot;, \&quot;woman\&quot; or empty. (optional)
   * @param homePhones Identity home phones (mutiple). (optional)
   * @param lastname Identity lastname. (optional)
   * @param mobilePhones Identity mobile phones (multiple). (optional)
   * @param notes Identity notes. (optional)
   * @param tagIds Identity tag ids (multiple). (optional)
   * @return ApiResponse&lt;IdentityGroup&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<IdentityGroup> updateIdentityGroupWithHttpInfo(String identityGroupId, String company, String customFieldValuesCustomFieldKey, List<String> emails, String firstname, String gender, List<String> homePhones, String lastname, List<String> mobilePhones, String notes, List<String> tagIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identityGroupId' is set
    if (identityGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'identityGroupId' when calling updateIdentityGroup");
    }
    
    // create path and map variables
    String localVarPath = "/identity_groups/{identityGroupId}"
      .replaceAll("\\{" + "identityGroupId" + "\\}", apiClient.escapeString(identityGroupId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "company", company));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "custom_field_values[custom_field_key]", customFieldValuesCustomFieldKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "emails[]", emails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstname", firstname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gender", gender));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "home_phones[]", homePhones));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastname", lastname));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "mobile_phones[]", mobilePhones));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notes", notes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tag_ids[]", tagIds));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<IdentityGroup> localVarReturnType = new GenericType<IdentityGroup>() {};

    return apiClient.invokeAPI("IdentityGroupsApi.updateIdentityGroup", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
