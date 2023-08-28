package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import jakarta.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Event;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllEventsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-28T22:45:26.654875700+02:00[Europe/Paris]")
public class EventsApi {
  private ApiClient apiClient;

  public EventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EventsApi(ApiClient apiClient) {
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
   * Getting all events
   * This method renders events ordered by creation date (descending).  Authorization​: Only users whose role can search event permission.
   * @param q To filter events on given query. Query works exactly like threads query but only have those keywords: content, content_thread, name_in, created_before, created_after, user. Order can be created_at.desc (default) or created_at.asc. e.g. q&#x3D;name_in:\&quot;content.replied\&quot;%20content_thread:\&quot;7f946431b6eebffafae642cc\&quot;%20created_after:\&quot;2014-03-20\&quot;%20user:\&quot;4ee91f197aa58d01b500000f\&quot;%20order:\&quot;created_at.asc\&quot; * DateTime parameters should be ISO-8601 * you can specify multiple value for a given keyword: q&#x3D;name_in:’content.replied’&amp;name_in:’content.ignored’ Please refer to ​Search &amp; filtering parameters​ for more details. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllEventsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllEventsResponse getAllEvents(String q, Integer offset, Integer limit) throws ApiException {
    return getAllEventsWithHttpInfo(q, offset, limit).getData();
  }

  /**
   * Getting all events
   * This method renders events ordered by creation date (descending).  Authorization​: Only users whose role can search event permission.
   * @param q To filter events on given query. Query works exactly like threads query but only have those keywords: content, content_thread, name_in, created_before, created_after, user. Order can be created_at.desc (default) or created_at.asc. e.g. q&#x3D;name_in:\&quot;content.replied\&quot;%20content_thread:\&quot;7f946431b6eebffafae642cc\&quot;%20created_after:\&quot;2014-03-20\&quot;%20user:\&quot;4ee91f197aa58d01b500000f\&quot;%20order:\&quot;created_at.asc\&quot; * DateTime parameters should be ISO-8601 * you can specify multiple value for a given keyword: q&#x3D;name_in:’content.replied’&amp;name_in:’content.ignored’ Please refer to ​Search &amp; filtering parameters​ for more details. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllEventsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllEventsResponse> getAllEventsWithHttpInfo(String q, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/events";

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

    GenericType<GetAllEventsResponse> localVarReturnType = new GenericType<GetAllEventsResponse>() {};

    return apiClient.invokeAPI("EventsApi.getAllEvents", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting an event from its id
   * This method renders an event from given id. If token’s user role does not have “search event” permission a 404 HTTP response will be returned.  Authorization​: Only users who’s role can search event permission.
   * @param eventId  (required)
   * @return Event
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Event getEvent(String eventId) throws ApiException {
    return getEventWithHttpInfo(eventId).getData();
  }

  /**
   * Getting an event from its id
   * This method renders an event from given id. If token’s user role does not have “search event” permission a 404 HTTP response will be returned.  Authorization​: Only users who’s role can search event permission.
   * @param eventId  (required)
   * @return ApiResponse&lt;Event&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Event> getEventWithHttpInfo(String eventId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'eventId' is set
    if (eventId == null) {
      throw new ApiException(400, "Missing the required parameter 'eventId' when calling getEvent");
    }
    
    // create path and map variables
    String localVarPath = "/events/{eventId}"
      .replaceAll("\\{" + "eventId" + "\\}", apiClient.escapeString(eventId.toString()));

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

    GenericType<Event> localVarReturnType = new GenericType<Event>() {};

    return apiClient.invokeAPI("EventsApi.getEvent", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
