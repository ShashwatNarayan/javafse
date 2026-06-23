package com.cognizant.mockito;

import com.cognizant.service.ExternalApi;
import com.cognizant.service.MyService;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class VerifyingInteractionsTest {

    @Test
    public void testGetDataIsCalledOnFetch() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }

    @Test
    public void testSendDataIsCalledWithCorrectPayload() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.processData("order-payload");

        verify(mockApi).sendData("order-payload");
    }

    @Test
    public void testGetDataIsCalledExactlyOnce() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi, times(1)).getData();
    }

    @Test
    public void testSendDataIsNeverCalledOnFetch() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi, never()).sendData(Mockito.anyString());
    }
}
