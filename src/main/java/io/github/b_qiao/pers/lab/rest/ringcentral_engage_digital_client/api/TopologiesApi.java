package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllTopologiesResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Topology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class TopologiesApi {
  private ApiClient apiClient;

  public TopologiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TopologiesApi(ApiClient apiClient) {
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
   * Activating a topology
   * This method activates an existing topology from given attributes and renders it in case of success.  Authorization: Only users that have the right to manage topologies.
   * @param topologyId  (required)
   * @return Topology
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Topology activateTopology(String topologyId) throws ApiException {
    return activateTopologyWithHttpInfo(topologyId).getData();
  }

  /**
   * Activating a topology
   * This method activates an existing topology from given attributes and renders it in case of success.  Authorization: Only users that have the right to manage topologies.
   * @param topologyId  (required)
   * @return ApiResponse&lt;Topology&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Topology> activateTopologyWithHttpInfo(String topologyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'topologyId' is set
    if (topologyId == null) {
      throw new ApiException(400, "Missing the required parameter 'topologyId' when calling activateTopology");
    }
    
    // create path and map variables
    String localVarPath = "/topologies/{topologyId}/activate"
      .replaceAll("\\{" + "topologyId" + "\\}", apiClient.escapeString(topologyId.toString()));

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

    GenericType<Topology> localVarReturnType = new GenericType<Topology>() {};

    return apiClient.invokeAPI("TopologiesApi.activateTopology", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Creating a topology
   * This method creates a topology. In case of success it renders the topology, otherwise, it renders an error (422 HTTP code).  Authorization: Only users that have the right to manage topologies.
   * @param name  (optional)
   * @param jsonConfig  (optional)
   * @return Topology
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Created topology </td><td>  -  </td></tr>
     </table>
   */
  public Topology createTopology(String name, String jsonConfig) throws ApiException {
    return createTopologyWithHttpInfo(name, jsonConfig).getData();
  }

  /**
   * Creating a topology
   * This method creates a topology. In case of success it renders the topology, otherwise, it renders an error (422 HTTP code).  Authorization: Only users that have the right to manage topologies.
   * @param name  (optional)
   * @param jsonConfig  (optional)
   * @return ApiResponse&lt;Topology&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Created topology </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Topology> createTopologyWithHttpInfo(String name, String jsonConfig) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/topologies";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (name != null)
      localVarFormParams.put("name", name);
if (jsonConfig != null)
      localVarFormParams.put("json_config", jsonConfig);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Topology> localVarReturnType = new GenericType<Topology>() {};

    return apiClient.invokeAPI("TopologiesApi.createTopology", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deleting a topology
   * This method destroys an existing topology. It renders topology itself. It renders a 404 if id is invalid.  Authorization: Only users that have the right to manage topologies.
   * @param topologyId  (required)
   * @return Topology
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Topology deleteTopology(String topologyId) throws ApiException {
    return deleteTopologyWithHttpInfo(topologyId).getData();
  }

  /**
   * Deleting a topology
   * This method destroys an existing topology. It renders topology itself. It renders a 404 if id is invalid.  Authorization: Only users that have the right to manage topologies.
   * @param topologyId  (required)
   * @return ApiResponse&lt;Topology&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Topology> deleteTopologyWithHttpInfo(String topologyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'topologyId' is set
    if (topologyId == null) {
      throw new ApiException(400, "Missing the required parameter 'topologyId' when calling deleteTopology");
    }
    
    // create path and map variables
    String localVarPath = "/topologies/{topologyId}"
      .replaceAll("\\{" + "topologyId" + "\\}", apiClient.escapeString(topologyId.toString()));

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

    GenericType<Topology> localVarReturnType = new GenericType<Topology>() {};

    return apiClient.invokeAPI("TopologiesApi.deleteTopology", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all topologies
   * This method renders all topologies ordered by name (in alphabetical order).  Authorization: Only users that have the right to manage topologies
   * @return GetAllTopologiesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllTopologiesResponse getAllTopologies() throws ApiException {
    return getAllTopologiesWithHttpInfo().getData();
  }

  /**
   * Getting all topologies
   * This method renders all topologies ordered by name (in alphabetical order).  Authorization: Only users that have the right to manage topologies
   * @return ApiResponse&lt;GetAllTopologiesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllTopologiesResponse> getAllTopologiesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/topologies";

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

    GenericType<GetAllTopologiesResponse> localVarReturnType = new GenericType<GetAllTopologiesResponse>() {};

    return apiClient.invokeAPI("TopologiesApi.getAllTopologies", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a topology from its id
   * This method renders a topology from given id.  Authorization: only users that have the right to manage topologies.
   * @param topologyId  (required)
   * @return Topology
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Topology getTopology(String topologyId) throws ApiException {
    return getTopologyWithHttpInfo(topologyId).getData();
  }

  /**
   * Getting a topology from its id
   * This method renders a topology from given id.  Authorization: only users that have the right to manage topologies.
   * @param topologyId  (required)
   * @return ApiResponse&lt;Topology&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Topology> getTopologyWithHttpInfo(String topologyId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'topologyId' is set
    if (topologyId == null) {
      throw new ApiException(400, "Missing the required parameter 'topologyId' when calling getTopology");
    }
    
    // create path and map variables
    String localVarPath = "/topologies/{topologyId}"
      .replaceAll("\\{" + "topologyId" + "\\}", apiClient.escapeString(topologyId.toString()));

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

    GenericType<Topology> localVarReturnType = new GenericType<Topology>() {};

    return apiClient.invokeAPI("TopologiesApi.getTopology", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a topology
   * This method updates an existing topology from given attributes and renders it in case of success.  Authorization: only users that have the right to manage topologies. Topology must be inactive or the response will return an error.
   * @param topologyId  (required)
   * @param name  (optional)
   * @param jsonConfig  (optional)
   * @return Topology
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Topology updateTopology(String topologyId, String name, String jsonConfig) throws ApiException {
    return updateTopologyWithHttpInfo(topologyId, name, jsonConfig).getData();
  }

  /**
   * Updating a topology
   * This method updates an existing topology from given attributes and renders it in case of success.  Authorization: only users that have the right to manage topologies. Topology must be inactive or the response will return an error.
   * @param topologyId  (required)
   * @param name  (optional)
   * @param jsonConfig  (optional)
   * @return ApiResponse&lt;Topology&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Topology> updateTopologyWithHttpInfo(String topologyId, String name, String jsonConfig) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'topologyId' is set
    if (topologyId == null) {
      throw new ApiException(400, "Missing the required parameter 'topologyId' when calling updateTopology");
    }
    
    // create path and map variables
    String localVarPath = "/topologies/{topologyId}"
      .replaceAll("\\{" + "topologyId" + "\\}", apiClient.escapeString(topologyId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    if (name != null)
      localVarFormParams.put("name", name);
if (jsonConfig != null)
      localVarFormParams.put("json_config", jsonConfig);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Topology> localVarReturnType = new GenericType<Topology>() {};

    return apiClient.invokeAPI("TopologiesApi.updateTopology", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
