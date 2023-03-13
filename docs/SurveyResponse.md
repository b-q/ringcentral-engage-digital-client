

# SurveyResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**mainIndicator** | **Integer** |  |  [optional] |
|**mainIndicatorScaled** | **BigDecimal** |  |  [optional] |
|**interventionId** | **String** |  |  [optional] |
|**surveyId** | **String** |  |  [optional] |
|**sourceId** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**responseForeignId** | **String** | The survey provider&#39;s id for this response. |  [optional] |
|**questions** | [**List&lt;SurveyResponseQuestion&gt;**](SurveyResponseQuestion.md) | Questions answered by this response. |  [optional] |


## Implemented Interfaces

* Serializable


