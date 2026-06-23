package com.cognizant.mockito;

import com.cognizant.service.ExternalApi;
import com.cognizant.service.MyService;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class MockingAndStubbingTest {

    @Test
    public void testFetchDataReturnsStubbedValue() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }

    @Test
    public void testFetchDataReturnsNullWhenApiReturnsNull() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn(null);

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals(null, result);
    }
}
