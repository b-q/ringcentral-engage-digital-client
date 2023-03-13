/*
 * RingCentral Engage Digital API
 * REST API for RingCentral Engage Digital
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.api;

import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.handler.auth.*;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllReplyAssistantVersionsResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.ReplyAssistantVersion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReplyAssistantVersionsApi
 */
public class ReplyAssistantVersionsApiTest {

    private final ReplyAssistantVersionsApi api = new ReplyAssistantVersionsApi();

    /**
     * Creating a reply assistant version
     *
     * This method creates a reply assistant version. In case of success it renders the version, otherwise, it renders an error (422 HTTP code, 404 if the entry_id is invalid).  Authorization​: only users that have the right to manage reply assistant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createReplyAssistantVersionTest() throws ApiException {
        //String body = null;
        //String entryId = null;
        //List<String> sourceIds = null;
        //String format = null;
        //String language = null;
        //ReplyAssistantVersion response = api.createReplyAssistantVersion(body, entryId, sourceIds, format, language);
        // TODO: test validations
    }

    /**
     * Deleting a reply assistant version
     *
     * This method destroys an existing version. It renders the version itself. It renders a 404 if id is invalid.  Authorization​: only users that have the right to manage reply assistant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteReplyAssistantVersionTest() throws ApiException {
        //String replyAssistantVersionId = null;
        //ReplyAssistantVersion response = api.deleteReplyAssistantVersion(replyAssistantVersionId);
        // TODO: test validations
    }

    /**
     * Getting​ a​ll​ reply assistant versions
     *
     * This method renders all reply assistant versions ordered by creation date (ascending).  Authorization​: only users that have the right to manage reply assistant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllReplyAssistantVersionsTest() throws ApiException {
        //Integer offset = null;
        //Integer limit = null;
        //GetAllReplyAssistantVersionsResponse response = api.getAllReplyAssistantVersions(offset, limit);
        // TODO: test validations
    }

    /**
     * Getting a reply assistant version from its id
     *
     * This method renders a version from given id.  Authorization​: only users that have the right to manage reply assistant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReplyAssistantVersionTest() throws ApiException {
        //String replyAssistantVersionId = null;
        //ReplyAssistantVersion response = api.getReplyAssistantVersion(replyAssistantVersionId);
        // TODO: test validations
    }

    /**
     * Updating a reply assistant version
     *
     * This method updates an existing version from given attributes and renders it in case of success.  Authorization​: only users that have the right to manage reply assistant.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateReplyAssistantVersionTest() throws ApiException {
        //String replyAssistantVersionId = null;
        //String body = null;
        //String entryId = null;
        //List<String> sourceIds = null;
        //String format = null;
        //String language = null;
        //ReplyAssistantVersion response = api.updateReplyAssistantVersion(replyAssistantVersionId, body, entryId, sourceIds, format, language);
        // TODO: test validations
    }

}