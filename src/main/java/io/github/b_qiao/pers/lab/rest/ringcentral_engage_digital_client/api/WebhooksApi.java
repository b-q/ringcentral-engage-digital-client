package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllWebhooksResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Webhook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class WebhooksApi {
  private ApiClient apiClient;

  public WebhooksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WebhooksApi(ApiClient apiClient) {
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
   * Creating a webhook
   * This method creates a webhook. In case of success it renders the webhook, otherwise, it renders an error (422 HTTP code).  Authorization​: All users having the manage_api_access_tokens permission or all users having an api access token.
   * @param accessToken Access token. (required)
   * @param url The url of a webhook. This is used to determine the endpoint of your webhook, where (required)
   * @param registeredEvents An array containing all the events that your webhook wants to subscribe. (required)
   * @param active true or false, this field is used to enable/disable a webhook. (optional)
   * @param name The name of the webhook. (optional)
   * @param stagingUse true or false, this field is used to determine if a webhook will be run in staging (optional)
   * @param verifyToken The token used in your webhook. (optional)
   * @param secret The secret key that will be served as a ​&#x60;X-Dimelo-Secret​&#x60; header in every request. (optional)
   * @return Webhook
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Webhook createWebhook(String accessToken, String url, List<String> registeredEvents, Boolean active, String name, Boolean stagingUse, String verifyToken, String secret) throws ApiException {
    return createWebhookWithHttpInfo(accessToken, url, registeredEvents, active, name, stagingUse, verifyToken, secret).getData();
  }

  /**
   * Creating a webhook
   * This method creates a webhook. In case of success it renders the webhook, otherwise, it renders an error (422 HTTP code).  Authorization​: All users having the manage_api_access_tokens permission or all users having an api access token.
   * @param accessToken Access token. (required)
   * @param url The url of a webhook. This is used to determine the endpoint of your webhook, where (required)
   * @param registeredEvents An array containing all the events that your webhook wants to subscribe. (required)
   * @param active true or false, this field is used to enable/disable a webhook. (optional)
   * @param name The name of the webhook. (optional)
   * @param stagingUse true or false, this field is used to determine if a webhook will be run in staging (optional)
   * @param verifyToken The token used in your webhook. (optional)
   * @param secret The secret key that will be served as a ​&#x60;X-Dimelo-Secret​&#x60; header in every request. (optional)
   * @return ApiResponse&lt;Webhook&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Webhook> createWebhookWithHttpInfo(String accessToken, String url, List<String> registeredEvents, Boolean active, String name, Boolean stagingUse, String verifyToken, String secret) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling createWebhook");
    }
    
    // verify the required parameter 'url' is set
    if (url == null) {
      throw new ApiException(400, "Missing the required parameter 'url' when calling createWebhook");
    }
    
    // verify the required parameter 'registeredEvents' is set
    if (registeredEvents == null) {
      throw new ApiException(400, "Missing the required parameter 'registeredEvents' when calling createWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "active", active));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "staging_use", stagingUse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verify_token", verifyToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "secret", secret));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "registered_events[]", registeredEvents));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Webhook> localVarReturnType = new GenericType<Webhook>() {};

    return apiClient.invokeAPI("WebhooksApi.createWebhook", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deleting a webhook
   * This method destroys an existing webhook. It renders webhook itself. It renders a 404 if id is invalid.  Authorization​: All users having the manage_api_access_tokens permission or all users having an api access token belonging to the webhook you’re deleting.
   * @param webhookId  (required)
   * @param accessToken Access token. (required)
   * @return Webhook
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Webhook deleteWebhook(String webhookId, String accessToken) throws ApiException {
    return deleteWebhookWithHttpInfo(webhookId, accessToken).getData();
  }

  /**
   * Deleting a webhook
   * This method destroys an existing webhook. It renders webhook itself. It renders a 404 if id is invalid.  Authorization​: All users having the manage_api_access_tokens permission or all users having an api access token belonging to the webhook you’re deleting.
   * @param webhookId  (required)
   * @param accessToken Access token. (required)
   * @return ApiResponse&lt;Webhook&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Webhook> deleteWebhookWithHttpInfo(String webhookId, String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling deleteWebhook");
    }
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling deleteWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/{webhookId}"
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Webhook> localVarReturnType = new GenericType<Webhook>() {};

    return apiClient.invokeAPI("WebhooksApi.deleteWebhook", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all webhooks
   * This method renders webhooks ordered by active and staging_use (descending).  Authorization​: users having manage_api_access_tokens permission can see all webhooks / users don’t having the manage_api_access_tokens permission can see only the webhooks belonging to access token created by them.
   * @param accessToken Access token. (required)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllWebhooksResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllWebhooksResponse getAllWebhooks(String accessToken, Integer offset, Integer limit) throws ApiException {
    return getAllWebhooksWithHttpInfo(accessToken, offset, limit).getData();
  }

  /**
   * Getting all webhooks
   * This method renders webhooks ordered by active and staging_use (descending).  Authorization​: users having manage_api_access_tokens permission can see all webhooks / users don’t having the manage_api_access_tokens permission can see only the webhooks belonging to access token created by them.
   * @param accessToken Access token. (required)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllWebhooksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllWebhooksResponse> getAllWebhooksWithHttpInfo(String accessToken, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling getAllWebhooks");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
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

    GenericType<GetAllWebhooksResponse> localVarReturnType = new GenericType<GetAllWebhooksResponse>() {};

    return apiClient.invokeAPI("WebhooksApi.getAllWebhooks", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a webhook from its id
   * This method renders a webhook from given id.  Authorization​: users having manage_api_access_tokens permission can see any webhook / users don’t having the &#x60;manage_api_access_tokens&#x60; permission can see only the webhook in case the webhook is associated to an access token created by them.
   * @param webhookId  (required)
   * @param accessToken Access token. (required)
   * @return Webhook
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Webhook getWebhook(String webhookId, String accessToken) throws ApiException {
    return getWebhookWithHttpInfo(webhookId, accessToken).getData();
  }

  /**
   * Getting a webhook from its id
   * This method renders a webhook from given id.  Authorization​: users having manage_api_access_tokens permission can see any webhook / users don’t having the &#x60;manage_api_access_tokens&#x60; permission can see only the webhook in case the webhook is associated to an access token created by them.
   * @param webhookId  (required)
   * @param accessToken Access token. (required)
   * @return ApiResponse&lt;Webhook&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Webhook> getWebhookWithHttpInfo(String webhookId, String accessToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling getWebhook");
    }
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling getWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/{webhookId}"
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Webhook> localVarReturnType = new GenericType<Webhook>() {};

    return apiClient.invokeAPI("WebhooksApi.getWebhook", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a webhook
   * This method updates an existing webhook from given attributes and renders it in case of success.  Authorization​: All users having the manage_api_access_tokens permission or all users having an api access token belonging to the webhook you’re updating.
   * @param webhookId  (required)
   * @param accessToken Access token. (required)
   * @param active true or false, this field is used to enable/disable a webhook. (optional)
   * @param name The name of the webhook. (optional)
   * @param stagingUse true or false, this field is used to determine if a webhook will be run in staging (optional)
   * @param url The url of a webhook. This is used to determine the endpoint of your webhook, where (optional)
   * @param verifyToken The token used in your webhook. (optional)
   * @param secret The secret key that will be served as a ​&#x60;X-Dimelo-Secret​&#x60; header in every request. (optional)
   * @param registeredEvents An array containing all the events that your webhook wants to subscribe. (optional)
   * @return Webhook
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Webhook updateWebhook(String webhookId, String accessToken, Boolean active, String name, Boolean stagingUse, String url, String verifyToken, String secret, List<String> registeredEvents) throws ApiException {
    return updateWebhookWithHttpInfo(webhookId, accessToken, active, name, stagingUse, url, verifyToken, secret, registeredEvents).getData();
  }

  /**
   * Updating a webhook
   * This method updates an existing webhook from given attributes and renders it in case of success.  Authorization​: All users having the manage_api_access_tokens permission or all users having an api access token belonging to the webhook you’re updating.
   * @param webhookId  (required)
   * @param accessToken Access token. (required)
   * @param active true or false, this field is used to enable/disable a webhook. (optional)
   * @param name The name of the webhook. (optional)
   * @param stagingUse true or false, this field is used to determine if a webhook will be run in staging (optional)
   * @param url The url of a webhook. This is used to determine the endpoint of your webhook, where (optional)
   * @param verifyToken The token used in your webhook. (optional)
   * @param secret The secret key that will be served as a ​&#x60;X-Dimelo-Secret​&#x60; header in every request. (optional)
   * @param registeredEvents An array containing all the events that your webhook wants to subscribe. (optional)
   * @return ApiResponse&lt;Webhook&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Webhook> updateWebhookWithHttpInfo(String webhookId, String accessToken, Boolean active, String name, Boolean stagingUse, String url, String verifyToken, String secret, List<String> registeredEvents) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new ApiException(400, "Missing the required parameter 'webhookId' when calling updateWebhook");
    }
    
    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(400, "Missing the required parameter 'accessToken' when calling updateWebhook");
    }
    
    // create path and map variables
    String localVarPath = "/webhooks/{webhookId}"
      .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_token", accessToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "active", active));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "staging_use", stagingUse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "verify_token", verifyToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "secret", secret));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "registered_events[]", registeredEvents));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Webhook> localVarReturnType = new GenericType<Webhook>() {};

    return apiClient.invokeAPI("WebhooksApi.updateWebhook", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
