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
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.GetAllTopologiesResponse;
import io.github.b_qiao.pers.lab.rest.ringcentral_engage_digital_client.model.Topology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TopologiesApi
 */
public class TopologiesApiTest {

    private final TopologiesApi api = new TopologiesApi();

    /**
     * Activating a topology
     *
     * This method activates an existing topology from given attributes and renders it in case of success.  Authorization: Only users that have the right to manage topologies.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void activateTopologyTest() throws ApiException {
        //String topologyId = null;
        //Topology response = api.activateTopology(topologyId);
        // TODO: test validations
    }

    /**
     * Creating a topology
     *
     * This method creates a topology. In case of success it renders the topology, otherwise, it renders an error (422 HTTP code).  Authorization: Only users that have the right to manage topologies.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTopologyTest() throws ApiException {
        //String name = null;
        //String jsonConfig = null;
        //Topology response = api.createTopology(name, jsonConfig);
        // TODO: test validations
    }

    /**
     * Deleting a topology
     *
     * This method destroys an existing topology. It renders topology itself. It renders a 404 if id is invalid.  Authorization: Only users that have the right to manage topologies.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTopologyTest() throws ApiException {
        //String topologyId = null;
        //Topology response = api.deleteTopology(topologyId);
        // TODO: test validations
    }

    /**
     * Getting all topologies
     *
     * This method renders all topologies ordered by name (in alphabetical order).  Authorization: Only users that have the right to manage topologies
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTopologiesTest() throws ApiException {
        //GetAllTopologiesResponse response = api.getAllTopologies();
        // TODO: test validations
    }

    /**
     * Getting a topology from its id
     *
     * This method renders a topology from given id.  Authorization: only users that have the right to manage topologies.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTopologyTest() throws ApiException {
        //String topologyId = null;
        //Topology response = api.getTopology(topologyId);
        // TODO: test validations
    }

    /**
     * Updating a topology
     *
     * This method updates an existing topology from given attributes and renders it in case of success.  Authorization: only users that have the right to manage topologies. Topology must be inactive or the response will return an error.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTopologyTest() throws ApiException {
        //String topologyId = null;
        //String name = null;
        //String jsonConfig = null;
        //Topology response = api.updateTopology(topologyId, name, jsonConfig);
        // TODO: test validations
    }

}
