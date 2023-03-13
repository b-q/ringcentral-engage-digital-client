package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllReplyAssistantEntriesResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.ReplyAssistantEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class ReplyAssistantEntriesApi {
  private ApiClient apiClient;

  public ReplyAssistantEntriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReplyAssistantEntriesApi(ApiClient apiClient) {
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
   * Creating an entry
   * This method creates a reply assistant entry. In case of success it renders the entry, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that have the right to manage reply assistant.
   * @param label The name of the entry. (required)
   * @return ReplyAssistantEntry
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ReplyAssistantEntry createReplyAssistantEntry(String label) throws ApiException {
    return createReplyAssistantEntryWithHttpInfo(label).getData();
  }

  /**
   * Creating an entry
   * This method creates a reply assistant entry. In case of success it renders the entry, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that have the right to manage reply assistant.
   * @param label The name of the entry. (required)
   * @return ApiResponse&lt;ReplyAssistantEntry&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReplyAssistantEntry> createReplyAssistantEntryWithHttpInfo(String label) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'label' is set
    if (label == null) {
      throw new ApiException(400, "Missing the required parameter 'label' when calling createReplyAssistantEntry");
    }
    
    // create path and map variables
    String localVarPath = "/reply_assistant/entries";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "label", label));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ReplyAssistantEntry> localVarReturnType = new GenericType<ReplyAssistantEntry>() {};

    return apiClient.invokeAPI("ReplyAssistantEntriesApi.createReplyAssistantEntry", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deleting a reply assistant entry
   * This method destroys an existing entry. It renders the entry itself. It renders a 404 if id is invalid.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantEntryId  (required)
   * @return ReplyAssistantEntry
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ReplyAssistantEntry deleteReplyAssistantEntry(String replyAssistantEntryId) throws ApiException {
    return deleteReplyAssistantEntryWithHttpInfo(replyAssistantEntryId).getData();
  }

  /**
   * Deleting a reply assistant entry
   * This method destroys an existing entry. It renders the entry itself. It renders a 404 if id is invalid.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantEntryId  (required)
   * @return ApiResponse&lt;ReplyAssistantEntry&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReplyAssistantEntry> deleteReplyAssistantEntryWithHttpInfo(String replyAssistantEntryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replyAssistantEntryId' is set
    if (replyAssistantEntryId == null) {
      throw new ApiException(400, "Missing the required parameter 'replyAssistantEntryId' when calling deleteReplyAssistantEntry");
    }
    
    // create path and map variables
    String localVarPath = "/reply_assistant/entries/{replyAssistantEntryId}"
      .replaceAll("\\{" + "replyAssistantEntryId" + "\\}", apiClient.escapeString(replyAssistantEntryId.toString()));

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

    GenericType<ReplyAssistantEntry> localVarReturnType = new GenericType<ReplyAssistantEntry>() {};

    return apiClient.invokeAPI("ReplyAssistantEntriesApi.deleteReplyAssistantEntry", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting​ a​ll​ reply assistant e​ntries
   * This method renders all entries ordered by creation date (ascending).  Authorization​: only users that have the right to manage reply assistant.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllReplyAssistantEntriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllReplyAssistantEntriesResponse getAllReplyAssistantEntries(Integer offset, Integer limit) throws ApiException {
    return getAllReplyAssistantEntriesWithHttpInfo(offset, limit).getData();
  }

  /**
   * Getting​ a​ll​ reply assistant e​ntries
   * This method renders all entries ordered by creation date (ascending).  Authorization​: only users that have the right to manage reply assistant.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllReplyAssistantEntriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllReplyAssistantEntriesResponse> getAllReplyAssistantEntriesWithHttpInfo(Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/reply_assistant/entries";

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

    GenericType<GetAllReplyAssistantEntriesResponse> localVarReturnType = new GenericType<GetAllReplyAssistantEntriesResponse>() {};

    return apiClient.invokeAPI("ReplyAssistantEntriesApi.getAllReplyAssistantEntries", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a reply assistant entry from its id
   * This method renders an entry from given id.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantEntryId  (required)
   * @return ReplyAssistantEntry
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ReplyAssistantEntry getReplyAssistantEntry(String replyAssistantEntryId) throws ApiException {
    return getReplyAssistantEntryWithHttpInfo(replyAssistantEntryId).getData();
  }

  /**
   * Getting a reply assistant entry from its id
   * This method renders an entry from given id.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantEntryId  (required)
   * @return ApiResponse&lt;ReplyAssistantEntry&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReplyAssistantEntry> getReplyAssistantEntryWithHttpInfo(String replyAssistantEntryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replyAssistantEntryId' is set
    if (replyAssistantEntryId == null) {
      throw new ApiException(400, "Missing the required parameter 'replyAssistantEntryId' when calling getReplyAssistantEntry");
    }
    
    // create path and map variables
    String localVarPath = "/reply_assistant/entries/{replyAssistantEntryId}"
      .replaceAll("\\{" + "replyAssistantEntryId" + "\\}", apiClient.escapeString(replyAssistantEntryId.toString()));

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

    GenericType<ReplyAssistantEntry> localVarReturnType = new GenericType<ReplyAssistantEntry>() {};

    return apiClient.invokeAPI("ReplyAssistantEntriesApi.getReplyAssistantEntry", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a reply assistant entry
   * This method updates an existing entry from given attributes and renders it in case of success.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantEntryId  (required)
   * @param label The name of the entry. (optional)
   * @param foreignId The internal/company id of the entry. This is used to match Engage Digital entry’s id with the company one. Example: KB042. (optional)
   * @param categoryIds To restrict the entry to a set of Engage Digital categories. Then, KB entries that do not match message’s categories to which you are replying will not be suggested. (optional)
   * @param shortcuts entry shortcuts (optional)
   * @param entryGroupId Entry group id. (optional)
   * @param sourceIds Source ids (array) (optional)
   * @return ReplyAssistantEntry
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ReplyAssistantEntry updateReplyAssistantEntry(String replyAssistantEntryId, String label, String foreignId, List<String> categoryIds, List<String> shortcuts, String entryGroupId, List<String> sourceIds) throws ApiException {
    return updateReplyAssistantEntryWithHttpInfo(replyAssistantEntryId, label, foreignId, categoryIds, shortcuts, entryGroupId, sourceIds).getData();
  }

  /**
   * Updating a reply assistant entry
   * This method updates an existing entry from given attributes and renders it in case of success.  Authorization​: only users that have the right to manage reply assistant.
   * @param replyAssistantEntryId  (required)
   * @param label The name of the entry. (optional)
   * @param foreignId The internal/company id of the entry. This is used to match Engage Digital entry’s id with the company one. Example: KB042. (optional)
   * @param categoryIds To restrict the entry to a set of Engage Digital categories. Then, KB entries that do not match message’s categories to which you are replying will not be suggested. (optional)
   * @param shortcuts entry shortcuts (optional)
   * @param entryGroupId Entry group id. (optional)
   * @param sourceIds Source ids (array) (optional)
   * @return ApiResponse&lt;ReplyAssistantEntry&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReplyAssistantEntry> updateReplyAssistantEntryWithHttpInfo(String replyAssistantEntryId, String label, String foreignId, List<String> categoryIds, List<String> shortcuts, String entryGroupId, List<String> sourceIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'replyAssistantEntryId' is set
    if (replyAssistantEntryId == null) {
      throw new ApiException(400, "Missing the required parameter 'replyAssistantEntryId' when calling updateReplyAssistantEntry");
    }
    
    // create path and map variables
    String localVarPath = "/reply_assistant/entries/{replyAssistantEntryId}"
      .replaceAll("\\{" + "replyAssistantEntryId" + "\\}", apiClient.escapeString(replyAssistantEntryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "label", label));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "foreign_id", foreignId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "category_ids[]", categoryIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "shortcuts[]", shortcuts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "entry_group_id", entryGroupId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source_ids[]", sourceIds));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ReplyAssistantEntry> localVarReturnType = new GenericType<ReplyAssistantEntry>() {};

    return apiClient.invokeAPI("ReplyAssistantEntriesApi.updateReplyAssistantEntry", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
