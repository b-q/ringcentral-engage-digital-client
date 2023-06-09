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
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllTeamsResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Team;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamsApi
 */
public class TeamsApiTest {

    private final TeamsApi api = new TeamsApi();

    /**
     * Creating a team
     *
     * This method creates a new team. In case of success it renders the created tag, otherwise, it renders an error (422 HTTP code).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTeamTest() throws ApiException {
        //String name = null;
        //List<String> leaderIds = null;
        //List<String> userIds = null;
        //Team response = api.createTeam(name, leaderIds, userIds);
        // TODO: test validations
    }

    /**
     * Deleting a team
     *
     * This method destroys an existing team. It renders the team itself. It renders a 404 if id is invalid.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTeamTest() throws ApiException {
        //String teamId = null;
        //String takeOverCategoryId = null;
        //Team response = api.deleteTeam(teamId, takeOverCategoryId);
        // TODO: test validations
    }

    /**
     * Getting all teams
     *
     * This method renders teams ordered by creation date (ascending).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTeamsTest() throws ApiException {
        //Integer offset = null;
        //Integer limit = null;
        //GetAllTeamsResponse response = api.getAllTeams(offset, limit);
        // TODO: test validations
    }

    /**
     * Getting a team from its id
     *
     * This method renders a team from given id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTeamTest() throws ApiException {
        //String teamId = null;
        //Team response = api.getTeam(teamId);
        // TODO: test validations
    }

    /**
     * Updating a team
     *
     * This method updates an existing team from given attributes and renders it in case of success.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTeamTest() throws ApiException {
        //String teamId = null;
        //String name = null;
        //List<String> leaderIds = null;
        //List<String> userIds = null;
        //Team response = api.updateTeam(teamId, name, leaderIds, userIds);
        // TODO: test validations
    }

}
