package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Folder;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllFoldersResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class FoldersApi {
  private ApiClient apiClient;

  public FoldersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FoldersApi(ApiClient apiClient) {
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
   * Creating a folder
   * This method creates a new folder. In case of success it renders the created folder, otherwise an error (422 HTTP code).
   * @param label Folder’s label (mandatory). (optional)
   * @param parentId ID of the parent folder. (optional)
   * @param position position of the folder.  (optional)
   * @param query query of the folder as described in ​Search API documentation.​\\n\\nExample: “​active_and_assigned_to_me:true” (optional)
   * @param renderThreadsCount boolean describing display of the number of threads.  (optional)
   * @param roleRestrictionOnly list of roles allowed to see this folder. This parameter has to be a hash otherwise it will raise a 400 error. The key should be \&quot;only\&quot;. For example: &#x60;&amp;role_restriction[only][]&#x3D;4e5596cdae70f677b5000002&#x60; (optional)
   * @param teamRestrictionOnly list of teams allowed to see this folder. Same thing as role_restriction: team_restriction parameter has to be a hash with the key \&quot;only\&quot;. (optional)
   * @return Folder
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Folder createFolder(String label, String parentId, Integer position, String query, Boolean renderThreadsCount, List<String> roleRestrictionOnly, List<String> teamRestrictionOnly) throws ApiException {
    return createFolderWithHttpInfo(label, parentId, position, query, renderThreadsCount, roleRestrictionOnly, teamRestrictionOnly).getData();
  }

  /**
   * Creating a folder
   * This method creates a new folder. In case of success it renders the created folder, otherwise an error (422 HTTP code).
   * @param label Folder’s label (mandatory). (optional)
   * @param parentId ID of the parent folder. (optional)
   * @param position position of the folder.  (optional)
   * @param query query of the folder as described in ​Search API documentation.​\\n\\nExample: “​active_and_assigned_to_me:true” (optional)
   * @param renderThreadsCount boolean describing display of the number of threads.  (optional)
   * @param roleRestrictionOnly list of roles allowed to see this folder. This parameter has to be a hash otherwise it will raise a 400 error. The key should be \&quot;only\&quot;. For example: &#x60;&amp;role_restriction[only][]&#x3D;4e5596cdae70f677b5000002&#x60; (optional)
   * @param teamRestrictionOnly list of teams allowed to see this folder. Same thing as role_restriction: team_restriction parameter has to be a hash with the key \&quot;only\&quot;. (optional)
   * @return ApiResponse&lt;Folder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Folder> createFolderWithHttpInfo(String label, String parentId, Integer position, String query, Boolean renderThreadsCount, List<String> roleRestrictionOnly, List<String> teamRestrictionOnly) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/folders";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "label", label));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "parent_id", parentId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "position", position));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "render_threads_count", renderThreadsCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "role_restriction[only][]", roleRestrictionOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "team_restriction[only][]", teamRestrictionOnly));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Folder> localVarReturnType = new GenericType<Folder>() {};

    return apiClient.invokeAPI("FoldersApi.createFolder", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deleting a folder
   * This method destroys an existing folder. It renders the folder itself. It renders a 404 if id is invalid.
   * @param folderId  (required)
   * @return Folder
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Folder deleteFolder(String folderId) throws ApiException {
    return deleteFolderWithHttpInfo(folderId).getData();
  }

  /**
   * Deleting a folder
   * This method destroys an existing folder. It renders the folder itself. It renders a 404 if id is invalid.
   * @param folderId  (required)
   * @return ApiResponse&lt;Folder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Folder> deleteFolderWithHttpInfo(String folderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling deleteFolder");
    }
    
    // create path and map variables
    String localVarPath = "/folders/{folderId}"
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

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

    GenericType<Folder> localVarReturnType = new GenericType<Folder>() {};

    return apiClient.invokeAPI("FoldersApi.deleteFolder", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all folders
   * This method renders folders.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllFoldersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllFoldersResponse getAllFolders(Integer offset, Integer limit) throws ApiException {
    return getAllFoldersWithHttpInfo(offset, limit).getData();
  }

  /**
   * Getting all folders
   * This method renders folders.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllFoldersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllFoldersResponse> getAllFoldersWithHttpInfo(Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/folders";

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

    GenericType<GetAllFoldersResponse> localVarReturnType = new GenericType<GetAllFoldersResponse>() {};

    return apiClient.invokeAPI("FoldersApi.getAllFolders", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a folder from its id
   * This method renders a folder from given id.
   * @param folderId  (required)
   * @return Folder
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Folder getFolder(String folderId) throws ApiException {
    return getFolderWithHttpInfo(folderId).getData();
  }

  /**
   * Getting a folder from its id
   * This method renders a folder from given id.
   * @param folderId  (required)
   * @return ApiResponse&lt;Folder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Folder> getFolderWithHttpInfo(String folderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling getFolder");
    }
    
    // create path and map variables
    String localVarPath = "/folders/{folderId}"
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

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

    GenericType<Folder> localVarReturnType = new GenericType<Folder>() {};

    return apiClient.invokeAPI("FoldersApi.getFolder", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a folder
   * This method updates an existing folder from given attributes and renders it in case of success.
   * @param folderId  (required)
   * @param label Folder’s label (mandatory). (optional)
   * @param parentId ID of the parent folder. (optional)
   * @param position position of the folder.  (optional)
   * @param query query of the folder as described in ​Search API documentation.​\\n\\nExample: “​active_and_assigned_to_me:true” (optional)
   * @param renderThreadsCount boolean describing display of the number of threads.  (optional)
   * @param roleRestrictionOnly list of roles allowed to see this folder. This parameter has to be a hash otherwise it will raise a 400 error. The key should be \&quot;only\&quot;. For example: &#x60;&amp;role_restriction[only][]&#x3D;4e5596cdae70f677b5000002&#x60; (optional)
   * @param teamRestrictionOnly list of teams allowed to see this folder. Same thing as role_restriction: team_restriction parameter has to be a hash with the key \&quot;only\&quot;. (optional)
   * @return Folder
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Folder updateFolder(String folderId, String label, String parentId, Integer position, String query, Boolean renderThreadsCount, List<String> roleRestrictionOnly, List<String> teamRestrictionOnly) throws ApiException {
    return updateFolderWithHttpInfo(folderId, label, parentId, position, query, renderThreadsCount, roleRestrictionOnly, teamRestrictionOnly).getData();
  }

  /**
   * Updating a folder
   * This method updates an existing folder from given attributes and renders it in case of success.
   * @param folderId  (required)
   * @param label Folder’s label (mandatory). (optional)
   * @param parentId ID of the parent folder. (optional)
   * @param position position of the folder.  (optional)
   * @param query query of the folder as described in ​Search API documentation.​\\n\\nExample: “​active_and_assigned_to_me:true” (optional)
   * @param renderThreadsCount boolean describing display of the number of threads.  (optional)
   * @param roleRestrictionOnly list of roles allowed to see this folder. This parameter has to be a hash otherwise it will raise a 400 error. The key should be \&quot;only\&quot;. For example: &#x60;&amp;role_restriction[only][]&#x3D;4e5596cdae70f677b5000002&#x60; (optional)
   * @param teamRestrictionOnly list of teams allowed to see this folder. Same thing as role_restriction: team_restriction parameter has to be a hash with the key \&quot;only\&quot;. (optional)
   * @return ApiResponse&lt;Folder&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Folder> updateFolderWithHttpInfo(String folderId, String label, String parentId, Integer position, String query, Boolean renderThreadsCount, List<String> roleRestrictionOnly, List<String> teamRestrictionOnly) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'folderId' is set
    if (folderId == null) {
      throw new ApiException(400, "Missing the required parameter 'folderId' when calling updateFolder");
    }
    
    // create path and map variables
    String localVarPath = "/folders/{folderId}"
      .replaceAll("\\{" + "folderId" + "\\}", apiClient.escapeString(folderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "label", label));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "parent_id", parentId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "position", position));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "render_threads_count", renderThreadsCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "role_restriction[only][]", roleRestrictionOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "team_restriction[only][]", teamRestrictionOnly));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Folder> localVarReturnType = new GenericType<Folder>() {};

    return apiClient.invokeAPI("FoldersApi.updateFolder", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
