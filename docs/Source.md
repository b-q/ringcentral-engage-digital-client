

# Source


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Activate/deactivate the source |  [optional] |
|**autoDetectContentLanguage** | **Boolean** | Auto-detect content language (Boolean) |  [optional] |
|**channelId** | **String** |  |  [optional] |
|**color** | **Integer** | Color of the icon: Default: 0 Blue: 1 Green: 2 Turquoise: 3 Purple: 4 Yellow: 5 Orange: 6 Red: 7 Asphalt: 8 Grey: 9 |  [optional] |
|**communityId** | **String** |  |  [optional] |
|**contentArchiving** | **Boolean** | Automatic archiving of old contents (Boolean) |  [optional] |
|**contentArchivingPeriod** | **Long** | Archive contents older than (seconds) |  [optional] |
|**contentLanguages** | **List&lt;String&gt;** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**defaultCategoryIds** | **List&lt;String&gt;** | Default categories |  [optional] |
|**defaultContentLanguage** | **String** | Default content language |  [optional] |
|**enableAndroid** | **Boolean** | Only on Engage Messaging sources. Boolean describing if the source is enabled on Android or not. |  [optional] |
|**enableIos** | **Boolean** | Only on Engage Messaging sources. Boolean describing if the source is enabled on iOS or not. |  [optional] |
|**enableWeb** | **Boolean** | Only on Engage Messaging sources. Boolean describing if the source is enabled on the web or not. |  [optional] |
|**autoResponseTriggers** | [**List&lt;SourceAutoResponseTriggersInner&gt;**](SourceAutoResponseTriggersInner.md) | Automatic Messages. Only on sources which supports Automatic Messages. |  [optional] |
|**autoResponseTriggerEnabled** | [**SourceAutoResponseTriggerEnabled**](SourceAutoResponseTriggerEnabled.md) |  |  [optional] |
|**autoResponseTriggerGracePeriods** | [**SourceAutoResponseTriggerGracePeriods**](SourceAutoResponseTriggerGracePeriods.md) |  |  [optional] |
|**signatures** | [**List&lt;SourceSignaturesInner&gt;**](SourceSignaturesInner.md) | Signatures. |  [optional] |
|**fromName** | **String** | Custom sender name. Only on sources which supports a custom sender name. |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**templateMessageNamespace** | **String** | Only on WhatsApp Sources. Internal WhatsApp field that can also be found on the business manager (unique per WhatsApp account). |  [optional] |
|**hiddenFromStats** | **Boolean** | Hide from statistics |  [optional] |
|**id** | **String** |  |  [optional] |
|**interventionMessagesBoost** | **Integer** | Priority boost of messages with intervention |  [optional] |
|**liveChat** | **Boolean** | Only on Engage Messaging sources. Boolean describing if the source is livechat or not. |  [optional] |
|**name** | **String** | Source name |  [optional] |
|**slaExpiredStrategy** | [**SlaExpiredStrategyEnum**](#SlaExpiredStrategyEnum) | SLA expired strategy (\&quot;max\&quot;, \&quot;half\&quot; or \&quot;base\&quot;) |  [optional] |
|**slaResponse** | **Integer** | Response time (seconds) |  [optional] |
|**slaThreshold** | **Integer** | Customer SLA warning threshold (must be greater than 0 and less than 100, default value is 0). |  [optional] |
|**slaFilteringCategoriesStrategy** | **String** | Categories filtering strategy for Customer SLA indicator (\&quot;ignored_categories\&quot; or \&quot;selected_categories\&quot;) |  [optional] |
|**slaFilteringCategoryIds** | **List&lt;String&gt;** | Filtering categories for Customer SLA indicator |  [optional] |
|**defaultTaskPriority** | **Integer** | Default priority for interactions |  [optional] |
|**status** | **String** |  |  [optional] |
|**templateMessages** | [**List&lt;SourceTemplateMessagesInner&gt;**](SourceTemplateMessagesInner.md) | Only for WhatsApp Sources, list of the available message templates that can be used to send outbound messages. |  [optional] |
|**timeSheetIds** | **List&lt;String&gt;** | Business Hours (Limited to 1) |  [optional] |
|**transferredTasksBoost** | **Integer** | Priority boost of transferred tasks |  [optional] |
|**attachmentsSecurityLevel** | **String** | Attachments security level. (\&quot;strict\&quot;, \&quot;relaxed\&quot;, or \&quot;permissive\&quot;). Strict allows images and medias. Relaxed allows images, media and documents. Permissive allows all kind of attachments |  [optional] |
|**type** | **String** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**userThreadDefaultCategoryIds** | **List&lt;String&gt;** | Default categories (agent messages) |  [optional] |
|**timeForThreadInclusion** | **Integer** | Time for thread inclusion |  [optional] |
|**timeForThreadInclusionEnabled** | **Boolean** | Enable time for thread inclusion. Only on Email sources |  [optional] |
|**emailParser** | **Boolean** | Email parser (BBCode). Only on Email sources |  [optional] |
|**imapSmtpEmail** | **String** | Email address to synchronize. Only on Email sources |  [optional] |
|**imapMailboxesToImport** | **List&lt;String&gt;** | Folders to synchronize. Only on Email sources |  [optional] |
|**imapMailboxUsedForSentMail** | **String** | Folder for &#39;Sent Mail&#39;. Only on Email sources |  [optional] |
|**imapAddress** | **String** | IMAP server address. Only on Email sources |  [optional] |
|**imapPort** | **Integer** | IMAP server port. Only on Email sources |  [optional] |
|**imapUsername** | **String** | IMAP username. Only on Email sources |  [optional] |
|**imapUseSslTls** | **Boolean** | Use SSL/TLS protocol to establish secure IMAP connection. Only on Email sources |  [optional] |
|**imapUseStartTls** | **Boolean** | Use STARTTLS protocol to establish secure IMAP connection. Only on Email sources |  [optional] |
|**imapAuthenticationType** | **String** | IMAP Authentication type (\&quot;basic\&quot; or \&quot;microsoft_identity_platform\&quot;). Only on Email sources |  [optional] |
|**imapSslVerifyMode** | **String** | IMAP SSL verification mode. (\&quot;NONE\&quot;, \&quot;PEER\&quot;, \&quot;CLIENT_ONCE\&quot; or \&quot;FAIL_IF_NO_PEER_CERT\&quot;). Only on Email sources |  [optional] |
|**smtpAddress** | **String** | SMTP server address. Only on Email sources |  [optional] |
|**smtpPort** | **Integer** | SMTP server port. Only on Email sources |  [optional] |
|**smtpUsername** | **String** | SMTP username. Only on Email sources |  [optional] |
|**smtpUseSslTls** | **Boolean** | Use SSL/TLS protocol to establish secure SMTP connection. Only on Email sources |  [optional] |
|**smtpUseStartTls** | **Boolean** | Use STARTTLS protocol to establish secure SMTP connection. Only on Email sources |  [optional] |
|**smtpAuthenticationType** | **String** | SMTP Authentication type (\&quot;basic\&quot; or \&quot;microsoft_identity_platform\&quot;). Only on Email sources |  [optional] |
|**smtpSslVerifyMode** | **String** | SMTP SSL verification mode (\&quot;NONE\&quot;, \&quot;PEER\&quot;, \&quot;CLIENT_ONCE\&quot; or \&quot;FAIL_IF_NO_PEER_CERT\&quot;). Only on Email sources |  [optional] |
|**smtpHeloDomain** | **String** | Used to identify HELO/EHLO when connecting to the SMTP server. Only on Email sources |  [optional] |
|**threadingHeuristics** | **Boolean** | Threading_heuristics. Only on Email sources |  [optional] |
|**spamAssassinLevel** | **String** | Spam threshold (\&quot;disabled\&quot;, \&quot;relaxed\&quot;, or \&quot;strict\&quot;). Only on Email sources |  [optional] |
|**whitelistedEmails** | **String** | Whitelisted emails. All emails received from this address won&#39;t be threaded and can be associated with an anonymous identity or the Reply-To, if there is one. To be filled when implementing a form. Only on Email sources |  [optional] |
|**ccBlacklist** | **List&lt;String&gt;** | Exclude from TO/CC. Only on Email sources |  [optional] |
|**postmarkEnabled** | **Boolean** | Enable Postmark. Only on Email sources |  [optional] |



## Enum: SlaExpiredStrategyEnum

| Name | Value |
|---- | -----|
| MAX | &quot;max&quot; |
| HALF | &quot;half&quot; |
| BASE | &quot;base&quot; |


## Implemented Interfaces

* Serializable


