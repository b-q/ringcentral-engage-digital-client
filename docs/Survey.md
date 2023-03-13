

# Survey


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**name** | **String** | Name displayed in ED admin interface. Is not displayed to end users. |  [optional] |
|**link** | **String** | Link to the survey on the provider website. |  [optional] |
|**active** | **Boolean** |  |  [optional] |
|**fromName** | **String** | Name displayed as sender when survey is sent to end user. Currently only applies to surveys sent by email. |  [optional] |
|**instantSendThreshold** | **BigDecimal** | Any intervention whose duration is shorter than this value (in seconds) will have the survey sent instantly. |  [optional] |
|**maxTimeSinceLastReply** | **BigDecimal** | If last message from end user is older than this duration (in seconds), no survey will be sent. |  [optional] |
|**sendDelay** | **BigDecimal** | Delay before sending survey to end users. |  [optional] |
|**categoryIds** | **List&lt;String&gt;** |  |  [optional] |
|**teamIds** | **List&lt;String&gt;** |  |  [optional] |
|**sourceIds** | **List&lt;String&gt;** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Contains the information of the survey provider used. Currently, only provider supported is alchemer. |  [optional] |
|**questions** | [**List&lt;SurveyQuestion&gt;**](SurveyQuestion.md) | Fetched from survey provider. List of questions asked in this survey. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALCHEMER | &quot;alchemer&quot; |


## Implemented Interfaces

* Serializable


