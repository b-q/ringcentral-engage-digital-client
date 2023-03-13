package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Attachment;
import java.io.File;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllAttachmentsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class AttachmentsApi {
  private ApiClient apiClient;

  public AttachmentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AttachmentsApi(ApiClient apiClient) {
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
   * Creating an attachment
   * This method allows you to create an new attachment.
   * @param _file  (optional)
   * @param _private  (optional)
   * @return Attachment
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Compose is not supported on this source (compose_disabled_on_source) </td><td>  -  </td></tr>
     </table>
   */
  public Attachment createAttachment(File _file, String _private) throws ApiException {
    return createAttachmentWithHttpInfo(_file, _private).getData();
  }

  /**
   * Creating an attachment
   * This method allows you to create an new attachment.
   * @param _file  (optional)
   * @param _private  (optional)
   * @return ApiResponse&lt;Attachment&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Compose is not supported on this source (compose_disabled_on_source) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Attachment> createAttachmentWithHttpInfo(File _file, String _private) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/attachments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (_file != null)
      localVarFormParams.put("file", _file);
if (_private != null)
      localVarFormParams.put("private", _private);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data:"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Attachment> localVarReturnType = new GenericType<Attachment>() {};

    return apiClient.invokeAPI("AttachmentsApi.createAttachment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all attachments
   * This method renders attachments ordered by creation date (descending).
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @param extension Search parameter for file extension (e.g. pdf, xlsx, jpg...) (optional)
   * @param createdBefore Search parameter to get attachments created before a ISO 8601 datetime (inclusive) (optional)
   * @param createdAfter Search parameter to get attachments created after a ISO 8601 datetime (inclusive) (optional)
   * @return GetAllAttachmentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllAttachmentsResponse getAllAttachments(Integer offset, Integer limit, String extension, String createdBefore, String createdAfter) throws ApiException {
    return getAllAttachmentsWithHttpInfo(offset, limit, extension, createdBefore, createdAfter).getData();
  }

  /**
   * Getting all attachments
   * This method renders attachments ordered by creation date (descending).
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @param extension Search parameter for file extension (e.g. pdf, xlsx, jpg...) (optional)
   * @param createdBefore Search parameter to get attachments created before a ISO 8601 datetime (inclusive) (optional)
   * @param createdAfter Search parameter to get attachments created after a ISO 8601 datetime (inclusive) (optional)
   * @return ApiResponse&lt;GetAllAttachmentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllAttachmentsResponse> getAllAttachmentsWithHttpInfo(Integer offset, Integer limit, String extension, String createdBefore, String createdAfter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/attachments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "extension", extension));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_before", createdBefore));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_after", createdAfter));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<GetAllAttachmentsResponse> localVarReturnType = new GenericType<GetAllAttachmentsResponse>() {};

    return apiClient.invokeAPI("AttachmentsApi.getAllAttachments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting an attachment from its id
   * This method renders an attachment from given id.
   * @param attachmentId  (required)
   * @return Attachment
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Attachment getAttachment(String attachmentId) throws ApiException {
    return getAttachmentWithHttpInfo(attachmentId).getData();
  }

  /**
   * Getting an attachment from its id
   * This method renders an attachment from given id.
   * @param attachmentId  (required)
   * @return ApiResponse&lt;Attachment&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Attachment> getAttachmentWithHttpInfo(String attachmentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling getAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/attachments/{attachmentId}"
      .replaceAll("\\{" + "attachmentId" + "\\}", apiClient.escapeString(attachmentId.toString()));

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

    GenericType<Attachment> localVarReturnType = new GenericType<Attachment>() {};

    return apiClient.invokeAPI("AttachmentsApi.getAttachment", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
