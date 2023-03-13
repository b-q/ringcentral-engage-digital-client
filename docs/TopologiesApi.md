# TopologiesApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateTopology**](TopologiesApi.md#activateTopology) | **PUT** /topologies/{topologyId}/activate | Activating a topology |
| [**createTopology**](TopologiesApi.md#createTopology) | **POST** /topologies | Creating a topology |
| [**deleteTopology**](TopologiesApi.md#deleteTopology) | **DELETE** /topologies/{topologyId} | Deleting a topology |
| [**getAllTopologies**](TopologiesApi.md#getAllTopologies) | **GET** /topologies | Getting all topologies |
| [**getTopology**](TopologiesApi.md#getTopology) | **GET** /topologies/{topologyId} | Getting a topology from its id |
| [**updateTopology**](TopologiesApi.md#updateTopology) | **PUT** /topologies/{topologyId} | Updating a topology |



## activateTopology

> Topology activateTopology(topologyId)

Activating a topology

This method activates an existing topology from given attributes and renders it in case of success.

Authorization: Only users that have the right to manage topologies.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TopologiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TopologiesApi apiInstance = new TopologiesApi(defaultClient);
        String topologyId = "topologyId_example"; // String | 
        try {
            Topology result = apiInstance.activateTopology(topologyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologiesApi#activateTopology");
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
| **topologyId** | **String**|  | |

### Return type

[**Topology**](Topology.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## createTopology

> Topology createTopology(name, jsonConfig)

Creating a topology

This method creates a topology. In case of success it renders the topology, otherwise, it renders an error (422 HTTP code).

Authorization: Only users that have the right to manage topologies.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TopologiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TopologiesApi apiInstance = new TopologiesApi(defaultClient);
        String name = "name_example"; // String | 
        String jsonConfig = "jsonConfig_example"; // String | 
        try {
            Topology result = apiInstance.createTopology(name, jsonConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologiesApi#createTopology");
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
| **name** | **String**|  | [optional] |
| **jsonConfig** | **String**|  | [optional] |

### Return type

[**Topology**](Topology.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created topology |  -  |


## deleteTopology

> Topology deleteTopology(topologyId)

Deleting a topology

This method destroys an existing topology. It renders topology itself. It renders a 404 if id is invalid.

Authorization: Only users that have the right to manage topologies.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TopologiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TopologiesApi apiInstance = new TopologiesApi(defaultClient);
        String topologyId = "topologyId_example"; // String | 
        try {
            Topology result = apiInstance.deleteTopology(topologyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologiesApi#deleteTopology");
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
| **topologyId** | **String**|  | |

### Return type

[**Topology**](Topology.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllTopologies

> GetAllTopologiesResponse getAllTopologies()

Getting all topologies

This method renders all topologies ordered by name (in alphabetical order).

Authorization: Only users that have the right to manage topologies

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TopologiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TopologiesApi apiInstance = new TopologiesApi(defaultClient);
        try {
            GetAllTopologiesResponse result = apiInstance.getAllTopologies();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologiesApi#getAllTopologies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetAllTopologiesResponse**](GetAllTopologiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getTopology

> Topology getTopology(topologyId)

Getting a topology from its id

This method renders a topology from given id.

Authorization: only users that have the right to manage topologies.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TopologiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TopologiesApi apiInstance = new TopologiesApi(defaultClient);
        String topologyId = "topologyId_example"; // String | 
        try {
            Topology result = apiInstance.getTopology(topologyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologiesApi#getTopology");
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
| **topologyId** | **String**|  | |

### Return type

[**Topology**](Topology.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## updateTopology

> Topology updateTopology(topologyId, name, jsonConfig)

Updating a topology

This method updates an existing topology from given attributes and renders it in case of success.

Authorization: only users that have the right to manage topologies. Topology must be inactive or the response will return an error.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.TopologiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        TopologiesApi apiInstance = new TopologiesApi(defaultClient);
        String topologyId = "topologyId_example"; // String | 
        String name = "name_example"; // String | 
        String jsonConfig = "jsonConfig_example"; // String | 
        try {
            Topology result = apiInstance.updateTopology(topologyId, name, jsonConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TopologiesApi#updateTopology");
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
| **topologyId** | **String**|  | |
| **name** | **String**|  | [optional] |
| **jsonConfig** | **String**|  | [optional] |

### Return type

[**Topology**](Topology.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

