# ContentsApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**categorizeContent**](ContentsApi.md#categorizeContent) | **PUT** /contents/{contentId}/update_categories | Categorizing a content |
| [**createContent**](ContentsApi.md#createContent) | **POST** /contents | Creating content |
| [**getAllContents**](ContentsApi.md#getAllContents) | **GET** /contents | Contents |
| [**getContent**](ContentsApi.md#getContent) | **GET** /contents/{contentId} | Getting a content from its id |
| [**ignoreContent**](ContentsApi.md#ignoreContent) | **PUT** /contents/{contentId}/ignore | Ignoring a content |



## categorizeContent

> Content categorizeContent(contentId, categoryIds)

Categorizing a content

This method updates the categories of a content. If token’s user does not have “read” on this content’s source a 404 HTTP response will be returned.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ContentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ContentsApi apiInstance = new ContentsApi(defaultClient);
        String contentId = "contentId_example"; // String | 
        List<String> categoryIds = Arrays.asList(); // List<String> | An array containing the new categories to set on the content.
        try {
            Content result = apiInstance.categorizeContent(contentId, categoryIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentsApi#categorizeContent");
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
| **contentId** | **String**|  | |
| **categoryIds** | **List&lt;String&gt;**| An array containing the new categories to set on the content. | |

### Return type

[**Content**](Content.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## createContent

> Content createContent(body, authorId, inReplyToId, _private, sourceId, attachmentIds, autoSubmitted, title, to, cc, bcc, templateName, templateLanguage)

Creating content

This method allows you to create new content for use in discussions. It can be a reply to another piece of content or be used to initiate discussion. If authorized, the token’s user will be used as the content author. Content will be created in Engage Digital and pushed asynchronously to the source.
Replying to a customer content is usually possible (unless the source/conversation is read only).
Composing a content on the contrary depend on the source itself:
* The source may not support it (and be purely reactive like Instagram, Messenger ...)
* Some sources (usually public account) like Twitter or Facebook page allows to publish content without targeting specific individuals.
* Some sources (usually non public media) require specific targeting (phone number for SMS, email address for email, customer_id ...) to be able to create a content. This is source specific and detailed under the generic parameters.

Authorization​: only users that can reply or initiate discussion (= compose) on given source. it renders also an error if in_reply_to isn’t synchronized or if in_reply_to content is not under an ​open intervention.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ContentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ContentsApi apiInstance = new ContentsApi(defaultClient);
        String body = "body_example"; // String | The content’s body. This parameter is mandatory.
        String authorId = "authorId_example"; // String | The identity id of content. This parameter is not mandatory, by default it use the token’s user first identity on source.
        String inReplyToId = "inReplyToId_example"; // String | The content’s id you want to reply to. If omitted, a new discussion will be created. If source does not support to initiate discussion this parameter is mandatory.
        Boolean _private = true; // Boolean | Created contents are public by default, set this parameter to \"true\" in order to create a private reply. It is NOT supported on every source.
        String sourceId = "sourceId_example"; // String | The source to create content to. If you specify `in_reply_to_id` parameter, source will be determined from it. Otherwise, this parameter is mandatory.
        List<String> attachmentIds = Arrays.asList(); // List<String> | An array containing the attachments’ ids that need to be attached to this content.
        Boolean autoSubmitted = true; // Boolean | Marks the message as automatically sent.
        String title = "title_example"; // String | For an email source. The subject of the email. This parameter is mandatory when initiating a discussion.
        List<String> to = Arrays.asList(); // List<String> | For an email or SMS and WhatsApp source. For an email, an array containing the email addresses used in the “To” section of the email. This parameter is mandatory when initiating a discussion. For a WhatsApp message or a SMS, the number the message will be sent to. It must start with 00 or +, example: +33634231224 or 0033634231224. This parameter is mandatory when initiating a discussion.
        List<String> cc = Arrays.asList(); // List<String> | For an email source. An array containing the email addresses used in the “Cc” section of the email.
        List<String> bcc = Arrays.asList(); // List<String> | For an email source. An array containing the email addresses used in the “Bcc” section of the email.
        String templateName = "templateName_example"; // String | Mandatory for a WhatsApp source. A discussion can only be initiated using a specific template created on the business manager and approved by WhatsApp. You can find all available template_names on /1.0/content_sources/source_id.
        String templateLanguage = "templateLanguage_example"; // String | Mandatory for a WhatsApp source. A discussion can only be initiated using a specific template created on the business manager and approved by WhatsApp. You can find all available template_languages for a given template_name on /1.0/content_sources/source_id.
        try {
            Content result = apiInstance.createContent(body, authorId, inReplyToId, _private, sourceId, attachmentIds, autoSubmitted, title, to, cc, bcc, templateName, templateLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentsApi#createContent");
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
| **body** | **String**| The content’s body. This parameter is mandatory. | |
| **authorId** | **String**| The identity id of content. This parameter is not mandatory, by default it use the token’s user first identity on source. | [optional] |
| **inReplyToId** | **String**| The content’s id you want to reply to. If omitted, a new discussion will be created. If source does not support to initiate discussion this parameter is mandatory. | [optional] |
| **_private** | **Boolean**| Created contents are public by default, set this parameter to \&quot;true\&quot; in order to create a private reply. It is NOT supported on every source. | [optional] |
| **sourceId** | **String**| The source to create content to. If you specify &#x60;in_reply_to_id&#x60; parameter, source will be determined from it. Otherwise, this parameter is mandatory. | [optional] |
| **attachmentIds** | **List&lt;String&gt;**| An array containing the attachments’ ids that need to be attached to this content. | [optional] |
| **autoSubmitted** | **Boolean**| Marks the message as automatically sent. | [optional] |
| **title** | **String**| For an email source. The subject of the email. This parameter is mandatory when initiating a discussion. | [optional] |
| **to** | **List&lt;String&gt;**| For an email or SMS and WhatsApp source. For an email, an array containing the email addresses used in the “To” section of the email. This parameter is mandatory when initiating a discussion. For a WhatsApp message or a SMS, the number the message will be sent to. It must start with 00 or +, example: +33634231224 or 0033634231224. This parameter is mandatory when initiating a discussion. | [optional] |
| **cc** | **List&lt;String&gt;**| For an email source. An array containing the email addresses used in the “Cc” section of the email. | [optional] |
| **bcc** | **List&lt;String&gt;**| For an email source. An array containing the email addresses used in the “Bcc” section of the email. | [optional] |
| **templateName** | **String**| Mandatory for a WhatsApp source. A discussion can only be initiated using a specific template created on the business manager and approved by WhatsApp. You can find all available template_names on /1.0/content_sources/source_id. | [optional] |
| **templateLanguage** | **String**| Mandatory for a WhatsApp source. A discussion can only be initiated using a specific template created on the business manager and approved by WhatsApp. You can find all available template_languages for a given template_name on /1.0/content_sources/source_id. | [optional] |

### Return type

[**Content**](Content.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **422** | Unprocessable Entity |  -  |


## getAllContents

> GetAllContentsResponse getAllContents(q, offset, limit)

Contents

This method renders contents ordered by creation date (descending). Only contents in sources where token’s user has “read” permission are returned.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ContentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ContentsApi apiInstance = new ContentsApi(defaultClient);
        String q = "q_example"; // String | To filter contents on given query. Query works exactly like threads query but only have those keywords: intervention,identity, identity_group, source, status_in, thread or text. Order can be created_at.desc (default) or created_at.asc. e.g. q=intervention:\"7f946431b6eebffafae642cc\"%20source:\"d19c81948c137d86dac77216\" Please refer to ​Search & filtering parameters​ for more details.
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllContentsResponse result = apiInstance.getAllContents(q, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentsApi#getAllContents");
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
| **q** | **String**| To filter contents on given query. Query works exactly like threads query but only have those keywords: intervention,identity, identity_group, source, status_in, thread or text. Order can be created_at.desc (default) or created_at.asc. e.g. q&#x3D;intervention:\&quot;7f946431b6eebffafae642cc\&quot;%20source:\&quot;d19c81948c137d86dac77216\&quot; Please refer to ​Search &amp; filtering parameters​ for more details. | [optional] |
| **offset** | **Integer**| The record index to start. Default value is 0. | [optional] |
| **limit** | **Integer**| The max number of records to return. Default value is 30, max value is 150. | [optional] |

### Return type

[**GetAllContentsResponse**](GetAllContentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getContent

> Content getContent(contentId)

Getting a content from its id

This method renders a content from given id. If token’s user does not have “read” on content’s source a 404 HTTP response will be returned.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ContentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ContentsApi apiInstance = new ContentsApi(defaultClient);
        String contentId = "contentId_example"; // String | 
        try {
            Content result = apiInstance.getContent(contentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentsApi#getContent");
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
| **contentId** | **String**|  | |

### Return type

[**Content**](Content.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## ignoreContent

> Content ignoreContent(contentId)

Ignoring a content

Ignores a content. If token’s user does not have “read” on content’s source a 404 HTTP response will be returned.

Authorization​: no.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.ContentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        ContentsApi apiInstance = new ContentsApi(defaultClient);
        String contentId = "contentId_example"; // String | 
        try {
            Content result = apiInstance.ignoreContent(contentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentsApi#ignoreContent");
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
| **contentId** | **String**|  | |

### Return type

[**Content**](Content.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |

