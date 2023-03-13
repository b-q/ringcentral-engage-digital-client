# SurveyResponsesApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSurveyResponse**](SurveyResponsesApi.md#getSurveyResponse) | **GET** /survey_responses/{surveyResponseId} | Get a survey response |



## getSurveyResponse

> SurveyResponse getSurveyResponse(surveyResponseId)

Get a survey response

This method returns information about a survey response.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.SurveyResponsesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        SurveyResponsesApi apiInstance = new SurveyResponsesApi(defaultClient);
        String surveyResponseId = "surveyResponseId_example"; // String | 
        try {
            SurveyResponse result = apiInstance.getSurveyResponse(surveyResponseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SurveyResponsesApi#getSurveyResponse");
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
| **surveyResponseId** | **String**|  | |

### Return type

[**SurveyResponse**](SurveyResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

