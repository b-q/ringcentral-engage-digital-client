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
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.CustomField;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllCustomFieldsResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomFieldsApi
 */
public class CustomFieldsApiTest {

    private final CustomFieldsApi api = new CustomFieldsApi();

    /**
     * Creating a custom field
     *
     * This method creates a custom field. In case of success it renders the custom field, otherwise, it renders an error (422 HTTP code).  Authorization​: only users that can create custom fields.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCustomFieldTest() throws ApiException {
        //String associatedTypeName = null;
        //String label = null;
        //String key = null;
        //String type = null;
        //List<String> choices = null;
        //Boolean multiple = null;
        //Integer position = null;
        //CustomField response = api.createCustomField(associatedTypeName, label, key, type, choices, multiple, position);
        // TODO: test validations
    }

    /**
     * Deleting a custom field
     *
     * This method destroys an existing custom field. It renders custom field itself. It renders a 404 if id is invalid.  Authorization​: only users that are able to destroy custom fields..
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCustomFieldTest() throws ApiException {
        //String customFieldId = null;
        //CustomField response = api.deleteCustomField(customFieldId);
        // TODO: test validations
    }

    /**
     * Getting all custom fields
     *
     * This method renders custom fields ordered by position (ascending).  Authorization​: only users that can see custom fields in administration section.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllCustomFieldsTest() throws ApiException {
        //Integer offset = null;
        //Integer limit = null;
        //GetAllCustomFieldsResponse response = api.getAllCustomFields(offset, limit);
        // TODO: test validations
    }

    /**
     * Getting a custom field from its id
     *
     * This method renders a custom field from given id.  Authorization​: only users that can see custom fields in administration section.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomFieldTest() throws ApiException {
        //String customFieldId = null;
        //CustomField response = api.getCustomField(customFieldId);
        // TODO: test validations
    }

    /**
     * Updating a custom field
     *
     * This method updates an existing custom field from given attributes and renders it in case of success.  Authorization​: only users that are able to update custom fields.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCustomFieldTest() throws ApiException {
        //String customFieldId = null;
        //String label = null;
        //List<String> choices = null;
        //Integer position = null;
        //CustomField response = api.updateCustomField(customFieldId, label, choices, position);
        // TODO: test validations
    }

}
