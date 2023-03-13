package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.CustomField;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllCustomFieldsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class CustomFieldsApi {
  private ApiClient apiClient;

  public CustomFieldsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomFieldsApi(ApiClient apiClient) {
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
   * Creating a custom field
   * This method creates a custom field. In case of success it renders the custom field, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can create custom fields.
   * @param associatedTypeName The associated type of custom field. It can be IdentityGroup or Intervention. (required)
   * @param label The label of the custom field. (required)
   * @param key The key of the custom field (example: customer_id). This is used to determine how it is stored on identity groups. (optional)
   * @param type The type of the custom field. It can be string, boolean, text, integer, float, single_choice, (optional)
   * @param choices A list of choices to be for single_choice, or multiple_choice types. This must be given (optional)
   * @param multiple true or false, this as no effect on single_choice, multiple_choice or boolean types (optional)
   * @param position an integer that indicates custom field’s position between others (default: -1). (optional, default to -1)
   * @return CustomField
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public CustomField createCustomField(String associatedTypeName, String label, String key, String type, List<String> choices, Boolean multiple, Integer position) throws ApiException {
    return createCustomFieldWithHttpInfo(associatedTypeName, label, key, type, choices, multiple, position).getData();
  }

  /**
   * Creating a custom field
   * This method creates a custom field. In case of success it renders the custom field, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can create custom fields.
   * @param associatedTypeName The associated type of custom field. It can be IdentityGroup or Intervention. (required)
   * @param label The label of the custom field. (required)
   * @param key The key of the custom field (example: customer_id). This is used to determine how it is stored on identity groups. (optional)
   * @param type The type of the custom field. It can be string, boolean, text, integer, float, single_choice, (optional)
   * @param choices A list of choices to be for single_choice, or multiple_choice types. This must be given (optional)
   * @param multiple true or false, this as no effect on single_choice, multiple_choice or boolean types (optional)
   * @param position an integer that indicates custom field’s position between others (default: -1). (optional, default to -1)
   * @return ApiResponse&lt;CustomField&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomField> createCustomFieldWithHttpInfo(String associatedTypeName, String label, String key, String type, List<String> choices, Boolean multiple, Integer position) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'associatedTypeName' is set
    if (associatedTypeName == null) {
      throw new ApiException(400, "Missing the required parameter 'associatedTypeName' when calling createCustomField");
    }
    
    // verify the required parameter 'label' is set
    if (label == null) {
      throw new ApiException(400, "Missing the required parameter 'label' when calling createCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/custom_fields";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "associated_type_name", associatedTypeName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "label", label));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "choices[]", choices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "multiple", multiple));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "position", position));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CustomField> localVarReturnType = new GenericType<CustomField>() {};

    return apiClient.invokeAPI("CustomFieldsApi.createCustomField", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deleting a custom field
   * This method destroys an existing custom field. It renders custom field itself. It renders a 404 if id is invalid.  Authorization​: only users that are able to destroy custom fields..
   * @param customFieldId  (required)
   * @return CustomField
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public CustomField deleteCustomField(String customFieldId) throws ApiException {
    return deleteCustomFieldWithHttpInfo(customFieldId).getData();
  }

  /**
   * Deleting a custom field
   * This method destroys an existing custom field. It renders custom field itself. It renders a 404 if id is invalid.  Authorization​: only users that are able to destroy custom fields..
   * @param customFieldId  (required)
   * @return ApiResponse&lt;CustomField&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomField> deleteCustomFieldWithHttpInfo(String customFieldId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customFieldId' is set
    if (customFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'customFieldId' when calling deleteCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/custom_fields/{customFieldId}"
      .replaceAll("\\{" + "customFieldId" + "\\}", apiClient.escapeString(customFieldId.toString()));

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

    GenericType<CustomField> localVarReturnType = new GenericType<CustomField>() {};

    return apiClient.invokeAPI("CustomFieldsApi.deleteCustomField", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all custom fields
   * This method renders custom fields ordered by position (ascending).  Authorization​: only users that can see custom fields in administration section.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllCustomFieldsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllCustomFieldsResponse getAllCustomFields(Integer offset, Integer limit) throws ApiException {
    return getAllCustomFieldsWithHttpInfo(offset, limit).getData();
  }

  /**
   * Getting all custom fields
   * This method renders custom fields ordered by position (ascending).  Authorization​: only users that can see custom fields in administration section.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllCustomFieldsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllCustomFieldsResponse> getAllCustomFieldsWithHttpInfo(Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/custom_fields";

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

    GenericType<GetAllCustomFieldsResponse> localVarReturnType = new GenericType<GetAllCustomFieldsResponse>() {};

    return apiClient.invokeAPI("CustomFieldsApi.getAllCustomFields", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a custom field from its id
   * This method renders a custom field from given id.  Authorization​: only users that can see custom fields in administration section.
   * @param customFieldId  (required)
   * @return CustomField
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public CustomField getCustomField(String customFieldId) throws ApiException {
    return getCustomFieldWithHttpInfo(customFieldId).getData();
  }

  /**
   * Getting a custom field from its id
   * This method renders a custom field from given id.  Authorization​: only users that can see custom fields in administration section.
   * @param customFieldId  (required)
   * @return ApiResponse&lt;CustomField&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomField> getCustomFieldWithHttpInfo(String customFieldId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customFieldId' is set
    if (customFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'customFieldId' when calling getCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/custom_fields/{customFieldId}"
      .replaceAll("\\{" + "customFieldId" + "\\}", apiClient.escapeString(customFieldId.toString()));

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

    GenericType<CustomField> localVarReturnType = new GenericType<CustomField>() {};

    return apiClient.invokeAPI("CustomFieldsApi.getCustomField", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a custom field
   * This method updates an existing custom field from given attributes and renders it in case of success.  Authorization​: only users that are able to update custom fields.
   * @param customFieldId  (required)
   * @param label Custom field’s label. (optional)
   * @param choices  (optional)
   * @param position Custom field’s position. (optional)
   * @return CustomField
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public CustomField updateCustomField(String customFieldId, String label, List<String> choices, Integer position) throws ApiException {
    return updateCustomFieldWithHttpInfo(customFieldId, label, choices, position).getData();
  }

  /**
   * Updating a custom field
   * This method updates an existing custom field from given attributes and renders it in case of success.  Authorization​: only users that are able to update custom fields.
   * @param customFieldId  (required)
   * @param label Custom field’s label. (optional)
   * @param choices  (optional)
   * @param position Custom field’s position. (optional)
   * @return ApiResponse&lt;CustomField&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomField> updateCustomFieldWithHttpInfo(String customFieldId, String label, List<String> choices, Integer position) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'customFieldId' is set
    if (customFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'customFieldId' when calling updateCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/custom_fields/{customFieldId}"
      .replaceAll("\\{" + "customFieldId" + "\\}", apiClient.escapeString(customFieldId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "label", label));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "choices[]", choices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "position", position));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<CustomField> localVarReturnType = new GenericType<CustomField>() {};

    return apiClient.invokeAPI("CustomFieldsApi.updateCustomField", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
