package com.kveola13.Mockitomasterclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BusinessImplMockTest {

    @Test
    public void testFindHighestFromData() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.fetchAllData()).thenReturn(new int[]{1, 2, 3});

        BusinessImpl business = new BusinessImpl(dataServiceMock);
        int result = business.findHighestNumberFromData();
        assertEquals(3, result);
    }
    @Test
    public void testFindFromData() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.fetchAllData()).thenReturn(new int[]{15});

        BusinessImpl business = new BusinessImpl(dataServiceMock);
        int result = business.findHighestNumberFromData();
        assertEquals(15, result);
    }

}
