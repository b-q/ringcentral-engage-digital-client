

# Content


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvalRequired** | **Boolean** |  |  [optional] |
|**attachments** | [**List&lt;ContentAttachment&gt;**](ContentAttachment.md) |  |  [optional] |
|**attachmentsCount** | **Integer** |  |  [optional] |
|**authorId** | **String** |  |  [optional] |
|**autoSubmitted** | **Boolean** |  |  [optional] |
|**body** | **String** |  |  [optional] |
|**bodyFormatted** | [**ContentBodyFormatted**](ContentBodyFormatted.md) |  |  [optional] |
|**bodyInputFormat** | [**BodyInputFormatEnum**](#BodyInputFormatEnum) | values can be: text or html. |  [optional] |
|**categoryIds** | **List&lt;String&gt;** | are content categories if none, they are default to intervention categories or thread categories |  [optional] |
|**contextData** | **Object** | is present only if the content has context_data associated. The context_data hash keys are the custom fields keys. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**createdFrom** | **String** |  |  [optional] |
|**creatorId** | **String** |  |  [optional] |
|**foreignCategories** | **List&lt;String&gt;** | is present only if the content has foreign_categories. |  [optional] |
|**foreignId** | **String** |  |  [optional] |
|**id** | **String** |  |  |
|**inReplyToAuthorId** | **String** |  |  [optional] |
|**inReplyToId** | **String** |  |  [optional] |
|**interventionId** | **String** |  |  [optional] |
|**language** | **String** |  |  [optional] |
|**privateMessage** | **Boolean** |  |  [optional] |
|**published** | **Boolean** |  |  [optional] |
|**rating** | **Integer** | is present only if the content supports rating and rating is filled. |  [optional] |
|**remotelyDeleted** | **Boolean** |  |  [optional] |
|**sourceId** | **String** |  |  [optional] |
|**sourceType** | **String** |  |  [optional] |
|**sourceUrl** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**synchronizationStatus** | **String** |  |  [optional] |
|**synchronizationError** | **String** |  |  [optional] |
|**threadId** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**capabilitiesSupported** | **List&lt;String&gt;** | lists the types of structured messages that can be used to reply to this type of message |  [optional] |



## Enum: BodyInputFormatEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| HTML | &quot;html&quot; |


## Implemented Interfaces

* Serializable


