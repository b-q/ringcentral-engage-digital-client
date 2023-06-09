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
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllInterventionsResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Intervention;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InterventionsApi
 */
public class InterventionsApiTest {

    private final InterventionsApi api = new InterventionsApi();

    /**
     * Cancelling an intervention
     *
     * This method cancels (destroys) an intervention. It renders intervention itself. If token’s user does not have “read” on intervention’s source a 404 HTTP response will be returned.  Caveats:  * If the intervention is already being canceled, it will return a 409 error. * To be able to close an intervention, it must meet the following criteria otherwise a 403 will be raised:   * Intervention MUST NOT already be closed  * Intervention MUST NOT have agent replies   * Access-Token agent MUST have read access on the source  Authorization​: no, but it renders an error if intervention can’t be destroyed (see caveats).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelInterventionTest() throws ApiException {
        //String interventionId = null;
        //Intervention response = api.cancelIntervention(interventionId);
        // TODO: test validations
    }

    /**
     * Categorizing an intervention
     *
     * This method updates the categories of an intervention. If token’s user does not have “read” on the intervention’s source a 404 HTTP response will be returned.  Authorization​: no.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void categorizeInterventionTest() throws ApiException {
        //String interventionId = null;
        //List<String> categoryIds = null;
        //Intervention response = api.categorizeIntervention(interventionId, categoryIds);
        // TODO: test validations
    }

    /**
     * Closing an intervention
     *
     * This method closes an intervention. Caveats:  * If the intervention is already being closed, it will return a 409 error. * To be able to close an intervention, it must meet the following criteria otherwise a 403 will be raised:    * Intervention MUST NOT already be closed    * Intervention MUST have agent replies   * Access-Token agent MUST be the owner of the intervention or have the permission to edit permissions    * Access-Token agent MUST have read access on the source  Authorization​: no, but it renders an error if intervention can’t be closed (see caveats)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void closeInterventionTest() throws ApiException {
        //String interventionId = null;
        //Intervention response = api.closeIntervention(interventionId);
        // TODO: test validations
    }

    /**
     * Creating an intervention
     *
     * This method creates a new intervention or reopen it. In case of success it renders the intervention, otherwise, it renders an error (422 HTTP code). This method opens intervention as access token’s user.  Authorization​: no, but it renders an error if intervention can’t be created or reopened (already opened, etc.).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createInterventionTest() throws ApiException {
        //String contentId = null;
        //Intervention response = api.createIntervention(contentId);
        // TODO: test validations
    }

    /**
     * Getting all interventions
     *
     * This method renders interventions ordered by creation date (descending). Only interventions in sources where token’s user has “read” permission are returned.  Authorization​: no.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllInterventionsTest() throws ApiException {
        //String threadId = null;
        //String userId = null;
        //String identityGroupId = null;
        //String identityId = null;
        //String sort = null;
        //Integer offset = null;
        //Integer limit = null;
        //GetAllInterventionsResponse response = api.getAllInterventions(threadId, userId, identityGroupId, identityId, sort, offset, limit);
        // TODO: test validations
    }

    /**
     * Getting an intervention from its id
     *
     * This method renders an intervention from given id. If token’s user does not have “read” on intervention’s source a 404 HTTP response will be returned.  Authorization​: no.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInterventionTest() throws ApiException {
        //String interventionId = null;
        //Intervention response = api.getIntervention(interventionId);
        // TODO: test validations
    }

    /**
     * Reassigning an intervention
     *
     * This method updates the user in charge of the intervention  Authorization​: Only users who can update interventions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reassignInterventionTest() throws ApiException {
        //String interventionId = null;
        //String userId = null;
        //Intervention response = api.reassignIntervention(interventionId, userId);
        // TODO: test validations
    }

    /**
     * Updating an intervention from its id
     *
     * This method updates intervention from given attributes and renders it in case of success.  Authorization​: no.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateInterventionTest() throws ApiException {
        //String interventionId = null;
        //String customFieldValuesCustomFieldKey = null;
        //Intervention response = api.updateIntervention(interventionId, customFieldValuesCustomFieldKey);
        // TODO: test validations
    }

}
