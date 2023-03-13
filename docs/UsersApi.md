# UsersApi

All URIs are relative to *https://domain-name.api.engagement.dimelo.com/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUser**](UsersApi.md#createUser) | **POST** /users | Creating a user |
| [**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /users/{userId} | Deleting a user |
| [**getAllUsers**](UsersApi.md#getAllUsers) | **GET** /users | Getting all users |
| [**getUser**](UsersApi.md#getUser) | **GET** /users/{userId} | Getting a user from its id |
| [**inviteUser**](UsersApi.md#inviteUser) | **POST** /users/invite | Inviting a user |
| [**updateUser**](UsersApi.md#updateUser) | **PUT** /users/{userId} | Updating a user |



## createUser

> User createUser(email, firstname, lastname, password, roleId, categoryIds, enabled, externalId, gender, identityIds, locale, nickname, teamIds, timezone, spokenLanguages, noPassword)

Creating a user

This method creates a new user. In case of success it renders the created user, otherwise, it renders an error (422 HTTP code).

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String email = "email_example"; // String | User email (mandatory).
        String firstname = "firstname_example"; // String | User firstname (mandatory).
        String lastname = "lastname_example"; // String | User lastname (mandatory).
        String password = "password_example"; // String | User plain password (mandatory).
        String roleId = "roleId_example"; // String | User role id (mandatory).
        List<String> categoryIds = Arrays.asList(); // List<String> | User list of category ids (multiple).
        Boolean enabled = true; // Boolean | Whether the user is enabled or not (boolean).
        String externalId = "externalId_example"; // String | User external id, used for SSO.
        String gender = "man"; // String | User gender (\"man\" or \"woman\").
        List<String> identityIds = Arrays.asList(); // List<String> | User list of identity ids (multiple).
        String locale = "locale_example"; // String | Language for the user interface.
        String nickname = "nickname_example"; // String | User nickname.
        List<String> teamIds = Arrays.asList(); // List<String> | User list of team ids (multiple).
        String timezone = "timezone_example"; // String | Use the timezone endpoint to get the timezone name (String), default is empty for domain timezone.
        List<String> spokenLanguages = Arrays.asList(); // List<String> | List of locales corresponding to the languages spoken by the user (multiple).
        Boolean noPassword = true; // Boolean | Whether the user is passwordless or not (boolean). Must be used with the corresponding SSO configuration.
        try {
            User result = apiInstance.createUser(email, firstname, lastname, password, roleId, categoryIds, enabled, externalId, gender, identityIds, locale, nickname, teamIds, timezone, spokenLanguages, noPassword);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#createUser");
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
| **email** | **String**| User email (mandatory). | |
| **firstname** | **String**| User firstname (mandatory). | |
| **lastname** | **String**| User lastname (mandatory). | |
| **password** | **String**| User plain password (mandatory). | |
| **roleId** | **String**| User role id (mandatory). | |
| **categoryIds** | **List&lt;String&gt;**| User list of category ids (multiple). | [optional] |
| **enabled** | **Boolean**| Whether the user is enabled or not (boolean). | [optional] |
| **externalId** | **String**| User external id, used for SSO. | [optional] |
| **gender** | **String**| User gender (\&quot;man\&quot; or \&quot;woman\&quot;). | [optional] [enum: man, woman] |
| **identityIds** | **List&lt;String&gt;**| User list of identity ids (multiple). | [optional] |
| **locale** | **String**| Language for the user interface. | [optional] |
| **nickname** | **String**| User nickname. | [optional] |
| **teamIds** | **List&lt;String&gt;**| User list of team ids (multiple). | [optional] |
| **timezone** | **String**| Use the timezone endpoint to get the timezone name (String), default is empty for domain timezone. | [optional] |
| **spokenLanguages** | **List&lt;String&gt;**| List of locales corresponding to the languages spoken by the user (multiple). | [optional] |
| **noPassword** | **Boolean**| Whether the user is passwordless or not (boolean). Must be used with the corresponding SSO configuration. | [optional] |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## deleteUser

> User deleteUser(userId)

Deleting a user

This method deletes the given user. In case of success it renders the deleted user, otherwise, it renders an error (422 HTTP code).

Authorization​: only users that can update users. The user affiliated to the token must have at least all the permissions of the other user. If the user affiliated to the token has the manage_users_of_my_teams permission, the deleted user will need to belong to at least one of the teams he’s the leader of.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | 
        try {
            User result = apiInstance.deleteUser(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#deleteUser");
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
| **userId** | **String**|  | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getAllUsers

> GetAllUsersResponse getAllUsers(email, categoryId, identityId, externalId, roleId, teamId, offset, limit)

Getting all users

This method renders users ordered by creation date (descending).

Authorization​: only users that can view users. If the user affiliated to the token has the manage_users_of_my_teams permission, only the users belonging to at least one of the teams he’s the leader of will be returned.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String email = "email_example"; // String | To filter users on given email.
        String categoryId = "categoryId_example"; // String | To filter users on given category id.
        String identityId = "identityId_example"; // String | To filter users on given identity id.
        String externalId = "externalId_example"; // String | To filter users on given external id.
        String roleId = "roleId_example"; // String | To filter users on given role id.
        String teamId = "teamId_example"; // String | To filter users on given team id.
        Integer offset = 56; // Integer | The record index to start. Default value is 0.
        Integer limit = 56; // Integer | The max number of records to return. Default value is 30, max value is 150.
        try {
            GetAllUsersResponse result = apiInstance.getAllUsers(email, categoryId, identityId, externalId, roleId, teamId, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getAllUsers");
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
| **email** | **String**| To filter users on given email. | [optional] |
| **categoryId** | **String**| To filter users on given category id. | [optional] |
| **identityId** | **String**| To filter users on given identity id. | [optional] |
| **externalId** | **String**| To filter users on given external id. | [optional] |
| **roleId** | **String**| To filter users on given role id. | [optional] |
| **teamId** | **String**| To filter users on given team id. | [optional] |
| **offset** | **Integer**| The record index to start. Default value is 0. | [optional] |
| **limit** | **Integer**| The max number of records to return. Default value is 30, max value is 150. | [optional] |

### Return type

[**GetAllUsersResponse**](GetAllUsersResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## getUser

> User getUser(userId)

Getting a user from its id

This method renders a user from given id.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | 
        try {
            User result = apiInstance.getUser(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUser");
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
| **userId** | **String**|  | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## inviteUser

> User inviteUser(email, firstname, lastname, roleId, categoryIds, enabled, externalId, gender, identityIds, locale, nickname, teamIds, timezone, spokenLanguages)

Inviting a user

This method invites a new user. In case of success it renders the created user, otherwise, it renders an error (422 HTTP code).

Authorization​: only users that can invite other users. If the user affiliated to the token has the manage_users_of_my_teams permission, the invited user will need to belong to at least one of the teams he’s the leader of. It will not be possible to assign the user to other teams.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String email = "email_example"; // String | User email (mandatory).
        String firstname = "firstname_example"; // String | User firstname (mandatory).
        String lastname = "lastname_example"; // String | User lastname (mandatory).
        String roleId = "roleId_example"; // String | User role id (mandatory).
        List<String> categoryIds = Arrays.asList(); // List<String> | User list of category ids (multiple).
        Boolean enabled = true; // Boolean | Whether the user is enabled or not (boolean).
        String externalId = "externalId_example"; // String | User external id.
        String gender = "man"; // String | User gender (\"man\" or \"woman\").
        List<String> identityIds = Arrays.asList(); // List<String> | User list of identity ids (multiple).
        String locale = "locale_example"; // String | Language for the user interface.
        String nickname = "nickname_example"; // String | User nickname.
        List<String> teamIds = Arrays.asList(); // List<String> | User list of team ids (multiple).
        String timezone = "timezone_example"; // String | Use the timezone endpoint to get the timezone name (String), default is empty for
        List<String> spokenLanguages = Arrays.asList(); // List<String> | List of locales corresponding to the languages spoken by the user (multiple).
        try {
            User result = apiInstance.inviteUser(email, firstname, lastname, roleId, categoryIds, enabled, externalId, gender, identityIds, locale, nickname, teamIds, timezone, spokenLanguages);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#inviteUser");
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
| **email** | **String**| User email (mandatory). | |
| **firstname** | **String**| User firstname (mandatory). | |
| **lastname** | **String**| User lastname (mandatory). | |
| **roleId** | **String**| User role id (mandatory). | |
| **categoryIds** | **List&lt;String&gt;**| User list of category ids (multiple). | [optional] |
| **enabled** | **Boolean**| Whether the user is enabled or not (boolean). | [optional] |
| **externalId** | **String**| User external id. | [optional] |
| **gender** | **String**| User gender (\&quot;man\&quot; or \&quot;woman\&quot;). | [optional] [enum: man, woman] |
| **identityIds** | **List&lt;String&gt;**| User list of identity ids (multiple). | [optional] |
| **locale** | **String**| Language for the user interface. | [optional] |
| **nickname** | **String**| User nickname. | [optional] |
| **teamIds** | **List&lt;String&gt;**| User list of team ids (multiple). | [optional] |
| **timezone** | **String**| Use the timezone endpoint to get the timezone name (String), default is empty for | [optional] |
| **spokenLanguages** | **List&lt;String&gt;**| List of locales corresponding to the languages spoken by the user (multiple). | [optional] |

### Return type

[**User**](User.md)

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


## updateUser

> User updateUser(userId, categoryIds, email, enabled, externalId, firstname, gender, identityIds, lastname, locale, nickname, password, roleId, teamIds, timezone, spokenLanguages, noPassword)

Updating a user

This method updates users from given attributes and renders it in case of success.

Authorization​: only users that can update users. If the user affiliated to the token has the `manage_users_of_my_teams` permission, the updated user will need to belong to at least one of the teams he’s the leader of. The teams the user affiliated to the token is the leader of will be the only ones which can be added or removed.

### Example

```java
// Import classes:
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiClient;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.ApiException;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.Configuration;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.model.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://domain-name.api.engagement.dimelo.com/1.0");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | 
        List<String> categoryIds = Arrays.asList(); // List<String> | User list of category ids (multiple).
        String email = "email_example"; // String | User email.
        Boolean enabled = true; // Boolean | Whether the user is enabled or not (boolean).
        String externalId = "externalId_example"; // String | User external id, used for SSO.
        String firstname = "firstname_example"; // String | User firstname.
        String gender = "man"; // String | User gender (\"man\" or \"woman\").
        List<String> identityIds = Arrays.asList(); // List<String> | User list of identity ids (multiple).
        String lastname = "lastname_example"; // String | User lastname.
        String locale = "locale_example"; // String | Language for the user interface.
        String nickname = "nickname_example"; // String | User nickname.
        String password = "password_example"; // String | User plain password.
        String roleId = "roleId_example"; // String | User role id.
        List<String> teamIds = Arrays.asList(); // List<String> | User list of team ids (multiple).
        String timezone = "timezone_example"; // String | Use the timezone endpoint to get the timezone name (String), default is empty for domain timezone.
        List<String> spokenLanguages = Arrays.asList(); // List<String> | List of locales corresponding to the languages spoken by the user (multiple).
        Boolean noPassword = true; // Boolean | Whether the user is passwordless or not (boolean). Must be used with the corresponding SSO configuration.
        try {
            User result = apiInstance.updateUser(userId, categoryIds, email, enabled, externalId, firstname, gender, identityIds, lastname, locale, nickname, password, roleId, teamIds, timezone, spokenLanguages, noPassword);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#updateUser");
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
| **userId** | **String**|  | |
| **categoryIds** | **List&lt;String&gt;**| User list of category ids (multiple). | [optional] |
| **email** | **String**| User email. | [optional] |
| **enabled** | **Boolean**| Whether the user is enabled or not (boolean). | [optional] |
| **externalId** | **String**| User external id, used for SSO. | [optional] |
| **firstname** | **String**| User firstname. | [optional] |
| **gender** | **String**| User gender (\&quot;man\&quot; or \&quot;woman\&quot;). | [optional] [enum: man, woman] |
| **identityIds** | **List&lt;String&gt;**| User list of identity ids (multiple). | [optional] |
| **lastname** | **String**| User lastname. | [optional] |
| **locale** | **String**| Language for the user interface. | [optional] |
| **nickname** | **String**| User nickname. | [optional] |
| **password** | **String**| User plain password. | [optional] |
| **roleId** | **String**| User role id. | [optional] |
| **teamIds** | **List&lt;String&gt;**| User list of team ids (multiple). | [optional] |
| **timezone** | **String**| Use the timezone endpoint to get the timezone name (String), default is empty for domain timezone. | [optional] |
| **spokenLanguages** | **List&lt;String&gt;**| List of locales corresponding to the languages spoken by the user (multiple). | [optional] |
| **noPassword** | **Boolean**| Whether the user is passwordless or not (boolean). Must be used with the corresponding SSO configuration. | [optional] |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

