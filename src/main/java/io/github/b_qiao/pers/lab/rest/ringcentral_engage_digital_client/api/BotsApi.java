package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.BotCompleteResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.HandoverFromBotToAgentResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Intervention;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class BotsApi {
  private ApiClient apiClient;

  public BotsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BotsApi(ApiClient apiClient) {
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
   * Bot complete
   * This method is used to complete an intervention from a bot (closing the intervention and completing the task). In case of success it renders 200, otherwise, it renders an error (422 HTTP code).
   * @param interventionId The intervention_id of the intervention that you want to complete. (required)
   * @param closeThread Wether if the thread should be closed at the same time. (optional)
   * @return BotCompleteResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public BotCompleteResponse botComplete(String interventionId, Boolean closeThread) throws ApiException {
    return botCompleteWithHttpInfo(interventionId, closeThread).getData();
  }

  /**
   * Bot complete
   * This method is used to complete an intervention from a bot (closing the intervention and completing the task). In case of success it renders 200, otherwise, it renders an error (422 HTTP code).
   * @param interventionId The intervention_id of the intervention that you want to complete. (required)
   * @param closeThread Wether if the thread should be closed at the same time. (optional)
   * @return ApiResponse&lt;BotCompleteResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BotCompleteResponse> botCompleteWithHttpInfo(String interventionId, Boolean closeThread) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'interventionId' is set
    if (interventionId == null) {
      throw new ApiException(400, "Missing the required parameter 'interventionId' when calling botComplete");
    }
    
    // create path and map variables
    String localVarPath = "/bots/complete";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "intervention_id", interventionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "close_thread", closeThread));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<BotCompleteResponse> localVarReturnType = new GenericType<BotCompleteResponse>() {};

    return apiClient.invokeAPI("BotsApi.botComplete", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Bot engage
   * This method is used to engage a thread from a bot. In case of success it renders the intervention, otherwise, it renders an error (422 HTTP code). This method opens intervention as the virtual agent user.
   * @param contentId The content_id of the content for which you want to engage the bot. (required)
   * @return Intervention
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public Intervention botEngage(String contentId) throws ApiException {
    return botEngageWithHttpInfo(contentId).getData();
  }

  /**
   * Bot engage
   * This method is used to engage a thread from a bot. In case of success it renders the intervention, otherwise, it renders an error (422 HTTP code). This method opens intervention as the virtual agent user.
   * @param contentId The content_id of the content for which you want to engage the bot. (required)
   * @return ApiResponse&lt;Intervention&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Intervention> botEngageWithHttpInfo(String contentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'contentId' is set
    if (contentId == null) {
      throw new ApiException(400, "Missing the required parameter 'contentId' when calling botEngage");
    }
    
    // create path and map variables
    String localVarPath = "/bots/engage";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "content_id", contentId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Intervention> localVarReturnType = new GenericType<Intervention>() {};

    return apiClient.invokeAPI("BotsApi.botEngage", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Bot handover
   * This method is used to handover a conversation between a bot and an agent. It handles 2 different cases, specific sources handover (Messenger for example, see Bots API doc) and handover between Engage Virtual Agents and human agents
   * @param from Who we are taking the conversation control from (either bot or agent). (required)
   * @param to Who we are giving the convesation control to (either bot or agent). (required)
   * @param type The type of handover (either type of channel or engage_virtual_agent). (required)
   * @param identityForeignId The foreign_id of the identity for which you want to do the handover (only for source specific handover). (required)
   * @param appId The id of the Facebook&#39;s app that controls the Bot (only for source specific handover). (optional)
   * @param interventionId The id of the intervention that we want to handover (only for Engage Virtual Agent handover). (optional)
   * @return HandoverFromBotToAgentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public HandoverFromBotToAgentResponse handoverFromBotToAgent(String from, String to, String type, String identityForeignId, String appId, String interventionId) throws ApiException {
    return handoverFromBotToAgentWithHttpInfo(from, to, type, identityForeignId, appId, interventionId).getData();
  }

  /**
   * Bot handover
   * This method is used to handover a conversation between a bot and an agent. It handles 2 different cases, specific sources handover (Messenger for example, see Bots API doc) and handover between Engage Virtual Agents and human agents
   * @param from Who we are taking the conversation control from (either bot or agent). (required)
   * @param to Who we are giving the convesation control to (either bot or agent). (required)
   * @param type The type of handover (either type of channel or engage_virtual_agent). (required)
   * @param identityForeignId The foreign_id of the identity for which you want to do the handover (only for source specific handover). (required)
   * @param appId The id of the Facebook&#39;s app that controls the Bot (only for source specific handover). (optional)
   * @param interventionId The id of the intervention that we want to handover (only for Engage Virtual Agent handover). (optional)
   * @return ApiResponse&lt;HandoverFromBotToAgentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<HandoverFromBotToAgentResponse> handoverFromBotToAgentWithHttpInfo(String from, String to, String type, String identityForeignId, String appId, String interventionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'from' is set
    if (from == null) {
      throw new ApiException(400, "Missing the required parameter 'from' when calling handoverFromBotToAgent");
    }
    
    // verify the required parameter 'to' is set
    if (to == null) {
      throw new ApiException(400, "Missing the required parameter 'to' when calling handoverFromBotToAgent");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling handoverFromBotToAgent");
    }
    
    // verify the required parameter 'identityForeignId' is set
    if (identityForeignId == null) {
      throw new ApiException(400, "Missing the required parameter 'identityForeignId' when calling handoverFromBotToAgent");
    }
    
    // create path and map variables
    String localVarPath = "/bots/handover";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "to", to));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "identity_foreign_id", identityForeignId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "app_id", appId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "intervention_id", interventionId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<HandoverFromBotToAgentResponse> localVarReturnType = new GenericType<HandoverFromBotToAgentResponse>() {};

    return apiClient.invokeAPI("BotsApi.handoverFromBotToAgent", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
