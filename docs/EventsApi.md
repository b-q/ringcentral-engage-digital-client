# EventsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllEvents**](EventsApi.md#getAllEvents) | **GET** /events | Getting all events |
| [**getEvent**](EventsApi.md#getEvent) | **GET** /events/{eventId} | Getting an event from its id |



## getAllEvents

> GetAllEventsResponse getAllEvents(q, offset, limit)

Getting all events

This method renders events ordered by creation date (descending).

Authorization​: Only users whose role can search event permission.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String q = "q_example"; // String | To filter events on given query. Query works exactly like threads query but only have those keywords: content, content_thread, name_in, created_before, created_after, user. Order can be created_at.desc (default) or created_at.asc. e.g. q=name_in:\"content.replied\"%20content_thread:\"7f946431b6eebffafae642cc\"%20created_after:\"2014-03-20\"%20user:\"4ee91f197aa58d01b500000f\"%20order:\"created_at.asc\" * DateTime parameters should be ISO-8601 * you can specify multiple value for a given keyword: q=name_in:’content.replied’&name_in:’content.ignored’ Please refer to ​Search & filtering parameters​ for more details.
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllEventsResponse result = apiInstance.getAllEvents(q, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getAllEvents");
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
| **q** | **String**| To filter events on given query. Query works exactly like threads query but only have those keywords: content, content_thread, name_in, created_before, created_after, user. Order can be created_at.desc (default) or created_at.asc. e.g. q&#x3D;name_in:\&quot;content.replied\&quot;%20content_thread:\&quot;7f946431b6eebffafae642cc\&quot;%20created_after:\&quot;2014-03-20\&quot;%20user:\&quot;4ee91f197aa58d01b500000f\&quot;%20order:\&quot;created_at.asc\&quot; * DateTime parameters should be ISO-8601 * you can specify multiple value for a given keyword: q&#x3D;name_in:’content.replied’&amp;name_in:’content.ignored’ Please refer to ​Search &amp; filtering parameters​ for more details. | [optional] |
| **offset** | **Integer**| The record index to start. Default value is 0. | [optional] |
| **limit** | **Integer**| The max number of records to return. Default value is 30, max value is 150. | [optional] |

### Return type

[**GetAllEventsResponse**](GetAllEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getEvent

> Event getEvent(eventId)

Getting an event from its id

This method renders an event from given id. If token’s user role does not have “search event” permission a 404 HTTP response will be returned.

Authorization​: Only users who’s role can search event permission.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String eventId = "eventId_example"; // String | 
        try {
            Event result = apiInstance.getEvent(eventId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getEvent");
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
| **eventId** | **String**|  | |

### Return type

[**Event**](Event.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

