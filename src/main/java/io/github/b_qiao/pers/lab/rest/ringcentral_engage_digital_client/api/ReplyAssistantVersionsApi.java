package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllReplyAssistantVersionsResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.ReplyAssistantVersion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class ReplyAssistantVersionsApi {
  private ApiClient apiClient;

  public ReplyAssistantVersionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReplyAssistantVersionsApi(ApiClient apiClient) {
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
   * Creating a reply assistant version
   * This method creates a reply assistant version. In case of success it renders the version, otherwise, it renders an error (422 HTTP code, 404 if the entry_id is invalid).  Authorization​: only users that have the right to manage reply assistant.
   * @param body Body of the version (required)
   * @param entryId Reply assistant entry id (mandatory) (required)
   * @param sourceIds Source ids (array) (optional)
   * @param format Either “text” or “html” (optional)
   * @param language Language (ex: “fr”) (optional)
   * @return ReplyAssistantVersion
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ReplyAssistantVersion createReplyAssistantVersion(String body, String entryId, List<String> sourceIds, String format, String language) throws ApiException {
    return createReplyAssistantVersionWithHttpInfo(body, entryId, sourceIds, format, language).getData();
  }

  /**
   * Creating a reply assistant version
   * This method creates a reply assistant version. In case of success it renders the version, otherwise, it renders an error (422 HTTP code, 404 if the entry_id is invalid).  Authorization​: only users that have the right to manage reply assistant.
   * @param body Body of the version (required)
   * @param entryId Reply assistant entry id (mandatory) (required)
   * @param sourceIds Source ids (array) (optional)
   * @param format Either “text” or “html” (optional)
   * @param language Language (ex: “fr”) (optional)
   * @return ApiResponse&lt;ReplyAssistantVersion&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReplyAssistantVersion> createReplyAssistantVersionWithHttpInfo(String body, String entryId, List<String> sourceIds, String format, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createReplyAssistantVersion");
    }
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling createReplyAssistantVersion");
    }
    
    // create path and map variables
    String localVarPath = "/reply_assistant/versions";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entry_id", entryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source_ids[]", sourceIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ReplyAssistantVersion> localVarReturnType = new GenericType<ReplyAssistantVersion>() {};

    return apiClient.invokeAPI("ReplyAssistantVersionsApi.createReplyAssistantVersion", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deleting a reply assistant version
   * This method destroys an existing version. It renders the version itself. It renders a 404 if id is invalid.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantVersionId  (required)
   * @return ReplyAssistantVersion
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ReplyAssistantVersion deleteReplyAssistantVersion(String replyAssistantVersionId) throws ApiException {
    return deleteReplyAssistantVersionWithHttpInfo(replyAssistantVersionId).getData();
  }

  /**
   * Deleting a reply assistant version
   * This method destroys an existing version. It renders the version itself. It renders a 404 if id is invalid.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantVersionId  (required)
   * @return ApiResponse&lt;ReplyAssistantVersion&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReplyAssistantVersion> deleteReplyAssistantVersionWithHttpInfo(String replyAssistantVersionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replyAssistantVersionId' is set
    if (replyAssistantVersionId == null) {
      throw new ApiException(400, "Missing the required parameter 'replyAssistantVersionId' when calling deleteReplyAssistantVersion");
    }
    
    // create path and map variables
    String localVarPath = "/reply_assistant/versions/{replyAssistantVersionId}"
      .replaceAll("\\{" + "replyAssistantVersionId" + "\\}", apiClient.escapeString(replyAssistantVersionId.toString()));

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

    GenericType<ReplyAssistantVersion> localVarReturnType = new GenericType<ReplyAssistantVersion>() {};

    return apiClient.invokeAPI("ReplyAssistantVersionsApi.deleteReplyAssistantVersion", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting​ a​ll​ reply assistant versions
   * This method renders all reply assistant versions ordered by creation date (ascending).  Authorization​: only users that have the right to manage reply assistant.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllReplyAssistantVersionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllReplyAssistantVersionsResponse getAllReplyAssistantVersions(Integer offset, Integer limit) throws ApiException {
    return getAllReplyAssistantVersionsWithHttpInfo(offset, limit).getData();
  }

  /**
   * Getting​ a​ll​ reply assistant versions
   * This method renders all reply assistant versions ordered by creation date (ascending).  Authorization​: only users that have the right to manage reply assistant.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllReplyAssistantVersionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllReplyAssistantVersionsResponse> getAllReplyAssistantVersionsWithHttpInfo(Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reply_assistant/versions";

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

    GenericType<GetAllReplyAssistantVersionsResponse> localVarReturnType = new GenericType<GetAllReplyAssistantVersionsResponse>() {};

    return apiClient.invokeAPI("ReplyAssistantVersionsApi.getAllReplyAssistantVersions", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a reply assistant version from its id
   * This method renders a version from given id.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantVersionId  (required)
   * @return ReplyAssistantVersion
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ReplyAssistantVersion getReplyAssistantVersion(String replyAssistantVersionId) throws ApiException {
    return getReplyAssistantVersionWithHttpInfo(replyAssistantVersionId).getData();
  }

  /**
   * Getting a reply assistant version from its id
   * This method renders a version from given id.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantVersionId  (required)
   * @return ApiResponse&lt;ReplyAssistantVersion&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReplyAssistantVersion> getReplyAssistantVersionWithHttpInfo(String replyAssistantVersionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replyAssistantVersionId' is set
    if (replyAssistantVersionId == null) {
      throw new ApiException(400, "Missing the required parameter 'replyAssistantVersionId' when calling getReplyAssistantVersion");
    }
    
    // create path and map variables
    String localVarPath = "/reply_assistant/versions/{replyAssistantVersionId}"
      .replaceAll("\\{" + "replyAssistantVersionId" + "\\}", apiClient.escapeString(replyAssistantVersionId.toString()));

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

    GenericType<ReplyAssistantVersion> localVarReturnType = new GenericType<ReplyAssistantVersion>() {};

    return apiClient.invokeAPI("ReplyAssistantVersionsApi.getReplyAssistantVersion", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a reply assistant version
   * This method updates an existing version from given attributes and renders it in case of success.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantVersionId  (required)
   * @param body Body of the version (optional)
   * @param entryId Reply assistant entry id. (optional)
   * @param sourceIds Source ids (array) (optional)
   * @param format Either “text” or “html” (optional)
   * @param language Language (ex: “fr”) (optional)
   * @return ReplyAssistantVersion
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ReplyAssistantVersion updateReplyAssistantVersion(String replyAssistantVersionId, String body, String entryId, List<String> sourceIds, String format, String language) throws ApiException {
    return updateReplyAssistantVersionWithHttpInfo(replyAssistantVersionId, body, entryId, sourceIds, format, language).getData();
  }

  /**
   * Updating a reply assistant version
   * This method updates an existing version from given attributes and renders it in case of success.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantVersionId  (required)
   * @param body Body of the version (optional)
   * @param entryId Reply assistant entry id. (optional)
   * @param sourceIds Source ids (array) (optional)
   * @param format Either “text” or “html” (optional)
   * @param language Language (ex: “fr”) (optional)
   * @return ApiResponse&lt;ReplyAssistantVersion&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReplyAssistantVersion> updateReplyAssistantVersionWithHttpInfo(String replyAssistantVersionId, String body, String entryId, List<String> sourceIds, String format, String language) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replyAssistantVersionId' is set
    if (replyAssistantVersionId == null) {
      throw new ApiException(400, "Missing the required parameter 'replyAssistantVersionId' when calling updateReplyAssistantVersion");
    }
    
    // create path and map variables
    String localVarPath = "/reply_assistant/versions/{replyAssistantVersionId}"
      .replaceAll("\\{" + "replyAssistantVersionId" + "\\}", apiClient.escapeString(replyAssistantVersionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entry_id", entryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source_ids[]", sourceIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "language", language));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ReplyAssistantVersion> localVarReturnType = new GenericType<ReplyAssistantVersion>() {};

    return apiClient.invokeAPI("ReplyAssistantVersionsApi.updateReplyAssistantVersion", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
