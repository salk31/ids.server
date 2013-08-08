package org.icatproject.ids;

import java.net.MalformedURLException;

import org.icatproject.IcatException_Exception;
import org.junit.BeforeClass;

/*
 * Test the preparedData method for the IDS.
 */
public class PrepareDataTest {

    private static Setup setup = null;

    @BeforeClass
    public static void setup() throws MalformedURLException, IcatException_Exception {
        setup = new Setup();
    }

//    @Test(expected = NotImplementedException.class)
//    public void notImplementedInvestigationIdsTest() throws IOException, IDSException {
//        TestingClient client = new TestingClient(setup.getIdsUrl());
//        client.prepareDataTest(setup.getGoodSessionId(), "1,2,3", null, null, null, null);
//    }
//
//    @Test(expected = NotImplementedException.class)
//    public void notImplementedZipTest() throws IOException, IDSException {
//        TestingClient client = new TestingClient(setup.getIdsUrl());
//        client.prepareDataTest(setup.getGoodSessionId(), null, null, null, null, "false");
//    }
//
//    @Test(expected = BadRequestException.class)
//    public void badSessionIdFormatTest() throws IOException, IDSException {
//        TestingClient client = new TestingClient(setup.getIdsUrl());
//        client.prepareDataTest("bad sessionId format", null, null, null, null, null);
//    }
//
//    @Test(expected = BadRequestException.class)
//    public void badDatafileIdListTest() throws IOException, IDSException {
//        TestingClient client = new TestingClient(setup.getIdsUrl());
//        client.prepareDataTest(setup.getGoodSessionId(), null, null, "1, 2, a", null, null);
//    }
//
//    @Test(expected = BadRequestException.class)
//    public void badDatasetIdListTest() throws IOException, IDSException {
//        TestingClient client = new TestingClient(setup.getIdsUrl());
//        client.prepareDataTest(setup.getGoodSessionId(), null, "", null, null, null);
//    }
//    
//    @Test(expected = BadRequestException.class)
//    public void tooBigIdTest() throws IOException, IDSException {
//        TestingClient client = new TestingClient(setup.getIdsUrl());
//        client.prepareDataTest(setup.getGoodSessionId(), null, "99999999999999999999", null, null, null);
//    }
//
//    @Test(expected = BadRequestException.class)
//    public void noIdsTest() throws IOException, IDSException {
//        TestingClient client = new TestingClient(setup.getIdsUrl());
//        client.prepareDataTest(setup.getGoodSessionId(), null, null, null, null, null);
//    }
//    
//    @Test(expected = BadRequestException.class)
//    public void badCompressTest() throws IOException, IDSException {
//        TestingClient client = new TestingClient(setup.getIdsUrl());
//        client.prepareDataTest(setup.getGoodSessionId(), null, null, null, "flase", null);
//    }
//
//    @Test(expected = ForbiddenException.class)
//    public void nonExistingSessionIdTest() throws IOException, IDSException {
//        TestingClient client = new TestingClient(setup.getIdsUrl());
//        client.prepareDataTest("aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa", null, null, setup.getCommaSepDatafileIds(),
//                null, null);
//    }
//
//    @Test
//    public void correctBehaviourTest() throws IOException, IDSException {
//        TestingClient client = new TestingClient(setup.getIdsUrl());
//        String preparedId = client.prepareDataTest(setup.getGoodSessionId(), null, null, setup.getCommaSepDatafileIds(), null, null);
//        Assert.assertNotNull(preparedId);
//    }
}
