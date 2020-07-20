package com.kveola13.Mockitomasterclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessImplTest {

    @Test
    void findHighestNumberFromData() {
        BusinessImpl business = new BusinessImpl(new DataServiceStub());
        int highestNumberFromData = business.findHighestNumberFromData();
        assertEquals(3, highestNumberFromData);
    }
}

class DataServiceStub implements DataService {
    @Override
    public int[] fetchAllData() {
        return new int[]{1, 2, 3};
    }
}