package com.kveola13.Mockitomasterclass;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BusinessImplMockAnnotationTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    BusinessImpl business;

    @Test
    public void testFindHighestFromData() {
        when(dataServiceMock.fetchAllData()).thenReturn(new int[]{1, 2, 3});
        assertEquals(3, business.findHighestNumberFromData());
    }

    @Test
    public void testFindFromData() {
        when(dataServiceMock.fetchAllData()).thenReturn(new int[]{15});
        assertEquals(15, business.findHighestNumberFromData());
    }

    @Test
    public void testFindFromNoData() {
        when(dataServiceMock.fetchAllData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, business.findHighestNumberFromData());
    }

}
