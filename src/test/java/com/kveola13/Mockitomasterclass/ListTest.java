package com.kveola13.Mockitomasterclass;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    public void testSize() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10);
        assertEquals(10, listMock.size());
    }

    @Test
    public void testMultipleReturns() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, listMock.size());
        assertEquals(20, listMock.size());
    }

    @Test
    public void testGet() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Test");
        assertEquals("Test", listMock.get(0));
        assertNull(listMock.get(1));
    }
    @Test
    public void testGetTwo() {
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("Test");
        assertEquals("Test", listMock.get(0));
        assertEquals("Test", listMock.get(1));
    }
}
