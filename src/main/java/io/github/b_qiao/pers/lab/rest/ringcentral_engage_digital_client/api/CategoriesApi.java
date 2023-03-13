package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Pair;

import javax.ws.rs.core.GenericType;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Category;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllCategoriesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-13T22:37:55.741968+01:00[Europe/Paris]")
public class CategoriesApi {
  private ApiClient apiClient;

  public CategoriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CategoriesApi(ApiClient apiClient) {
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
   * Creating a category
   * This method creates a new team. In case of success it renders the created tag, otherwise, it renders an error (422 HTTP code).  Note: The fields ​&#x60;mandatory&#x60;,​ &#x60;​multiple&#x60;,​ ​&#x60;post_qualification​&#x60;, &#x60;s​ource_ids&#x60;​ and &#x60;u​nselectable​&#x60; are accounted for only if the Category has no parent.  Authorization​: only users that can manage teams.
   * @param name Category name. (optional)
   * @param parentId ID of parent category. (optional)
   * @param color displayed color for the category, see Category colors.  (optional)
   * @param mandatory mandatory categorization (Boolean). (optional)
   * @param multiple allow to assign multiple child categories (Boolean). (optional)
   * @param postQualification post qualification (Boolean). (optional)
   * @param unselectable root category is unselectable (Boolean). (optional)
   * @param sourceIds List of source id. (optional)
   * @return Category
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Category createCategory(String name, String parentId, Integer color, Boolean mandatory, Boolean multiple, Boolean postQualification, Boolean unselectable, List<String> sourceIds) throws ApiException {
    return createCategoryWithHttpInfo(name, parentId, color, mandatory, multiple, postQualification, unselectable, sourceIds).getData();
  }

  /**
   * Creating a category
   * This method creates a new team. In case of success it renders the created tag, otherwise, it renders an error (422 HTTP code).  Note: The fields ​&#x60;mandatory&#x60;,​ &#x60;​multiple&#x60;,​ ​&#x60;post_qualification​&#x60;, &#x60;s​ource_ids&#x60;​ and &#x60;u​nselectable​&#x60; are accounted for only if the Category has no parent.  Authorization​: only users that can manage teams.
   * @param name Category name. (optional)
   * @param parentId ID of parent category. (optional)
   * @param color displayed color for the category, see Category colors.  (optional)
   * @param mandatory mandatory categorization (Boolean). (optional)
   * @param multiple allow to assign multiple child categories (Boolean). (optional)
   * @param postQualification post qualification (Boolean). (optional)
   * @param unselectable root category is unselectable (Boolean). (optional)
   * @param sourceIds List of source id. (optional)
   * @return ApiResponse&lt;Category&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Category> createCategoryWithHttpInfo(String name, String parentId, Integer color, Boolean mandatory, Boolean multiple, Boolean postQualification, Boolean unselectable, List<String> sourceIds) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/categories";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "parent_id", parentId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "color", color));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mandatory", mandatory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "multiple", multiple));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "post_qualification", postQualification));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "unselectable", unselectable));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source_ids[]", sourceIds));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Category> localVarReturnType = new GenericType<Category>() {};

    return apiClient.invokeAPI("CategoriesApi.createCategory", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Deleting a category
   * This method destroys an existing category. It renders the category itself. It renders a 404 if id is invalid.
   * @param categoryId  (required)
   * @param takeOverCategoryId ID of a category to recategorize (optional). (optional)
   * @return Category
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Category deleteCategory(String categoryId, String takeOverCategoryId) throws ApiException {
    return deleteCategoryWithHttpInfo(categoryId, takeOverCategoryId).getData();
  }

  /**
   * Deleting a category
   * This method destroys an existing category. It renders the category itself. It renders a 404 if id is invalid.
   * @param categoryId  (required)
   * @param takeOverCategoryId ID of a category to recategorize (optional). (optional)
   * @return ApiResponse&lt;Category&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Category> deleteCategoryWithHttpInfo(String categoryId, String takeOverCategoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'categoryId' is set
    if (categoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'categoryId' when calling deleteCategory");
    }
    
    // create path and map variables
    String localVarPath = "/categories/{categoryId}"
      .replaceAll("\\{" + "categoryId" + "\\}", apiClient.escapeString(categoryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "take_over_category_id", takeOverCategoryId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Category> localVarReturnType = new GenericType<Category>() {};

    return apiClient.invokeAPI("CategoriesApi.deleteCategory", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting all categories
   * This method renders categories ordered by creation date (ascending).
   * @param parentId To filter categories on given category parent id. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return GetAllCategoriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public GetAllCategoriesResponse getAllCategories(String parentId, Integer offset, Integer limit) throws ApiException {
    return getAllCategoriesWithHttpInfo(parentId, offset, limit).getData();
  }

  /**
   * Getting all categories
   * This method renders categories ordered by creation date (ascending).
   * @param parentId To filter categories on given category parent id. (optional)
   * @param offset The record index to start. Default value is 0. (optional)
   * @param limit The max number of records to return. Default value is 30, max value is 150. (optional)
   * @return ApiResponse&lt;GetAllCategoriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GetAllCategoriesResponse> getAllCategoriesWithHttpInfo(String parentId, Integer offset, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/categories";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "parent_id", parentId));
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

    GenericType<GetAllCategoriesResponse> localVarReturnType = new GenericType<GetAllCategoriesResponse>() {};

    return apiClient.invokeAPI("CategoriesApi.getAllCategories", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Getting a category from its id
   * This method renders a category from given id.
   * @param categoryId  (required)
   * @return Category
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Category getCategory(String categoryId) throws ApiException {
    return getCategoryWithHttpInfo(categoryId).getData();
  }

  /**
   * Getting a category from its id
   * This method renders a category from given id.
   * @param categoryId  (required)
   * @return ApiResponse&lt;Category&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Category> getCategoryWithHttpInfo(String categoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'categoryId' is set
    if (categoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'categoryId' when calling getCategory");
    }
    
    // create path and map variables
    String localVarPath = "/categories/{categoryId}"
      .replaceAll("\\{" + "categoryId" + "\\}", apiClient.escapeString(categoryId.toString()));

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

    GenericType<Category> localVarReturnType = new GenericType<Category>() {};

    return apiClient.invokeAPI("CategoriesApi.getCategory", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Updating a category
   * This method creates a new team. In case of success it renders the created tag, otherwise, it renders an error (422 HTTP code).  Note: The fields ​&#x60;mandatory&#x60;,​ ​&#x60;multiple&#x60;,​ ​&#x60;post_qualification​&#x60;, &#x60;s​ource_ids​&#x60; and &#x60;u​nselectable​&#x60; are accounted for only if the Category has no parent.  Authorization​: only users that can manage teams.
   * @param categoryId  (required)
   * @param name Category name. (optional)
   * @param parentId ID of parent category. (optional)
   * @param color displayed color for the category, see Category colors.  (optional)
   * @param mandatory mandatory categorization (Boolean). (optional)
   * @param multiple allow to assign multiple child categories (Boolean). (optional)
   * @param postQualification post qualification (Boolean). (optional)
   * @param unselectable root category is unselectable (Boolean). (optional)
   * @param sourceIds List of source id. (optional)
   * @return Category
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public Category updateCategory(String categoryId, String name, String parentId, Integer color, Boolean mandatory, Boolean multiple, Boolean postQualification, Boolean unselectable, List<String> sourceIds) throws ApiException {
    return updateCategoryWithHttpInfo(categoryId, name, parentId, color, mandatory, multiple, postQualification, unselectable, sourceIds).getData();
  }

  /**
   * Updating a category
   * This method creates a new team. In case of success it renders the created tag, otherwise, it renders an error (422 HTTP code).  Note: The fields ​&#x60;mandatory&#x60;,​ ​&#x60;multiple&#x60;,​ ​&#x60;post_qualification​&#x60;, &#x60;s​ource_ids​&#x60; and &#x60;u​nselectable​&#x60; are accounted for only if the Category has no parent.  Authorization​: only users that can manage teams.
   * @param categoryId  (required)
   * @param name Category name. (optional)
   * @param parentId ID of parent category. (optional)
   * @param color displayed color for the category, see Category colors.  (optional)
   * @param mandatory mandatory categorization (Boolean). (optional)
   * @param multiple allow to assign multiple child categories (Boolean). (optional)
   * @param postQualification post qualification (Boolean). (optional)
   * @param unselectable root category is unselectable (Boolean). (optional)
   * @param sourceIds List of source id. (optional)
   * @return ApiResponse&lt;Category&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Category> updateCategoryWithHttpInfo(String categoryId, String name, String parentId, Integer color, Boolean mandatory, Boolean multiple, Boolean postQualification, Boolean unselectable, List<String> sourceIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'categoryId' is set
    if (categoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'categoryId' when calling updateCategory");
    }
    
    // create path and map variables
    String localVarPath = "/categories/{categoryId}"
      .replaceAll("\\{" + "categoryId" + "\\}", apiClient.escapeString(categoryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "parent_id", parentId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "color", color));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "mandatory", mandatory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "multiple", multiple));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "post_qualification", postQualification));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "unselectable", unselectable));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "source_ids[]", sourceIds));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Category> localVarReturnType = new GenericType<Category>() {};

    return apiClient.invokeAPI("CategoriesApi.updateCategory", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
