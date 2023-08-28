package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllThreadsResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class ThreadsApi {
  private ApiClient apiClient;

  public ThreadsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ThreadsApi(ApiClient apiClient) {
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
   * Archiving a thread
   * Archives the contents of a thread. If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned.  If the thread is already being archived, a 409 HTTP response will be returned.  Authorization​: no.
   * @param threadId  (required)
   * @return Thread
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Thread archiveThread(String threadId) throws ApiException {
    return archiveThreadWithHttpInfo(threadId).getData();
  }

  /**
   * Archiving a thread
   * Archives the contents of a thread. If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned.  If the thread is already being archived, a 409 HTTP response will be returned.  Authorization​: no.
   * @param threadId  (required)
   * @return ApiResponse&lt;Thread&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Thread> archiveThreadWithHttpInfo(String threadId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'threadId' is set
    if (threadId == null) {
      throw new ApiException(400, "Missing the required parameter 'threadId' when calling archiveThread");
    }
    
    // create path and map variables
    String localVarPath = "/content_threads/{threadId}/ignore"
      .replaceAll("\\{" + "threadId" + "\\}", apiClient.escapeString(threadId.toString()));

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

    GenericType<Thread> localVarReturnType = new GenericType<Thread>() {};

    return apiClient.invokeAPI("ThreadsApi.archiveThread", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Categorizing a thread
   * This method updates the categories of a thread. If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned.  If the thread is already being categorized, a 409 HTTP response will be returned.  Authorization​: no.
   * @param threadId  (required)
   * @param threadCategoryIds An array containing the new categories to set on the thread. (optional)
   * @return Thread
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Thread categorizeThread(String threadId, List<String> threadCategoryIds) throws ApiException {
    return categorizeThreadWithHttpInfo(threadId, threadCategoryIds).getData();
  }

  /**
   * Categorizing a thread
   * This method updates the categories of a thread. If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned.  If the thread is already being categorized, a 409 HTTP response will be returned.  Authorization​: no.
   * @param threadId  (required)
   * @param threadCategoryIds An array containing the new categories to set on the thread. (optional)
   * @return ApiResponse&lt;Thread&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Thread> categorizeThreadWithHttpInfo(String threadId, List<String> threadCategoryIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'threadId' is set
    if (threadId == null) {
      throw new ApiException(400, "Missing the required parameter 'threadId' when calling categorizeThread");
    }
    
    // create path and map variables
    String localVarPath = "/content_threads/{threadId}/update_categories"
      .replaceAll("\\{" + "threadId" + "\\}", apiClient.escapeString(threadId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "thread_category_ids[]", threadCategoryIds));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Thread> localVarReturnType = new GenericType<Thread>() {};

    return apiClient.invokeAPI("ThreadsApi.categorizeThread", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Close a thread
   * Thread closure/opening is only available for the following sources: * Emails * Answers * Ideas * Facebook Messenger * Google+ * Lithium * Mobile Messaging  Starts a job to close a thread. It returns the thread but as the job is asynchronous, the state of the “close” attribute in the returned object do not is the one when the job started.  If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned. Returns a 403 if the thread cannot be closed or if the user does not have the permission to close a thread.  Authorization​: no.
   * @param threadId  (required)
   * @return Thread
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Thread closeThread(String threadId) throws ApiException {
    return closeThreadWithHttpInfo(threadId).getData();
  }

  /**
   * Close a thread
   * Thread closure/opening is only available for the following sources: * Emails * Answers * Ideas * Facebook Messenger * Google+ * Lithium * Mobile Messaging  Starts a job to close a thread. It returns the thread but as the job is asynchronous, the state of the “close” attribute in the returned object do not is the one when the job started.  If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned. Returns a 403 if the thread cannot be closed or if the user does not have the permission to close a thread.  Authorization​: no.
   * @param threadId  (required)
   * @return ApiResponse&lt;Thread&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Thread> closeThreadWithHttpInfo(String threadId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'threadId' is set
    if (threadId == null) {
      throw new ApiException(400, "Missing the required parameter 'threadId' when calling closeThread");
    }
    
    // create path and map variables
    String localVarPath = "/content_threads/{threadId}/close"
      .replaceAll("\\{" + "threadId" + "\\}", apiClient.escapeString(threadId.toString()));

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

    GenericType<Thread> localVarReturnType = new GenericType<Thread>() {};

    return apiClient.invokeAPI("ThreadsApi.closeThread", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all threads
   * This method renders threads ordered by last content date (descending). Only threads in sources where token’s user has “read” permission are returned.  Authorization​: no.
   * @param q A search query to filter threads. Please refer to ​Search &amp; filtering parameters​ for more details. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllThreadsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllThreadsResponse getAllThreads(String q, Integer offset, Integer limit) throws ApiException {
    return getAllThreadsWithHttpInfo(q, offset, limit).getData();
  }

  /**
   * Getting all threads
   * This method renders threads ordered by last content date (descending). Only threads in sources where token’s user has “read” permission are returned.  Authorization​: no.
   * @param q A search query to filter threads. Please refer to ​Search &amp; filtering parameters​ for more details. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllThreadsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllThreadsResponse> getAllThreadsWithHttpInfo(String q, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/content_threads";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
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

    GenericType<GetAllThreadsResponse> localVarReturnType = new GenericType<GetAllThreadsResponse>() {};

    return apiClient.invokeAPI("ThreadsApi.getAllThreads", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a thread from its id
   * This method renders a thread from given id. If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned.  Authorization​: no.
   * @param threadId  (required)
   * @return Thread
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Thread getThread(String threadId) throws ApiException {
    return getThreadWithHttpInfo(threadId).getData();
  }

  /**
   * Getting a thread from its id
   * This method renders a thread from given id. If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned.  Authorization​: no.
   * @param threadId  (required)
   * @return ApiResponse&lt;Thread&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Thread> getThreadWithHttpInfo(String threadId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'threadId' is set
    if (threadId == null) {
      throw new ApiException(400, "Missing the required parameter 'threadId' when calling getThread");
    }
    
    // create path and map variables
    String localVarPath = "/content_threads/{threadId}"
      .replaceAll("\\{" + "threadId" + "\\}", apiClient.escapeString(threadId.toString()));

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

    GenericType<Thread> localVarReturnType = new GenericType<Thread>() {};

    return apiClient.invokeAPI("ThreadsApi.getThread", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Open a thread
   * Thread closure/opening is only available for the following sources:  * Emails * Answers * Ideas * Facebook Messenger * Google+ * Lithium * Mobile Messaging  Starts a job to open a thread. It returns the thread but as the job is asynchronous, the state of the “close” attribute in the returned object is the one when the job started.  If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned. Returns a 403 if the thread cannot be opened or if the user does not have the permission to open a thread.  Authorization​: no.
   * @param threadId  (required)
   * @return Thread
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Thread openThread(String threadId) throws ApiException {
    return openThreadWithHttpInfo(threadId).getData();
  }

  /**
   * Open a thread
   * Thread closure/opening is only available for the following sources:  * Emails * Answers * Ideas * Facebook Messenger * Google+ * Lithium * Mobile Messaging  Starts a job to open a thread. It returns the thread but as the job is asynchronous, the state of the “close” attribute in the returned object is the one when the job started.  If token’s user does not have “read” on thread’s source a 404 HTTP response will be returned. Returns a 403 if the thread cannot be opened or if the user does not have the permission to open a thread.  Authorization​: no.
   * @param threadId  (required)
   * @return ApiResponse&lt;Thread&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Thread> openThreadWithHttpInfo(String threadId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'threadId' is set
    if (threadId == null) {
      throw new ApiException(400, "Missing the required parameter 'threadId' when calling openThread");
    }
    
    // create path and map variables
    String localVarPath = "/content_threads/{threadId}/open"
      .replaceAll("\\{" + "threadId" + "\\}", apiClient.escapeString(threadId.toString()));

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

    GenericType<Thread> localVarReturnType = new GenericType<Thread>() {};

    return apiClient.invokeAPI("ThreadsApi.openThread", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
