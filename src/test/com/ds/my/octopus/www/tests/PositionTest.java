package com.ds.my.octopus.www.tests;

import com.ds.my.octopus.www.common.IPosition;
import com.ds.my.octopus.www.implementations.Position;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author dmitry shalygin on 1/19/2016.
 */
public class PositionTest {

    @Test
    public void testJUnit(){
        Assert.assertTrue(true);
    }

    @Test
    public void testEquals(){
        Position p1 = new Position("Java");
        Position p2 = new Position("JaVa");
        Position p3 = new Position("JaVaSE");
        Assert.assertTrue(p1.equals(p2));
        Assert.assertFalse(p2.equals(p3));
    }

    @Test
    public void testHash(){
        Position p1 = new Position("Java");
        Position p2 = new Position("JaVa");
        Position p3 = new Position("JaVaSE");
        Assert.assertTrue(p1.hashCode()==p2.hashCode());
        Assert.assertFalse(p2.hashCode()==p3.hashCode());
    }


}
