# TimeSheetsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTimeSheet**](TimeSheetsApi.md#createTimeSheet) | **POST** /time_sheets | Creating a time sheet |
| [**deleteTimeSheet**](TimeSheetsApi.md#deleteTimeSheet) | **DELETE** /time_sheets/{timeSheetId} | Deleting a time sheet |
| [**getAllTimeSheets**](TimeSheetsApi.md#getAllTimeSheets) | **GET** /time_sheets | Getting all time sheets |
| [**getTimeSheet**](TimeSheetsApi.md#getTimeSheet) | **GET** /time_sheets/{timeSheetId} | Getting a time sheet from its id |
| [**updateTimeSheet**](TimeSheetsApi.md#updateTimeSheet) | **PUT** /time_sheets/{timeSheetId} | Updating a time sheet |



## createTimeSheet

> TimeSheet createTimeSheet(label, active, sourceIds, holidaysRegion, holidays, mondayHours, tuesdayHours, wednesdayHours, thursdayHours, fridayHours, saturdayHours, sundayHours)

Creating a time sheet

This method creates a time sheet. In case of success it renders the time sheet, otherwise, it renders an error (422 HTTP code).

Authorization​: only users that can create time sheet.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TimeSheetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TimeSheetsApi apiInstance = new TimeSheetsApi(defaultClient);
        String label = "label_example"; // String | The label of the time sheet.
        Boolean active = true; // Boolean | true or false, this field is used to enable/disable a time sheet.
        List<String> sourceIds = Arrays.asList(); // List<String> | An array containing id of each source using your time sheet.
        String holidaysRegion = "de"; // String | A string containing the first two letters of your country (example: \"fr\"/\"en\"/\"es\"), useful to bootstrap default holidays following to a country.
        String holidays = "holidays_example"; // String | An array containing one or more hash of holidays, a holiday must contain a name (string) and a date (string), the date must be in a valid format, a valid format is a format corresponding to your domain’s locale).
        String mondayHours = "mondayHours_example"; // String | this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. For example: “a-b,c-d”: “a” is the beginning of the first interval of the day, “b” is the ending of the first interval of the day, “c” is the beginning of the second interval of the day, “d” is the ending of the second interval of the day
        String tuesdayHours = "tuesdayHours_example"; // String | this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See `monday_hours` for the format.
        String wednesdayHours = "wednesdayHours_example"; // String | this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See `monday_hours` for the format.
        String thursdayHours = "thursdayHours_example"; // String | this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See `monday_hours` for the format.
        String fridayHours = "fridayHours_example"; // String | this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See `monday_hours` for the format.
        String saturdayHours = "saturdayHours_example"; // String | this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See `monday_hours` for the format.
        String sundayHours = "sundayHours_example"; // String | this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See `monday_hours` for the format.
        try {
            TimeSheet result = apiInstance.createTimeSheet(label, active, sourceIds, holidaysRegion, holidays, mondayHours, tuesdayHours, wednesdayHours, thursdayHours, fridayHours, saturdayHours, sundayHours);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeSheetsApi#createTimeSheet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **label** | **String**| The label of the time sheet. | |
| **active** | **Boolean**| true or false, this field is used to enable/disable a time sheet. | [optional] |
| **sourceIds** | **List&lt;String&gt;**| An array containing id of each source using your time sheet. | [optional] |
| **holidaysRegion** | **String**| A string containing the first two letters of your country (example: \&quot;fr\&quot;/\&quot;en\&quot;/\&quot;es\&quot;), useful to bootstrap default holidays following to a country. | [optional] [enum: de, es, fr, gb, it, nl, us] |
| **holidays** | **String**| An array containing one or more hash of holidays, a holiday must contain a name (string) and a date (string), the date must be in a valid format, a valid format is a format corresponding to your domain’s locale). | [optional] |
| **mondayHours** | **String**| this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. For example: “a-b,c-d”: “a” is the beginning of the first interval of the day, “b” is the ending of the first interval of the day, “c” is the beginning of the second interval of the day, “d” is the ending of the second interval of the day | [optional] |
| **tuesdayHours** | **String**| this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. | [optional] |
| **wednesdayHours** | **String**| this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. | [optional] |
| **thursdayHours** | **String**| this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. | [optional] |
| **fridayHours** | **String**| this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. | [optional] |
| **saturdayHours** | **String**| this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. | [optional] |
| **sundayHours** | **String**| this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. | [optional] |

### Return type

[**TimeSheet**](TimeSheet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteTimeSheet

> TimeSheet deleteTimeSheet(timeSheetId)

Deleting a time sheet

This method destroys an existing time sheet. It renders time sheet itself. It renders a 404 if id is invalid.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TimeSheetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TimeSheetsApi apiInstance = new TimeSheetsApi(defaultClient);
        String timeSheetId = "timeSheetId_example"; // String | 
        try {
            TimeSheet result = apiInstance.deleteTimeSheet(timeSheetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeSheetsApi#deleteTimeSheet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **timeSheetId** | **String**|  | |

### Return type

[**TimeSheet**](TimeSheet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllTimeSheets

> GetAllTimeSheetsResponse getAllTimeSheets(offset, limit)

Getting all time sheets

This method renders time sheets ordered by active and label.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TimeSheetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TimeSheetsApi apiInstance = new TimeSheetsApi(defaultClient);
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllTimeSheetsResponse result = apiInstance.getAllTimeSheets(offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeSheetsApi#getAllTimeSheets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **offset** | **Integer**| The record index to start. Default value is 0. | [optional] |
| **limit** | **Integer**| The max number of records to return. Default value is 30, max value is 150. | [optional] |

### Return type

[**GetAllTimeSheetsResponse**](GetAllTimeSheetsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getTimeSheet

> TimeSheet getTimeSheet(timeSheetId)

Getting a time sheet from its id

This method renders a time sheet from given id.

Authorization​: only users that can see time sheets in administration section.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TimeSheetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TimeSheetsApi apiInstance = new TimeSheetsApi(defaultClient);
        String timeSheetId = "timeSheetId_example"; // String | 
        try {
            TimeSheet result = apiInstance.getTimeSheet(timeSheetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeSheetsApi#getTimeSheet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **timeSheetId** | **String**|  | |

### Return type

[**TimeSheet**](TimeSheet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateTimeSheet

> TimeSheet updateTimeSheet(timeSheetId, active, label, sourceIds, holidays, mondayHours, tuesdayHours, wednesdayHours, thursdayHours, fridayHours, saturdayHours, sundayHours)

Updating a time sheet

This method updates an existing team from given attributes and renders it in case of success.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TimeSheetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TimeSheetsApi apiInstance = new TimeSheetsApi(defaultClient);
        String timeSheetId = "timeSheetId_example"; // String | 
        Boolean active = true; // Boolean | true or false, this field is used to enable/disable a time sheet.
        String label = "label_example"; // String | The label of the time sheet.
        List<String> sourceIds = Arrays.asList(); // List<String> | An array containing id of each source using your time sheet.
        String holidays = "holidays_example"; // String | An array containing one or more hash of holidays, a holiday must contain a name (string) and a date (string), the date must be in a valid format, a valid format is a format corresponding to your domain’s locale).
        String mondayHours = "mondayHours_example"; // String | this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. For example: “a-b,c-d”: “a” is the beginning of the first interval of the day, “b” is the ending of the first interval of the day, “c” is the beginning of the second interval of the day, “d” is the ending of the second interval of the day
        String tuesdayHours = "tuesdayHours_example"; // String | this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See `monday_hours` for the format.
        String wednesdayHours = "wednesdayHours_example"; // String | this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See `monday_hours` for the format.
        String thursdayHours = "thursdayHours_example"; // String | this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See `monday_hours` for the format.
        String fridayHours = "fridayHours_example"; // String | this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See `monday_hours` for the format.
        String saturdayHours = "saturdayHours_example"; // String | this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See `monday_hours` for the format.
        String sundayHours = "sundayHours_example"; // String | this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See `monday_hours` for the format.
        try {
            TimeSheet result = apiInstance.updateTimeSheet(timeSheetId, active, label, sourceIds, holidays, mondayHours, tuesdayHours, wednesdayHours, thursdayHours, fridayHours, saturdayHours, sundayHours);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TimeSheetsApi#updateTimeSheet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **timeSheetId** | **String**|  | |
| **active** | **Boolean**| true or false, this field is used to enable/disable a time sheet. | [optional] |
| **label** | **String**| The label of the time sheet. | [optional] |
| **sourceIds** | **List&lt;String&gt;**| An array containing id of each source using your time sheet. | [optional] |
| **holidays** | **String**| An array containing one or more hash of holidays, a holiday must contain a name (string) and a date (string), the date must be in a valid format, a valid format is a format corresponding to your domain’s locale). | [optional] |
| **mondayHours** | **String**| this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. For example: “a-b,c-d”: “a” is the beginning of the first interval of the day, “b” is the ending of the first interval of the day, “c” is the beginning of the second interval of the day, “d” is the ending of the second interval of the day | [optional] |
| **tuesdayHours** | **String**| this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. | [optional] |
| **wednesdayHours** | **String**| this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. | [optional] |
| **thursdayHours** | **String**| this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. | [optional] |
| **fridayHours** | **String**| this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. | [optional] |
| **saturdayHours** | **String**| this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. | [optional] |
| **sundayHours** | **String**| this field define the time intervals of the day (in secs). An empty string means that there are no business hours on this day. See &#x60;monday_hours&#x60; for the format. | [optional] |

### Return type

[**TimeSheet**](TimeSheet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

