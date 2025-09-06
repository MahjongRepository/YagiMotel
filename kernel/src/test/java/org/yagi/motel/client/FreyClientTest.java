package org.yagi.motel.client;

import org.junit.Assert;
import org.junit.Test;
import org.yagi.motel.model.PersonsGetPersonalInfoResponseDto;

public class FreyClientTest {
    @Test
    public void testPantheonClient() {
        FreyClient client = new FreyClient();
        PersonsGetPersonalInfoResponseDto response = client.getPersonalInfo(748);

        Assert.assertTrue(!response.getPeople().get(0).getTenhouId().isEmpty());
    }
}
