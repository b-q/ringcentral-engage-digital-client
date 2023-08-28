package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Content;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllContentsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class ContentsApi {
  private ApiClient apiClient;

  public ContentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContentsApi(ApiClient apiClient) {
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
   * Categorizing a content
   * This method updates the categories of a content. If token’s user does not have “read” on this content’s source a 404 HTTP response will be returned.  Authorization​: no.
   * @param contentId  (required)
   * @param categoryIds An array containing the new categories to set on the content. (required)
   * @return Content
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Content categorizeContent(String contentId, List<String> categoryIds) throws ApiException {
    return categorizeContentWithHttpInfo(contentId, categoryIds).getData();
  }

  /**
   * Categorizing a content
   * This method updates the categories of a content. If token’s user does not have “read” on this content’s source a 404 HTTP response will be returned.  Authorization​: no.
   * @param contentId  (required)
   * @param categoryIds An array containing the new categories to set on the content. (required)
   * @return ApiResponse&lt;Content&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Content> categorizeContentWithHttpInfo(String contentId, List<String> categoryIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contentId' is set
    if (contentId == null) {
      throw new ApiException(400, "Missing the required parameter 'contentId' when calling categorizeContent");
    }
    
    // verify the required parameter 'categoryIds' is set
    if (categoryIds == null) {
      throw new ApiException(400, "Missing the required parameter 'categoryIds' when calling categorizeContent");
    }
    
    // create path and map variables
    String localVarPath = "/contents/{contentId}/update_categories"
      .replaceAll("\\{" + "contentId" + "\\}", apiClient.escapeString(contentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "category_ids[]", categoryIds));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Content> localVarReturnType = new GenericType<Content>() {};

    return apiClient.invokeAPI("ContentsApi.categorizeContent", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Creating content
   * This method allows you to create new content for use in discussions. It can be a reply to another piece of content or be used to initiate discussion. If authorized, the token’s user will be used as the content author. Content will be created in Engage Digital and pushed asynchronously to the source. Replying to a customer content is usually possible (unless the source/conversation is read only). Composing a content on the contrary depend on the source itself: * The source may not support it (and be purely reactive like Instagram, Messenger ...) * Some sources (usually public account) like Twitter or Facebook page allows to publish content without targeting specific individuals. * Some sources (usually non public media) require specific targeting (phone number for SMS, email address for email, customer_id ...) to be able to create a content. This is source specific and detailed under the generic parameters.  Authorization​: only users that can reply or initiate discussion (&#x3D; compose) on given source. it renders also an error if in_reply_to isn’t synchronized or if in_reply_to content is not under an ​open intervention.
   * @param body The content’s body. This parameter is mandatory. (required)
   * @param authorId The identity id of content. This parameter is not mandatory, by default it use the token’s user first identity on source. (optional)
   * @param inReplyToId The content’s id you want to reply to. If omitted, a new discussion will be created. If source does not support to initiate discussion this parameter is mandatory. (optional)
   * @param _private Created contents are public by default, set this parameter to \&quot;true\&quot; in order to create a private reply. It is NOT supported on every source. (optional)
   * @param sourceId The source to create content to. If you specify &#x60;in_reply_to_id&#x60; parameter, source will be determined from it. Otherwise, this parameter is mandatory. (optional)
   * @param attachmentIds An array containing the attachments’ ids that need to be attached to this content. (optional)
   * @param autoSubmitted Marks the message as automatically sent. (optional)
   * @param title For an email source. The subject of the email. This parameter is mandatory when initiating a discussion. (optional)
   * @param to For an email or SMS and WhatsApp source. For an email, an array containing the email addresses used in the “To” section of the email. This parameter is mandatory when initiating a discussion. For a WhatsApp message or a SMS, the number the message will be sent to. It must start with 00 or +, example: +33634231224 or 0033634231224. This parameter is mandatory when initiating a discussion. (optional)
   * @param cc For an email source. An array containing the email addresses used in the “Cc” section of the email. (optional)
   * @param bcc For an email source. An array containing the email addresses used in the “Bcc” section of the email. (optional)
   * @param templateName Mandatory for a WhatsApp source. A discussion can only be initiated using a specific template created on the business manager and approved by WhatsApp. You can find all available template_names on /1.0/content_sources/source_id. (optional)
   * @param templateLanguage Mandatory for a WhatsApp source. A discussion can only be initiated using a specific template created on the business manager and approved by WhatsApp. You can find all available template_languages for a given template_name on /1.0/content_sources/source_id. (optional)
   * @return Content
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public Content createContent(String body, String authorId, String inReplyToId, Boolean _private, String sourceId, List<String> attachmentIds, Boolean autoSubmitted, String title, List<String> to, List<String> cc, List<String> bcc, String templateName, String templateLanguage) throws ApiException {
    return createContentWithHttpInfo(body, authorId, inReplyToId, _private, sourceId, attachmentIds, autoSubmitted, title, to, cc, bcc, templateName, templateLanguage).getData();
  }

  /**
   * Creating content
   * This method allows you to create new content for use in discussions. It can be a reply to another piece of content or be used to initiate discussion. If authorized, the token’s user will be used as the content author. Content will be created in Engage Digital and pushed asynchronously to the source. Replying to a customer content is usually possible (unless the source/conversation is read only). Composing a content on the contrary depend on the source itself: * The source may not support it (and be purely reactive like Instagram, Messenger ...) * Some sources (usually public account) like Twitter or Facebook page allows to publish content without targeting specific individuals. * Some sources (usually non public media) require specific targeting (phone number for SMS, email address for email, customer_id ...) to be able to create a content. This is source specific and detailed under the generic parameters.  Authorization​: only users that can reply or initiate discussion (&#x3D; compose) on given source. it renders also an error if in_reply_to isn’t synchronized or if in_reply_to content is not under an ​open intervention.
   * @param body The content’s body. This parameter is mandatory. (required)
   * @param authorId The identity id of content. This parameter is not mandatory, by default it use the token’s user first identity on source. (optional)
   * @param inReplyToId The content’s id you want to reply to. If omitted, a new discussion will be created. If source does not support to initiate discussion this parameter is mandatory. (optional)
   * @param _private Created contents are public by default, set this parameter to \&quot;true\&quot; in order to create a private reply. It is NOT supported on every source. (optional)
   * @param sourceId The source to create content to. If you specify &#x60;in_reply_to_id&#x60; parameter, source will be determined from it. Otherwise, this parameter is mandatory. (optional)
   * @param attachmentIds An array containing the attachments’ ids that need to be attached to this content. (optional)
   * @param autoSubmitted Marks the message as automatically sent. (optional)
   * @param title For an email source. The subject of the email. This parameter is mandatory when initiating a discussion. (optional)
   * @param to For an email or SMS and WhatsApp source. For an email, an array containing the email addresses used in the “To” section of the email. This parameter is mandatory when initiating a discussion. For a WhatsApp message or a SMS, the number the message will be sent to. It must start with 00 or +, example: +33634231224 or 0033634231224. This parameter is mandatory when initiating a discussion. (optional)
   * @param cc For an email source. An array containing the email addresses used in the “Cc” section of the email. (optional)
   * @param bcc For an email source. An array containing the email addresses used in the “Bcc” section of the email. (optional)
   * @param templateName Mandatory for a WhatsApp source. A discussion can only be initiated using a specific template created on the business manager and approved by WhatsApp. You can find all available template_names on /1.0/content_sources/source_id. (optional)
   * @param templateLanguage Mandatory for a WhatsApp source. A discussion can only be initiated using a specific template created on the business manager and approved by WhatsApp. You can find all available template_languages for a given template_name on /1.0/content_sources/source_id. (optional)
   * @return ApiResponse&lt;Content&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Content> createContentWithHttpInfo(String body, String authorId, String inReplyToId, Boolean _private, String sourceId, List<String> attachmentIds, Boolean autoSubmitted, String title, List<String> to, List<String> cc, List<String> bcc, String templateName, String templateLanguage) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createContent");
    }
    
    // create path and map variables
    String localVarPath = "/contents";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "author_id", authorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "in_reply_to_id", inReplyToId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "private", _private));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "source_id", sourceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "attachment_ids[]", attachmentIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "auto_submitted", autoSubmitted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "to[]", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "cc[]", cc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "bcc[]", bcc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "template_name", templateName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "template_language", templateLanguage));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Content> localVarReturnType = new GenericType<Content>() {};

    return apiClient.invokeAPI("ContentsApi.createContent", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Contents
   * This method renders contents ordered by creation date (descending). Only contents in sources where token’s user has “read” permission are returned.  Authorization​: no.
   * @param q To filter contents on given query. Query works exactly like threads query but only have those keywords: intervention,identity, identity_group, source, status_in, thread or text. Order can be created_at.desc (default) or created_at.asc. e.g. q&#x3D;intervention:\&quot;7f946431b6eebffafae642cc\&quot;%20source:\&quot;d19c81948c137d86dac77216\&quot; Please refer to ​Search &amp; filtering parameters​ for more details. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllContentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllContentsResponse getAllContents(String q, Integer offset, Integer limit) throws ApiException {
    return getAllContentsWithHttpInfo(q, offset, limit).getData();
  }

  /**
   * Contents
   * This method renders contents ordered by creation date (descending). Only contents in sources where token’s user has “read” permission are returned.  Authorization​: no.
   * @param q To filter contents on given query. Query works exactly like threads query but only have those keywords: intervention,identity, identity_group, source, status_in, thread or text. Order can be created_at.desc (default) or created_at.asc. e.g. q&#x3D;intervention:\&quot;7f946431b6eebffafae642cc\&quot;%20source:\&quot;d19c81948c137d86dac77216\&quot; Please refer to ​Search &amp; filtering parameters​ for more details. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllContentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllContentsResponse> getAllContentsWithHttpInfo(String q, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/contents";

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

    GenericType<GetAllContentsResponse> localVarReturnType = new GenericType<GetAllContentsResponse>() {};

    return apiClient.invokeAPI("ContentsApi.getAllContents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a content from its id
   * This method renders a content from given id. If token’s user does not have “read” on content’s source a 404 HTTP response will be returned.  Authorization​: no.
   * @param contentId  (required)
   * @return Content
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Content getContent(String contentId) throws ApiException {
    return getContentWithHttpInfo(contentId).getData();
  }

  /**
   * Getting a content from its id
   * This method renders a content from given id. If token’s user does not have “read” on content’s source a 404 HTTP response will be returned.  Authorization​: no.
   * @param contentId  (required)
   * @return ApiResponse&lt;Content&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Content> getContentWithHttpInfo(String contentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contentId' is set
    if (contentId == null) {
      throw new ApiException(400, "Missing the required parameter 'contentId' when calling getContent");
    }
    
    // create path and map variables
    String localVarPath = "/contents/{contentId}"
      .replaceAll("\\{" + "contentId" + "\\}", apiClient.escapeString(contentId.toString()));

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

    GenericType<Content> localVarReturnType = new GenericType<Content>() {};

    return apiClient.invokeAPI("ContentsApi.getContent", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Ignoring a content
   * Ignores a content. If token’s user does not have “read” on content’s source a 404 HTTP response will be returned.  Authorization​: no.
   * @param contentId  (required)
   * @return Content
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public Content ignoreContent(String contentId) throws ApiException {
    return ignoreContentWithHttpInfo(contentId).getData();
  }

  /**
   * Ignoring a content
   * Ignores a content. If token’s user does not have “read” on content’s source a 404 HTTP response will be returned.  Authorization​: no.
   * @param contentId  (required)
   * @return ApiResponse&lt;Content&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Content> ignoreContentWithHttpInfo(String contentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contentId' is set
    if (contentId == null) {
      throw new ApiException(400, "Missing the required parameter 'contentId' when calling ignoreContent");
    }
    
    // create path and map variables
    String localVarPath = "/contents/{contentId}/ignore"
      .replaceAll("\\{" + "contentId" + "\\}", apiClient.escapeString(contentId.toString()));

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

    GenericType<Content> localVarReturnType = new GenericType<Content>() {};

    return apiClient.invokeAPI("ContentsApi.ignoreContent", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
