package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllTimeSheetsResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.TimeSheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class TimeSheetsApi {
  private ApiClient apiClient;

  public TimeSheetsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TimeSheetsApi(ApiClient apiClient) {
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
   * Creating a time sheet
   * This method creates a time sheet. In case of success it renders the time sheet, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can create time sheet.
   * @param label The label of the time sheet. (required)
   * @param active true or false, this field is used to enable/disable a time sheet. (optional)
   * @param sourceIds An array containing id of each source using your time sheet. (optional)
   * @param holidaysRegion A string containing the first two letters of your country (example: \&quot;fr\&quot;/\&quot;en\&quot;/\&quot;es\&quot;), useful to bootstrap default holidays following to a country. (optional)
   * @param holidays An array containing one or more hash of holidays, a holiday must contain a name (string) and a date (string), the date must be in a valid format, a valid format is a format corresponding to your domain’s locale). (optional)
   * @param mondayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. For example: “a-b,c-d”: “a” is the beginning of the first interval of the day, “b” is the ending of the first interval of the day, “c” is the beginning of the second interval of the day, “d” is the ending of the second interval of the day (optional)
   * @param tuesdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param wednesdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param thursdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param fridayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param saturdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param sundayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @return TimeSheet
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public TimeSheet createTimeSheet(String label, Boolean active, List<String> sourceIds, String holidaysRegion, String holidays, String mondayHours, String tuesdayHours, String wednesdayHours, String thursdayHours, String fridayHours, String saturdayHours, String sundayHours) throws ApiException {
    return createTimeSheetWithHttpInfo(label, active, sourceIds, holidaysRegion, holidays, mondayHours, tuesdayHours, wednesdayHours, thursdayHours, fridayHours, saturdayHours, sundayHours).getData();
  }

  /**
   * Creating a time sheet
   * This method creates a time sheet. In case of success it renders the time sheet, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can create time sheet.
   * @param label The label of the time sheet. (required)
   * @param active true or false, this field is used to enable/disable a time sheet. (optional)
   * @param sourceIds An array containing id of each source using your time sheet. (optional)
   * @param holidaysRegion A string containing the first two letters of your country (example: \&quot;fr\&quot;/\&quot;en\&quot;/\&quot;es\&quot;), useful to bootstrap default holidays following to a country. (optional)
   * @param holidays An array containing one or more hash of holidays, a holiday must contain a name (string) and a date (string), the date must be in a valid format, a valid format is a format corresponding to your domain’s locale). (optional)
   * @param mondayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. For example: “a-b,c-d”: “a” is the beginning of the first interval of the day, “b” is the ending of the first interval of the day, “c” is the beginning of the second interval of the day, “d” is the ending of the second interval of the day (optional)
   * @param tuesdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param wednesdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param thursdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param fridayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param saturdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param sundayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @return ApiResponse&lt;TimeSheet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TimeSheet> createTimeSheetWithHttpInfo(String label, Boolean active, List<String> sourceIds, String holidaysRegion, String holidays, String mondayHours, String tuesdayHours, String wednesdayHours, String thursdayHours, String fridayHours, String saturdayHours, String sundayHours) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'label' is set
    if (label == null) {
      throw new ApiException(400, "Missing the required parameter 'label' when calling createTimeSheet");
    }
    
    // create path and map variables
    String localVarPath = "/time_sheets";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "active", active));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "label", label));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source_ids[]", sourceIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "holidays_region", holidaysRegion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "holidays", holidays));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "monday_hours", mondayHours));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tuesday_hours", tuesdayHours));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "wednesday_hours", wednesdayHours));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "thursday_hours", thursdayHours));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "friday_hours", fridayHours));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "saturday_hours", saturdayHours));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sunday_hours", sundayHours));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TimeSheet> localVarReturnType = new GenericType<TimeSheet>() {};

    return apiClient.invokeAPI("TimeSheetsApi.createTimeSheet", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deleting a time sheet
   * This method destroys an existing time sheet. It renders time sheet itself. It renders a 404 if id is invalid.
   * @param timeSheetId  (required)
   * @return TimeSheet
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public TimeSheet deleteTimeSheet(String timeSheetId) throws ApiException {
    return deleteTimeSheetWithHttpInfo(timeSheetId).getData();
  }

  /**
   * Deleting a time sheet
   * This method destroys an existing time sheet. It renders time sheet itself. It renders a 404 if id is invalid.
   * @param timeSheetId  (required)
   * @return ApiResponse&lt;TimeSheet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TimeSheet> deleteTimeSheetWithHttpInfo(String timeSheetId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timeSheetId' is set
    if (timeSheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'timeSheetId' when calling deleteTimeSheet");
    }
    
    // create path and map variables
    String localVarPath = "/time_sheets/{timeSheetId}"
      .replaceAll("\\{" + "timeSheetId" + "\\}", apiClient.escapeString(timeSheetId.toString()));

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

    GenericType<TimeSheet> localVarReturnType = new GenericType<TimeSheet>() {};

    return apiClient.invokeAPI("TimeSheetsApi.deleteTimeSheet", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all time sheets
   * This method renders time sheets ordered by active and label.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllTimeSheetsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllTimeSheetsResponse getAllTimeSheets(Integer offset, Integer limit) throws ApiException {
    return getAllTimeSheetsWithHttpInfo(offset, limit).getData();
  }

  /**
   * Getting all time sheets
   * This method renders time sheets ordered by active and label.
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllTimeSheetsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllTimeSheetsResponse> getAllTimeSheetsWithHttpInfo(Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/time_sheets";

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

    GenericType<GetAllTimeSheetsResponse> localVarReturnType = new GenericType<GetAllTimeSheetsResponse>() {};

    return apiClient.invokeAPI("TimeSheetsApi.getAllTimeSheets", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a time sheet from its id
   * This method renders a time sheet from given id.  Authorization​: only users that can see time sheets in administration section.
   * @param timeSheetId  (required)
   * @return TimeSheet
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public TimeSheet getTimeSheet(String timeSheetId) throws ApiException {
    return getTimeSheetWithHttpInfo(timeSheetId).getData();
  }

  /**
   * Getting a time sheet from its id
   * This method renders a time sheet from given id.  Authorization​: only users that can see time sheets in administration section.
   * @param timeSheetId  (required)
   * @return ApiResponse&lt;TimeSheet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TimeSheet> getTimeSheetWithHttpInfo(String timeSheetId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timeSheetId' is set
    if (timeSheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'timeSheetId' when calling getTimeSheet");
    }
    
    // create path and map variables
    String localVarPath = "/time_sheets/{timeSheetId}"
      .replaceAll("\\{" + "timeSheetId" + "\\}", apiClient.escapeString(timeSheetId.toString()));

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

    GenericType<TimeSheet> localVarReturnType = new GenericType<TimeSheet>() {};

    return apiClient.invokeAPI("TimeSheetsApi.getTimeSheet", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a time sheet
   * This method updates an existing team from given attributes and renders it in case of success.
   * @param timeSheetId  (required)
   * @param active true or false, this field is used to enable/disable a time sheet. (optional)
   * @param label The label of the time sheet. (optional)
   * @param sourceIds An array containing id of each source using your time sheet. (optional)
   * @param holidays An array containing one or more hash of holidays, a holiday must contain a name (string) and a date (string), the date must be in a valid format, a valid format is a format corresponding to your domain’s locale). (optional)
   * @param mondayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. For example: “a-b,c-d”: “a” is the beginning of the first interval of the day, “b” is the ending of the first interval of the day, “c” is the beginning of the second interval of the day, “d” is the ending of the second interval of the day (optional)
   * @param tuesdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param wednesdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param thursdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param fridayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param saturdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param sundayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @return TimeSheet
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public TimeSheet updateTimeSheet(String timeSheetId, Boolean active, String label, List<String> sourceIds, String holidays, String mondayHours, String tuesdayHours, String wednesdayHours, String thursdayHours, String fridayHours, String saturdayHours, String sundayHours) throws ApiException {
    return updateTimeSheetWithHttpInfo(timeSheetId, active, label, sourceIds, holidays, mondayHours, tuesdayHours, wednesdayHours, thursdayHours, fridayHours, saturdayHours, sundayHours).getData();
  }

  /**
   * Updating a time sheet
   * This method updates an existing team from given attributes and renders it in case of success.
   * @param timeSheetId  (required)
   * @param active true or false, this field is used to enable/disable a time sheet. (optional)
   * @param label The label of the time sheet. (optional)
   * @param sourceIds An array containing id of each source using your time sheet. (optional)
   * @param holidays An array containing one or more hash of holidays, a holiday must contain a name (string) and a date (string), the date must be in a valid format, a valid format is a format corresponding to your domain’s locale). (optional)
   * @param mondayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. For example: “a-b,c-d”: “a” is the beginning of the first interval of the day, “b” is the ending of the first interval of the day, “c” is the beginning of the second interval of the day, “d” is the ending of the second interval of the day (optional)
   * @param tuesdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param wednesdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param thursdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param fridayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param saturdayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @param sundayHours this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. (optional)
   * @return ApiResponse&lt;TimeSheet&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TimeSheet> updateTimeSheetWithHttpInfo(String timeSheetId, Boolean active, String label, List<String> sourceIds, String holidays, String mondayHours, String tuesdayHours, String wednesdayHours, String thursdayHours, String fridayHours, String saturdayHours, String sundayHours) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timeSheetId' is set
    if (timeSheetId == null) {
      throw new ApiException(400, "Missing the required parameter 'timeSheetId' when calling updateTimeSheet");
    }
    
    // create path and map variables
    String localVarPath = "/time_sheets/{timeSheetId}"
      .replaceAll("\\{" + "timeSheetId" + "\\}", apiClient.escapeString(timeSheetId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "active", active));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "label", label));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source_ids[]", sourceIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "holidays", holidays));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "monday_hours", mondayHours));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tuesday_hours", tuesdayHours));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "wednesday_hours", wednesdayHours));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "thursday_hours", thursdayHours));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "friday_hours", fridayHours));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "saturday_hours", saturdayHours));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sunday_hours", sundayHours));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<TimeSheet> localVarReturnType = new GenericType<TimeSheet>() {};

    return apiClient.invokeAPI("TimeSheetsApi.updateTimeSheet", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
